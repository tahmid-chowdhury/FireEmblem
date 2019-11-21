package ActualScenario;

import java.awt.Color;
import java.awt.Graphics2D;

import javax.swing.JFrame;

import BaseMechanics.AllTogether;

public class UserInterface extends BaseMechanics.UserInterface {
	
	int xsize;
	int ysize;
	
	public UserInterface(JFrame f){
		super();
		xsize = f.getWidth();
		ysize = f.getHeight();
		this.elements.add(new border());
	}
	
	public static class border extends BaseMechanics.UserInterface.Element {
		
		
		
		@Override
		public void paint(Graphics2D g) {
			g.setColor(Color.red);
			g.drawString("Look mom I'm on a computer screen!", 69, 69);
		}

		@Override
		public void update(AllTogether a) {
			// TODO Auto-generated method stub
			
		}
		
	}
}
