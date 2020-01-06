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
				if( x == 0 || x == grid.length-1 || y == 0 || y == grid[x].length-1){
				//	grid[x][y] = new Tiles.StoneTile();
					grid[x][y].occupyingUnit = new Units.DwayneJohnson();
				}
			
			}
		}
		grid[4][3].occupyingUnit = new Units.baseRanger();
		grid[4][3].occupyingUnit.team = BaseMechanics.Unit.Team.PLAYER1;
		grid[5][3].occupyingUnit = new Units.baseMage();
		grid[5][3].occupyingUnit.team = BaseMechanics.Unit.Team.PLAYER1;
		grid[6][3].occupyingUnit = new Units.foxFighter();
		grid[6][3].occupyingUnit.team = BaseMechanics.Unit.Team.PLAYER1;
		grid[7][3].occupyingUnit = new Units.basePriestess();
		grid[7][3].occupyingUnit.team = BaseMechanics.Unit.Team.PLAYER1;
		grid[8][3].occupyingUnit = new Units.mysticSwordsman();
		grid[8][3].occupyingUnit.team = BaseMechanics.Unit.Team.PLAYER1;
		grid[9][3].occupyingUnit = new Units.robot();
		grid[9][3].occupyingUnit.team = BaseMechanics.Unit.Team.PLAYER1;
		
		grid[4][5].occupyingUnit = new Units.mrDavis();
		grid[4][5].occupyingUnit.team = BaseMechanics.Unit.Team.PLAYER2;
		grid[5][5].occupyingUnit = new Units.baseAssin();
		grid[5][5].occupyingUnit.team = BaseMechanics.Unit.Team.PLAYER2;
		grid[6][5].occupyingUnit = new Units.selfEntitled();
		grid[6][5].occupyingUnit.team = BaseMechanics.Unit.Team.PLAYER2;
		grid[7][5].occupyingUnit = new Units.lonelyWanderer();
		grid[7][5].occupyingUnit.team = BaseMechanics.Unit.Team.PLAYER2;
		grid[8][5].occupyingUnit = new Units.derpSwordsman();
		grid[8][5].occupyingUnit.team = BaseMechanics.Unit.Team.PLAYER2;
		grid[9][5].occupyingUnit = new Units.baseSwordsman();
		grid[9][5].occupyingUnit.team = BaseMechanics.Unit.Team.PLAYER2;
		
		grid[9][9].occupyingUnit = new Units.DwayneJohnson();
		grid[9][10].occupyingUnit = new Units.DwayneJohnson();

		
	}
}
}
