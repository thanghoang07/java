package gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SwingControlDemo {

	private JFrame frame;
	private JLabel headerLabel;
	private JLabel statusLabel;
	private JPanel controlPanel;

	public SwingControlDemo() {
		prepareGUI();
	}

	public static void main(String[] args) {
		SwingControlDemo swingControlDemo = new SwingControlDemo();
		swingControlDemo.showButtonDemo();
	}

	private void prepareGUI() {
		frame = new JFrame("Vi du Java Swing");
		frame.setSize(400, 400);
		frame.setLayout(new GridLayout(3, 1));
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}
		});
		headerLabel = new JLabel("", JLabel.CENTER);
		statusLabel = new JLabel("", JLabel.CENTER);

		statusLabel.setSize(350, 100);

		controlPanel = new JPanel();
		controlPanel.setLayout(new FlowLayout());

		frame.add(headerLabel);
		frame.add(controlPanel);
		frame.add(statusLabel);
		frame.setVisible(true);
	}

	private static ImageIcon createImageIcon(String path, String description) {
		java.net.URL imgURL = SwingControlDemo.class.getResource(path);
		if (imgURL != null) {
			return new ImageIcon(imgURL, description);
		} else {
			System.err.println("Couldn't find file: " + path);
			return null;
		}
	}

	private void showButtonDemo() {

		headerLabel.setText("Control in action: Button");

		// resource folder nen o ben trong SWING folder.
		ImageIcon icon = createImageIcon("/resources/java_icon.png", "Java");

		JButton okButton = new JButton("OK");
		JButton javaButton = new JButton("Submit", icon);
		JButton cancelButton = new JButton("Cancel", icon);
		cancelButton.setHorizontalTextPosition(SwingConstants.LEFT);

		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				statusLabel.setText("Ok Button clicked.");
			}
		});

		javaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				statusLabel.setText("Submit Button clicked.");
			}
		});

		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				statusLabel.setText("Cancel Button clicked.");
			}
		});

		controlPanel.add(okButton);
		controlPanel.add(javaButton);
		controlPanel.add(cancelButton);

		frame.setVisible(true);
	}
}