package textfield;

public abstract class Decorator implements Widget {
	private Widget wi;
	
	public Decorator(Widget wi) {
		super();
		this.wi = wi;
	}

	@Override
	public void draw() {
		wi.draw();
	}

}
