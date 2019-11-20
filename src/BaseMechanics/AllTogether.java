package BaseMechanics;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class AllTogether extends JPanel {
	
	public AllTogether(Map m, UserInterface ui,	InputMethod input) {
		this.map = m;
		this.viewport = new Viewport(m);
		this.ui = ui;
		this.input = input;
	}
	
	Viewport viewport;
	Map map;
	UserInterface ui;
	InputMethod input;
	
	public void paint(Graphics g){
		Graphics2D wnk = (Graphics2D) g;
		viewport.paint(wnk);
		ui.paint(wnk);
		}
	
	public void update() {
		viewport.move(input.returnInputs());
	}
}
