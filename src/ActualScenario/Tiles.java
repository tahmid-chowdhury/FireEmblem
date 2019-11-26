package ActualScenario;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Tiles {
	
	public static BufferedImage highlight; 
	
	static {
		highlight = null;
		try {
				highlight = ImageIO.read(new File(/*benis*/"sprites/Gui/selector.png"));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	}
		
	
	public static class BasicField extends BaseMechanics.Tile {
		public BasicField() {
			
			
			
			 terrainType = 0;
			 zAxis = 0;
			 passable = true;
			 tall = false;			
			//Drawing Stuff
			 try {
				sprite = ImageIO.read(new File(/*benis*/"sprites/land/betterGrass.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				
				e.printStackTrace();
			};
		}
	}
	
	public static class RightPathField extends BaseMechanics.Tile {
		public RightPathField() {
			 terrainType = 0;
			 zAxis = 0;
			 passable = true;
			 tall = false;			
			//Drawing Stuff
			 try {
				sprite = ImageIO.read(new File(/*benis*/"sprites/land/betterGrassRight.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				
				e.printStackTrace();
			};
		}
	}
	
	public static class LeftPathField extends BaseMechanics.Tile {
		public LeftPathField() {
			 terrainType = 0;
			 zAxis = 0;
			 passable = true;
			 tall = false;			
			//Drawing Stuff
			 try {
				sprite = ImageIO.read(new File(/*benis*/"sprites/land/betterGrassLeft.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				
				e.printStackTrace();
			};
		}
	}
	
	public static class BottomPathField extends BaseMechanics.Tile {
		public BottomPathField() {
			 terrainType = 0;
			 zAxis = 0;
			 passable = true;
			 tall = false;			
			//Drawing Stuff
			 try {
				sprite = ImageIO.read(new File(/*benis*/"sprites/land/betterGrassBottom.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				
				e.printStackTrace();
			};
		}
	}
	
	public static class TopPathField extends BaseMechanics.Tile {
		public TopPathField() {
			 terrainType = 0;
			 zAxis = 0;
			 passable = true;
			 tall = false;			
			//Drawing Stuff
			 try {
				sprite = ImageIO.read(new File(/*benis*/"sprites/land/betterGrassTop.png"));
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
	
	public static class Path extends BaseMechanics.Tile {
		public Path() {
			 terrainType = 0;
			 zAxis = 0;
			 passable = true;
			 tall = false;			
			//Drawing Stuff
			 try {
				sprite = ImageIO.read(new File(/*benis*/"sprites/land/path.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				
				e.printStackTrace();
			};
		}
	}
}
