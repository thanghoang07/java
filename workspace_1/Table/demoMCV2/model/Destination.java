package model;

import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class Destination {

	// Constructor with no arguments
	public Destination() {
	}

	public Destination(JRadioButton chicago, JRadioButton newYork, JRadioButton seattle, JRadioButton sanFransisco,
			JTextField name, JTextField phone) {

		String selectedDestination = getRadioButtonValue(chicago, newYork, seattle, sanFransisco);
		String custName = getCustName(name);
		String custPhone = getPhoneNum(phone);

	}

	public String getCustName(JTextField name) {
		return name.getText();
	}

	public String getPhoneNum(JTextField phone) {
		return phone.getText();
	}

	// get the type of paint
	public String getRadioButtonValue(JRadioButton chicago, JRadioButton newYork, JRadioButton seattle,
			JRadioButton sanFransisco) {

		String selected = "";

		if (chicago.isSelected())
			selected = "Chicago";
		if (newYork.isSelected())
			selected = "New York";
		if (seattle.isSelected())
			selected = "Seattle";
		if (sanFransisco.isSelected())
			selected = "San Fransisco";

		// JOptionPane.showMessageDialog(null, selected);

		return selected;
	}
}
