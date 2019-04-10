package Theory;

import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class RadioButtonDemo extends JFrame{
	public RadioButtonDemo(String title) {
		super(title);
		setLayout(new GridLayout(5, 2));
		
		JLabel lblSex = new JLabel("Sex:");
		add(lblSex);
		
		JRadioButton rBFemale = new JRadioButton("Female");
		JRadioButton rBMale = new JRadioButton("Male");
		ButtonGroup bg = new ButtonGroup();
		bg.add(rBFemale); bg.add(rBMale);
		add(rBFemale); add(rBMale);
		
		JButton btOK = new JButton("OK");
		add(btOK);
		
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new RadioButtonDemo("RadioButton Demo");
	}
}
