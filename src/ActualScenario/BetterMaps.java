package ActualScenario;

import BaseMechanics.Tile;
import BaseMechanics.Unit;

public class BetterMaps {
	public static class Plains extends BaseMechanics.Map {
		{
			this.grid = new Tile[16][24];
			for(int x = 0; x < grid.length; x++) {
				for(int y = 0; y < grid[x].length; y++) {
					grid[x][y] = new Tiles.BasicField();
					if (x == 0) {
						if (y >= 11 && y <= 13) {
							grid[x][y] = new Tiles.Path();
						}
						else if (y >= 0 && y <= 2) {
							grid[x][y] = new Tiles.Stone();
						}
						else if (y == 9) {
							grid[x][y] = new Tiles.BotRightPathFieldC();
						}
						else if (y == 10) {
							grid[x][y] = new Tiles.BotRightPathField();
						}
						else if (y == 14) {
							grid[x][y] = new Tiles.TopRightPathField();
						}
						else if (y == 15) {
							grid[x][y] = new Tiles.TopRightPathFieldC();
						}
						else if (y == 21) {
							grid[x][y] = new Tiles.BotRightPathFieldC();
						}
						else if (y >= 22 && y <= 23) {
							grid[x][y] = new Tiles.RightPathField();
						}
					}
					else if (x == 1) {
						if (y >= 10 && y <= 14) {
							grid[x][y] = new Tiles.Path();
						}
						else if (y >= 22 && y <= 23) {
							grid[x][y] = new Tiles.Path();
						}
						else if (y >= 0 && y <= 2) {
							grid[x][y] = new Tiles.Stone();
						}
						else if (y == 8) {
							grid[x][y] = new Tiles.BotRightPathFieldC();
						}
						else if (y == 9) {
							grid[x][y] = new Tiles.BotRightPathField();
						}
						else if (y == 15) {
							grid[x][y] = new Tiles.TopRightPathField();
						}
						else if (y == 16) {
							grid[x][y] = new Tiles.TopRightPathFieldC();
						}
						else if (y == 21) {
							grid[x][y] = new Tiles.BottomPathField();
						}
					}
					else if (x == 2) {
						if (y >= 9 && y <= 15) {
							grid[x][y] = new Tiles.Path();
						}
						else if (y >= 22 && y <= 23) {
							grid[x][y] = new Tiles.Path();
						}
						else if (y >= 0 && y <= 1) {
							grid[x][y] = new Tiles.Stone();
						}
						else if (y == 7) {
							grid[x][y] = new Tiles.BotRightPathFieldC();
						}
						else if (y == 8) {
							grid[x][y] = new Tiles.BotRightPathField();
						}
						else if (y == 16) {
							grid[x][y] = new Tiles.TopPathField();
						}
						else if (y == 20) {
							grid[x][y] = new Tiles.BotRightPathFieldC();
						}
						else if (y == 21) {
							grid[x][y] = new Tiles.BotRightPathField();
						}
					}
					else if (x == 3) {
						if (y >= 8 && y <= 15) {
							grid[x][y] = new Tiles.Path();
						}
						else if (y >= 21 && y <= 23) {
							grid[x][y] = new Tiles.Path();
						}
						else if (y >= 0 && y <= 1) {
							grid[x][y] = new Tiles.Stone();
						}
						else if (y == 7) {
							grid[x][y] = new Tiles.BottomPathField();
						}
						else if (y == 16) {
							grid[x][y] = new Tiles.TopRightPathField();
						}
						else if (y == 17) {
							grid[x][y] = new Tiles.TopRightPathFieldC();
						}
						else if (y == 20) {
							grid[x][y] = new Tiles.BottomPathField();
						}
					}
					else if (x == 4) {
						if (y >= 8 && y <= 10) {
							grid[x][y] = new Tiles.Path();
						}
						else if (y >= 14 && y <= 16) {
							grid[x][y] = new Tiles.Path();
						}
						else if (y >= 21 && y <= 23) {
							grid[x][y] = new Tiles.Path();
						}
						else if (y == 0) {
							grid[x][y] = new Tiles.Stone();
						}
						else if (y == 11) {
							grid[x][y] = new Tiles.TopLeftPathField();
						}
						else if (y == 12) {
							grid[x][y] = new Tiles.LeftPathField();
						}
						else if (y == 13) {
							grid[x][y] = new Tiles.BotLeftPathField();
						}
						else if (y == 17) {
							grid[x][y] = new Tiles.TopPathField();
						}
						else if (y == 20) {
							grid[x][y] = new Tiles.BotRightPathField();
						}
						else if (y == 19) {
							grid[x][y] = new Tiles.BotRightPathFieldC();
						}
						else if (y == 10 || y == 11 || y == 12) {
							grid[x][y].occupyingUnit = new Units.DwayneJohnson();
						}
						else if (y == 7) {
							grid[x][y] = new Tiles.BottomPathField();
						}
					}
					else if (x == 5) {
						if (y >= 8 && y <= 10) {
							grid[x][y] = new Tiles.Path();
						}
						else if (y >= 14 && y <= 16) {
							grid[x][y] = new Tiles.Path();
						}
						else if (y >= 20 && y <= 23) {
							grid[x][y] = new Tiles.Path();
						}
						else if (y == 7) {
							grid[x][y] = new Tiles.BotRightPathField();
						}
						else if (y == 6) {
							grid[x][y] = new Tiles.BotRightPathFieldC();
						}
						else if (y == 11) {
							grid[x][y] = new Tiles.TopPathField();
						}
						else if (y == 13) {
							grid[x][y] = new Tiles.BotRightPathField();
						}
						else if (y == 12) {
							grid[x][y] = new Tiles.BotRightPathFieldC();
						}
						else if (y == 17) {
							grid[x][y] = new Tiles.TopRightPathField();
						}
						else if (y == 18) {
							grid[x][y] = new Tiles.TopRightPathFieldC();
						}
						else if (y == 19) {
							grid[x][y] = new Tiles.BottomPathField();
						}
					}
					else if (x == 6) {
						if (y >= 7 && y <= 10) {
							grid[x][y] = new Tiles.Path();
						}
						else if (y >= 13 && y <= 17) {
							grid[x][y] = new Tiles.Path();
						}
						else if (y >= 20 && y <= 23) {
							grid[x][y] = new Tiles.Path();
						}
						else if (y == 11) {
							grid[x][y] = new Tiles.TopRightPathField();
						}
						else if (y == 12) {
							grid[x][y] = new Tiles.BotRightPathField();
						}
						else if (y == 18) {
							grid[x][y] = new Tiles.TopRightPathField();
						}
						else if (y == 19) {
							grid[x][y] = new Tiles.BotRightPathField();
						}
						else if (y == 6) {
							grid[x][y] = new Tiles.BottomPathField();
						}
					}
					else if (x == 7) {
						if (y >= 7 && y <= 23) {
							grid[x][y] = new Tiles.Path();
						}
						else if (y == 5) {
							grid[x][y] = new Tiles.BotRightPathFieldC();
						}
						else if (y == 6) {
							grid[x][y] = new Tiles.BotRightPathField();
						}
					}
					else if (x == 8) {
						if (y >= 6 && y <= 21) {
							grid[x][y] = new Tiles.Path();
						}
						else if (y == 5) {
							grid[x][y] = new Tiles.BottomPathField();
						}
						else if (y == 22) {
							grid[x][y] = new Tiles.TopLeftPathField();
						}
						else if (y == 23) {
							grid[x][y] = new Tiles.LeftPathField();
						}
					}
					else if (x == 9) {
						if (y >= 6 && y <= 21) {
							grid[x][y] = new Tiles.Path();
						}
						else if (y >= 0 && y <= 4) {
							grid[x][y] = new Tiles.RightPathField();
						}
						else if (y == 5) {
							grid[x][y] = new Tiles.BotRightPathField();
						}
						else if (y == 22) {
							grid[x][y] = new Tiles.TopPathField();
						}
					}
					else if (x == 10) {
						if (y >= 0 && y <= 8) {
							grid[x][y] = new Tiles.Path();
						}
						else if (y >= 11 && y <= 13) {
							grid[x][y] = new Tiles.Path();
						}
						else if (y >= 16 && y <= 21) {
							grid[x][y] = new Tiles.Path();
						}
						else if (y == 9 || y == 14) {
							grid[x][y] = new Tiles.TopLeftPathField();
						}
						else if (y == 10 || y == 15) { 
							grid[x][y] = new Tiles.BotLeftPathField();
						}
						else if (y == 22) {
							grid[x][y] = new Tiles.TopPathField();
						}
					}
					else if (x == 11) {
						if (y >= 0 && y <= 6) {
							grid[x][y] = new Tiles.Path();
						}
						else if (y >= 18 && y <= 21) {
							grid[x][y] = new Tiles.Path();
						}
						else if (y == 7) {
							grid[x][y] = new Tiles.TopLeftPathField();
						}
						else if (y == 8) {
							grid[x][y] = new Tiles.LeftPathField();
						}
						else if (y == 9) {
							grid[x][y] = new Tiles.TopLeftPathFieldC();
						}
						else if (y == 10) {
							grid[x][y] = new Tiles.BotLeftPathFieldC();
						}
						else if (y >= 11 && y <= 13) {
							grid[x][y] = new Tiles.LeftPathField();
						}
						else if (y == 14) {
							grid[x][y] = new Tiles.TopLeftPathFieldC();
						}
						else if (y == 15) {
							grid[x][y] = new Tiles.BotLeftPathFieldC();
						}
						else if (y == 16) {
							grid[x][y] = new Tiles.LeftPathField();
						}
						else if (y == 17) {
							grid[x][y] = new Tiles.BotLeftPathField();
						}
						else if (y == 22) {
							grid[x][y] = new Tiles.TopPathField();
						}
					}
					else if (x == 12) {
						if (y >= 19 && y <= 21) {
							grid[x][y] = new Tiles.Path();
						}
						else if (y == 11) {
							grid[x][y] = new Tiles.Stone();
						}
						else if (y >= 0 && y <= 6) {
							grid[x][y] = new Tiles.LeftPathField();
						}
						else if (y == 7) {
							grid[x][y] = new Tiles.TopLeftPathFieldC();
						}
						else if (y == 17) {
							grid[x][y] = new Tiles.BotLeftPathFieldC();
						}
						else if (y == 18) {
							grid[x][y] = new Tiles.BotLeftPathField();
						}
						else if (y == 22) {
							grid[x][y] = new Tiles.TopPathField();
						}
					}
					else if (x == 13) {
						if (y >= 20 && y <= 21) {
							grid[x][y] = new Tiles.Path();
						}
						else if (y >= 10 && y <= 11) {
							grid[x][y] = new Tiles.Stone();
						}
						else if (y == 18) {
							grid[x][y] = new Tiles.BotLeftPathFieldC();
						}
						else if (y == 19) {
							grid[x][y] = new Tiles.BotLeftPathField();
						}
						else if (y == 22) {
							grid[x][y] = new Tiles.TopPathField();
						}
					}
					else if (x == 14) {
						if (y >= 20 && y <= 21) {
							grid[x][y] = new Tiles.Path();
						}
						else if (y >= 10 && y <= 12) {
							grid[x][y] = new Tiles.Stone();
						}
						else if (y == 19) {
							grid[x][y] = new Tiles.BottomPathField();
						}
						else if (y == 22) {
							grid[x][y] = new Tiles.TopRightPathField();
						}
						else if (y == 23) {
							grid[x][y] = new Tiles.TopRightPathFieldC();
						}
					}
					else if (x == 15) {
						if (y >= 20 && y <= 22) {
							grid[x][y] = new Tiles.Path();
						}
						else if (y == 0) {
							grid[x][y] = new Tiles.Stone();
						}
						else if (y >= 9 && y <= 12) {
							grid[x][y] = new Tiles.Stone();
						}
						else if (y == 19) {
							grid[x][y] = new Tiles.BottomPathField();
						}
						else if (y == 23) {
							grid[x][y] = new Tiles.TopPathField();
						}
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
			grid[10][3].occupyingUnit = new Units.unicornLady();
			grid[10][3].occupyingUnit.team = BaseMechanics.Unit.Team.PLAYER1;

			grid[4][20].occupyingUnit = new Units.mrDavis();
			grid[4][20].occupyingUnit.team = BaseMechanics.Unit.Team.PLAYER2;
			grid[5][20].occupyingUnit = new Units.baseAssin();
			grid[5][20].occupyingUnit.team = BaseMechanics.Unit.Team.PLAYER2;
			grid[6][20].occupyingUnit = new Units.selfEntitled();
			grid[6][20].occupyingUnit.team = BaseMechanics.Unit.Team.PLAYER2;
			grid[7][20].occupyingUnit = new Units.lonelyWanderer();
			grid[7][20].occupyingUnit.team = BaseMechanics.Unit.Team.PLAYER2;
			grid[8][20].occupyingUnit = new Units.winterRanger();
			grid[8][20].occupyingUnit.team = BaseMechanics.Unit.Team.PLAYER2;
			grid[9][20].occupyingUnit = new Units.baseSwordsman();
			grid[9][20].occupyingUnit.team = BaseMechanics.Unit.Team.PLAYER2;
			grid[10][20].occupyingUnit = new Units.femRanger();
			grid[10][20].occupyingUnit.team = BaseMechanics.Unit.Team.PLAYER2;

			grid[4][11].occupyingUnit = new Units.DwayneJohnson();
			grid[4][12].occupyingUnit = new Units.DwayneJohnson();
			grid[5][12].occupyingUnit = new Units.DwayneJohnson();
			grid[13][16].occupyingUnit = new Units.DwayneJohnson();
		}
	}
	public static class Pacman extends BaseMechanics.Map {
		{
			this.grid = new Tile[16][32];
			for(int x = 0; x < grid.length; x++) {
				for(int y = 0; y < grid[x].length; y++) {
					grid[x][y] = new Tiles.PacmanBlank();
					if (x == 1) {
						if (y == 2) {
							grid[x][y] = new Tiles.PacmanTopLeft();
						}
						else if (y >= 3 && y <= 10) {
							grid[x][y] = new Tiles.PacmanMid();
						}
						else if (y == 11) {
							grid[x][y] = new Tiles.PacmanBottomLeft();
						}
						else if (y == 14) {
							grid[x][y] = new Tiles.PacmanTopLeft();
						}
						else if (y >= 15 && y <= 16) {
							grid[x][y] = new Tiles.PacmanMid();
						}
						else if (y == 17) {
							grid[x][y] = new Tiles.PacmanBottomLeft();
						}
						else if (y == 20) {
							grid[x][y] = new Tiles.PacmanTopLeft();
						}
						else if (y >= 21 && y <= 28) {
							grid[x][y] = new Tiles.PacmanMid();
						}
						else if (y == 29) {
							grid[x][y] = new Tiles.PacmanBottomLeft();
						}
					}
					else if (x == 2) {
						if (y == 2 || y == 29) {
							grid[x][y] = new Tiles.PacmanMidSide();
						}
						else if (y == 11 || y == 17) {
							grid[x][y] = new Tiles.PacmanTopRight();
						}
						else if (y >= 12 && y <= 13) {
							grid[x][y] = new Tiles.PacmanMid();
						}
						else if (y >= 18 && y <= 19) {
							grid[x][y] = new Tiles.PacmanMid();
						}
						else if (y == 14 || y == 20) {
							grid[x][y] = new Tiles.PacmanBottomRight();
						}
					}
					else if (x == 3) {
						if (y == 2 || y == 29) {
							grid[x][y] = new Tiles.PacmanMidSide();
						}
						else if (y == 5 || y == 8) {
							grid[x][y] = new Tiles.PacmanBlock();
						}
						else if (y == 23 || y == 26) {
							grid[x][y] = new Tiles.PacmanLeft();
						}
					}
					else if (x == 4) {
						if (y == 2 || y == 23 || y == 29) {
							grid[x][y] = new Tiles.PacmanMidSide();
						}
						else if (y == 26) {
							grid[x][y] = new Tiles.PacmanRight();
						}
					}
					else if (x == 5) {
						if (y == 2 || y == 29) {
							grid[x][y] = new Tiles.PacmanMidSide();
						}
						else if (y == 5) {
							grid[x][y] = new Tiles.PacmanBlock();
						}
						else if (y == 9) {
							grid[x][y] = new Tiles.PacmanTop();
						}
						else if (y == 10) {
							grid[x][y] = new Tiles.PacmanMid();
						}
						else if (y == 11) {
							grid[x][y] = new Tiles.PacmanBottomLeft();
						}
						else if (y == 14 || y == 17 || y == 20) {
							grid[x][y] = new Tiles.PacmanLeft();
						}
						else if (y == 23) {
							grid[x][y] = new Tiles.PacmanRight();
						}
					}
					else if (x == 6) {
						if (y == 2 || y == 20 || y == 29) {
							grid[x][y] = new Tiles.PacmanMidSide();
						}
						else if (y == 11) {
							grid[x][y] = new Tiles.PacmanRight();
						}
						else if (y == 14) {
							grid[x][y] = new Tiles.PacmanTopRight();
						}
						else if (y == 15 || y == 16) {
							grid[x][y] = new Tiles.PacmanMid();
						}
						else if (y == 17) {
							grid[x][y] = new Tiles.PacmanBottomRight();
						}
					}
					else if (x == 7) {
						if (y == 2) {
							grid[x][y] = new Tiles.PacmanTopRight();
						}
						else if (y >= 3 && y <= 7) {
							grid[x][y] = new Tiles.PacmanMid();
						}
						else if (y == 8) {
							grid[x][y] = new Tiles.PacmanBottomLeft();
						}
						else if (y == 20) {
							grid[x][y] = new Tiles.PacmanMidSide();
						}
						else if (y == 27) {
							grid[x][y] = new Tiles.PacmanTopLeft();
						}
						else if (y == 28) {
							grid[x][y] = new Tiles.PacmanMid();
						}
						else if (y == 29) {
							grid[x][y] = new Tiles.PacmanBottomRight();
						}
					}
					else if (x == 8) {
						if (y == 2) {
							grid[x][y] = new Tiles.PacmanTopLeft();
						}
						else if (y >= 3 && y <= 7) {
							grid[x][y] = new Tiles.PacmanMid();
						}
						else if (y == 8) {
							grid[x][y] = new Tiles.PacmanBottomRight();
						}
						else if (y == 20) {
							grid[x][y] = new Tiles.PacmanMidSide();
						}
						else if (y == 27) {
							grid[x][y] = new Tiles.PacmanTopRight();
						}
						else if (y == 28) {
							grid[x][y] = new Tiles.PacmanMid();
						}
						else if (y == 29) {
							grid[x][y] = new Tiles.PacmanBottomLeft();
						}
					}
					else if (x == 9) {
						if (y == 2 || y == 20 || y == 29) {
							grid[x][y] = new Tiles.PacmanMidSide();
						}
						else if (y == 11) {
							grid[x][y] = new Tiles.PacmanLeft();
						}
						else if (y == 14) {
							grid[x][y] = new Tiles.PacmanTopLeft();
						}
						else if (y == 15 || y == 16) {
							grid[x][y] = new Tiles.PacmanMid();
						}
						else if (y == 17) {
							grid[x][y] = new Tiles.PacmanBottomLeft();
						}
					}
					else if (x == 10) {
						if (y == 2 || y == 29) {
							grid[x][y] = new Tiles.PacmanMidSide();
						}
						else if (y == 5) {
							grid[x][y] = new Tiles.PacmanBlock();
						}
						else if (y == 9) {
							grid[x][y] = new Tiles.PacmanTop();
						}
						else if (y == 10) {
							grid[x][y] = new Tiles.PacmanMid();
						}
						else if (y == 11) {
							grid[x][y] = new Tiles.PacmanBottomRight();
						}
						else if (y == 14 || y == 17 || y == 20) {
							grid[x][y] = new Tiles.PacmanRight();
						}
						else if (y == 23) {
							grid[x][y] = new Tiles.PacmanLeft();
						}
					}
					else if (x == 11) {
						if (y == 2 || y == 23 || y == 29) {
							grid[x][y] = new Tiles.PacmanMidSide();
						}
						else if (y == 26) {
							grid[x][y] = new Tiles.PacmanLeft();
						}
					}
					else if (x == 12) {
						if (y == 2 || y == 29) {
							grid[x][y] = new Tiles.PacmanMidSide();
						}
						else if (y == 5 || y == 8) {
							grid[x][y] = new Tiles.PacmanBlock();
						}
						else if (y == 23 || y == 26) {
							grid[x][y] = new Tiles.PacmanRight();
						}
					}
					else if (x == 13) {
						if (y == 2 || y == 29) {
							grid[x][y] = new Tiles.PacmanMidSide();
						}
						else if (y == 11 || y == 17) {
							grid[x][y] = new Tiles.PacmanTopLeft();
						}
						else if (y >= 12 && y <= 13) {
							grid[x][y] = new Tiles.PacmanMid();
						}
						else if (y >= 18 && y <= 19) {
							grid[x][y] = new Tiles.PacmanMid();
						}
						else if (y == 14 || y == 20) {
							grid[x][y] = new Tiles.PacmanBottomLeft();
						}
					}
					else if (x == 14) {
						if (y == 2) {
							grid[x][y] = new Tiles.PacmanTopRight();
						}
						else if (y >= 3 && y <= 10) {
							grid[x][y] = new Tiles.PacmanMid();
						}
						else if (y == 11) {
							grid[x][y] = new Tiles.PacmanBottomRight();
						}
						else if (y == 14) {
							grid[x][y] = new Tiles.PacmanTopRight();
						}
						else if (y >= 15 && y <= 16) {
							grid[x][y] = new Tiles.PacmanMid();
						}
						else if (y == 17) {
							grid[x][y] = new Tiles.PacmanBottomRight();
						}
						else if (y == 20) {
							grid[x][y] = new Tiles.PacmanTopRight();
						}
						else if (y >= 21 && y <= 28) {
							grid[x][y] = new Tiles.PacmanMid();
						}
						else if (y == 29) {
							grid[x][y] = new Tiles.PacmanBottomRight();
						}
					}
				}
			}

			grid[2][3].occupyingUnit = new Units.baseRanger();
			grid[2][3].occupyingUnit.team = BaseMechanics.Unit.Team.PLAYER1;
			grid[4][3].occupyingUnit = new Units.baseMage();
			grid[4][3].occupyingUnit.team = BaseMechanics.Unit.Team.PLAYER1;
			grid[6][3].occupyingUnit = new Units.foxFighter();
			grid[6][3].occupyingUnit.team = BaseMechanics.Unit.Team.PLAYER1;
			grid[9][3].occupyingUnit = new Units.basePriestess();
			grid[9][3].occupyingUnit.team = BaseMechanics.Unit.Team.PLAYER1;
			grid[11][3].occupyingUnit = new Units.mysticSwordsman();
			grid[11][3].occupyingUnit.team = BaseMechanics.Unit.Team.PLAYER1;
			grid[13][3].occupyingUnit = new Units.robot();
			grid[13][3].occupyingUnit.team = BaseMechanics.Unit.Team.PLAYER1;

			grid[2][28].occupyingUnit = new Units.mrDavis();
			grid[2][28].occupyingUnit.team = BaseMechanics.Unit.Team.PLAYER2;
			grid[4][28].occupyingUnit = new Units.baseAssin();
			grid[4][28].occupyingUnit.team = BaseMechanics.Unit.Team.PLAYER2;
			grid[6][28].occupyingUnit = new Units.selfEntitled();
			grid[6][28].occupyingUnit.team = BaseMechanics.Unit.Team.PLAYER2;
			grid[9][28].occupyingUnit = new Units.lonelyWanderer();
			grid[9][28].occupyingUnit.team = BaseMechanics.Unit.Team.PLAYER2;
			grid[11][28].occupyingUnit = new Units.baseSwordsman();
			grid[11][28].occupyingUnit.team = BaseMechanics.Unit.Team.PLAYER2;
			grid[13][28].occupyingUnit = new Units.femRanger();
			grid[13][28].occupyingUnit.team = BaseMechanics.Unit.Team.PLAYER2;

		}
	}
}
