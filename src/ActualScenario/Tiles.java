package ActualScenario;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Tiles {
	public static class BasicField extends BaseMechanics.Tile {
		public BasicField() {
			 terrainType = 0;
			 zAxis = 0;
			 passable = true;
			 tall = false;			
			//Drawing Stuff
			 try {
				sprite = ImageIO.read(new File(/*benis*/"sprites/betterGrass.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				
				e.printStackTrace();
			};
		}
	}
	
	public static class BasicStone extends BaseMechanics.Tile {
		public BasicStone() {
			 terrainType = 0;
			 zAxis = 0;
			 passable = true;
			 tall = false;			
			//Drawing Stuff
			 try {
				sprite = ImageIO.read(new File(/*benis*/"sprites/basicStone.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				
				e.printStackTrace();
			};
		}
	}
}
