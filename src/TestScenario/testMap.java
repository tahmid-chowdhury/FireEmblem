package TestScenario;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import BaseMechanics.Tile;

public class testMap extends BaseMechanics.Map {
	public testMap() {
		this.grid = new Tile[9][9];
		for(int x = 0; x < grid.length; x++) {
			for(int y = 0; y < grid[x].length; y++) {
				grid[x][y] = new testTile();
			}
		}
	}
	
	public class testTile extends BaseMechanics.Tile {
		public testTile() {
			 terrainType = 0;
			 zAxis = -1;
			 passable = true;
			 tall = false;			
			//Drawing Stuff
			 try {
				sprite = ImageIO.read(new File("test_sprite.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				
				e.printStackTrace();
			};
		}
	}
}
