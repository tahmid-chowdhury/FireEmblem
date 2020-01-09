package ActualScenario;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

import com.sun.glass.events.KeyEvent;

import BaseMechanics.AllTogether;
import BaseMechanics.drawText;
import BaseMechanics.InputMethod;
import BaseMechanics.Map;
import BaseMechanics.NewInputMethod;
import BaseMechanics.NewInputMethod.newKeyboardInput.keyboardDataPkg;
import BaseMechanics.Tile;
import BaseMechanics.Unit;
import BaseMechanics.UserInterface.Element;

public class UserInterface extends BaseMechanics.UserInterface {
	
	public enum controlState{
		MOVEMENT,
		COMBAT,
		MENU
	}
	
	static controlState controlState;
	static int player1Authority;
	static int player2Authority;
	static BaseMechanics.drawText.font basicFont;
	
	static boolean debug;
		
	static {
		player1Authority = 0;
		player2Authority = 0;
		controlState = ActualScenario.UserInterface.controlState.MOVEMENT;
		basicFont = new Fonts.basicFont();
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
	//	this.elements.add(new pauseMenu());
	//	this.elements.add(new border());
		j = f;
		mouse = m;
	}
	
	public void update(AllTogether a) {
		if(a.input.p.e==KeyEvent.VK_ESCAPE&&a.input.p.t==NewInputMethod.newKeyboardInput.eventType.RELEASED&&controlState!=ActualScenario.UserInterface.controlState.MENU){
			controlState = ActualScenario.UserInterface.controlState.MENU;
			a.input.p.clear();
		}else if(a.input.p.e==KeyEvent.VK_ESCAPE&&a.input.p.t==NewInputMethod.newKeyboardInput.eventType.RELEASED&&controlState==ActualScenario.UserInterface.controlState.MENU){
			controlState = ActualScenario.UserInterface.controlState.MOVEMENT;
			a.input.p.clear();	
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
	
	public static abstract class button extends BaseMechanics.UserInterface.Element{
		BufferedImage sprite;
		int x;
		int y;
		
		public abstract void onClickAction(AllTogether a);
		
		public void update(AllTogether a){
			if(mouse.pulse){
				if(mouse.CurrentMouseInputs[0] <= x+sprite.getWidth()&&
					mouse.CurrentMouseInputs[0] >= x&&
					mouse.CurrentMouseInputs[1] <= y+sprite.getWidth()&&
					mouse.CurrentMouseInputs[1] >= y
						){
					onClickAction(a);
				}
			}
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
			mouse.genericUpdate();
		}

		@Override
		public void toIterateOnEachTile(AllTogether a, Tile tile, int x, int y) {
			if(mouse.pulse&&(controlState == ActualScenario.UserInterface.controlState.MOVEMENT||controlState == ActualScenario.UserInterface.controlState.COMBAT)){
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
			
			if(mouse.rightPulse&&controlState == ActualScenario.UserInterface.controlState.MOVEMENT){
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
								&&
								a.map.moveCheck(x2, y2, x, y)
									){
								a.map.grid[x2][y2].occupyingUnit.hasMovedThisTurn = true;
								
								//Logging movement to "console"
								TurnLogicContainer.AttackLogic.log("$"+a.map.grid[x2][y2].occupyingUnit.getNameWithTeam()+" has moved from "+x2+","+y2+" to "+x+","+y);
								
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
	
	public static class unitInfo extends BaseMechanics.UserInterface.Element{
		
	//	static BaseMechanics.Unit toRead;
		
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
			if(TurnLogicContainer.selected!=null){
				//Drawing the area that the character can move
				for(int x = 0; x < a.map.grid.length; x++){ 
					for(int y = 0; y < a.map.grid[x].length; y++){
						if(a.map.grid[x][y].occupyingUnit == TurnLogicContainer.selected&&!a.map.grid[x][y].occupyingUnit.hasMovedThisTurn){
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
			/*for(int x = 0; x < a.map.grid.length; x++){
				for(int y = 0; y < a.map.grid[x].length; y++){
					if(a.map.grid[x][y].occupyingUnit != null&&a.map.grid[x][y].isHighlighted){
						toRead = a.map.grid[x][y].occupyingUnit;
					}else if(a.map.grid[x][y].isHighlighted){
						toRead = null;
					}
				}
			}*/
		}

		@Override
		public void toIterateOnEachTile(AllTogether a, Tile tile, int x, int y) {
			// TODO Auto-generated method stub
	/*		if(a.map.grid[x][y].occupyingUnit != null&&a.map.grid[x][y].isHighlighted){
				toRead = a.map.grid[x][y].occupyingUnit;
			}else if(a.map.grid[x][y].isHighlighted){
				toRead = null;
			}	*/
		}
		
	}
	
	public static class pauseMenu extends BaseMechanics.UserInterface.Element {
		static BufferedImage pausebg;
		static BufferedImage pauseButton;
		static keyboardDataPkg release;
		static {
			try{
				pausebg = ImageIO.read(new File("sprites/Gui/pauseBG.png"));
				pauseButton = ImageIO.read(new File("sprites/Gui/exit.png"));
			}catch(Exception e){
				
			}
		}
		
		@Override
		public void paint(Graphics2D g, AllTogether a) {
	//		if(controlState == ActualScenario.UserInterface.controlState.MENU) {
	//			g.drawImage(pausebg, 0, 0, a.parentFrame.getWidth(), a.parentFrame.getHeight(), 0, 0, pausebg.getWidth(), pausebg.getHeight(), null);
	//			g.drawImage(pauseButton, 0, a.parentFrame.getHeight()-pauseButton.getHeight(), pauseButton.getWidth(), a.parentFrame.getHeight(), 
	//					
	//					0, 0, pauseButton.getWidth(), pauseButton.getHeight(), null);
	//		}
		}

		@Override
		public void update(AllTogether a) {
			release = new keyboardDataPkg(a.input.p);
			if(controlState == ActualScenario.UserInterface.controlState.MENU) {
				if(mouse.pulse) {
					if(mouse.CurrentMouseInputs[0] >= 0&&
						mouse.CurrentMouseInputs[0] <= pauseButton.getWidth()&&
						mouse.CurrentMouseInputs[1] >= a.parentFrame.getHeight()-pauseButton.getHeight()&&
						mouse.CurrentMouseInputs[1] <= a.parentFrame.getHeight()
							){
						System.exit(0);
					}
				}else if(mouse.rightPulse||(release.e==KeyEvent.VK_ESCAPE&&release.t==NewInputMethod.newKeyboardInput.eventType.PRESSED&&a.input.current.contains(KeyEvent.VK_ESCAPE))) {
				//	controlState = ActualScenario.UserInterface.controlState.MOVEMENT;
				//	a.input.p.clear();
				}
			}
		}

		@Override
		public void toIterateOnEachTile(AllTogether a, Tile tile, int x, int y) {
			// TODO Auto-generated method stub
			
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
		static Unit selected;
		
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
				AttackLogic.log("#Please pass the controls to player two.");
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
				AttackLogic.log("#Turn advanced. It is now turn "+(turnCount+1)+", Please pass control back to player one.");
			}
		}
		
		public static class TurnLogicDisplay extends BaseMechanics.UserInterface.Element{
			
			boolean changeControl;
			
			public void paintData(Graphics2D g, AllTogether a){
				if(TurnLogicContainer.selected!=null){
					g.setColor(Color.CYAN);
					g.drawString("Unit Speed:"+TurnLogicContainer.selected.speed, 69, 138);
					g.setColor(Color.GREEN);
					g.drawString("Unit Type:"+TurnLogicContainer.selected.type, 69, 148);
					g.setColor(Color.YELLOW);
					g.drawString("Unit Health:"+TurnLogicContainer.selected.health, 69, 158);
					g.setColor(Color.PINK);
					g.drawString("Team: "+TurnLogicContainer.selected.team, 69, 168);
					g.setColor(Color.ORANGE);
					g.drawString("Unit ID:"+TurnLogicContainer.selected.getClass().toString(), 69, 178);
					
					drawText.drawUnbounded(g, selected.getNameWithTeam()+":",(int)(a.parentFrame.getWidth()*0.75),(int)(a.parentFrame.getHeight()*0.05)-22, basicFont);
					drawText.drawUnbounded(g, "@"+TurnLogicContainer.selected.health, (int)(a.parentFrame.getWidth()*0.75), (int)(a.parentFrame.getHeight()*0.05), basicFont);
					drawText.drawUnbounded(g, "$"+TurnLogicContainer.selected.speed, (int)(a.parentFrame.getWidth()*0.75), (int)(a.parentFrame.getHeight()*0.05)+22, basicFont);
					drawText.drawUnbounded(g, "Type:"+TurnLogicContainer.selected.type, (int)(a.parentFrame.getWidth()*0.75), (int)(a.parentFrame.getHeight()*0.05)+44, basicFont);
					drawText.drawUnbounded(g, "Team:"+TurnLogicContainer.selected.team, (int)(a.parentFrame.getWidth()*0.75), (int)(a.parentFrame.getHeight()*0.05)+66, basicFont);

				}
			}
			
			@Override
			public void paint(Graphics2D g, AllTogether a) {
				g.setColor(Color.MAGENTA);
				g.drawString("Controlling Player: "+currentUser+" Turn Number: "+turnCount+" Control State: "+controlState, 69, 128);
			/**/
				g.setColor(Color.gray);
				g.fillRect(0, (int)(a.parentFrame.getHeight()*0.75), 9999, 9999);
				g.fillRect((int)(a.parentFrame.getWidth()*0.75), 0, 9999, 9999);
				g.fillRect(0, 0, (int)(a.parentFrame.getWidth()*0.02), a.parentFrame.getHeight());
				g.fillRect(0, 0, a.parentFrame.getHeight(), (int)(a.parentFrame.getWidth()*0.02));
				
				paintData(g, a);
			/**/	
				g.drawImage(pauseMenu.pauseButton, a.parentFrame.getWidth()-pauseMenu.pauseButton.getWidth(), a.parentFrame.getHeight()-pauseMenu.pauseButton.getHeight(), a.parentFrame.getWidth(), a.parentFrame.getHeight(), 0, 0, pauseMenu.pauseButton.getWidth(), pauseMenu.pauseButton.getHeight(), null);
				
				AttackLogic.scrollTest.paint(g);
			}

			@Override
			public void update(AllTogether a) {
				if(a.input.current.contains(KeyEvent.VK_ENTER)&&!changeControl){
					changeControl = true;
					advanceTurn(a);
				}else if(!a.input.current.contains(KeyEvent.VK_ENTER)){
					changeControl = false;
				}
				
				if(a.input.current.contains(KeyEvent.VK_1)) {
					controlState = ActualScenario.UserInterface.controlState.MOVEMENT;
				}else if(a.input.current.contains(KeyEvent.VK_2)) {
					controlState = ActualScenario.UserInterface.controlState.COMBAT;
				}/*else if(a.input.current.contains(KeyEvent.VK_3)) {
					controlState = ActualScenario.UserInterface.controlState.MENU;
				}*/
				
				if(mouse.pulse){
					if(mouse.CurrentMouseInputs[0] <= a.parentFrame.getWidth()&&
						mouse.CurrentMouseInputs[0] >= a.parentFrame.getWidth()-pauseMenu.pauseButton.getWidth()&&
						mouse.CurrentMouseInputs[1] <= a.parentFrame.getHeight()&&
						mouse.CurrentMouseInputs[1] >= a.parentFrame.getHeight()-pauseMenu.pauseButton.getHeight()
							){
						System.exit(0);
					}
				}
			}

			@Override
			public void toIterateOnEachTile(AllTogether a, Tile tile, int x, int y) {
				// TODO Auto-generated method stub
				
			}
			
		}
	
	
	public static class AttackLogic extends BaseMechanics.UserInterface.Element {
			static BaseMechanics.drawText.infiniteScroller scrollTest;
			static BaseMechanics.drawText.infiniteScroller attackNames;
			char scrollTestchar;
			static BufferedImage attack;
			static{
				scrollTest = new BaseMechanics.drawText.infiniteScroller(22, 768, 800, 1024);
				attackNames = new drawText.infiniteScroller((int)(xsize*0.75), (int)(ysize*0.42), (int)(xsize*1), (int)(ysize*0.98));
				try{
					attack = ImageIO.read(new File("sprites/Gui/target.png"));

				}catch(Exception e){
					
				}
			}
			public static void log(String s){
				scrollTest.addItem(s, basicFont);
			}
			
			@Override
			public void paint(Graphics2D g, AllTogether a) {
				// TODO Auto-generated method stub
				g.setColor(Color.GREEN);
				if(selected!=null) {
					g.drawString(selected.toString(), 256, 59);
					if(selected.attacks!=null) {
						for(int n = 0; n < selected.attacks.length; n++) {
							g.drawString(selected.attacks[n].name, 256, 69+(n*10));
						}
					}
				}
				if(controlState==ActualScenario.UserInterface.controlState.COMBAT){
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
				
					g.setColor(Color.RED);
					g.drawRect((int)(a.parentFrame.getWidth()*0.75), (int)(a.parentFrame.getHeight()*0.4), (int)(a.parentFrame.getWidth()*0.3), (int)(a.parentFrame.getHeight()*0.4));
					drawText.drawUnbounded(g, "Attacks", (int)(a.parentFrame.getWidth()*0.75), (int)(a.parentFrame.getHeight()*0.4),basicFont);
					if(selected!=null&&selected.attacks!=null){
						drawText.drawUnbounded(g, selected.attacks[0].name, (int)(a.parentFrame.getWidth()*0.75), (int)(a.parentFrame.getHeight()*0.4)+21, basicFont);
					}
				}
				
			}
	
			@Override
			public void update(AllTogether a) {
			/*	attackNames.clear();
				if(selected!=null&&selected.attacks!=null){
					for(int x = 0; x < selected.attacks.length; x++){
						attackNames.addItem(selected.attacks[x].name, basicFont);
					}
				}*/
			}

			@Override
			public void toIterateOnEachTile(AllTogether a, Tile tile, int x, int y) {
				if(tile.occupyingUnit!=null&&tile.isHighlighted) {
					selected = tile.occupyingUnit;
				}else if(tile.isHighlighted){
					selected = null;
				}
			}
			
		}
	}
	
}
