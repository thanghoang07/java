package shape;

public class Circle extends Shape {

	public Circle() {
		super(ShapeType.CIRCLE);
		draw();
	}

	@Override
	public void draw() {
		System.out.println("Inside circle....");
	}

}
