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
				grid[x][y] = new Tiles.BasicStone();
				}
				
			}
		}
		
	}
}
}
