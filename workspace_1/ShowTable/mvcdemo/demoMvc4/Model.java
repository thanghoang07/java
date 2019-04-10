package demoMvc4;

public class Model {
	private int x;

	public Model() {
		x = 0;
	}

	public Model(int x) {
		this.x = x;
	}

	public void incX() {
		x++;
	}

	public int getX() {
		return x;
	}
}
