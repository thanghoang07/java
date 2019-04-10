package vacworld;

import agent.Agent;
import agent.Action;
import agent.State;

/**
 * A vacuum cleaning world action that causes the agent to suck up dirt from it
 * current location.
 */
public final class SuckDirt extends Action {

    public SuckDirt() {

    }

    /**
     * Return the state that results from the agent sucking up dirt in the given
     * state. In order to avoid creating unnecessary objects, we do not create a
     * new state, but instead modify the old one. This would have to change if
     * the Environment needs to maintain a history of states.
     */
    public State execute(Agent a, State s) {

        int x, y;
        VacuumState state = null;

        if (s instanceof VacuumState)
            state = (VacuumState) s;
        else
            System.out
                    .println("ERROR - Argument to SuckDirt.execute() is not of type VacuumState");

        /*
         * since we will be copying the state and bumps depend only on the
         * current move, unset the bump condition
         */
        state.setBump(false);

        x = state.getAgentX();
        y = state.getAgentY();
        state.removeDirt(x, y);
        return state;
    }

    public String toString() {
        return "SUCK DIRT";
    }
}
