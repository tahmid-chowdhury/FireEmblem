package BaseMechanics;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JPanel;

import com.sun.glass.events.KeyEvent;

import ActualScenario.Tiles;
import BaseMechanics.NewInputMethod.newKeyboardInput.eventType;
import BaseMechanics.NewInputMethod.newKeyboardInput.keyboardDataPkg;

public class Viewport{
	protected Map map;
	//Percentages of the map area
	public double xOffset;
	public double yOffset;
	//if this variable ever becomes 0 or negative it'll fuck everything up
	//do not let it fall below 0
	public double scaleFactor;
	
	protected double speed;
	
	public Viewport(Map m) {
		scaleFactor = 0.3001;
		map = m;
		speed = 0.01;
		
		xOffset=0.2;
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
				
						//AAAAAAAAAAAAAAAAAAAAAAAAAAHHHHHHHHHHHHHHHHHHHHH
						
						if(map.grid[x][y].occupyingUnit!=null) {
							map.grid[x][y].occupyingUnit.paint(g, x, y, scaleFactor, xOffset, yOffset, map.grid.length, map.grid[x].length);
						}
						
						//test code incoming
			/*			if(map.grid[x][y].isHighlighted&&map.grid[x][y].highlight!=null){
							//duplication
							
							g.drawImage(map.grid[x][y].highlight,
									//destination x co-ord 1
									(int)(x*map.grid[x][y].highlight.getWidth()*scaleFactor) + (int) (xOffset*(map.grid[x][y].highlight.getWidth()*scaleFactor*map.grid.length)), 
									
									//destination y co-ord 1
									(int)(y*map.grid[x][y].highlight.getHeight()*scaleFactor) + (int) (yOffset*(map.grid[x][y].highlight.getHeight()*scaleFactor*map.grid[x].length)), 
									
									//destination x co-ord 2
									(int)(x*map.grid[x][y].highlight.getWidth()*scaleFactor + map.grid[x][y].highlight.getWidth()*scaleFactor) + (int) (xOffset*(map.grid[x][y].highlight.getWidth()*scaleFactor*map.grid.length)), 
									
									//destination y co-ord 2
									(int)(y*map.grid[x][y].highlight.getHeight()*scaleFactor + map.grid[x][y].highlight.getHeight()*scaleFactor) + (int) (yOffset*(map.grid[x][y].highlight.getHeight()*scaleFactor*map.grid[x].length)),
									
									
									//source co-ords, don't touch these
									0, 0, map.grid[x][y].highlight.getWidth(),  map.grid[x][y].sprite.getHeight(), null);
							
						}	*/
			}
		}
	}
	//end of the paint method, keep track of those brackets!
	public void move(ArrayList<Integer> a) {
		if((((a.contains(KeyEvent.VK_LEFT)||a.contains(KeyEvent.VK_A))^(a.contains(KeyEvent.VK_RIGHT))||a.contains(KeyEvent.VK_D))||((a.contains(KeyEvent.VK_UP)||a.contains(KeyEvent.VK_W))^(a.contains(KeyEvent.VK_DOWN)||a.contains(KeyEvent.VK_S))))&&speed < 0.025) {
			//if(speed < 0.025) {
				speed += 0.0002;
			//}
		}else if((speed >= 0.025)&&(((a.contains(KeyEvent.VK_LEFT)||a.contains(KeyEvent.VK_A))^(a.contains(KeyEvent.VK_RIGHT)||a.contains(KeyEvent.VK_D)))||((a.contains(KeyEvent.VK_UP)||a.contains(KeyEvent.VK_W))^(a.contains(KeyEvent.VK_DOWN)||a.contains(KeyEvent.VK_S))||a.contains(KeyEvent.VK_S)))){}else {
			speed = 0.0001;
		}
		
		if(a.contains(KeyEvent.VK_LEFT)||a.contains(KeyEvent.VK_A)) {
			xOffset += speed/scaleFactor;
		}
		if(a.contains(KeyEvent.VK_RIGHT)||a.contains(KeyEvent.VK_D)) {
			xOffset -= speed/scaleFactor;
		}
		
		if(a.contains(KeyEvent.VK_UP)||a.contains(KeyEvent.VK_W)) {
			yOffset += speed/scaleFactor;
		}
		if(a.contains(KeyEvent.VK_DOWN)||a.contains(KeyEvent.VK_S)) {
			yOffset -= speed/scaleFactor;
		}
		
		if(scaleFactor >= 0.25&&a.contains(KeyEvent.VK_Z)) {
				scaleFactor -= 0.01;
		}else if(scaleFactor < 0.25) {
			scaleFactor = 0.25;
		}
		
		if(a.contains(KeyEvent.VK_X)&&scaleFactor <= 4) {
			scaleFactor += 0.01;
			/*if(scaleFactor > 4) {
				scaleFactor = 4;
			}*/
		}else if(scaleFactor > 4) {
			scaleFactor = 4;
		}

	}
}
