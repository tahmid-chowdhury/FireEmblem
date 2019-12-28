package BaseMechanics;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class NewInputMethod {
	public static class newKeyboardInput implements KeyListener {
		
		public keyboardDataPkg p;
		
		public enum eventType{
			PRESSED,
			RELEASED
		}
		public class keyboardDataPkg {
			KeyEvent e;
			eventType t;
			keyboardDataPkg(KeyEvent event, eventType type){
				e = event;
				t = type;
			}
		}
		@Override
		public void keyPressed(KeyEvent arg0) {
			p = new keyboardDataPkg(arg0, eventType.PRESSED);
		}

		@Override
		public void keyReleased(KeyEvent arg0) {
			p = new keyboardDataPkg(arg0, eventType.RELEASED);			
		}

		@Override
		public void keyTyped(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
		public keyboardDataPkg mostRecentInput() {
			return p;
		}
		
	}
}
