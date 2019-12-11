package BaseMechanics;

import java.awt.Graphics2D;
import java.util.ArrayList;

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
	
	private static class node{
		int x; int y;
		node(int x, int y){this.x = x; this.y = y; }
		node(node n){this.x = n.x; this.y = n.y;}
		
		public boolean equals(node n){
			if(n.x == this.x && n.y== this.y){
				return true;
			}else{
				return false;
			}
		}
		
	}
	
	/*public boolean moveCheck(int x1, int y1, int x2, int y2){
		node end = new node(x1, y1);
		ArrayList<node> frontier = new ArrayList<node>();
		ArrayList<node> tempFrontier = new ArrayList<node>();
		
		frontier.add(new node(x2, y2));
		
		ArrayList<node> conquered = new ArrayList<node>();

		if(x1<0||x2<0||y1<0||y2<0||x1>=grid.length||x2>=grid.length||y1>=grid[x1].length||y2>=grid[x2].length){
			return false;
		}
		else if(
				grid[x1][y1].occupyingUnit!=null&&
				grid[x2][y2].occupyingUnit==null){
		//	while(!frontier.isEmpty()){
				for(int i = 0; i <= grid[x1][y1].occupyingUnit.speed; i++){
					for(node n : frontier){
						if(n.equals(end)){return true;}
						if(!conquered.contains(n)){
						//top row
						try{
							if(grid[n.x-1][n.y-1].passable&&grid[n.x-1][n.y-1].occupyingUnit==null){tempFrontier.add(new node(n.x-1, n.y-1));}	
						}catch(ArrayIndexOutOfBoundsException e){}
						try{
							if(grid[n.x][n.y-1].passable&&grid[n.x][n.y-1].occupyingUnit==null){tempFrontier.add(new node(n.x, n.y-1));}	
						}catch(ArrayIndexOutOfBoundsException e){}
						try{
							if(grid[n.x+1][n.y-1].passable&&grid[n.x+1][n.y-1].occupyingUnit==null){tempFrontier.add(new node(n.x+1, n.y-1));}	
						}catch(ArrayIndexOutOfBoundsException e){}
						//the sides
						try{
							if(grid[n.x-1][n.y-1].passable&&grid[n.x-1][n.y-1].occupyingUnit==null){tempFrontier.add(new node(n.x-1, n.y));}	
						}catch(ArrayIndexOutOfBoundsException e){}
						try{
							if(grid[n.x][n.y-1].passable&&grid[n.x][n.y-1].occupyingUnit==null){tempFrontier.add(new node(n.x+1, n.y));}	
						}catch(ArrayIndexOutOfBoundsException e){}
						//bottom shelf
						try{
							if(grid[n.x-1][n.y-1].passable&&grid[n.x-1][n.y-1].occupyingUnit==null){tempFrontier.add(new node(n.x-1, n.y-1));}	
						}catch(ArrayIndexOutOfBoundsException e){}
						try{
							if(grid[n.x][n.y-1].passable&&grid[n.x][n.y-1].occupyingUnit==null){tempFrontier.add(new node(n.x, n.y-1));}	
						}catch(ArrayIndexOutOfBoundsException e){}
						try{
							if(grid[n.x+1][n.y-1].passable&&grid[n.x+1][n.y-1].occupyingUnit==null){tempFrontier.add(new node(n.x+1, n.y-1));}	
						}catch(ArrayIndexOutOfBoundsException e){}
						
						conquered.add(new node(n));
						}
					}
					
					frontier.clear();
					frontier.addAll(tempFrontier);
				}
				
				return false;
				
		//	}
		}
		return true;
		
	}*/
}
