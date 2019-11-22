package ActualScenario;

import java.awt.Color;
import java.awt.Graphics2D;

import javax.swing.JFrame;

import BaseMechanics.AllTogether;

public class UserInterface extends BaseMechanics.UserInterface {
	
	static int xsize;
	static int ysize;
	JFrame j;
	
	public UserInterface(JFrame f){
		super();
		xsize = f.getWidth();
		ysize = f.getHeight();
		this.elements.add(new border());
		j = f;
	}
	
	public void update(AllTogether a) {
		xsize = j.getWidth();
		ysize = j.getHeight();
		super.update(a);
	}
	
	public static class border extends BaseMechanics.UserInterface.Element {
		
		
		
		@Override
		public void paint(Graphics2D g) {
			g.setColor(Color.red);
			g.drawString("Look mom I'm on a computer screen!", 69, 69);
			g.fillRect((int)(xsize*0.05), (int)(ysize*0.65), (int)(xsize*0.9), (int)(ysize*0.25));
			
			g.setColor(Color.WHITE);
			
		}

		@Override
		public void update(AllTogether a) {
			// TODO Auto-generated method stub
			
		}
		
	}
}
