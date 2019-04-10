package lcd;

import java.io.IOException;

public class Core implements LCD {
	protected DecoratorStream ds = new DecoratorStream();

	public void write(String[] s) {
		System.out.print("INPUT:    ");
		try {
			s[0] = ds.in.readLine();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	public void read(String[] s) {
		System.out.println("Output:   " + s[0]);
	}
}
