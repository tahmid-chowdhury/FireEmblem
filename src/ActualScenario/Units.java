package ActualScenario;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import BaseMechanics.Unit;

public class Units {
	public static class baseRanger extends BaseMechanics.Unit{
		public baseRanger(){
			this.sprites = new BufferedImage[2];
			this.speed = 3.5;
			this.type = Unit.Type.RANGED;
			this.name = "Wolke";
			this.health = 100;
			try{
				sprites[0] = ImageIO.read(new File("sprites/characters/body/mbody1.png"));
				sprites[1] = ImageIO.read(new File("sprites/characters/heads/mhead1.png"));
			}catch(Exception e){
				
			}
			this.attacks = new Attack[1];
			attacks[0] = new Attacks.BaseRanged();

		}
		
		public void paint(Graphics2D g, int x, int y, double scaleFactor, double xOffset, double yOffset, int xSize, int ySize){
			super.paint(g, x, y, scaleFactor, xOffset, yOffset, xSize, ySize);
			
			g.drawImage(sprites[1], 
					//destination x co-ord 1
					(int)(x*sprites[1].getWidth()*scaleFactor) + (int) (xOffset*(sprites[1].getWidth()*scaleFactor*xSize)), 
					
					//destination y co-ord 1
					(int)(y*sprites[1].getHeight()*scaleFactor) + (int) (yOffset*(sprites[1].getHeight()*scaleFactor*ySize)), 
					
					//destination x co-ord 2
					(int)(x*sprites[1].getWidth()*scaleFactor + sprites[1].getWidth()*scaleFactor) + (int) (xOffset*(sprites[1].getWidth()*scaleFactor*xSize)), 
					
					//destination y co-ord 2
					(int)(y*sprites[1].getHeight()*scaleFactor + sprites[1].getHeight()*scaleFactor) + (int) (yOffset*(sprites[1].getHeight()*scaleFactor*ySize)),
					
					
					0, 0, sprites[1].getWidth(), sprites[1].getHeight(), null);
		}
	}
	
	public static class baseMage extends BaseMechanics.Unit{
		public baseMage(){
			this.sprites = new BufferedImage[2];
			this.speed = 1.5;
			this.type = Unit.Type.MAGIC;
			this.name = "Silynia";
			this.health = 100;
			try{
				sprites[0] = ImageIO.read(new File("sprites/characters/body/fbody1.png"));
				sprites[1] = ImageIO.read(new File("sprites/characters/heads/fhead1.png"));
			}catch(Exception e){
				
			}
			this.attacks = new Attack[1];
			attacks[0] = new Attacks.BaseMagic();
		}
		
		public void paint(Graphics2D g, int x, int y, double scaleFactor, double xOffset, double yOffset, int xSize, int ySize){
			super.paint(g, x, y, scaleFactor, xOffset, yOffset, xSize, ySize);
			
			g.drawImage(sprites[1], 
					//destination x co-ord 1
					(int)(x*sprites[1].getWidth()*scaleFactor) + (int) (xOffset*(sprites[1].getWidth()*scaleFactor*xSize)), 
					
					//destination y co-ord 1
					(int)(y*sprites[1].getHeight()*scaleFactor) + (int) (yOffset*(sprites[1].getHeight()*scaleFactor*ySize)), 
					
					//destination x co-ord 2
					(int)(x*sprites[1].getWidth()*scaleFactor + sprites[1].getWidth()*scaleFactor) + (int) (xOffset*(sprites[1].getWidth()*scaleFactor*xSize)), 
					
					//destination y co-ord 2
					(int)(y*sprites[1].getHeight()*scaleFactor + sprites[1].getHeight()*scaleFactor) + (int) (yOffset*(sprites[1].getHeight()*scaleFactor*ySize)),
					
					
					0, 0, sprites[1].getWidth(), sprites[1].getHeight(), null);
		}
	}
	
