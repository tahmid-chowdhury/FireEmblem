package ActualScenario;

import BaseMechanics.AllTogether;
import BaseMechanics.GameLogic;
import BaseMechanics.InputMethod;
import BaseMechanics.InputMethod.Mouse;
import BaseMechanics.Map;
import BaseMechanics.UserInterface;

public class fightTogether extends AllTogether {
	
	//DO NOT USE THIS CLASS, IT IS BROKEN
	
	InputMethod.Mouse mo;

	public fightTogether(Map m, UserInterface ui, InputMethod input, GameLogic gl, Mouse mo) {
		super(m, ui, input, gl);
		this.mo = mo;
		// TODO Auto-generated constructor stub
	}
	
	public void update() {
		ui.update(this);
		viewport.move(mo.appendScroll(input.returnInputs()));
		gl.update(this);	
	}
}
