package vacworld;

import agent.Agent;
import agent.Action;
import agent.State;

/** A vacuum cleaning world action that causes the agent to power down. */
public final class ShutOff extends Action {

	public ShutOff() {
	}

//thuc hien hanh dong va cap nhat trang thai
	public State execute(Agent a, State s) {

		VacuumState state = null;

		if (s instanceof VacuumState)
			state = (VacuumState)s;
		else
			System.out.println("ERROR - Argument to ShutOff.execute() is not of type VacuumState");

		state.setRobotOff(true);
		return state;
	}

	public String toString() {
		return "SHUT OFF";
	}
}
