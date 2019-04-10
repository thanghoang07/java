package textfield;

public class ScrollDecorator extends Decorator {

	public ScrollDecorator(Widget wi) {
		super(wi);
		draw();
	}

	@Override
	public void draw() {
		super.draw();
		System.out.println("ScrollDecorator");
	}

}
