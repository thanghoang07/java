package agent;

/**
 * An abstract software agent class. The agent must be managed by the
 * Environment class, which calls its see() and selectAction() methods.
 */
public abstract class Agent {

    /**
     * Provide a Percept to the agent. This function is called by the
     * environment at the beginning of each agent's turn. If the agent has
     * internal state, this method should also update it.
     */
    public abstract void see(Percept p);

    /**
     * Have the agent select its next action to perform. Implements the action0:
     * Per -> Ac function or the action: I -> Ac function, depending on whether
     * or not the agent has internal state. Note, Per (or I) is not passed as a
     * parameter, because we assume this information is recorded in an instance
     * variable by the see() method.
     */
    public abstract Action selectAction();

    /**
     * Return a unique string that identifies the agent. This is particularly
     * useful in multi-agent environments.
     */
    public abstract String getId();

}
