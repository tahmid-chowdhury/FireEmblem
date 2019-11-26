package BaseMechanics;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public abstract class Tile {
	//Game logic stuff
	public Unit occupyingUnit;
	protected int terrainType;
	protected int zAxis;
	protected boolean passable;
	protected boolean tall;
	
	public boolean isHighlighted;
	//Drawing Stuff
	public BufferedImage sprite;
	
	public BufferedImage highlight; 
	

		
}
