package textfield;

public class BorderDecorator extends Decorator {

	public BorderDecorator(Widget wi) {
		super(wi);
		draw();
	}

	@Override
	public void draw() {
		super.draw();
		System.out.println("BorderDecorator");
	}

}
