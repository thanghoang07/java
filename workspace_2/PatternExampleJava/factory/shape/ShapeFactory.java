package shape;

public class ShapeFactory {
	public Shape getShape(ShapeType model) {
		Shape sh = null;
		switch (model) {
		case RECTANGLE:
			sh = new Rectangle();
			break;
		case SQUARE:
			sh = new Square();
			break;
		case CIRCLE:
			sh = new Circle();
			break;
		default:
			break;
		}
		return sh;
	}
}
