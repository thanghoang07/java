package textfield;

public class TextField implements Widget {
	private int width, height;

	public TextField(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw() {
		System.out.printf("TextField: %3d, %3d\n", width, height);
	}

}
