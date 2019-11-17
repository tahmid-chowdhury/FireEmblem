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
	
	public abstract void paint(Graphics2D g, int x, int y, double scaleFactor, int xOffset, int yOffset);
	/*Putting this here for safekeeping...
	 
	 		public void paint(Graphics2D g, int x, int y, double scaleFactor, int xOffset, int yOffset) {
			g.drawImage(sprites[0], 
					x*sprites[0].getWidth()+xOffset, 
					y*sprites[0].getHeight()+yOffset, 
					(int)((x+1)*sprites[0].getWidth()*scaleFactor)+xOffset, 
					(int)((y+1)*sprites[0].getHeight()*scaleFactor)+yOffset, 
					
					0, 0, sprites[0].getWidth(), sprites[0].getHeight(), null);
		}
	 
	 */
}
