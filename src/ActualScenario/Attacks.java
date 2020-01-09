package ActualScenario;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import BaseMechanics.Unit;

public class Attacks {
	public static class GenericMelee extends BaseMechanics.Unit.Attack{
		public GenericMelee() {
			this.name = "Generic Melee";
			try {
				this.button = ImageIO.read(new File("sprites/Gui/skillButtons/Basic Melee.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		@Override
		public int calcDamage(Unit target, Unit attacker) {
			// TODO Auto-generated method stub
			return 0;
		}
		
	}
}
