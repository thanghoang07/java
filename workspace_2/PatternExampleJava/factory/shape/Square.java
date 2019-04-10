package shape;

public class Square extends Shape {

	public Square() {
		super(ShapeType.SQUARE);
		draw();
	}

	@Override
	public void draw() {
		System.out.println("Inside square....");
	}

}
