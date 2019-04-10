package vacworld;

import agent.Agent;
import agent.Action;
import agent.State;

public final class SuckDirt extends Action {

	public SuckDirt() {

	}

	
	public State execute(Agent a, State s) {

		int x, y;
		VacuumState state = null;

		if (s instanceof VacuumState)
			state = (VacuumState)s;
		else
			System.out.println("ERROR - Argument to SuckDirt.execute() is not of type VacuumState");

		state.setBump(false);

		x = state.getAgentX();
		y = state.getAgentY();
		state.removeDirt(x,y);
		return state;
	}

	public String toString() {
		return "SUCK DIRT";
	}
}
