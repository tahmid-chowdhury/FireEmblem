package ActualScenario;

import java.awt.Color;
import java.awt.Graphics2D;

import BaseMechanics.AllTogether;

public class UserInterface extends BaseMechanics.UserInterface {
	public UserInterface(){
		super();
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