	public static class baseAssin extends BaseMechanics.Unit{
		public baseAssin(){
			this.sprites = new BufferedImage[3];
			this.speed = 2;
			this.type = Unit.Type.MELEE;
			this.name = "Harriot";
			this.health = 100;
			this.attacks = new Attack[1];
			attacks[0] = new Attacks.GenericMelee();
			try{
				sprites[0] = ImageIO.read(new File("sprites/characters/body/fbody3.png"));
				sprites[1] = ImageIO.read(new File("sprites/characters/heads/fhead3.png"));
				sprites[2] = ImageIO.read(new File("sprites/characters/heads/fhead3back.png"));

			}catch(Exception e){
				
			}
		}

		public void paint(Graphics2D g, int x, int y, double scaleFactor, double xOffset, double yOffset, int xSize, int ySize){
			g.drawImage(sprites[2], 
					//destination x co-ord 1
					(int)(x*sprites[2].getWidth()*scaleFactor) + (int) (xOffset*(sprites[2].getWidth()*scaleFactor*xSize)), 
					
					//destination y co-ord 1
					(int)(y*sprites[2].getHeight()*scaleFactor) + (int) (yOffset*(sprites[2].getHeight()*scaleFactor*ySize)), 
					
					//destination x co-ord 2
					(int)(x*sprites[2].getWidth()*scaleFactor + sprites[2].getWidth()*scaleFactor) + (int) (xOffset*(sprites[2].getWidth()*scaleFactor*xSize)), 
					
					//destination y co-ord 2
					(int)(y*sprites[2].getHeight()*scaleFactor + sprites[2].getHeight()*scaleFactor) + (int) (yOffset*(sprites[2].getHeight()*scaleFactor*ySize)),
					
					
					0, 0, sprites[2].getWidth(), sprites[2].getHeight(), null);
			
			super.paint(g, x, y, scaleFactor, xOffset, yOffset, xSize, ySize);
			
			g.drawImage(sprites[1], 
					//destination x co-ord 1
					(int)(x*sprites[1].getWidth()*scaleFactor) + (int) (xOffset*(sprites[1].getWidth()*scaleFactor*xSize)), 
					
					//destination y co-ord 1
					(int)(y*sprites[1].getHeight()*scaleFactor) + (int) (yOffset*(sprites[1].getHeight()*scaleFactor*ySize)), 
					
					//destination x co-ord 2
					(int)(x*sprites[1].getWidth()*scaleFactor + sprites[1].getWidth()*scaleFactor) + (int) (xOffset*(sprites[1].getWidth()*scaleFactor*xSize)), 
					
					//destination y co-ord 2
					(int)(y*sprites[1].getHeight()*scaleFactor + sprites[1].getHeight()*scaleFactor) + (int) (yOffset*(sprites[1].getHeight()*scaleFactor*ySize)),
					
					
					0, 0, sprites[1].getWidth(), sprites[1].getHeight(), null);
		}
	}
	
	public static class mrDavis extends BaseMechanics.Unit{
		public mrDavis(){
			this.sprites = new BufferedImage[2];
			this.speed = 2;
			this.type = Unit.Type.SPECIAL;
			this.name = "Xehan";
			this.health = 100;
			try{
				sprites[0] = ImageIO.read(new File("sprites/characters/body/mbody2.png"));
				sprites[1] = ImageIO.read(new File("sprites/characters/heads/mhead2.png"));
			}catch(Exception e){
				
			}
		}
		
		public void paint(Graphics2D g, int x, int y, double scaleFactor, double xOffset, double yOffset, int xSize, int ySize){
			super.paint(g, x, y, scaleFactor, xOffset, yOffset, xSize, ySize);
			
			g.drawImage(sprites[1], 
					//destination x co-ord 1
					(int)(x*sprites[1].getWidth()*scaleFactor) + (int) (xOffset*(sprites[1].getWidth()*scaleFactor*xSize)), 
					
					//destination y co-ord 1
					(int)(y*sprites[1].getHeight()*scaleFactor) + (int) (yOffset*(sprites[1].getHeight()*scaleFactor*ySize)), 
					
					//destination x co-ord 2
					(int)(x*sprites[1].getWidth()*scaleFactor + sprites[1].getWidth()*scaleFactor) + (int) (xOffset*(sprites[1].getWidth()*scaleFactor*xSize)), 
					
					//destination y co-ord 2
					(int)(y*sprites[1].getHeight()*scaleFactor + sprites[1].getHeight()*scaleFactor) + (int) (yOffset*(sprites[1].getHeight()*scaleFactor*ySize)),
					
					
					0, 0, sprites[1].getWidth(), sprites[1].getHeight(), null);
		}
	}
	
