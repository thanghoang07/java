package tesst;


import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

public class ButtonPopupSample {

	// Define Show Popup ActionListener
	static class ShowPopupActionListener implements ActionListener {
		private Component component;

		ShowPopupActionListener(Component component) {
			this.component = component;
		}

		public synchronized void actionPerformed(ActionEvent actionEvent) {
			JButton button = new JButton("Tó");
			PopupFactory factory = PopupFactory.getSharedInstance();
			Random random = new Random();
			int x = random.nextInt(200);
			int y = random.nextInt(200);
			final Popup popup = factory.getPopup(component, button, x, y);
			popup.show();
			ActionListener hider = new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					popup.hide();
				}
			};
			// Hide popup in 3 seconds
			Timer timer = new Timer(6000, hider);
			timer.start();
		}
	}

	public static void main(final String args[]) {
		JFrame frame = new JFrame("\\\\:v//");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ActionListener actionListener = new ShowPopupActionListener(frame);

		JButton start = new JButton("click");
		start.addActionListener(actionListener);
		frame.add(start);
		frame.setSize(350, 250);
		frame.setVisible(true);
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
