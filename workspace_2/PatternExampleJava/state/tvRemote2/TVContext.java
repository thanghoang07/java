package tvRemote2;

public class TVContext implements State {
	private State tvState;

	public State getTvState() {
		return tvState;
	}

	public void setTvState(State tvState) {
		this.tvState = tvState;
	}

	@Override
	public void doAction() {
		this.tvState.doAction();
	}

}
