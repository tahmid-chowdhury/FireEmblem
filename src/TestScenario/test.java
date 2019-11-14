package TestScenario;

import javax.swing.JFrame;

public class test {
	public static void main(String[] args){
		System.out.print("test\n");
		
		JFrame test = new JFrame("tekst");
		BaseMechanics.AllTogether viewTest = new BaseMechanics.AllTogether();
		
		test.add(viewTest);
		test.setSize(640, 480);
		test.setFocusable(true);
		test.setVisible(true);
		test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		test.setVisible(true);
		
		for(;;){
			test.repaint();
		}
		
	}
}
