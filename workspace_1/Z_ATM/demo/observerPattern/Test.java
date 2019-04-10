package observerPattern;

public class Test {
	public static void main(String[] args) {
		Clock clock = new Clock();
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				Analog ana = new Analog(clock);
				Digital dig = new Digital();

			}
		});
		
	}
}
