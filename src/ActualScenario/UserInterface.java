package ActualScenario;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

import BaseMechanics.AllTogether;

public class UserInterface extends BaseMechanics.UserInterface {
	
	static double xsize;
	static double ysize;
	JFrame j;
	
	public UserInterface(JFrame f){
		super();
		xsize = f.getWidth();
		ysize = f.getHeight();
		this.elements.add(new border());
		j = f;
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
			
			g.drawImage(sprites.get(0), 
					//only scale the destination with height
					
					(int)(xsize*0.05), 
					
					(int)(ysize*0.65), 
					
					(int)((xsize*0.05)+(sprites.get(0).getWidth()*(xsize/ysize))) , 
					
					(int)((ysize*0.65)+(sprites.get(0).getHeight()*(xsize/ysize))),
					
					0, 0, sprites.get(0).getWidth(), sprites.get(0).getHeight(), null);
			

			g.drawImage(sprites.get(1), 
					//only scale the destination with height
					
					(int)((xsize*0.05)+(sprites.get(0).getWidth()*(xsize/ysize))), 
					
					(int)(ysize*0.65), 
					
					(int)((xsize*0.9)/*-(sprites.get(2).getWidth()*(xsize/ysize))*/), 
					
					(int)((ysize*0.65)+(sprites.get(1).getHeight()*(xsize/ysize))),
					
					0, 0, sprites.get(1).getWidth(), sprites.get(1).getHeight(), null);
			
			
			g.drawImage(sprites.get(2), 
					//only scale the destination with height
					
					(int)(xsize*0.9), 
					
					(int)(ysize*0.65), 
					
					(int)((xsize*0.9)+(sprites.get(2).getWidth()*(xsize/ysize))) , 
					
					(int)((ysize*0.65)+(sprites.get(2).getHeight()*(xsize/ysize))),
					
					0, 0, sprites.get(2).getWidth(), sprites.get(2).getHeight(), null);
			
			
		}

		@Override
		public void update(AllTogether a) {
			// TODO Auto-generated method stub
			
		}
		
	}
}
