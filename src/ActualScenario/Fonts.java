package ActualScenario;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import BaseMechanics.drawText.textChar;

public class Fonts {
	public static class basicFont extends BaseMechanics.drawText.font{
		basicFont(){
			name = "Basic";
			yes = new ArrayList<textChar>(0);
			
			try {
				yes.add(new textChar(ImageIO.read(new File("sprites/Gui/Fonts/Basic/a.png")), 'a'));
				yes.add(new textChar(ImageIO.read(new File("sprites/Gui/Fonts/Basic/b.png")), 'b'));
				yes.add(new textChar(ImageIO.read(new File("sprites/Gui/Fonts/Basic/c.png")), 'c'));
				yes.add(new textChar(ImageIO.read(new File("sprites/Gui/Fonts/Basic/d.png")), 'd'));
				yes.add(new textChar(ImageIO.read(new File("sprites/Gui/Fonts/Basic/e.png")), 'e'));
				yes.add(new textChar(ImageIO.read(new File("sprites/Gui/Fonts/Basic/f.png")), 'f'));
				yes.add(new textChar(ImageIO.read(new File("sprites/Gui/Fonts/Basic/g.png")), 'g'));
				yes.add(new textChar(ImageIO.read(new File("sprites/Gui/Fonts/Basic/h.png")), 'h'));
				yes.add(new textChar(ImageIO.read(new File("sprites/Gui/Fonts/Basic/i.png")), 'i'));		
				yes.add(new textChar(ImageIO.read(new File("sprites/Gui/Fonts/Basic/j.png")), 'j'));
				
				yes.add(new textChar(ImageIO.read(new File("sprites/Gui/Fonts/Basic/k.png")), 'k'));
				yes.add(new textChar(ImageIO.read(new File("sprites/Gui/Fonts/Basic/l.png")), 'l'));
				yes.add(new textChar(ImageIO.read(new File("sprites/Gui/Fonts/Basic/m.png")), 'm'));
				yes.add(new textChar(ImageIO.read(new File("sprites/Gui/Fonts/Basic/n.png")), 'n'));
				yes.add(new textChar(ImageIO.read(new File("sprites/Gui/Fonts/Basic/o.png")), 'o'));
				yes.add(new textChar(ImageIO.read(new File("sprites/Gui/Fonts/Basic/p.png")), 'p'));
				yes.add(new textChar(ImageIO.read(new File("sprites/Gui/Fonts/Basic/q.png")), 'q'));
				yes.add(new textChar(ImageIO.read(new File("sprites/Gui/Fonts/Basic/r.png")), 'r'));
				yes.add(new textChar(ImageIO.read(new File("sprites/Gui/Fonts/Basic/s.png")), 's'));
				yes.add(new textChar(ImageIO.read(new File("sprites/Gui/Fonts/Basic/t.png")), 't'));
				
				yes.add(new textChar(ImageIO.read(new File("sprites/Gui/Fonts/Basic/u.png")), 'u'));
				yes.add(new textChar(ImageIO.read(new File("sprites/Gui/Fonts/Basic/v.png")), 'v'));
				yes.add(new textChar(ImageIO.read(new File("sprites/Gui/Fonts/Basic/w.png")), 'w'));
				yes.add(new textChar(ImageIO.read(new File("sprites/Gui/Fonts/Basic/x.png")), 'x'));
				yes.add(new textChar(ImageIO.read(new File("sprites/Gui/Fonts/Basic/y.png")), 'y'));
				yes.add(new textChar(ImageIO.read(new File("sprites/Gui/Fonts/Basic/z.png")), 'z'));
				yes.add(new textChar(ImageIO.read(new File("sprites/Gui/Fonts/Basic/0.png")), '0'));
				yes.add(new textChar(ImageIO.read(new File("sprites/Gui/Fonts/Basic/1.png")), '1'));
				yes.add(new textChar(ImageIO.read(new File("sprites/Gui/Fonts/Basic/2.png")), '2'));
				yes.add(new textChar(ImageIO.read(new File("sprites/Gui/Fonts/Basic/3.png")), '3'));
				
				yes.add(new textChar(ImageIO.read(new File("sprites/Gui/Fonts/Basic/4.png")), '4'));
				yes.add(new textChar(ImageIO.read(new File("sprites/Gui/Fonts/Basic/5.png")), '5'));
				yes.add(new textChar(ImageIO.read(new File("sprites/Gui/Fonts/Basic/6.png")), '6'));
				yes.add(new textChar(ImageIO.read(new File("sprites/Gui/Fonts/Basic/7.png")), '7'));
				yes.add(new textChar(ImageIO.read(new File("sprites/Gui/Fonts/Basic/8.png")), '8'));
				yes.add(new textChar(ImageIO.read(new File("sprites/Gui/Fonts/Basic/9.png")), '9'));
				yes.add(new textChar(ImageIO.read(new File("sprites/Gui/Fonts/Basic/space.png")), ' '));


			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
