package agent;

/** A abstract class for actions in an agent environment. Each type of
    action (an element of the set Ac) should be a separate subclass of
    this one.    
 */
public abstract class Action {

    /**
     * Return the State of the environment that results after Agent a executes
     * the Action in State s. This reflects the state transformer function
     * T:R^Ac -> 2^E for a specific action in Ac, with two caveats. First, if
     * the action is nondeterministic, this method selects one of the resulting
     * states. Second, if history is important, we assume that the state s
     * contains all necessary history information. Note that in a multiagent
     * environment, it is also important to know which agent is executing the
     * action.
     * 
     * <p>
     * DESIGN NOTE: The choice to divide the state transformer into separate
     * methods for each action is essentially one of modularity. We suggest that
     * having each action "know" what its effects are is more natural than
     * having the environment (or each state) know how states are changed by
     * actions.
     */
    public abstract State execute(Agent a, State s);

}
