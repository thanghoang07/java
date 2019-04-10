package agent;

/**
 * An abstract class for things an agent can perceive. Since an agent only
 * receives one Percept per turn, the Percept may incorporate the results of
 * multiple sensors. This class represents the set Per.
 */
public abstract class Percept {

    /**
     * Construct a percept for a state from the point of view of a particular
     * agent. Every subclass of Percept should override this default
     * constructor. This design allows for greater modularity in the case that
     * different agents have different kinds of percepts.
     */
    public Percept(State s, Agent a) {

    }

}
