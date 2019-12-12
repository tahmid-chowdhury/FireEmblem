package ActualScenario;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class Units {
	public static class baseRanger extends BaseMechanics.Unit{
		public baseRanger(){
			this.sprites = new BufferedImage[2];
			this.speed = 3.5;
			try{
				sprites[0] = ImageIO.read(new File("sprites/characters/body/mbody1.png"));
				sprites[1] = ImageIO.read(new File("sprites/characters/heads/mhead1.png"));
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
	
	public static class baseMage extends BaseMechanics.Unit{
		public baseMage(){
			this.sprites = new BufferedImage[2];
			this.speed = 1.5;
			try{
				sprites[0] = ImageIO.read(new File("sprites/characters/body/fbody1.png"));
				sprites[1] = ImageIO.read(new File("sprites/characters/heads/fhead1.png"));
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
	
	public static class baseAssin extends BaseMechanics.Unit{
		public baseAssin(){
			this.sprites = new BufferedImage[3];
			this.speed = 2;
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
	
	public static class DwayneJohnson extends BaseMechanics.Unit{
		public DwayneJohnson(){
			this.sprites = new BufferedImage[1];
			this.speed = 0;
			this.team = 2;
			try{
				sprites[0] = ImageIO.read(new File("sprites/rock.png"));
			}catch(Exception e){
				
			}
		}
	}
	
}
