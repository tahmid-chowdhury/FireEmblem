package BaseMechanics;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class AllTogether extends JPanel {
	
	public AllTogether(Map m, UserInterface ui,	InputMethod input, GameLogic gl, JFrame parent) {
		this.map = m;
		this.viewport = new Viewport(m);
		this.ui = ui;
		this.input = input;
		this.gl = gl;
		this.parentFrame = parent;
	}
	
	public Viewport viewport;
	public Map map;
	protected UserInterface ui;
	public InputMethod input;
	public GameLogic gl;
	public JFrame parentFrame;
	
	public void paint(Graphics g){
		Graphics2D wnk = (Graphics2D) g;
		viewport.paint(wnk);
		ui.paint(wnk, this);
		}
	
	public void update() {
		ui.tileIterate(this);
		ui.update(this);
		viewport.move(input.returnInputs());
		gl.update(this);
	}
}
