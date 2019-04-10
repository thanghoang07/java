package lcd;

public class Decorator implements LCD {
	private LCD inner;

	public Decorator(LCD i) {
		inner = i;
	}

	public void write(String[] s) {
		inner.write(s);
	}

	public void read(String[] s) {
		inner.read(s);
	}
}
