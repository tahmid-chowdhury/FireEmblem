package BaseMechanics;

import java.awt.image.BufferedImage;

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
}
