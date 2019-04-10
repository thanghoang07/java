package demoMvc4;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class Main {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
					Model model = new Model(0);
					View view = new View("-");
					Controller controller = new Controller(model, view);
					controller.contol();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
