package BaseMechanics;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class Viewport{
	protected Map map;
	//Percentages of the map area
	protected double xOffset;
	protected double yOffset;
	//if this variable ever becomes 0 or negative it'll fuck everything up
	//do not let it fall below 0
	protected double scaleFactor;
	
	public Viewport(Map m) {
		scaleFactor = 0.25;
		map = m;
		
		xOffset=0.05;
		yOffset=-0.05;
	}
	
	public void paint(Graphics2D g){
		for(int x = 0; x < map.grid.length; x++) {
			for(int y = 0; y < map.grid[x].length; y++) {
				g.drawImage(map.grid[x][y].sprite,
						/*destination co-ords, apply scaling fuckery to these*/
						
						/* for each variable, subtract it's respective offset multiplied by the width/height of the frame
						 * then add the width/height of the sprite to it
						 */
						
						//destination x co-ord 1
						(int)(x*map.grid[x][y].sprite.getWidth()*scaleFactor) + (int) (xOffset*(map.grid[x][y].sprite.getWidth()*scaleFactor*map.grid.length)), 
						
						//destination y co-ord 1
						(int)(y*map.grid[x][y].sprite.getHeight()*scaleFactor) + (int) (yOffset*(map.grid[x][y].sprite.getHeight()*scaleFactor*map.grid[x].length)), 
						
						//destination x co-ord 2
						(int)(x*map.grid[x][y].sprite.getWidth()*scaleFactor + map.grid[x][y].sprite.getWidth()*scaleFactor) + (int) (xOffset*(map.grid[x][y].sprite.getWidth()*scaleFactor*map.grid.length)), 
						
						//destination y co-ord 2
						(int)(y*map.grid[x][y].sprite.getHeight()*scaleFactor + map.grid[x][y].sprite.getHeight()*scaleFactor) + (int) (yOffset*(map.grid[x][y].sprite.getHeight()*scaleFactor*map.grid[x].length)),
						
						
						/*source co-ords, don't touch these*/
						0, 0, map.grid[x][y].sprite.getWidth(),  map.grid[x][y].sprite.getHeight(), null);
			}
		}
	}
	//end of the paint method, keep track of those brackets!
	public void move(boolean[] a) {
		
	}
}
