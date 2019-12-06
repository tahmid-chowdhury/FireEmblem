package ActualScenario;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Tiles extends BaseMechanics.Tile {
	

	public static class BasicField extends BaseMechanics.Tile {
		public BasicField() {
			
			super();
			
			 terrainType = 0;
			 zAxis = 0;
			 passable = true;
			 tall = false;			
			//Drawing Stuff
			 try {
				sprite = ImageIO.read(new File(/*benis*/"sprites/land/betterGrass.png"));
				highlight = ImageIO.read(new File("sprites/Gui/selector.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				
				e.printStackTrace();
			};
		}
	}
	
	public static class RightPathField extends BaseMechanics.Tile {
		public RightPathField() {
			
			super();
			
			 terrainType = 0;
			 zAxis = 0;
			 passable = true;
			 tall = false;			
			//Drawing Stuff
			 try {
				sprite = ImageIO.read(new File(/*benis*/"sprites/land/betterGrassRight.png"));
				highlight = ImageIO.read(new File("sprites/Gui/selector.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				
				e.printStackTrace();
			};
		}
	}
	
	public static class LeftPathField extends BaseMechanics.Tile {
		public LeftPathField() {

			super();

			 terrainType = 0;
			 zAxis = 0;
			 passable = true;
			 tall = false;			
			//Drawing Stuff
			 try {
				sprite = ImageIO.read(new File(/*benis*/"sprites/land/betterGrassLeft.png"));
				highlight = ImageIO.read(new File("sprites/Gui/selector.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				
				e.printStackTrace();
			};
		}
	}
	
	public static class BottomPathField extends BaseMechanics.Tile {
		public BottomPathField() {
			
			super();

			 terrainType = 0;
			 zAxis = 0;
			 passable = true;
			 tall = false;			
			//Drawing Stuff
			 try {
				sprite = ImageIO.read(new File(/*benis*/"sprites/land/betterGrassBottom.png"));
				highlight = ImageIO.read(new File("sprites/Gui/selector.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				
				e.printStackTrace();
			};
		}
	}
	
	public static class TopPathField extends BaseMechanics.Tile {
		public TopPathField() {
			
			super();
			
			 terrainType = 0;
			 zAxis = 0;
			 passable = true;
			 tall = false;			
			//Drawing Stuff
			 try {
				sprite = ImageIO.read(new File(/*benis*/"sprites/land/betterGrassTop.png"));
				highlight = ImageIO.read(new File("sprites/Gui/selector.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				
				e.printStackTrace();
			};
		}
	}
	
	public static class BasicStone extends BaseMechanics.Tile {
		public BasicStone() {
			
			super();
			
			 terrainType = 0;
			 zAxis = 0;
			 passable = true;
			 tall = false;			
			//Drawing Stuff
			 try {
				sprite = ImageIO.read(new File(/*benis*/"sprites/basicStone.png"));
				highlight = ImageIO.read(new File("sprites/Gui/selector.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				
				e.printStackTrace();
			};
		}
	}
	
	public static class Path extends BaseMechanics.Tile {
		public Path() {
			
			super();

			 terrainType = 0;
			 zAxis = 0;
			 passable = true;
			 tall = false;			
			//Drawing Stuff
			 try {
				sprite = ImageIO.read(new File(/*benis*/"sprites/land/path.png"));
				highlight = ImageIO.read(new File("sprites/Gui/selector.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				
				e.printStackTrace();
			};
		}
	}
	
	public static class Snow extends BaseMechanics.Tile {
		public Snow() {
			
			super();

			 terrainType = 0;
			 zAxis = 0;
			 passable = true;
			 tall = false;			
			//Drawing Stuff
			 try {
				sprite = ImageIO.read(new File(/*benis*/"sprites/land/snow.png"));
				highlight = ImageIO.read(new File("sprites/Gui/selector.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				
				e.printStackTrace();
			};
		}
	}
}
