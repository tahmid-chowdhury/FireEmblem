package BaseMechanics;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class NewInputMethod {
	public static class newKeyboardInput implements KeyListener {
		
		public newKeyboardInput() {
			this.current = new ArrayList<Integer>(0);
			this.p = new keyboardDataPkg(Integer.MIN_VALUE, eventType.PRESSED);
		}
				
		public volatile ArrayList<Integer> current;
		public keyboardDataPkg p;
		
		public enum eventType{
			PRESSED,
			RELEASED
		}
		public static class keyboardDataPkg {
			public int e;
			public eventType t;
			public keyboardDataPkg(int event, eventType type){
				e = event;
				t = type;
			}
			
			public keyboardDataPkg() {
				e = Integer.MIN_VALUE;
				t = eventType.PRESSED;
			}
			
			public keyboardDataPkg(keyboardDataPkg n){
				this.e = new Integer(n.e);
				this.t = n.t;
			}
			
			public void clear() {
				e = Integer.MIN_VALUE;
				t = eventType.PRESSED;
			}
		}
		@Override
		public void keyPressed(KeyEvent arg0) {
			if(!current.contains(new Integer(arg0.getKeyCode()))) {
			current.add(new Integer(arg0.getKeyCode()));
			}
			p = new keyboardDataPkg(arg0.getKeyCode(), eventType.PRESSED);
		}

		@Override
		public void keyReleased(KeyEvent arg0) {
			current.remove(new Integer(arg0.getKeyCode()));
			p = new keyboardDataPkg(arg0.getKeyCode(), eventType.RELEASED);
		}

		@Override
		public void keyTyped(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}
}
