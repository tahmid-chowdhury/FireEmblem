package BaseMechanics;

import java.awt.Graphics2D;
import java.util.ArrayList;

public class UserInterface {
	
	ArrayList<Element> elements;
	
	public void paint(Graphics2D g){
		for(Element x: elements){
			x.paint(g);		
		}
	}
	
	public static abstract class Element {
		public abstract void paint(Graphics2D g);
	}
}
