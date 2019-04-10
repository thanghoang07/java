package shape;

public abstract class Shape {
	private ShapeType model;

	public Shape(ShapeType model) {
		super();
		this.model = model;
	}

	public abstract void draw();

	public ShapeType getModel() {
		return model;
	}

	public void setModel(ShapeType model) {
		this.model = model;
	}

}
