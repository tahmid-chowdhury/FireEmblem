package ActualScenario;

import BaseMechanics.Tile;
import TestScenario.testMap.testTile;
import TestScenario.testMap.testTile2;

public class Maps {
	public static class OuterField extends BaseMechanics.Map {
		{
		this.grid = new Tile[16][12];
		for(int x = 0; x < grid.length; x++) {
			for(int y = 0; y < grid[x].length; y++) {
				grid[x][y] = new Tiles.BasicField();
				if(y >= 3 && y <= 5){
				grid[x][y] = new Tiles.Path();
					if(x == 2){
						grid[x][y] = new Tiles.RightPathField();
					}else if(x == 1){
						grid[x][y] = new Tiles.LeftPathField();
					}
				}
				if(y == 2){
					if(x!=2&&x!=1){
					grid[x][y] = new Tiles.BottomPathField();
					}
				}else if(y == 6){
						if(x!=2&&x!=1){
						grid[x][y] = new Tiles.TopPathField();
						}
					}
			}
		}
		grid[4][4].occupyingUnit = new Units.baseRanger();
		grid[5][4].occupyingUnit = new Units.baseMage();
		grid[6][4].occupyingUnit = new Units.baseAssin();
		
	}
}
}
