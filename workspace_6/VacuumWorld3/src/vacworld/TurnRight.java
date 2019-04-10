package vacworld;

import agent.Agent;
import agent.Action;
import agent.State;

public final class TurnRight extends Action {

	public TurnRight() {

	}


	public State execute(Agent a, State s) {

		int dir;
		int newDir;
		VacuumState state = null;

		if (s instanceof VacuumState)
			state = (VacuumState)s;
		else
			System.out.println("ERROR - Argument to TurnRight.execute() is not of type VacuumState");

		
		state.setBump(false);

		dir = state.getAgentDir();

		newDir = dir + 1;
		if (newDir > 3)
			newDir = 0;
		state.setAgentDir(newDir);
		return state;
	}

	public String toString() {
		return "TURN RIGHT";
	}
}
