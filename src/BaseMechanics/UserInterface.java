package BaseMechanics;

import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JComponent;

public class UserInterface {
	
	protected ArrayList<Element> elements;
	
	public UserInterface(){
		this.elements = new ArrayList<Element>(0);
	}
	
	public void paint(Graphics2D g, AllTogether a){
		if(!elements.isEmpty()){
			for(Element x: elements){
				x.paint(g, a);
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
	
	public void tileIterate(AllTogether a) {
		if(!elements.isEmpty()){
			for(Element e: elements){
				for(int x = 0; x < a.map.grid.length; x++) {
					for(int y = 0; y < a.map.grid[x].length; y++) {
						e.toIterateOnEachTile(a, a.map.grid[x][y], x, y);
					}
				}
			}
		}else{
			System.out.print("No elements in interface array to iterate on!\n");
		}
	}
	
	public static abstract class Element extends JComponent {
		public abstract void paint(Graphics2D g, AllTogether a);
		public abstract void update(AllTogether a);
		public abstract void toIterateOnEachTile(AllTogether a, Tile tile, int x, int y);
	}
}
