package BaseMechanics;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public abstract class Unit {
	//Actual Battle Logic
	public Type type;
	public int health;
	public Team team;
	public double speed;
	public boolean hasMovedThisTurn;
	public boolean hasAttackedThisTurn;
	public Attack[] attacks;
	//0 = player 1, 1 = player 2, all others neutral
	
	public enum Team {
		PLAYER1,
		PLAYER2,
		NEUTRAL
	}
	public enum Type {
		TYPELESS,
		MELEE,
		RANGED,
		MAGIC,
		SPECIAL
	}
	

	public static abstract class Attack {
		double range;
		double areaOfEffect;
		int authorityThreshold;
	}
	
	
	//Stuff for drawing the Sprite
	protected BufferedImage[] sprites;
	
	public void paint(Graphics2D g, int x, int y, double scaleFactor, double xOffset, double yOffset, int xSize, int ySize){
		
		g.drawImage(sprites[0], 
				//destination x co-ord 1
				(int)(x*sprites[0].getWidth()*scaleFactor) + (int) (xOffset*(sprites[0].getWidth()*scaleFactor*xSize)), 
				
				//destination y co-ord 1
				(int)(y*sprites[0].getHeight()*scaleFactor) + (int) (yOffset*(sprites[0].getHeight()*scaleFactor*ySize)), 
				
				//destination x co-ord 2
				(int)(x*sprites[0].getWidth()*scaleFactor + sprites[0].getWidth()*scaleFactor) + (int) (xOffset*(sprites[0].getWidth()*scaleFactor*xSize)), 
				
				//destination y co-ord 2
				(int)(y*sprites[0].getHeight()*scaleFactor + sprites[0].getHeight()*scaleFactor) + (int) (yOffset*(sprites[0].getHeight()*scaleFactor*ySize)),
				
				
				0, 0, sprites[0].getWidth(), sprites[0].getHeight(), null);
	}

}
