package tvRemote;

public class TVRemoteBasicDemo {
	private String state = "";

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void doAction() {
		if (state.equalsIgnoreCase("On")) {
			System.out.println("Tv is turn on");
		} else if (state.equalsIgnoreCase("Off")) {
			System.out.println("Tv is turn off");
		}
	}

	public static void main(String[] args) {
		TVRemoteBasicDemo remote = new TVRemoteBasicDemo();

		remote.setState("On");
		remote.doAction();
		
		remote.setState("On");
		remote.doAction();
	}
}
