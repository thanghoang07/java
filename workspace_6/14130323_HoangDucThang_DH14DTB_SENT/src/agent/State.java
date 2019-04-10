package agent;

/**
 * A complete representation of a situation in the agent environment. Since this
 * is very domain specific, few methods are given. However, there should be
 * methods for updating and retrieving various aspects of the state. This
 * corresponds to the set E.
 */
public abstract class State {

    /**
     * Display information about the state. This may be as simple as text-based
     * output, or could update a graphical display.
     */
    public abstract void display();

}
