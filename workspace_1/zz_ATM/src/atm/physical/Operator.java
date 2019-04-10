package atm.physical;

import atm.ATM;
import atm.simulation.Simulation;
import bank.Money;

public class Operator {
	private ATM atm;

	public Operator(ATM atm) {
		this.atm = atm;
	}

	public Money getInitialCash() {
		return Simulation.getInstance().getInitialCash();
	}
}
