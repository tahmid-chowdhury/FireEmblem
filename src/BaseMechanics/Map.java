package BaseMechanics;

import java.awt.Graphics2D;

public abstract class Map {
	public Tile[][] grid;
	
	public void move(int x1, int y1, int x2, int y2){
		if(
			/*	grid[x1][y1].occupyingUnit!=null&&
				grid[x2][y2].occupyingUnit==null&&
				grid[x2][y2].passable&&
				
				Math.sqrt(((x1-x2)*(x1-x2))+((y1-y2)*(y1-y2))) < grid[x1][y1].occupyingUnit.speed	*/
				
				moveCheck(x1, y1, x2, y2)
				
				){
			
				grid[x2][y2].occupyingUnit = grid[x1][y1].occupyingUnit;
				grid[x1][y1].occupyingUnit = null;
		}
		
	}
	
	public boolean moveCheck(int x1, int y1, int x2, int y2){
		if(x1<0||x2<0||y1<0||y2<0||x1>=grid.length||x2>=grid.length||y1>=grid[x1].length||y2>=grid[x2].length){
			return false;
		}
		else if(
				grid[x1][y1].occupyingUnit!=null&&
				grid[x2][y2].occupyingUnit==null&&
				grid[x2][y2].passable&&
				(Math.abs(grid[x2][y2].zAxis-grid[x1][y1].zAxis)==1||Math.abs(grid[x2][y2].zAxis-grid[x1][y1].zAxis)==0)&&
				
				Math.sqrt(((x1-x2)*(x1-x2))+((y1-y2)*(y1-y2))) <= grid[x1][y1].occupyingUnit.speed
				){
			return true;
		}else{
			return false;
		}
	}
}
