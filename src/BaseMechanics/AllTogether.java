package BaseMechanics;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class AllTogether extends JPanel {
	
	public AllTogether(Map m) {
		this.map = m;
		this.viewport = new Viewport(m);
	}
	
	Viewport viewport;
	Map map;
	
	public void paint(Graphics g){
		Graphics2D wnk = (Graphics2D) g;
		viewport.paint(wnk);
		}
}
