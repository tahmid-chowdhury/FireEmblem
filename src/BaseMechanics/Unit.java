package BaseMechanics;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import BaseMechanics.Unit.Attack.attackMethod;

public abstract class Unit {
	//Actual Battle Logic
	public Type type;
	public int health;
	public Team team;
	public double speed;
	public double armour;
	public boolean hasMovedThisTurn;
	public boolean hasAttackedThisTurn;
	public Attack[] attacks;
	public int authorityLevel;
	public String name;
	
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
	
	public String getNameWithTeam(){
		if(team == Team.PLAYER2){
			return name+"}";
		}else{
			return name+"{";
		}
	}
	
	//His Majesty's Royal Banter Battalion
	public static abstract class Attack {
		public String name;
		double range;
		double areaOfEffect;
		int authorityThreshold;
		int baseDamage; //yes, negative basedamage will heal
		attackMethod method;
		attackType type;
		public enum attackMethod{
			MARTIAL,
			MAGIC
		}
		public enum attackType{
			RANGED,
			MELEE
		}
		public abstract int calcDamage(Unit target, Unit attacker);
	}
	
/*	public int calcDamage(Attack attack, Unit target){
		switch (target.type){
		case TYPELESS:
			return (int) (attack.baseDamage+(attack.baseDamage*((double)authorityLevel/10)));
		case MAGIC:
			if(attack.method == attackMethod.MARTIAL){
				
			}
		default:
			return attack.baseDamage;
		}
	}	*/
	
	
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
