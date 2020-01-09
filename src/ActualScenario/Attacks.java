package ActualScenario;

import BaseMechanics.Unit;

public class Attacks {
	public static class GenericMelee extends BaseMechanics.Unit.Attack{
		public GenericMelee() {
			this.name = "Generic Melee";
		}
		@Override
		public int calcDamage(Unit target, Unit attacker) {
			// TODO Auto-generated method stub
			return 0;
		}
		
	}
}
