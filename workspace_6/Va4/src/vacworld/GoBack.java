package vacworld;

import agent.Action;
import agent.Agent;
import agent.State;

public class GoBack extends Action  {
	public GoBack() {

    }

    /**
     * Return the state that results from the agent moving forward in the given
     * state. In order to avoid creating unnecessary objects, we do not create a
     * new state, but instead modify the old one. This would have to change if
     * the Environment needs to maintain a history of states.
     */
    public State execute(Agent a, State s) {

        int x, y;
        int dir;
        int newX, newY;
        VacuumState state = null;

        if (s instanceof VacuumState)
            state = (VacuumState) s;
        else
            System.out
                    .println("ERROR - Argument to GoForward.execute() is not of type VacuumState");

        /*
         * since we will be copying the state and bumps depend only on the
         * current move, unset the bump condition
         */
        state.setBump(false);

        x = state.getAgentX();
        y = state.getAgentY();
        dir = state.getAgentDir();

        if (dir >= 0 && dir < 4) {
            newX = x - Direction.DELTA_X[dir];
            newY = y + Direction.DELTA_Y[dir];
        } else {
            System.out.println("ERROR - Invalid direction for agent.");
            newX = x;
            newY = y;
        }

        /*
         * if there is an obstacle in front, the agent doesn't move but instead
         * feels a bump.
         */
        if (state.hasObstacle(newX, newY) == true) {
            state.setBump(true);
        } else if (state.inBounds(newX, newY)) {
            state.setAgentX(newX);
            state.setAgentY(newY);
        }
        return state;
    }

    public String toString() {
        return "GO BACK";
    }
}
