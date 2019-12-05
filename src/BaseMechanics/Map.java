package BaseMechanics;

import java.awt.Graphics2D;

public abstract class Map {
	public Tile[][] grid;
	
	public void move(int x1, int y1, int x2, int y2){
		if(
				grid[x1][y1].occupyingUnit!=null&&
				grid[x2][y2].occupyingUnit==null&&
				grid[x2][y2].passable&&
				
				Math.sqrt(((x1-x2)*(x1-x2))+((y1-y2)*(y1-y2))) < grid[x1][y1].occupyingUnit.speed
				
				){
			
				grid[x2][y2].occupyingUnit = grid[x1][y1].occupyingUnit;
				grid[x1][y1].occupyingUnit = null;
		}
	}
}
