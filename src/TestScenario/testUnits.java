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
		public void paint(Graphics2D g, int x, int y, double scaleFactor, int xOffset, int yOffset) {
			g.drawImage(sprites[0], 
					x*sprites[0].getWidth()+xOffset, 
					y*sprites[0].getHeight()+yOffset, 
					(int)((x+1)*sprites[0].getWidth()*scaleFactor)+xOffset, 
					(int)((y+1)*sprites[0].getHeight()*scaleFactor)+yOffset, 
					
					0, 0, sprites[0].getWidth(), sprites[0].getHeight(), null);
		}
		
	}

}
