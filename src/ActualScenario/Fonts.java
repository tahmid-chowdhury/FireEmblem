package ActualScenario;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import BaseMechanics.drawText.textChar;

public class Fonts {
	public static class basicFont extends BaseMechanics.drawText.font{
		basicFont(){
			name = "Basic";
			yes = new textChar[36];
			
			try {
				yes[0] = new textChar(ImageIO.read(new File("sprites/Gui/Fonts/Basic/a.png")), 'a');
				yes[1] = new textChar(ImageIO.read(new File("sprites/Gui/Fonts/Basic/b.png")), 'b');
				yes[2] = new textChar(ImageIO.read(new File("sprites/Gui/Fonts/Basic/c.png")), 'c');
				yes[3] = new textChar(ImageIO.read(new File("sprites/Gui/Fonts/Basic/d.png")), 'd');
				yes[4] = new textChar(ImageIO.read(new File("sprites/Gui/Fonts/Basic/e.png")), 'e');
				yes[5] = new textChar(ImageIO.read(new File("sprites/Gui/Fonts/Basic/f.png")), 'f');
				yes[6] = new textChar(ImageIO.read(new File("sprites/Gui/Fonts/Basic/g.png")), 'g');
				yes[7] = new textChar(ImageIO.read(new File("sprites/Gui/Fonts/Basic/h.png")), 'h');
				yes[8] = new textChar(ImageIO.read(new File("sprites/Gui/Fonts/Basic/i.png")), 'i');		
				yes[9] = new textChar(ImageIO.read(new File("sprites/Gui/Fonts/Basic/a.png")), 'j');
				
				yes[10] = new textChar(ImageIO.read(new File("sprites/Gui/Fonts/Basic/k.png")), 'k');
				yes[11] = new textChar(ImageIO.read(new File("sprites/Gui/Fonts/Basic/l.png")), 'l');
				yes[12] = new textChar(ImageIO.read(new File("sprites/Gui/Fonts/Basic/m.png")), 'm');
				yes[13] = new textChar(ImageIO.read(new File("sprites/Gui/Fonts/Basic/n.png")), 'n');
				yes[14] = new textChar(ImageIO.read(new File("sprites/Gui/Fonts/Basic/o.png")), 'o');
				yes[15] = new textChar(ImageIO.read(new File("sprites/Gui/Fonts/Basic/p.png")), 'p');
				yes[16] = new textChar(ImageIO.read(new File("sprites/Gui/Fonts/Basic/q.png")), 'q');
				yes[17] = new textChar(ImageIO.read(new File("sprites/Gui/Fonts/Basic/r.png")), 'r');
				yes[18] = new textChar(ImageIO.read(new File("sprites/Gui/Fonts/Basic/s.png")), 's');
				yes[19] = new textChar(ImageIO.read(new File("sprites/Gui/Fonts/Basic/t.png")), 't');
				
				yes[20] = new textChar(ImageIO.read(new File("sprites/Gui/Fonts/Basic/u.png")), 'u');
				yes[21] = new textChar(ImageIO.read(new File("sprites/Gui/Fonts/Basic/v.png")), 'v');
				yes[22] = new textChar(ImageIO.read(new File("sprites/Gui/Fonts/Basic/w.png")), 'w');
				yes[23] = new textChar(ImageIO.read(new File("sprites/Gui/Fonts/Basic/x.png")), 'x');
				yes[24] = new textChar(ImageIO.read(new File("sprites/Gui/Fonts/Basic/y.png")), 'y');
				yes[25] = new textChar(ImageIO.read(new File("sprites/Gui/Fonts/Basic/z.png")), 'z');
				yes[26] = new textChar(ImageIO.read(new File("sprites/Gui/Fonts/Basic/0.png")), '0');
				yes[27] = new textChar(ImageIO.read(new File("sprites/Gui/Fonts/Basic/1.png")), '1');
				yes[28] = new textChar(ImageIO.read(new File("sprites/Gui/Fonts/Basic/2.png")), '2');
				yes[29] = new textChar(ImageIO.read(new File("sprites/Gui/Fonts/Basic/3.png")), '3');
				
				yes[30] = new textChar(ImageIO.read(new File("sprites/Gui/Fonts/Basic/4.png")), '4');
				yes[31] = new textChar(ImageIO.read(new File("sprites/Gui/Fonts/Basic/5.png")), '5');
				yes[32] = new textChar(ImageIO.read(new File("sprites/Gui/Fonts/Basic/6.png")), '6');
				yes[33] = new textChar(ImageIO.read(new File("sprites/Gui/Fonts/Basic/7.png")), '7');
				yes[34] = new textChar(ImageIO.read(new File("sprites/Gui/Fonts/Basic/8.png")), '8');
				yes[35] = new textChar(ImageIO.read(new File("sprites/Gui/Fonts/Basic/9.png")), '9');


			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
