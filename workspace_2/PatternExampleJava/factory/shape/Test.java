package shape;

public class Test {
	public static void main(String[] args) {
		ShapeFactory shf = new ShapeFactory();

		System.out.println(shf.getShape(ShapeType.RECTANGLE));
		System.out.println(shf.getShape(ShapeType.CIRCLE));
		System.out.println(shf.getShape(ShapeType.SQUARE));
	}
}
