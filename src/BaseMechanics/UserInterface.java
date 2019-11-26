package BaseMechanics;

import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JComponent;

public class UserInterface {
	
	protected ArrayList<Element> elements;
	
	public UserInterface(){
		this.elements = new ArrayList<Element>(0);
	}
	
	public void paint(Graphics2D g){
		if(!elements.isEmpty()){
			for(Element x: elements){
				x.paint(g);
			}
		}else{
			System.out.print("No elements in interface array to print!\n");
		}
	}
	
	public void update(AllTogether a){
		if(!elements.isEmpty()){
			for(Element x: elements){
				x.update(a);
			}
		}else{
			System.out.print("No elements in interface array to update!\n");
		}
	}
	
	public static abstract class Element extends JComponent {
		public abstract void paint(Graphics2D g);
		public abstract void update(AllTogether a);
	}
}
