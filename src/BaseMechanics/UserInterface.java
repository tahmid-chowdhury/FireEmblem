package BaseMechanics;

import java.awt.Graphics2D;
import java.util.ArrayList;

public class UserInterface {
	
	ArrayList<Element> elements;
	
	public UserInterface(){
		this.elements = new ArrayList<Element>(0);
	}
	
	public void paint(Graphics2D g){
		if(!elements.isEmpty()){
			for(Element x: elements){
				x.paint(g);
			}
		}
	}
	
	public void update(AllTogether a){
		if(!elements.isEmpty()){
			for(Element x: elements){
				x.update(a);
			}
		}
	}
	
	public static abstract class Element {
		public abstract void paint(Graphics2D g);
		public abstract void update(AllTogether a);
	}
}
