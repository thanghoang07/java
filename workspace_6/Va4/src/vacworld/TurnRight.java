package vacworld;

import agent.Agent;
import agent.Action;
import agent.State;

/**
 * A vacuum cleaning world action that causes the agent to turn 90 degrees to
 * the right.
 */
public final class TurnRight extends Action {

    public TurnRight() {

    }

    /**
     * Return the state that results from the agent turning right in the given
     * state. In order to avoid creating unnecessary objects, we do not create a
     * new state, but instead modify the old one. This would have to change if
     * the Environment needs to maintain a history of states.
     */
    public State execute(Agent a, State s) {

        int dir;
        int newDir;
        VacuumState state = null;

        if (s instanceof VacuumState)
            state = (VacuumState) s;
        else
            System.out
                    .println("ERROR - Argument to TurnRight.execute() is not of type VacuumState");

        /*
         * since we will be copying the state and bumps depend only on the
         * current move, unset the bump condition
         */
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
