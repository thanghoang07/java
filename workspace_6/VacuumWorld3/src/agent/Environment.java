package agent;

import java.util.ArrayList;

/**
 * The top-level class for an agent simulation. This can be used for either
 * single or multi-agent environments. This is intended for simulating static
 * environments in which the agents take turns acting. An environment in which
 * the agent could decide when to sense and act, or a dynamic multi-agent
 * environment would require multiple threads, one for managing the way the
 * environment changes and one for each agent.
 */
public abstract class Environment {

    /** The set of agents in the environment. */
    protected ArrayList<Agent> agents = null;

    /** The current state of the environment. */
    protected State state = null;

    /** Construct a new environment. Initialize the agents vector. */
    public Environment() {

        agents = new ArrayList<Agent>();
    }

    /** Add a new agent to the environment. */
    public abstract void addAgent(Agent agent);

    /**
     * Run the simulation starting from a given state. This consists of a
     * sense-act loop for each agent.
     */
    public void start(State initState) {

        int numAgents;
        Percept p;
        Action action;
        Agent a;

        state = initState;
        state.display();

        numAgents = agents.size();
        while (!isComplete()) {
            for (int i = 0; i < numAgents; i++) {
                a = (Agent) agents.get(i);
                p = getPercept(a);
                a.see(p);
                action = a.selectAction();
                updateState(a, action);
                state.display();
            }
        }
    }

    /** Is the simulation over? Returns true if it is, otherwise false. */
    protected abstract boolean isComplete();

    /**
     * Create a percept for an agent. This effectively implements the see: E ->
     * Per function. Implementations of this method should call the
     * Percept(State,Agent) constructor of the appropriate Percept subclass in
     * order to create an appropriate percept based on the current state.
     * 
     * <p>
     * DESIGN NOTE: The see() function is not implemented in the agent because
     * the agent shouldn't have direct access to the environment. Otherwise, the
     * agent could "cheat" in inaccessible environments and "see" things that
     * wasn't part of its percept.
     * </p>
     */
    protected abstract Percept getPercept(Agent a);

    /**
     * Execute an agent's action and update the environment's state. This
     * effectively applies the state transformer function T:R^Ac -> 2^E to
     * select a subsequent state. Note, if an action is nondeterministic, one of
     * the resulting states is chosen.
     */
    protected void updateState(Agent a, Action action) {

        state = action.execute(a, state);
    }

    /**
     * Return the performance measure of a team of agents in a cooperative
     * environment. Higher values are considered better.
     */
    public abstract int getTeamPerformanceMeasure();

    /**
     * Return the performance measure of a particular agent in the current
     * environment. Higher values are considered better.
     */
    public abstract int getPerformanceMeasure(Agent a);

}