	public static class foxFighter extends BaseMechanics.Unit{
		public foxFighter(){
			this.sprites = new BufferedImage[2];
			this.speed = 2;
			this.type = Unit.Type.MELEE;
			this.name = "Yesera";
			this.health = 100;
			this.attacks = new Attack[1];
			attacks[0] = new Attacks.GenericMelee();
			try{
				sprites[0] = ImageIO.read(new File("sprites/characters/body/fbody2.png"));
				sprites[1] = ImageIO.read(new File("sprites/characters/heads/fhead2.png"));
			}catch(Exception e){
			
			}
		}
	
		public void paint(Graphics2D g, int x, int y, double scaleFactor, double xOffset, double yOffset, int xSize, int ySize){
			super.paint(g, x, y, scaleFactor, xOffset, yOffset, xSize, ySize);
			
			g.drawImage(sprites[1], 
					//destination x co-ord 1
					(int)(x*sprites[1].getWidth()*scaleFactor) + (int) (xOffset*(sprites[1].getWidth()*scaleFactor*xSize)), 
					
					//destination y co-ord 1
					(int)(y*sprites[1].getHeight()*scaleFactor) + (int) (yOffset*(sprites[1].getHeight()*scaleFactor*ySize)), 
					
					//destination x co-ord 2
					(int)(x*sprites[1].getWidth()*scaleFactor + sprites[1].getWidth()*scaleFactor) + (int) (xOffset*(sprites[1].getWidth()*scaleFactor*xSize)), 
					
					//destination y co-ord 2
					(int)(y*sprites[1].getHeight()*scaleFactor + sprites[1].getHeight()*scaleFactor) + (int) (yOffset*(sprites[1].getHeight()*scaleFactor*ySize)),
					
					
					0, 0, sprites[1].getWidth(), sprites[1].getHeight(), null);
		}
	}
	
	public static class selfEntitled extends BaseMechanics.Unit{
		public selfEntitled(){
			this.sprites = new BufferedImage[3];
			this.speed = 2;
			this.type = Unit.Type.MELEE;
			this.name = "Prince Victor";
			this.health = 100;
			this.attacks = new Attack[1];
			attacks[0] = new Attacks.GenericMelee();
			try{
				sprites[0] = ImageIO.read(new File("sprites/characters/body/mbody5.png"));
				sprites[1] = ImageIO.read(new File("sprites/characters/heads/mhead5.png"));
				sprites[2] = ImageIO.read(new File("sprites/characters/heads/mhead5back.png"));
			}catch(Exception e){
			
			}
		}
	
		public void paint(Graphics2D g, int x, int y, double scaleFactor, double xOffset, double yOffset, int xSize, int ySize){
			
			g.drawImage(sprites[2], 
					//destination x co-ord 1
					(int)(x*sprites[2].getWidth()*scaleFactor) + (int) (xOffset*(sprites[2].getWidth()*scaleFactor*xSize)), 
					
					//destination y co-ord 1
					(int)(y*sprites[2].getHeight()*scaleFactor) + (int) (yOffset*(sprites[2].getHeight()*scaleFactor*ySize)), 
					
					//destination x co-ord 2
					(int)(x*sprites[2].getWidth()*scaleFactor + sprites[2].getWidth()*scaleFactor) + (int) (xOffset*(sprites[2].getWidth()*scaleFactor*xSize)), 
					
					//destination y co-ord 2
					(int)(y*sprites[2].getHeight()*scaleFactor + sprites[2].getHeight()*scaleFactor) + (int) (yOffset*(sprites[2].getHeight()*scaleFactor*ySize)),
					
					
					0, 0, sprites[2].getWidth(), sprites[2].getHeight(), null);
			
			super.paint(g, x, y, scaleFactor, xOffset, yOffset, xSize, ySize);
			
			g.drawImage(sprites[1], 
					//destination x co-ord 1
					(int)(x*sprites[1].getWidth()*scaleFactor) + (int) (xOffset*(sprites[1].getWidth()*scaleFactor*xSize)), 
					
					//destination y co-ord 1
					(int)(y*sprites[1].getHeight()*scaleFactor) + (int) (yOffset*(sprites[1].getHeight()*scaleFactor*ySize)), 
					
					//destination x co-ord 2
					(int)(x*sprites[1].getWidth()*scaleFactor + sprites[1].getWidth()*scaleFactor) + (int) (xOffset*(sprites[1].getWidth()*scaleFactor*xSize)), 
					
					//destination y co-ord 2
					(int)(y*sprites[1].getHeight()*scaleFactor + sprites[1].getHeight()*scaleFactor) + (int) (yOffset*(sprites[1].getHeight()*scaleFactor*ySize)),
					
					
					0, 0, sprites[1].getWidth(), sprites[1].getHeight(), null);
		}
		
	}
	
