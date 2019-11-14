package BaseMechanics;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class AllTogether extends JPanel {
	
	Viewport viewport;
	
	
	public void paint(Graphics g){
		Graphics2D wnk = (Graphics2D) g;
		viewport.paint(wnk);
		}
}
