package ActualScenario;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import BaseMechanics.AllTogether;
import BaseMechanics.InputMethod;

public class UserInterface extends BaseMechanics.UserInterface {
	
	static double xsize;
	static double ysize;
	JFrame j;
	static InputMethod.Mouse mouse;
	
	public UserInterface(JFrame f, InputMethod.Mouse m){
		super();
		xsize = f.getWidth();
		ysize = f.getHeight();
		this.elements.add(new border());
		this.elements.add(new mouseGrid());
		j = f;
		mouse = m;
	}
	
	public void update(AllTogether a) {
		xsize = j.getWidth();
		ysize = j.getHeight();
		super.update(a);
	}
	
	public static class border extends BaseMechanics.UserInterface.Element {
		
		ArrayList<BufferedImage> sprites;
		
		public border(){
			sprites = new ArrayList<BufferedImage>(0);
			try{
				sprites.add(ImageIO.read(new File("sprites/Gui/borderLeft.png")));
				sprites.add(ImageIO.read(new File("sprites/Gui/borderMid.png")));
				sprites.add(ImageIO.read(new File("sprites/Gui/borderRight.png")));

			}catch(Exception e){
				
			}
		}
	
		@Override
		public void paint(Graphics2D g) {
			
		//	g.fillRect((int)(xsize*0.05), (int)(ysize*0.65), (int)(xsize*0.9), (int)(ysize*0.25));
			
			//IT'S A HARD KNOCK LIFE FOR US
			g.drawImage(sprites.get(0), 
					//only scale the destination with height
					
					(int)(xsize*0.05), 
					
					(int)(ysize*0.65), 
					
					(int)((xsize*0.05)+(sprites.get(0).getWidth()*(xsize/ysize))) , 
					
					(int)((ysize*0.75)+(sprites.get(0).getHeight()*(xsize/ysize))),
					
					0, 0, sprites.get(0).getWidth(), sprites.get(0).getHeight(), null);
			

			g.drawImage(sprites.get(1), 
					//only scale the destination with height
					
					(int)((xsize*0.05)+(sprites.get(0).getWidth()*(xsize/ysize))), 
					
					(int)(ysize*0.65), 
					
					(int)((xsize*0.9)/*-(sprites.get(2).getWidth()*(xsize/ysize))*/), 
					
					(int)((ysize*0.75)+(sprites.get(1).getHeight()*(xsize/ysize))),
					
					0, 0, sprites.get(1).getWidth(), sprites.get(1).getHeight(), null);
			
			
			g.drawImage(sprites.get(2), 
					//only scale the destination with height
					
					(int)(xsize*0.9), 
					
					(int)(ysize*0.65), 
					
					(int)((xsize*0.9)+(sprites.get(2).getWidth()*(xsize/ysize))) , 
					
					(int)((ysize*0.75)+(sprites.get(2).getHeight()*(xsize/ysize))),
					
					0, 0, sprites.get(2).getWidth(), sprites.get(2).getHeight(), null);
			
			
			
		}

		@Override
		public void update(AllTogether a) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	public static class mouseGrid extends BaseMechanics.UserInterface.Element {
		
		boolean test;
		
		@Override
		public void paint(Graphics2D g) {
			g.setColor(Color.RED);
			g.drawString("x:"+mouse.CurrentInputs[0]+" y:"+mouse.CurrentInputs[1]+" "+test, 69, 69);
		}

		@Override
		public void update(AllTogether a) {
			test = mouse.pressed;
		if(mouse.pressed){	
			for(int x = 0; x < a.map.grid.length; x++) {
				for(int y = 0; y < a.map.grid[x].length; y++) {
							//See viewport if these statements don't make sense
							if(
							mouse.CurrentInputs[0] >= (x*a.map.grid[x][y].sprite.getWidth()*a.viewport.scaleFactor) +  (a.viewport.xOffset*(a.map.grid[x][y].sprite.getWidth()*a.viewport.scaleFactor*a.map.grid.length))
							&&		
							mouse.CurrentInputs[0] <= (x*a.map.grid[x][y].sprite.getWidth()*a.viewport.scaleFactor + a.map.grid[x][y].sprite.getWidth()*a.viewport.scaleFactor) + (a.viewport.xOffset*(a.map.grid[x][y].sprite.getWidth()*a.viewport.scaleFactor*a.map.grid.length))
							&&
							mouse.CurrentInputs[1] >= (y*a.map.grid[x][y].sprite.getHeight()*a.viewport.scaleFactor) +  (a.viewport.yOffset*(a.map.grid[x][y].sprite.getHeight()*a.viewport.scaleFactor*a.map.grid[x].length))
							&&
							mouse.CurrentInputs[1] <= (y*a.map.grid[x][y].sprite.getHeight()*a.viewport.scaleFactor + a.map.grid[x][y].sprite.getHeight()*a.viewport.scaleFactor) +  (a.viewport.yOffset*(a.map.grid[x][y].sprite.getHeight()*a.viewport.scaleFactor*a.map.grid[x].length))
								){
								a.map.grid[x][y].isHighlighted = !a.map.grid[x][y].isHighlighted;
							}

				}
			}
		}
			
		}
		
	}

	
}
