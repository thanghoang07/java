package theAdapterPattern2;

public class Button {
	private Switchable swit;

	public Button() {
		// TODO Auto-generated constructor stub
	}

	public Button(Switchable swit) {
		// TODO Auto-generated constructor stub
		this.swit = swit;
	}

	public void press() {
		swit.turnOn();
	}
}
