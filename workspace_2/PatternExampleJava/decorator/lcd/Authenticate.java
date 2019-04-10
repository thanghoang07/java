package lcd;

import java.io.IOException;

public class Authenticate extends Decorator {
	protected DecoratorStream ds = new DecoratorStream();

	public Authenticate(LCD inner) {
		super(inner);
	}

	public void write(String[] s) {
		System.out.print("PASSWORD: ");
		try {
			ds.in.readLine();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		super.write(s);
	}

	public void read(String[] s) {
		System.out.print("PASSWORD: ");
		try {
			ds.in.readLine();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		super.read(s);
	}
}
