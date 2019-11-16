package TestScenario;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class test {
	public static void main(String[] args){
		System.out.print("test\n");
		
		JFrame test = new JFrame("tekst");
		
		BaseMechanics.Map m = new testMap();
		
		BaseMechanics.AllTogether viewTest = new BaseMechanics.AllTogether(m);
		
		test.add(viewTest);
		test.setSize(640, 480);
		test.setFocusable(true);
	//	test.setUndecorated(true);
		test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		test.setVisible(true);
		
		for(;;){
			test.repaint();
		}
		
	}
}