	public static class basePriestess extends BaseMechanics.Unit{
		public basePriestess(){
			this.sprites = new BufferedImage[2];
			this.speed = 1.5;
			this.type = Unit.Type.MAGIC;
			this.name = "Belle";
			this.health = 100;
			try{
				sprites[0] = ImageIO.read(new File("sprites/characters/body/fbody4.png"));
				sprites[1] = ImageIO.read(new File("sprites/characters/heads/fhead4.png"));
			}catch(Exception e){
				
			}
			this.attacks = new Attack[1];
			attacks[0] = new Attacks.BaseMagic();
		}
		
		public void paint(Graphics2D g, int x, int y, double scaleFactor, double xOffset, double yOffset, int xSize, int ySize){
			super.paint(g, x, y, scaleFactor, xOffset, yOffset, xSize, ySize);
			
			g.drawImage(sprites[1], 
					//destination x co-ord 1
					(int)(x*sprites[1].getWidth()*scaleFactor) + (int) (xOffset*(sprites[1].getWidth()*scaleFactor*xSize)), 
					
					//destination y co-ord 1
					(int)(y*sprites[1].getHeight()*scaleFactor) + (int) (yOffset*(sprites[1].getHeight()*scaleFactor*ySize)), 
					
					//destination x co-ord 2
					(int)(x*sprites[1].getWidth()*scaleFactor + sprites[1].getWidth()*scaleFactor) + (int) (xOffset*(sprites[1].getWidth()*scaleFactor*xSize)), 
					
					//destination y co-ord 2
					(int)(y*sprites[1].getHeight()*scaleFactor + sprites[1].getHeight()*scaleFactor) + (int) (yOffset*(sprites[1].getHeight()*scaleFactor*ySize)),
					
					
					0, 0, sprites[1].getWidth(), sprites[1].getHeight(), null);
		}
	}
	
	public static class baseSwordsman extends BaseMechanics.Unit{
		public baseSwordsman(){
			this.sprites = new BufferedImage[2];
			this.speed = 1.5;
			this.type = Unit.Type.MELEE;
			this.name = "Tyra";
			this.health = 100;
			this.attacks = new Attack[1];
			attacks[0] = new Attacks.GenericMelee();
			try{
				sprites[0] = ImageIO.read(new File("sprites/characters/body/mbody3.png"));
				sprites[1] = ImageIO.read(new File("sprites/characters/heads/mhead3.png"));
			}catch(Exception e){
				
			}
		}
		
