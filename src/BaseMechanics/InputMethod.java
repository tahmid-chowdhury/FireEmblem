package BaseMechanics;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;

import javax.swing.event.MouseInputListener;

public class InputMethod {
	protected boolean[] CurrentInputs = new boolean[10];
	
	public InputMethod(){
		this.CurrentInputs = new boolean[10];
	}
	
	/* 0 = A button
	 * 1 = B button
	 * 2 = C button
	 * 3 = X button
	 * 4 = Y button
	 * 5 = Z button
	 * 6 = Left
	 * 7 = Up
	 * 8 = Down
	 * 9 = Right
	 */
	
	
	
	public boolean[] returnInputs() {
		return CurrentInputs;
	}
	
	public static class Keyboard1 extends InputMethod implements KeyListener {
		
		public Keyboard1(){
			this.CurrentInputs = new boolean[10];
		}

		@Override
		public void keyPressed(KeyEvent arg0) {
			//A, B, and C
			if(arg0.getKeyCode() == KeyEvent.VK_COMMA){
				this.CurrentInputs[0] = true;
			}
			
			if(arg0.getKeyCode() == KeyEvent.VK_PERIOD){
				this.CurrentInputs[1] = true;
			}
			
			if(arg0.getKeyCode() == KeyEvent.VK_SLASH){
				this.CurrentInputs[2] = true;
			}
			//X, Y, and Z
			if(arg0.getKeyCode() == KeyEvent.VK_L){
				this.CurrentInputs[3] = true;
			}
			
			if(arg0.getKeyCode() == KeyEvent.VK_SEMICOLON){
				this.CurrentInputs[4] = true;
			}
			
			if(arg0.getKeyChar() == '\''){
				this.CurrentInputs[5] = true;
			}
			//Directional Buttons
			if(arg0.getKeyCode() == KeyEvent.VK_LEFT){
				this.CurrentInputs[6] = true;
			}
			
			if(arg0.getKeyCode() == KeyEvent.VK_UP){
				this.CurrentInputs[7] = true;
			}
			
			if(arg0.getKeyCode() == KeyEvent.VK_DOWN){
				this.CurrentInputs[8] = true;
			}
			
			if(arg0.getKeyCode() == KeyEvent.VK_RIGHT){
				this.CurrentInputs[9] = true;
			}
		}

		@Override
		public void keyReleased(KeyEvent arg0) {
			// TODO Auto-generated method stub
			//A, B, and C
			if(arg0.getKeyCode() == KeyEvent.VK_COMMA){
				this.CurrentInputs[0] = false;
			}
			
			if(arg0.getKeyCode() == KeyEvent.VK_PERIOD){
				this.CurrentInputs[1] = false;
			}
			
			if(arg0.getKeyCode() == KeyEvent.VK_SLASH){
				this.CurrentInputs[2] = false;
			}
			//X, Y, and Z
			if(arg0.getKeyCode() == KeyEvent.VK_L){
				this.CurrentInputs[3] = false;
			}
			
			if(arg0.getKeyCode() == KeyEvent.VK_SEMICOLON){
				this.CurrentInputs[4] = false;
			}
			
			if(arg0.getKeyChar() == '\''){
				this.CurrentInputs[5] = false;
			}
			//Directional Buttons
			if(arg0.getKeyCode() == KeyEvent.VK_LEFT){
				this.CurrentInputs[6] = false;
			}
			
			if(arg0.getKeyCode() == KeyEvent.VK_UP){
				this.CurrentInputs[7] = false;
			}
			
			if(arg0.getKeyCode() == KeyEvent.VK_DOWN){
				this.CurrentInputs[8] = false;
			}
			
			if(arg0.getKeyCode() == KeyEvent.VK_RIGHT){
				this.CurrentInputs[9] = false;
				}
		}

		@Override
		public void keyTyped(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	public static class Mouse implements MouseInputListener {

		public int[] CurrentInputs;
		UserInterface.Element parent;
		
		boolean lastFrame;
		boolean freshInput;
		
		public boolean pressed;
		
		public Mouse(){
			CurrentInputs = new int[2];
			lastFrame = false;
			freshInput = false;
		}
		
		@Override
		public void mouseClicked(MouseEvent e) {
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			CurrentInputs[0] = e.getXOnScreen();
			CurrentInputs[1] = e.getYOnScreen();
			pressed = true;
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			pressed = false;
		}

		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}


}
