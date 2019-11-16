package BaseMechanics;

import java.awt.image.BufferedImage;

public abstract class Tile {
	//Game logic stuff
	protected Unit occupyingUnit;
	protected int terrainType;
	protected int zAxis;
	protected boolean passable;
	protected boolean tall;
	
	//Drawing Stuff
	protected BufferedImage sprite;
}