		public void paint(Graphics2D g, int x, int y, double scaleFactor, double xOffset, double yOffset, int xSize, int ySize){
			
			g.drawImage(sprites[1], 
					//destination x co-ord 1
					(int)(x*sprites[1].getWidth()*scaleFactor) + (int) (xOffset*(sprites[1].getWidth()*scaleFactor*xSize)), 
					
					//destination y co-ord 1
					(int)(y*sprites[1].getHeight()*scaleFactor) + (int) (yOffset*(sprites[1].getHeight()*scaleFactor*ySize)), 
					
					//destination x co-ord 2
					(int)(x*sprites[1].getWidth()*scaleFactor + sprites[1].getWidth()*scaleFactor) + (int) (xOffset*(sprites[1].getWidth()*scaleFactor*xSize)), 
					
					//destination y co-ord 2
					(int)(y*sprites[1].getHeight()*scaleFactor + sprites[1].getHeight()*scaleFactor) + (int) (yOffset*(sprites[1].getHeight()*scaleFactor*ySize)),
					
					
					0, 0, sprites[1].getWidth(), sprites[1].getHeight(), null);
			super.paint(g, x, y, scaleFactor, xOffset, yOffset, xSize, ySize);

		}
	} 
	
	public static class derpSwordsman extends BaseMechanics.Unit{
		public derpSwordsman(){
			this.sprites = new BufferedImage[2];
			this.speed = 99;
			this.type = Unit.Type.MELEE;
			this.name = "god";
			this.health = Integer.MAX_VALUE;
			
			this.attacks = new Attack[1];
			this.attacks[0] = new Attacks.nullAttack();
			try{
				sprites[0] = ImageIO.read(new File("sprites/characters/body/mbody3hq.png"));
				sprites[1] = ImageIO.read(new File("sprites/characters/heads/mhead3hq.png"));
			}catch(Exception e){
				
			}
		}
		
		public void paint(Graphics2D g, int x, int y, double scaleFactor, double xOffset, double yOffset, int xSize, int ySize){
			
			g.drawImage(sprites[1], 
					//destination x co-ord 1
					(int)(x*sprites[1].getWidth()*scaleFactor) + (int) (xOffset*(sprites[1].getWidth()*scaleFactor*xSize)), 
					
					//destination y co-ord 1
					(int)(y*sprites[1].getHeight()*scaleFactor) + (int) (yOffset*(sprites[1].getHeight()*scaleFactor*ySize)), 
					
					//destination x co-ord 2
					(int)(x*sprites[1].getWidth()*scaleFactor + sprites[1].getWidth()*scaleFactor) + (int) (xOffset*(sprites[1].getWidth()*scaleFactor*xSize)), 
					
					//destination y co-ord 2
					(int)(y*sprites[1].getHeight()*scaleFactor + sprites[1].getHeight()*scaleFactor) + (int) (yOffset*(sprites[1].getHeight()*scaleFactor*ySize)),
					
					
					0, 0, sprites[1].getWidth(), sprites[1].getHeight(), null);
			super.paint(g, x, y, scaleFactor, xOffset, yOffset, xSize, ySize);

		}
	} 
	
	public static class lonelyWanderer extends BaseMechanics.Unit{
		public lonelyWanderer(){
			this.sprites = new BufferedImage[2];
			this.speed = 2;
			this.type = Unit.Type.MELEE;
			this.name = "Joran";
			this.health = 100;
			this.attacks = new Attack[1];
			attacks[0] = new Attacks.GenericMelee();
			try{
				sprites[0] = ImageIO.read(new File("sprites/characters/body/mbody4.png"));
				sprites[1] = ImageIO.read(new File("sprites/characters/heads/mhead4.png"));
			}catch(Exception e){
				
			}
		}
		
		public void paint(Graphics2D g, int x, int y, double scaleFactor, double xOffset, double yOffset, int xSize, int ySize){
			super.paint(g, x, y, scaleFactor, xOffset, yOffset, xSize, ySize);
			
			g.drawImage(sprites[1], 
					//destination x co-ord 1
					(int)(x*sprites[1].getWidth()*scaleFactor) + (int) (xOffset*(sprites[1].getWidth()*scaleFactor*xSize)), 
					
					//destination y co-ord 1
					(int)(y*sprites[1].getHeight()*scaleFactor) + (int) (yOffset*(sprites[1].getHeight()*scaleFactor*ySize)), 
					
					//destination x co-ord 2
					(int)(x*sprites[1].getWidth()*scaleFactor + sprites[1].getWidth()*scaleFactor) + (int) (xOffset*(sprites[1].getWidth()*scaleFactor*xSize)), 
					
					//destination y co-ord 2
					(int)(y*sprites[1].getHeight()*scaleFactor + sprites[1].getHeight()*scaleFactor) + (int) (yOffset*(sprites[1].getHeight()*scaleFactor*ySize)),
					
					
					0, 0, sprites[1].getWidth(), sprites[1].getHeight(), null);
		}
	}
	
