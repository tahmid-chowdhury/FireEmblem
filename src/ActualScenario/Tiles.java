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
	
	public static class BotRightPathField extends BaseMechanics.Tile {
		public BotRightPathField() {
			
			super();
			
			 terrainType = 0;
			 zAxis = 0;
			 passable = true;
			 tall = false;			
			//Drawing Stuff
			 try {
				sprite = ImageIO.read(new File(/*benis*/"sprites/land/betterGrassBotRight.png"));
				highlight = ImageIO.read(new File("sprites/Gui/selector.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				
				e.printStackTrace();
			};
		}
	}
	
	public static class BotLeftPathField extends BaseMechanics.Tile {
		public BotLeftPathField() {
			
			super();
			
			 terrainType = 0;
			 zAxis = 0;
			 passable = true;
			 tall = false;			
			//Drawing Stuff
			 try {
				sprite = ImageIO.read(new File(/*benis*/"sprites/land/betterGrassBotLeft.png"));
				highlight = ImageIO.read(new File("sprites/Gui/selector.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				
				e.printStackTrace();
			};
		}
	}
	
	public static class TopRightPathField extends BaseMechanics.Tile {
		public TopRightPathField() {
			
			super();
			
			 terrainType = 0;
			 zAxis = 0;
			 passable = true;
			 tall = false;			
			//Drawing Stuff
			 try {
				sprite = ImageIO.read(new File(/*benis*/"sprites/land/betterGrassTopRight.png"));
				highlight = ImageIO.read(new File("sprites/Gui/selector.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				
				e.printStackTrace();
			};
		}
	}
	
	public static class TopLeftPathField extends BaseMechanics.Tile {
		public TopLeftPathField() {
			
			super();
			
			 terrainType = 0;
			 zAxis = 0;
			 passable = true;
			 tall = false;			
			//Drawing Stuff
			 try {
				sprite = ImageIO.read(new File(/*benis*/"sprites/land/betterGrassTopLeft.png"));
				highlight = ImageIO.read(new File("sprites/Gui/selector.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				
				e.printStackTrace();
			};
		}
	}
	
	public static class BotRightPathFieldC extends BaseMechanics.Tile {
		public BotRightPathFieldC() {
			
			super();
			
			 terrainType = 0;
			 zAxis = 0;
			 passable = true;
			 tall = false;			
			//Drawing Stuff
			 try {
				sprite = ImageIO.read(new File(/*benis*/"sprites/land/betterGrassBotRightCon.png"));
				highlight = ImageIO.read(new File("sprites/Gui/selector.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				
				e.printStackTrace();
			};
		}
	}
	
	public static class BotLeftPathFieldC extends BaseMechanics.Tile {
		public BotLeftPathFieldC() {
			
			super();
			
			 terrainType = 0;
			 zAxis = 0;
			 passable = true;
			 tall = false;			
			//Drawing Stuff
			 try {
				sprite = ImageIO.read(new File(/*benis*/"sprites/land/betterGrassBotLeftCon.png"));
				highlight = ImageIO.read(new File("sprites/Gui/selector.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				
				e.printStackTrace();
			};
		}
	}
	
	public static class TopRightPathFieldC extends BaseMechanics.Tile {
		public TopRightPathFieldC() {
			
			super();
			
			 terrainType = 0;
			 zAxis = 0;
			 passable = true;
			 tall = false;			
			//Drawing Stuff
			 try {
				sprite = ImageIO.read(new File(/*benis*/"sprites/land/betterGrassTopRightCon.png"));
				highlight = ImageIO.read(new File("sprites/Gui/selector.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				
				e.printStackTrace();
			};
		}
	}
	
	public static class TopLeftPathFieldC extends BaseMechanics.Tile {
		public TopLeftPathFieldC() {
			
			super();
			
			 terrainType = 0;
			 zAxis = 0;
			 passable = true;
			 tall = false;			
			//Drawing Stuff
			 try {
				sprite = ImageIO.read(new File(/*benis*/"sprites/land/betterGrassTopLeftCon.png"));
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
			 passable = false;
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
	
	public static class Stone extends BaseMechanics.Tile {
		public Stone() {
			
			super();

			 terrainType = 0;
			 zAxis = 0;
			 passable = false;
			 tall = false;			
			//Drawing Stuff
			 try {
				sprite = ImageIO.read(new File(/*benis*/"sprites/land/rock.png"));
				highlight = ImageIO.read(new File("sprites/Gui/selector.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				
				e.printStackTrace();
			};
		}
	}
	
	public static class StoneTileBottom extends BaseMechanics.Tile {
		public StoneTileBottom() {
			
			super();

			 terrainType = 0;
			 zAxis = 0;
			 passable = false;
			 tall = false;			
			//Drawing Stuff
			 try {
				sprite = ImageIO.read(new File(/*benis*/"sprites/land/someMoreStone.png"));
				highlight = ImageIO.read(new File("sprites/Gui/selector.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				
				e.printStackTrace();
			};
		}
	}
	
	public static class PacmanBlank extends BaseMechanics.Tile {
		public PacmanBlank() {
			
			super();
			
			 terrainType = 0;
			 zAxis = 0;
			 passable = true;
			 tall = false;
			//Drawing Stuff
			 try {
				sprite = ImageIO.read(new File(/*benis*/"sprites/land/pacmanBlank.png"));
				highlight = ImageIO.read(new File("sprites/Gui/selector.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				
				e.printStackTrace();
			};
		}
	}
	
	public static class PacmanBottomLeft extends BaseMechanics.Tile {
		public PacmanBottomLeft() {
			
			super();
			
			 terrainType = 0;
			 zAxis = 0;
			 passable = false;
			 tall = true;			
			//Drawing Stuff
			 try {
				sprite = ImageIO.read(new File(/*benis*/"sprites/land/pacmanBlockBottomLeft.png"));
				highlight = ImageIO.read(new File("sprites/Gui/selector.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				
				e.printStackTrace();
			};
		}
	}
	
	public static class PacmanBottomRight extends BaseMechanics.Tile {
		public PacmanBottomRight() {
			
			super();
			
			 terrainType = 0;
			 zAxis = 0;
			 passable = false;
			 tall = true;			
			//Drawing Stuff
			 try {
				sprite = ImageIO.read(new File(/*benis*/"sprites/land/pacmanBlockBottomRight.png"));
				highlight = ImageIO.read(new File("sprites/Gui/selector.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				
				e.printStackTrace();
			};
		}
	}
	
	public static class PacmanLeft extends BaseMechanics.Tile {
		public PacmanLeft() {
			
			super();
			
			 terrainType = 0;
			 zAxis = 0;
			 passable = false;
			 tall = true;			
			//Drawing Stuff
			 try {
				sprite = ImageIO.read(new File(/*benis*/"sprites/land/pacmanBlockLeft.png"));
				highlight = ImageIO.read(new File("sprites/Gui/selector.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				
				e.printStackTrace();
			};
		}
	}
	
	public static class PacmanMid extends BaseMechanics.Tile {
		public PacmanMid() {
			
			super();
			
			 terrainType = 0;
			 zAxis = 0;
			 passable = false;
			 tall = true;			
			//Drawing Stuff
			 try {
				sprite = ImageIO.read(new File(/*benis*/"sprites/land/pacmanBlockMid.png"));
				highlight = ImageIO.read(new File("sprites/Gui/selector.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				
				e.printStackTrace();
			};
		}
	}
	
	public static class PacmanMidSide extends BaseMechanics.Tile {
		public PacmanMidSide() {
			
			super();
			
			 terrainType = 0;
			 zAxis = 0;
			 passable = false;
			 tall = true;			
			//Drawing Stuff
			 try {
				sprite = ImageIO.read(new File(/*benis*/"sprites/land/pacmanBlockMidSide.png"));
				highlight = ImageIO.read(new File("sprites/Gui/selector.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				
				e.printStackTrace();
			};
		}
	}
	
	public static class PacmanRight extends BaseMechanics.Tile {
		public PacmanRight() {
			
			super();
			
			 terrainType = 0;
			 zAxis = 0;
			 passable = false;
			 tall = true;			
			//Drawing Stuff
			 try {
				sprite = ImageIO.read(new File(/*benis*/"sprites/land/pacmanBlockRight.png"));
				highlight = ImageIO.read(new File("sprites/Gui/selector.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				
				e.printStackTrace();
			};
		}
	}
	
	public static class PacmanTop extends BaseMechanics.Tile {
		public PacmanTop() {
			
			super();
			
			 terrainType = 0;
			 zAxis = 0;
			 passable = false;
			 tall = true;			
			//Drawing Stuff
			 try {
				sprite = ImageIO.read(new File(/*benis*/"sprites/land/pacmanBlockTop.png"));
				highlight = ImageIO.read(new File("sprites/Gui/selector.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				
				e.printStackTrace();
			};
		}
	}
	
	public static class PacmanTopLeft extends BaseMechanics.Tile {
		public PacmanTopLeft() {
			
			super();
			
			 terrainType = 0;
			 zAxis = 0;
			 passable = false;
			 tall = true;			
			//Drawing Stuff
			 try {
				sprite = ImageIO.read(new File(/*benis*/"sprites/land/pacmanBlockTopLeft.png"));
				highlight = ImageIO.read(new File("sprites/Gui/selector.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				
				e.printStackTrace();
			};
		}
	}
	
	public static class PacmanTopRight extends BaseMechanics.Tile {
		public PacmanTopRight() {
			
			super();
			
			 terrainType = 0;
			 zAxis = 0;
			 passable = false;
			 tall = true;			
			//Drawing Stuff
			 try {
				sprite = ImageIO.read(new File(/*benis*/"sprites/land/pacmanBlockTopRight.png"));
				highlight = ImageIO.read(new File("sprites/Gui/selector.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				
				e.printStackTrace();
			};
		}
	}
	public static class PacmanBlock extends BaseMechanics.Tile {
		public PacmanBlock() {
			
			super();
			
			 terrainType = 0;
			 zAxis = 0;
			 passable = false;
			 tall = true;			
			//Drawing Stuff
			 try {
				sprite = ImageIO.read(new File(/*benis*/"sprites/land/pacmanSingleBlock.png"));
				highlight = ImageIO.read(new File("sprites/Gui/selector.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				
				e.printStackTrace();
			};
		}
	}
	
	public static class BottomRock extends BaseMechanics.Tile {
		public BottomRock() {
			
			super();
			
			 terrainType = 0;
			 zAxis = 0;
			 passable = false;
			 tall = false;			
			//Drawing Stuff
			 try {
				sprite = ImageIO.read(new File(/*benis*/"sprites/land/rockgrassbottom.png"));
				highlight = ImageIO.read(new File("sprites/Gui/selector.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				
				e.printStackTrace();
			};
		}
	}
	
	public static class TopRock extends BaseMechanics.Tile {
		public TopRock() {
			
			super();
			
			 terrainType = 0;
			 zAxis = 0;
			 passable = false;
			 tall = false;			
			//Drawing Stuff
			 try {
				sprite = ImageIO.read(new File(/*benis*/"sprites/land/rockgrasstop.png"));
				highlight = ImageIO.read(new File("sprites/Gui/selector.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				
				e.printStackTrace();
			};
		}
	}
	
	public static class LeftRock extends BaseMechanics.Tile {
		public LeftRock() {
			
			super();
			
			 terrainType = 0;
			 zAxis = 0;
			 passable = false;
			 tall = false;			
			//Drawing Stuff
			 try {
				sprite = ImageIO.read(new File(/*benis*/"sprites/land/rockgrassleft.png"));
				highlight = ImageIO.read(new File("sprites/Gui/selector.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				
				e.printStackTrace();
			};
		}
	}
	
	public static class RightRock extends BaseMechanics.Tile {
		public RightRock() {
			
			super();
			
			 terrainType = 0;
			 zAxis = 0;
			 passable = false;
			 tall = false;			
			//Drawing Stuff
			 try {
				sprite = ImageIO.read(new File(/*benis*/"sprites/land/rockgrassright.png"));
				highlight = ImageIO.read(new File("sprites/Gui/selector.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				
				e.printStackTrace();
			};
		}
	}
}
