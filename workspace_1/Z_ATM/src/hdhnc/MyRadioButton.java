package hdhnc;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class MyRadioButton extends JFrame implements ItemListener {
	private JRadioButton radBoy, radGirl;
	private JLabel lbGender;

	public MyRadioButton() {
		// add main panel
		add(createMainPanel());
		// set display
		setTitle("JRadioButton");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(200, 100);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	// create main panel
	private JPanel createMainPanel() {
		JPanel panel = new JPanel();
		// add two radiobutton and a label to frame
		panel.add(radBoy = createRadioButton("Boy", true));
		panel.add(radGirl = createRadioButton("Girl", false));
		panel.add(lbGender = createLabel("You are a boy"));

		// create ButtonGroup for radBoy and radGirl
		ButtonGroup genderGroup = new ButtonGroup();
		// add radBoy and radGirl into Group
		genderGroup.add(radBoy);
		genderGroup.add(radGirl);

		return panel;
	}

	// create a JRadioButton with name
	private JRadioButton createRadioButton(String name, boolean select) {
		JRadioButton rad = new JRadioButton(name, select);
		rad.addItemListener(this);
		return rad;
	}

	// create a JLabel with text
	private JLabel createLabel(String text) {
		JLabel lb = new JLabel(text);
		return lb;
	}

	private void changeSelect() {
		lbGender.setText("You are a " + (radBoy.isSelected() ? "boy" : "girl"));
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		changeSelect();
	}

	public static void main(String[] args) {
		new MyRadioButton();
	}

}