	public static class mysticSwordsman extends BaseMechanics.Unit{
		public mysticSwordsman(){
			this.sprites = new BufferedImage[2];
			this.speed = 2;
			this.type = Unit.Type.MELEE;
			this.name = "Stefan";
			this.health = 100;
			this.attacks = new Attack[1];
			attacks[0] = new Attacks.GenericMelee();
			try{
				sprites[0] = ImageIO.read(new File("sprites/characters/body/mbody6.png"));
				sprites[1] = ImageIO.read(new File("sprites/characters/heads/mhead6.png"));
			}catch(Exception e){
				
			}
		}
		
		public void paint(Graphics2D g, int x, int y, double scaleFactor, double xOffset, double yOffset, int xSize, int ySize){
			super.paint(g, x, y, scaleFactor, xOffset, yOffset, xSize, ySize);
			
			g.drawImage(sprites[1], 
					//destination x co-ord 1
					(int)(x*sprites[1].getWidth()*scaleFactor) + (int) (xOffset*(sprites[1].getWidth()*scaleFactor*xSize)), 
					
					//destination y co-ord 1
					(int)(y*sprites[1].getHeight()*scaleFactor) + (int) (yOffset*(sprites[1].getHeight()*scaleFactor*ySize)), 
					
					//destination x co-ord 2
					(int)(x*sprites[1].getWidth()*scaleFactor + sprites[1].getWidth()*scaleFactor) + (int) (xOffset*(sprites[1].getWidth()*scaleFactor*xSize)), 
					
					//destination y co-ord 2
					(int)(y*sprites[1].getHeight()*scaleFactor + sprites[1].getHeight()*scaleFactor) + (int) (yOffset*(sprites[1].getHeight()*scaleFactor*ySize)),
					
					
					0, 0, sprites[1].getWidth(), sprites[1].getHeight(), null);
		}
	}
	
	public static class robot extends BaseMechanics.Unit{
		public robot(){
			this.sprites = new BufferedImage[2];
			this.speed = 1;
			this.type = Unit.Type.MELEE;
			this.name = "F1ST-3-CUFF";
			this.health = 100;
			this.attacks = new Attack[1];
			attacks[0] = new Attacks.GenericMelee();
			try{
				sprites[0] = ImageIO.read(new File("sprites/characters/body/body.png"));
				sprites[1] = ImageIO.read(new File("sprites/characters/heads/head.png"));
			}catch(Exception e){
				
			}
		}
		
		public void paint(Graphics2D g, int x, int y, double scaleFactor, double xOffset, double yOffset, int xSize, int ySize){
			
			g.drawImage(sprites[1], 
					//destination x co-ord 1
					(int)(x*sprites[1].getWidth()*scaleFactor) + (int) (xOffset*(sprites[1].getWidth()*scaleFactor*xSize)), 
					
					//destination y co-ord 1
					(int)(y*sprites[1].getHeight()*scaleFactor) + (int) (yOffset*(sprites[1].getHeight()*scaleFactor*ySize)), 
					
					//destination x co-ord 2
					(int)(x*sprites[1].getWidth()*scaleFactor + sprites[1].getWidth()*scaleFactor) + (int) (xOffset*(sprites[1].getWidth()*scaleFactor*xSize)), 
					
					//destination y co-ord 2
					(int)(y*sprites[1].getHeight()*scaleFactor + sprites[1].getHeight()*scaleFactor) + (int) (yOffset*(sprites[1].getHeight()*scaleFactor*ySize)),
					
					
					0, 0, sprites[1].getWidth(), sprites[1].getHeight(), null);
			super.paint(g, x, y, scaleFactor, xOffset, yOffset, xSize, ySize);

		}
	}
	
