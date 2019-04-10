package vacworld;

import agent.Agent;
import agent.Action;
import agent.State;


public final class GoForward extends Action {

	public GoForward() {

	}


	//Tra ve ket qua trang thai cua Agent di chuyen ve phia truoc
	public State execute(Agent a, State s) {

		int x, y;
		int dir;
		int newX, newY;
		VacuumState state = null;

		if (s instanceof VacuumState)
			state = (VacuumState)s;
		else
			System.out.println("ERROR - Argument to GoForward.execute() is not of type VacuumState");

		/*  */
		state.setBump(false);

		x = state.getAgentX();
		y = state.getAgentY();
		dir = state.getAgentDir();

		if (dir >= 0 && dir < 4) {
			newX = x + Direction.DELTA_X[dir];
			newY = y + Direction.DELTA_Y[dir];
		}
		else {
			System.out.println("ERROR - Invalid direction for agent.");
			newX = x;
			newY = y;
		}

		//Neu thay co vat can phia truoc, agent ko di tiep, nhung cam giac va cham
		if (state.hasObstacle(newX,newY) == true) {
			state.setBump(true);
		}
		else if (state.inBounds(newX,newY)) {
			state.setAgentX(newX);
			state.setAgentY(newY);
		}
		return state;
	}

	public String toString() {
		return "GO FORWARD";
	}
}
