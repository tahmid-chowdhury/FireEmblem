package TestScenario;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class testUnits {
	
	public static class testSpear extends BaseMechanics.Unit {
		
		public testSpear() {
			sprites = new BufferedImage[1];
			 try {
					sprites[0] = ImageIO.read(new File("sprites/premium.png"));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					
					e.printStackTrace();
				}
		}

		@Override
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

}
