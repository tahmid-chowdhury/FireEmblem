package ActualScenario;

import BaseMechanics.AllTogether;
import BaseMechanics.GameLogic;
import BaseMechanics.InputMethod;
import BaseMechanics.Map;
import BaseMechanics.UserInterface;

public class fightTogether extends AllTogether {

	public fightTogether(Map m, UserInterface ui, InputMethod input, GameLogic gl) {
		super(m, ui, input, gl);
		// TODO Auto-generated constructor stub
	}
	
	public void update() {
		ui.update(this);
		viewport.move(ui.mouse.appendScroll(input.returnInputs()));
		gl.update(this);	
	}
}
