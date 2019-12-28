package BaseMechanics;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

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
		/*
		 * SUPERCEDED BY NEWKEYBOARDINPUT, DO NOT USE
		 */

		public Keyboard1(){
			this.CurrentInputs = new boolean[11];
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
			
			if(arg0.getKeyCode() == KeyEvent.VK_ESCAPE){
				this.CurrentInputs[10] = true;
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
	
	public static class Mouse extends InputMethod implements MouseInputListener, MouseWheelListener {

		public int[] CurrentMouseInputs;
		protected boolean[] scroll;
		UserInterface.Element parent;
		
		boolean lastFrame;
		boolean freshInput;
		
		public boolean pressed;
		public boolean pulse;
		
		public boolean rightPressed;
		public boolean rightPulse;
		public Mouse(){
			CurrentMouseInputs = new int[2];
			scroll = new boolean[2];
			lastFrame = false;
			freshInput = false;
		}
		
		public boolean[] returnInputs(){
			return scroll;
		}
		
		public boolean[] appendScroll(boolean[] a){
			boolean[] b = a;
			b[0] = scroll[0];
			b[1] = scroll[1];
			return b;
		}
		
		public void genericUpdate(){
			freshInput = pressed;
				if(freshInput!=lastFrame&&freshInput){
					pulse = true;
				}else{
					pulse = false;
				}
			lastFrame = freshInput;
			
			rightPulse = false;
		}
		
		@Override
		public void mouseClicked(MouseEvent e) {
			CurrentMouseInputs[0] = e.getXOnScreen();
			CurrentMouseInputs[1] = e.getYOnScreen();
			
			switch(e.getButton()){
			case MouseEvent.BUTTON3:
				rightPulse = true;
			}
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
			CurrentMouseInputs[0] = e.getXOnScreen();
			CurrentMouseInputs[1] = e.getYOnScreen();
			
			switch(e.getButton()){
			case MouseEvent.BUTTON1:
				pressed = true;
				break;
			case MouseEvent.BUTTON3:
				rightPressed = true;
			}
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			switch(e.getButton()){
			case MouseEvent.BUTTON1:
				pressed = false;
				break;
			case MouseEvent.BUTTON3:
				rightPressed = false;
			}
		}

		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseWheelMoved(MouseWheelEvent e) {
			if(e.getPreciseWheelRotation() > 0){
				scroll[0] = true;
				scroll[1] = false;
			}else if(e.getPreciseWheelRotation() < 0){
				scroll[0] = false;
				scroll[1] = true;
			}else{
				scroll[0] = false;
				scroll[1] = false;
			}
		}
		
	}


}
