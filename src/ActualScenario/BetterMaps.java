package ActualScenario;

import BaseMechanics.Tile;
import TestScenario.testMap.testTile;
import TestScenario.testMap.testTile2;

public class BetterMaps {
	public static class Plains extends BaseMechanics.Map {
		{
		this.grid = new Tile[16][32];
		for(int x = 0; x < grid.length; x++) {
			for(int y = 0; y < grid[x].length; y++) {
				grid[x][y] = new Tiles.BasicField();
				if (x == 1) {
					if (y >= 12 && y <= 14) {
						grid[x][y] = new Tiles.Path();
					}
				}
				else if (x == 2) {
					if (y >= 11 && y <= 15) {
						grid[x][y] = new Tiles.Path();
					}
					else if (y >= 23 && y <= 26) {
						grid[x][y] = new Tiles.Path();
					}
				}
				else if (x == 3) {
					if (y >= 10 && y <= 16) {
						grid[x][y] = new Tiles.Path();
					}
					else if (y >= 23 && y <= 28) {
						grid[x][y] = new Tiles.Path();
					}
					else if (y >= 31 && y <= 32) {
						grid[x][y] = new Tiles.Path();
					}
				}
				else if (x == 4) {
					if (y >= 9 && y <= 12) {
						grid[x][y] = new Tiles.Path();
					}
					else if (y >= 14 && y <= 16) {
						grid[x][y] = new Tiles.Path();
					}
					else if (y >= 22 && y <= 32) {
						grid[x][y] = new Tiles.Path();
					}
				}
				else if (x == 5) {
					if (y >= 9 && y <= 10) {
						grid[x][y] = new Tiles.Path();
					}
					else if (y >= 15 && y <= 17) {
						grid[x][y] = new Tiles.Path();
					}
					else if (y >= 22 && y <= 24) {
						grid[x][y] = new Tiles.Path();
					}
					else if (y == 28) {
						grid[x][y] = new Tiles.Path();
					}
				}
				else if (x == 6) {
					if (y >= 9 && y <= 11) {
						grid[x][y] = new Tiles.Path();
					}
					else if (y >= 15 && y <= 17) {
						grid[x][y] = new Tiles.Path();
					}
					else if (y >= 21 && y <= 24) {
						grid[x][y] = new Tiles.Path();
					}
					else if (y >= 27 && y <= 28) {
						grid[x][y] = new Tiles.Path();
					}
					else if (y == 31) {
						grid[x][y] = new Tiles.Path();
					}
				}
				else if (x == 7) {
					if (y >= 8 && y <= 11) {
						grid[x][y] = new Tiles.Path();
					}
					else if (y >= 14 && y <= 18) {
						grid[x][y] = new Tiles.Path();
					}
					else if (y >= 21 && y <= 24) {
						grid[x][y] = new Tiles.Path();
					}
					else if (y >= 26 && y <= 28) {
						grid[x][y] = new Tiles.Path();
					}
					else if (y == 30) {
						grid[x][y] = new Tiles.Path();
					}
				}
				else if (x == 8) {
					if (y >= 8 && y <= 11) {
						grid[x][y] = new Tiles.Path();
					}
					else if (y >= 13 && y <= 18) {
						grid[x][y] = new Tiles.Path();
					}
					else if (y >= 20 && y <= 26) {
						grid[x][y] = new Tiles.Path();
					}
					else if (y == 30) {
						grid[x][y] = new Tiles.Path();
					}
				}
				else if (x == 9) {
					if (y >= 7 && y <= 22) {
						grid[x][y] = new Tiles.Path();
					}
					else if (y >= 25 && y <= 26) {
						grid[x][y] = new Tiles.Path();
					}
					else if (y == 29) {
						grid[x][y] = new Tiles.Path();
					}
				}
				else if (x == 10) {
					if (y >= 7 && y <= 14) {
						grid[x][y] = new Tiles.Path();
					}
					else if (y >= 16 && y <= 21) {
						grid[x][y] = new Tiles.Path();
					}
					else if (y == 26) {
						grid[x][y] = new Tiles.Path();
					}
					else if (y >= 28 && y <= 29) {
						grid[x][y] = new Tiles.Path();
					}
				}
				
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
