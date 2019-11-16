package TestScenario;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Timer;
import java.util.TimerTask;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class test {
	public static void main(String[] args){
		System.out.print("test\n");
		
		JFrame test = new JFrame("tekst");
		
		BaseMechanics.Map m = new testMap();
		
		BaseMechanics.InputMethod.Keyboard1 i = new BaseMechanics.InputMethod.Keyboard1();
		
		BaseMechanics.AllTogether viewTest = new BaseMechanics.AllTogether(m);
		
		test.add(viewTest);
		test.setSize(640, 480);
		test.addKeyListener(i);
		test.setFocusable(true);
	//	test.setUndecorated(true);
		test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		test.setVisible(true);

		
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask(){
			public void run(){
				viewTest.update(i.returnInputs());
				test.repaint();
			}
		}
		, 1, 15);
	}
}
