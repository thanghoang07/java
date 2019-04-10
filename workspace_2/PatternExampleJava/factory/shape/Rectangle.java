package shape;

public class Rectangle extends Shape {

	public Rectangle() {
		super(ShapeType.RECTANGLE);
		draw();
	}

	@Override
	public void draw() {
		System.out.println("Inside Rectangle.....");
	}

}
