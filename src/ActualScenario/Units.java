package ActualScenario;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class Units {
	public static class baseRanger extends BaseMechanics.Unit{
		public baseRanger(){
			this.sprites = new BufferedImage[2];
			try{
				sprites[0] = ImageIO.read(new File("sprites/characters/body/mrangerbody.png"));
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
			try{
				sprites[0] = ImageIO.read(new File("sprites/characters/body/fmagebody.png"));
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
}