	public static class femRanger extends BaseMechanics.Unit{
		public femRanger(){
			this.sprites = new BufferedImage[2];
			this.speed = 3.5;
			this.type = Unit.Type.RANGED;
			this.name = "Carmen";
			this.health = 100;
			
			try{
				sprites[0] = ImageIO.read(new File("sprites/characters/body/fbody5.png"));
				sprites[1] = ImageIO.read(new File("sprites/characters/heads/fhead5.png"));
			}catch(Exception e){
				
			}
			this.attacks = new Attack[1];
			attacks[0] = new Attacks.BaseRanged();
		}
		
		public void paint(Graphics2D g, int x, int y, double scaleFactor, double xOffset, double yOffset, int xSize, int ySize){
			super.paint(g, x, y, scaleFactor, xOffset, yOffset, xSize, ySize);
			
			g.drawImage(sprites[1], 
					//destination x co-ord 1
					(int)(x*sprites[1].getWidth()*scaleFactor) + (int) (xOffset*(sprites[1].getWidth()*scaleFactor*xSize)), 
					
					//destination y co-ord 1
					(int)(y*sprites[1].getHeight()*scaleFactor) + (int) (yOffset*(sprites[1].getHeight()*scaleFactor*ySize)), 
					
					//destination x co-ord 2
					(int)(x*sprites[1].getWidth()*scaleFactor + sprites[1].getWidth()*scaleFactor) + (int) (xOffset*(sprites[1].getWidth()*scaleFactor*xSize)), 
					
					//destination y co-ord 2
					(int)(y*sprites[1].getHeight()*scaleFactor + sprites[1].getHeight()*scaleFactor) + (int) (yOffset*(sprites[1].getHeight()*scaleFactor*ySize)),
					
					
					0, 0, sprites[1].getWidth(), sprites[1].getHeight(), null);
		}
	}
	
	public static class unicornLady extends BaseMechanics.Unit{
		public unicornLady(){
			this.sprites = new BufferedImage[2];
			this.speed = 1.5;
			this.type = Unit.Type.MAGIC;
			this.name = "Ciel";
			this.health = 100;
			try{
				sprites[0] = ImageIO.read(new File("sprites/characters/heads/fhead6.png"));
				sprites[1] = ImageIO.read(new File("sprites/characters/body/fbody6.png"));
			}catch(Exception e){
				
			}
			this.attacks = new Attack[1];
			attacks[0] = new Attacks.BaseMagic();
		}
		
		public void paint(Graphics2D g, int x, int y, double scaleFactor, double xOffset, double yOffset, int xSize, int ySize){
			super.paint(g, x, y, scaleFactor, xOffset, yOffset, xSize, ySize);
			
			g.drawImage(sprites[1], 
					//destination x co-ord 1
					(int)(x*sprites[1].getWidth()*scaleFactor) + (int) (xOffset*(sprites[1].getWidth()*scaleFactor*xSize)), 
					
					//destination y co-ord 1
					(int)(y*sprites[1].getHeight()*scaleFactor) + (int) (yOffset*(sprites[1].getHeight()*scaleFactor*ySize)), 
					
					//destination x co-ord 2
					(int)(x*sprites[1].getWidth()*scaleFactor + sprites[1].getWidth()*scaleFactor) + (int) (xOffset*(sprites[1].getWidth()*scaleFactor*xSize)), 
					
					//destination y co-ord 2
					(int)(y*sprites[1].getHeight()*scaleFactor + sprites[1].getHeight()*scaleFactor) + (int) (yOffset*(sprites[1].getHeight()*scaleFactor*ySize)),
					
					
					0, 0, sprites[1].getWidth(), sprites[1].getHeight(), null);
		}
	}
	
	public static class DwayneJohnson extends BaseMechanics.Unit{
		public DwayneJohnson(){
			this.sprites = new BufferedImage[1];
			this.speed = 0;
			this.team = Team.NEUTRAL;
			this.type = Unit.Type.TYPELESS;
			try{
				sprites[0] = ImageIO.read(new File("sprites/rock.png"));
			}catch(Exception e){
				
			}
		}
	}
	
}
