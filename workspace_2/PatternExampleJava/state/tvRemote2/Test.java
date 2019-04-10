package tvRemote2;

public class Test {
	public static void main(String[] args) {
		TVContext tvc = new TVContext();
		State tvStartState = new TVStartState();
		State tvStopState = new TVStopState();

		tvc.setTvState(tvStartState);
		tvc.doAction();
		
		tvc.setTvState(tvStopState);
		tvc.doAction();
	}
}
