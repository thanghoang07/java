package vacworld;

import agent.Agent;
import agent.Action;
import agent.State;

/** A vacuum cleaning world action that causes the agent to power down. */
public final class ShutOff extends Action {

    public ShutOff() {
    }

    /**
     * Return the state that results from the agent shutting off in the given
     * state. In order to avoid creating unnecessary objects, we do not create a
     * new state, but instead modify the old one. This would have to change if
     * the Environment needs to maintain a history of states.
     */
    public State execute(Agent a, State s) {

        VacuumState state = null;

        if (s instanceof VacuumState)
            state = (VacuumState) s;
        else
            System.out
                    .println("ERROR - Argument to ShutOff.execute() is not of type VacuumState");

        state.setRobotOff(true);
        return state;
    }

    public String toString() {
        return "SHUT OFF";
    }
}
