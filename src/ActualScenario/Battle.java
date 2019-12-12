package ActualScenario;

import java.awt.Color;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;

import TestScenario.testMap;

public class Battle {
	public static void main(String[] args){
		System.out.print("test\n");
		
		JFrame test = new JFrame("光へ");
		
		BaseMechanics.Map m = new Maps.OuterField();
		
		BaseMechanics.InputMethod.Keyboard1 i = new BaseMechanics.InputMethod.Keyboard1();
		BaseMechanics.InputMethod.Mouse mu = new BaseMechanics.InputMethod.Mouse();
		
		BaseMechanics.UserInterface ui = new ActualScenario.UserInterface(test, mu);
		BaseMechanics.GameLogic gl = new Logic();
		
		BaseMechanics.AllTogether viewTest = new BaseMechanics.AllTogether(m, ui, i, gl);
		
		GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
		
		test.add(viewTest);
		test.addMouseListener(mu);
		test.setSize(gd.getDisplayMode().getWidth(), gd.getDisplayMode().getHeight());
		test.addKeyListener(i);
		test.setFocusable(true);
		test.setUndecorated(true);
		test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		test.setBackground(Color.BLACK);
		test.setVisible(true);
		
		Thread Logic = new Thread(new refreshLogic(viewTest));
		Thread Screen = new Thread(new refreshScreen(test));
		
		Logic.start();
		Screen.start();
		
	}

		static class refreshLogic implements Runnable{
		
			BaseMechanics.AllTogether a;
			
			refreshLogic(BaseMechanics.AllTogether a){
				this.a = a;
			}
		
		public void run(){
		Timer timer = new Timer();
				timer.scheduleAtFixedRate(new TimerTask(){
					public void run(){
						a.update();
					//	test.repaint();
					}
				}
				, 1, 15);
			}
		}
		
		static class refreshScreen implements Runnable{
		
			JFrame test;
			
			refreshScreen(JFrame test){
				this.test = test;
			}
			
		public void run(){
		Timer timer = new Timer();
				timer.scheduleAtFixedRate(new TimerTask(){
					public void run(){
					//	viewTest.update();
						test.repaint();
					}
				}
				, 1, 15);
			}
		}
	
}
