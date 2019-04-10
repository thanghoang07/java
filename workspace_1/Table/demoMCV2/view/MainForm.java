package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class MainForm extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public JTextField jtfCardNumber = null;
	public JTextField jtfName = null;
	public JTextField jtfPhone = null;
	public JRadioButton jrbChicago = null;
	public JRadioButton jrbNewYork = null;
	public JRadioButton jrbSeattle = null;
	public JRadioButton jrbSanFransisco = null;

	protected JPanel radioPanel = null;
	protected JPanel jpLabels = null;
	protected JPanel jpTextFields = null;

	protected JButton jbtSubmit = null;

	public MainForm() {
		makeFrom();
	}

	private void makeFrom() {
		// TODO Auto-generated method stub

		jpLabels = new JPanel();
		jpTextFields = new JPanel();

		jtfCardNumber = new JTextField(16);
		jtfName = new JTextField();
		jtfPhone = new JTextField();
		jrbChicago = new JRadioButton("Chicago");
		jrbNewYork = new JRadioButton("New York");
		jrbSeattle = new JRadioButton("Seattle");
		jrbSanFransisco = new JRadioButton("San Fransisco");

		jrbChicago.setSelected(true);

		ButtonGroup group = new ButtonGroup();
		group.add(jrbChicago);
		group.add(jrbNewYork);
		group.add(jrbSeattle);
		group.add(jrbSanFransisco);

		jbtSubmit = new JButton("Submit");

		jpTextFields.setLayout(new GridLayout(7, 1, 1, 1));
		jpLabels.setLayout(new GridLayout(7, 1, 1, 1));

		jpLabels.add(new JLabel("Name:"));
		jpTextFields.add(jtfName);
		jpLabels.add(new JLabel("Phone:"));
		jpTextFields.add(jtfPhone);
		jpLabels.add(new JLabel("Credit Card Number"));
		jpTextFields.add(jtfCardNumber);
		jpLabels.add(new JLabel("Please Select A Destination"));
		jpLabels.add(jrbChicago);
		jpLabels.add(jrbNewYork);
		jpLabels.add(jrbSeattle);
		jpLabels.add(jrbSanFransisco);

		add(jpTextFields, BorderLayout.CENTER);
		add(jpLabels, BorderLayout.WEST);
		add(jbtSubmit, BorderLayout.SOUTH);
	}

	public void addSubmitListener(ActionListener click) {
		jbtSubmit.addActionListener(click);
	}

	public void displayMessage(String message) {
		JOptionPane.showMessageDialog(null, message);
	}
}
