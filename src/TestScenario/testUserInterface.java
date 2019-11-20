package TestScenario;

import java.awt.Color;
import java.awt.Graphics2D;

import BaseMechanics.AllTogether;
import BaseMechanics.UserInterface;

public class testUserInterface extends UserInterface {
	public testUserInterface(){
		super();
		elements.add(new testButton());
	}
	
	public static class testButton extends UserInterface.Element{
		boolean rightDepressed;
		boolean leftDepressed;

		@Override
		public void paint(Graphics2D g) {
			if(rightDepressed){
				g.setColor(Color.RED);
			}else{
				g.setColor(Color.BLUE);
			}
				g.fillRect(69, 69, 69, 69);
				
			if(leftDepressed){
				g.setColor(Color.RED);
			}else{
				g.setColor(Color.BLUE);
			}
				g.fillRect(69*2, 69, 69, 69);
		}

		@Override
		public void update(AllTogether a) {
			if(a.input.returnInputs()[9]){
				rightDepressed = true;
			}else{
				rightDepressed = false;
			}
			
			if(a.input.returnInputs()[6]){
				leftDepressed = true;
			}else{
				leftDepressed = false;
			}
		}
	}
}
