package BaseMechanics;

import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.LinkedList;

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
	 
	public boolean checkAttack(int x1, int y1, int x2, int y2){
		if(x1<0||x2<0||y1<0||y2<0||x1>=grid.length||x2>=grid.length||y1>=grid[x1].length||y2>=grid[x2].length){
			return false;
		}
		else if(
				grid[x1][y1].occupyingUnit!=null&&
				grid[x2][y2].occupyingUnit!=null&&
				grid[x1][y1].occupyingUnit.team!=grid[x2][y2].occupyingUnit.team&&
				grid[x2][y2].passable&&
				(Math.abs(grid[x2][y2].zAxis-grid[x1][y1].zAxis)==1||Math.abs(grid[x2][y2].zAxis-grid[x1][y1].zAxis)==0)&&
				
				Math.sqrt(((x1-x2)*(x1-x2))+((y1-y2)*(y1-y2))) <= grid[x1][y1].occupyingUnit.speed
				){
			return true;
		}else{
			return false;
		}
	}
	
	/*private static class node{
		int x; int y; int f;
		node(int x, int y){this.x = x; this.y = y; }
		node(node n){this.x = n.x; this.y = n.y;}
		
		public boolean equals(node n){
			if(n.x == this.x && n.y== this.y){
				return true;
			}else{
				return false;
			}
		}
		
		public void updateF(node n){
			f = (int) Math.sqrt(((n.x-x)*(n.x-x))+((n.y-y)*(n.y-y)));
		}
		
		public LinkedList<node> returnAdjacent(Map m){
			LinkedList<node> temp = new LinkedList<node>();
			for(int x = -1; x <= 1; x++){
				for(int y = -1; y <= 1; y++){
					if((x==0&&y==0)||this.x+x < 0||this.y+y < 0||this.x+x >= m.grid.length||this.y+y >= m.grid[0].length){
						
					}else if(m.grid[this.x + x][this.y + y].passable){
						temp.add(new node(this.x + x, this.y + y));
					}
				}
			}
			return temp;
		}

		
	}
	
	public node returnLowestF(LinkedList<node> a, node end){
		node temp = new node(end);
		temp.f = Integer.MIN_VALUE;
		for(node n:a){
			n.updateF(end);
			if(n.f > temp.f){
				temp = n;
			}
		}
		return temp;
	}
	
	
	public boolean moveCheck(int x1, int y1, int x2, int y2){
		//https://www.raywenderlich.com/3016-introduction-to-a-pathfinding
		node end = new node(x2, y2);
		node iterate = null;
		LinkedList<node> frontier = new LinkedList<node>();
		LinkedList<node> adjacent = new LinkedList<node>();
		
		frontier.add(new node(x1, y1));
		
		LinkedList<node> conquered = new LinkedList<node>();

		if(x1<0||x2<0||y1<0||y2<0||x1>=grid.length||x2>=grid.length||y1>=grid[x1].length||y2>=grid[x2].length){
			return false;
		}
		else if(
				grid[x1][y1].occupyingUnit!=null&&
				grid[x2][y2].occupyingUnit==null){
			
			do{
				iterate = returnLowestF(frontier, end);
				
				conquered.add(iterate);
				frontier.remove(iterate);
				if(conquered.contains(end)){return true;}
				
				adjacent = iterate.returnAdjacent(this);
				
				for(node n: adjacent){
					if(conquered.contains(n)){}
					if(!frontier.contains(n)){
						n.updateF(end);
						frontier.add(n);
					}else{
						if(n.f < iterate.f){
							iterate = new node(n);
						}
					}
				}
				
				
			}while(!frontier.isEmpty());
		}
		return false;
		
	}	*/
}
