package ActualScenario;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import BaseMechanics.Unit;

public class Attacks {
	public static class GenericMelee extends BaseMechanics.Unit.Attack{
		public GenericMelee() {
			this.name = "Basic Melee";
			try {
				this.button = ImageIO.read(new File("sprites/Gui/skillButtons/Basic Melee.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		@Override
		public int calcDamage(Unit target, Unit attacker) {
			attacker.authorityLevel += 5;
			if(target.authorityLevel >= 5*target.armour) {
				attacker.authorityLevel += 5*target.armour;
				target.authorityLevel -= 5*target.armour;
			}else {
				attacker.authorityLevel += target.authorityLevel;
				target.authorityLevel = 0;
			}
			return (int)(attacker.baseDMG*target.armour);
		}
		
	}
	
	public static class BaseRanged extends BaseMechanics.Unit.Attack{
		public BaseRanged(){
			this.name = "Basic Ranged";
			try{
				this.button = ImageIO.read(new File("sprites/Gui/skillButtons/Basic Ranged.png"));
			}catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		@Override
		public int calcDamage(Unit target, Unit attacker) {
			attacker.authorityLevel += 5;
			if(target.authorityLevel >= 5*target.armour) {
				attacker.authorityLevel += 5*target.armour;
				target.authorityLevel -= 5*target.armour;
			}else {
				attacker.authorityLevel += target.authorityLevel;
				target.authorityLevel = 0;
			}
			return (int)(attacker.baseDMG*target.armour);
		}
		
		
	}
	
	public static class BaseMagic extends BaseMechanics.Unit.Attack{
		public BaseMagic(){
			this.name = "Basic Magic";
			try{
				this.button = ImageIO.read(new File("sprites/Gui/skillButtons/Basic Mage.png"));
			}catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		@Override
		public int calcDamage(Unit target, Unit attacker) {
			attacker.authorityLevel += 5;
			if(target.authorityLevel >= 5*target.armour) {
				attacker.authorityLevel += 5*target.armour;
				target.authorityLevel -= 5*target.armour;
			}else {
				attacker.authorityLevel += target.authorityLevel;
				target.authorityLevel = 0;
			}
			return (int)(attacker.baseDMG*target.armour);
		}
		
		
	}
	
	public static class MeleeSkill extends BaseMechanics.Unit.Attack{
		public MeleeSkill(){
			this.name = "Agility";
			this.authorityThreshold = 20;
			this.abilityOverride = true;
			try{
				this.button = ImageIO.read(new File("sprites/Gui/skillButtons/Skill 1 Melee.png"));
			}catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		@Override
		public int calcDamage(Unit target, Unit attacker) {
			attacker.hasMovedThisTurn = false;
			return 0;
		}
		
	}
	public static class nullAttack extends BaseMechanics.Unit.Attack{
		public nullAttack() {
			this.name = "null";
			try {
				this.button = ImageIO.read(new File("sprites/Gui/skillButtons/Basic Melee.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		}
		@Override
		public int calcDamage(Unit target, Unit attacker) {
			// TODO Auto-generated method stub
			return Integer.MAX_VALUE;
		}
		
	}
}
