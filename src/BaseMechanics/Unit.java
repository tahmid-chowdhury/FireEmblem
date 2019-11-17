package BaseMechanics;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public abstract class Unit {
	//Actual Battle Logic
	protected int type;
	protected int health;
	public void attack(Unit a){
		
	}
	
	//Stuff for drawing the Sprite
	protected BufferedImage[] sprites;
	
	public abstract void paint(Graphics2D g, int x, int y, double scaleFactor, double xOffset, double yOffset, int xSize, int ySize);

}
