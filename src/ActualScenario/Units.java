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
				sprites[1] = ImageIO.read(new File("sprites/characters/head/mrangerhead.png"));
			}catch(Exception e){
				
			}
		}
		
		public void paint(Graphics2D g, int x, int y, double scaleFactor, double xOffset, double yOffset, int xSize, int ySize){
			super.paint(g, x, y, scaleFactor, xOffset, yOffset, xSize, ySize);
			
			
		}
	}
}
