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
import BaseMechanics.Map;
import BaseMechanics.UserInterface.Element;

public class UserInterface extends BaseMechanics.UserInterface {
	
	static int player1Authority;
	static int player2Authority;
	
	static {
		player1Authority = 0;
		player2Authority = 0;
	}
	
	static double xsize;
	static double ysize;
	JFrame j;
	static InputMethod.Mouse mouse;
	
	static boolean God;
	
	public UserInterface(JFrame f, InputMethod.Mouse m){
		super();
		xsize = f.getWidth();
		ysize = f.getHeight();
		this.elements.add(new mouseGrid());
		this.elements.add(new unitInfo());
		this.elements.add(new TurnLogicContainer.TurnLogicDisplay());
		this.elements.add(new TurnLogicContainer.AttackLogic());
	//	this.elements.add(new border());
		j = f;
		mouse = m;
	}
	
	public void update(AllTogether a) {
		if(a.input.returnInputs()[10]){
			System.exit(0);
		}
		xsize = j.getWidth();
		ysize = j.getHeight();
		super.update(a);
	}
	
	protected static void drawArbritaryTile(AllTogether a, int x, int y, BufferedImage sprite, Graphics2D g){
		g.drawImage(sprite, 
				//destination x co-ord 1
				(int)(x*a.map.grid[x][y].sprite.getWidth()*a.viewport.scaleFactor) + (int) (a.viewport.xOffset*(a.map.grid[x][y].sprite.getWidth()*a.viewport.scaleFactor*a.map.grid.length)), 
				
				//destination y co-ord 1
				(int)(y*a.map.grid[x][y].sprite.getHeight()*a.viewport.scaleFactor) + (int) (a.viewport.yOffset*(a.map.grid[x][y].sprite.getHeight()*a.viewport.scaleFactor*a.map.grid[x].length)), 
				
				//destination x co-ord 2
				(int)(x*a.map.grid[x][y].sprite.getWidth()*a.viewport.scaleFactor + a.map.grid[x][y].sprite.getWidth()*a.viewport.scaleFactor) + (int) (a.viewport.xOffset*(a.map.grid[x][y].sprite.getWidth()*a.viewport.scaleFactor*a.map.grid.length)), 
				
				//destination y co-ord 2
				(int)(y*a.map.grid[x][y].sprite.getHeight()*a.viewport.scaleFactor + a.map.grid[x][y].sprite.getHeight()*a.viewport.scaleFactor) + (int) (a.viewport.yOffset*(a.map.grid[x][y].sprite.getHeight()*a.viewport.scaleFactor*a.map.grid[x].length)),
				
				
				
				0, 0, sprite.getWidth(), sprite.getHeight(), null);
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
		public void paint(Graphics2D g, AllTogether a) {
			
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
				
		protected ArrayList<ArrayList<Integer>> prevInput;


		
		public mouseGrid(){
			prevInput = new ArrayList<ArrayList<Integer>>(2);
		}
		
		@Override
		public void paint(Graphics2D g, AllTogether a) {
			g.setColor(Color.RED);
			g.drawString("x:"+mouse.CurrentMouseInputs[0]+" y:"+mouse.CurrentMouseInputs[1]+" "+mouse.pulse+"\n"+mouse.rightPulse, 69, 69);
		
			for(int x = 0; x < a.map.grid.length; x++){
				for(int y = 0; y < a.map.grid[x].length; y++){
					if(a.map.grid[x][y].isHighlighted){
					drawArbritaryTile(a, x, y, a.map.grid[x][y].highlight, g);
					}
				}
			}
		
		}

		@Override
		public void update(AllTogether a) {
					
		if(mouse.pulse){	
			for(int x = 0; x < a.map.grid.length; x++) {
				for(int y = 0; y < a.map.grid[x].length; y++) {
							//See viewport if these statements don't make sense
							if(
							mouse.CurrentMouseInputs[0] >= (x*a.map.grid[x][y].sprite.getWidth()*a.viewport.scaleFactor) +  (a.viewport.xOffset*(a.map.grid[x][y].sprite.getWidth()*a.viewport.scaleFactor*a.map.grid.length))
							&&		
							mouse.CurrentMouseInputs[0] <= (x*a.map.grid[x][y].sprite.getWidth()*a.viewport.scaleFactor + a.map.grid[x][y].sprite.getWidth()*a.viewport.scaleFactor) + (a.viewport.xOffset*(a.map.grid[x][y].sprite.getWidth()*a.viewport.scaleFactor*a.map.grid.length))
							&&
							mouse.CurrentMouseInputs[1] >= (y*a.map.grid[x][y].sprite.getHeight()*a.viewport.scaleFactor) +  (a.viewport.yOffset*(a.map.grid[x][y].sprite.getHeight()*a.viewport.scaleFactor*a.map.grid[x].length))
							&&
							mouse.CurrentMouseInputs[1] <= (y*a.map.grid[x][y].sprite.getHeight()*a.viewport.scaleFactor + a.map.grid[x][y].sprite.getHeight()*a.viewport.scaleFactor) +  (a.viewport.yOffset*(a.map.grid[x][y].sprite.getHeight()*a.viewport.scaleFactor*a.map.grid[x].length))
								){
								a.map.grid[x][y].isHighlighted = !a.map.grid[x][y].isHighlighted;
								
								for(int x2 = 0; x2 < a.map.grid.length; x2++) {
									for(int y2 = 0; y2 < a.map.grid[x].length; y2++) {
										if(a.map.grid[x2][y2].isHighlighted&&(x2!=x||y2!=y)){
											a.map.grid[x2][y2].isHighlighted = false;
										}
									}
								}
							}
				}
			}
		}
		
		if(mouse.rightPulse){
			for(int x = 0; x < a.map.grid.length; x++) {
				for(int y = 0; y < a.map.grid[x].length; y++) {
							//See viewport if these statements don't make sense
							if(
							mouse.CurrentMouseInputs[0] >= (x*a.map.grid[x][y].sprite.getWidth()*a.viewport.scaleFactor) +  (a.viewport.xOffset*(a.map.grid[x][y].sprite.getWidth()*a.viewport.scaleFactor*a.map.grid.length))
							&&		
							mouse.CurrentMouseInputs[0] <= (x*a.map.grid[x][y].sprite.getWidth()*a.viewport.scaleFactor + a.map.grid[x][y].sprite.getWidth()*a.viewport.scaleFactor) + (a.viewport.xOffset*(a.map.grid[x][y].sprite.getWidth()*a.viewport.scaleFactor*a.map.grid.length))
							&&
							mouse.CurrentMouseInputs[1] >= (y*a.map.grid[x][y].sprite.getHeight()*a.viewport.scaleFactor) +  (a.viewport.yOffset*(a.map.grid[x][y].sprite.getHeight()*a.viewport.scaleFactor*a.map.grid[x].length))
							&&
							mouse.CurrentMouseInputs[1] <= (y*a.map.grid[x][y].sprite.getHeight()*a.viewport.scaleFactor + a.map.grid[x][y].sprite.getHeight()*a.viewport.scaleFactor) +  (a.viewport.yOffset*(a.map.grid[x][y].sprite.getHeight()*a.viewport.scaleFactor*a.map.grid[x].length))
							
								){
								for(int x2 = 0; x2 < a.map.grid.length; x2++) {
									for(int y2 = 0; y2 < a.map.grid[x].length; y2++) {
										if(a.map.grid[x2][y2].isHighlighted
											&&a.map.grid[x2][y2].occupyingUnit!=null
											&&a.map.grid[x2][y2].occupyingUnit.hasMovedThisTurn == false
											&&a.map.grid[x][y].occupyingUnit==null
											//Wait, But I'm not done yet!
											&&
											(TurnLogicContainer.currentUser == a.map.grid[x2][y2].occupyingUnit.team||God)
												){
											a.map.grid[x2][y2].occupyingUnit.hasMovedThisTurn = true;
											a.map.move(x2, y2, x, y);
											a.map.grid[x2][y2].isHighlighted = false;
											a.map.grid[x][y].isHighlighted = true;
										}
									}
								}
							}
					}
				}
		}
		mouse.genericUpdate();

		}
		
	}
	
	public static class unitInfo extends BaseMechanics.UserInterface.Element{
		
		static BaseMechanics.Unit toRead;
		
		static BufferedImage[] movementBorder;

		static{
			movementBorder = new BufferedImage[8];
				try{
					movementBorder[0] = ImageIO.read(new File("sprites/Gui/Movement Indication/redtopleft.png"));
					movementBorder[1] = ImageIO.read(new File("sprites/Gui/Movement Indication/redtop.png"));
					movementBorder[2] = ImageIO.read(new File("sprites/Gui/Movement Indication/redtopright.png"));
					movementBorder[3] = ImageIO.read(new File("sprites/Gui/Movement Indication/redleft.png"));
					movementBorder[4] = ImageIO.read(new File("sprites/Gui/Movement Indication/redright.png"));
					movementBorder[5] = ImageIO.read(new File("sprites/Gui/Movement Indication/redbottomleft.png"));
					movementBorder[6] = ImageIO.read(new File("sprites/Gui/Movement Indication/redbottom.png"));
					movementBorder[7] = ImageIO.read(new File("sprites/Gui/Movement Indication/redbottomright.png"));


				}catch(Exception e){
					
				}
		}
		
		
		@Override
		public void paint(Graphics2D g, AllTogether a) {
			if(toRead!=null){
				g.setColor(Color.CYAN);
				g.drawString("Unit Speed:"+toRead.speed, 69, 138);
				g.setColor(Color.GREEN);
				g.drawString("Unit Type:"+toRead.type, 69, 148);
				g.setColor(Color.YELLOW);
				g.drawString("Unit Health:"+toRead.health, 69, 158);
				g.setColor(Color.PINK);
				g.drawString("Team: "+toRead.team, 69, 168);
				g.setColor(Color.ORANGE);
				g.drawString("Unit ID:"+toRead.getClass().toString(), 69, 178);
				
				//Drawing the area that the character can move
				for(int x = 0; x < a.map.grid.length; x++){
					for(int y = 0; y < a.map.grid[x].length; y++){
						if(a.map.grid[x][y].occupyingUnit == toRead&&!a.map.grid[x][y].occupyingUnit.hasMovedThisTurn){
							for(int x2 = 0; x2 < a.map.grid.length; x2++){
								for(int y2 = 0; y2 < a.map.grid[x].length; y2++){
									if(a.map.moveCheck(x, y, x2, y2)){
										/*if(!a.map.moveCheck(x, y, x2-1, y2)&&!a.map.moveCheck(x, y, x2, y2-1)&&x2-1!=x&&y2-1!=y){
											drawArbritaryTile(a, x2, y2, movementBorder[0], g);
										}else if(!a.map.moveCheck(x, y, x2+1, y2)&&!a.map.moveCheck(x, y, x2, y2-1)&&x2+1!=x&&y2-1!=y){
											drawArbritaryTile(a, x2, y2, movementBorder[2], g);
										}else if(!a.map.moveCheck(x, y, x2-1, y2)&&!a.map.moveCheck(x, y, x2, y2+1)&&x2-1!=x&&y2+1!=y){
											drawArbritaryTile(a, x2, y2, movementBorder[5], g);
										}else if(!a.map.moveCheck(x, y, x2+1, y2)&&!a.map.moveCheck(x, y, x2, y2+1)&&x2+1!=x&&y2+1!=y){
											drawArbritaryTile(a, x2, y2, movementBorder[7], g);
										}else*/ if(!a.map.moveCheck(x, y, x2-1, y2)/*&&x2-1!=x*/){
											drawArbritaryTile(a, x2, y2, movementBorder[3], g);
										}/*else*/ if(!a.map.moveCheck(x, y, x2+1, y2)/*&&x2+1!=x*/){
											drawArbritaryTile(a, x2, y2, movementBorder[4], g);
										}/*else*/ if(!a.map.moveCheck(x, y, x2, y2-1)/*&&y2-1!=y*/){
											drawArbritaryTile(a, x2, y2, movementBorder[1], g);
										}/*else*/ if(!a.map.moveCheck(x, y, x2, y2+1)/*&&y2+1!=y*/){
											drawArbritaryTile(a, x2, y2, movementBorder[6], g);
										}
										
										
									}else{
									//	drawArbritaryTile(a, x2, y2, a.map.grid[x][y].highlight, g);
									}
								}
							}
						}
					}
				}
			}
		}

		@Override
		public void update(AllTogether a) {
			for(int x = 0; x < a.map.grid.length; x++){
				for(int y = 0; y < a.map.grid[x].length; y++){
					if(a.map.grid[x][y].occupyingUnit != null&&a.map.grid[x][y].isHighlighted){
						toRead = a.map.grid[x][y].occupyingUnit;
					}else if(a.map.grid[x][y].isHighlighted){
						toRead = null;
					}
				}
			}
		}
		
	}
	/*
	 * 
	 * 
	 * 
	 * 
	 * SPAGHETTI INCOMING
	 * 
	 * 
	 * 
	 * 
	 */
	//Alright fuck it we're implementing ALL the game logic within the User Interface
	public static class TurnLogicContainer{
		static BaseMechanics.Unit.Team currentUser;
		static int turnCount;
		
		static{
			reset();
		}
		
		public static void reset(){
			currentUser = BaseMechanics.Unit.Team.PLAYER1;
			turnCount = 0;
			player1Authority = 0;
			player2Authority = 0;
		}
		
		public static void advanceTurn(AllTogether a){
			if(currentUser == BaseMechanics.Unit.Team.PLAYER1){
				currentUser = BaseMechanics.Unit.Team.PLAYER2;
			}else if(currentUser == BaseMechanics.Unit.Team.PLAYER2){
				currentUser = BaseMechanics.Unit.Team.PLAYER1;
				for(int x = 0; x < a.map.grid.length; x++){
					for(int y = 0; y < a.map.grid[x].length; y++){
						if(a.map.grid[x][y].occupyingUnit!=null){
							a.map.grid[x][y].occupyingUnit.hasAttackedThisTurn = false;
							a.map.grid[x][y].occupyingUnit.hasMovedThisTurn = false;
						}
					}
				}
				++turnCount;
			}
		}
		
		public static class TurnLogicDisplay extends BaseMechanics.UserInterface.Element{
			
			boolean changeControl;
			
			@Override
			public void paint(Graphics2D g, AllTogether a) {
				g.setColor(Color.MAGENTA);
				g.drawString("Controlling Player: "+currentUser+" Turn Number: "+turnCount, 69, 128);
			}

			@Override
			public void update(AllTogether a) {
				if(a.input.returnInputs()[5]&&!changeControl){
					changeControl = true;
					advanceTurn(a);
				}else if(!a.input.returnInputs()[5]){
					changeControl = false;
				}
			}
			
		}
	
	
	public static class AttackLogic extends BaseMechanics.UserInterface.Element {
			static BufferedImage attack;
			static{
				try{
					attack = ImageIO.read(new File("sprites/Gui/target.png"));

				}catch(Exception e){
					
				}
			}
			@Override
			public void paint(Graphics2D g, AllTogether a) {
				// TODO Auto-generated method stub
				for(int x = 0; x < a.map.grid.length; x++){
					for(int y = 0; y < a.map.grid[x].length; y++){
						if(a.map.grid[x][y].occupyingUnit!=null){
						if(a.map.grid[x][y].occupyingUnit.team == currentUser&&a.map.grid[x][y].isHighlighted){
							for(int x2 = 0; x2 < a.map.grid.length; x2++){
								for(int y2 = 0; y2 < a.map.grid[x].length; y2++){
									if(a.map.checkAttack(x, y, x2, y2)){
										drawArbritaryTile(a, x2, y2, attack, g);
									}
								}
							}
						}
					}
					}
				}
			}
	
			@Override
			public void update(AllTogether a) {
				// TODO Auto-generated method stub

			}
			
		}
	}
	
}
