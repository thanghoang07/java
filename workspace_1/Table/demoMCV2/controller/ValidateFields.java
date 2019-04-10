package controller;

import java.util.InputMismatchException;

import javax.swing.JRadioButton;

public class ValidateFields {
	private int count = 0;

	public ValidateFields() {

	}

	public boolean hasText(String wallSpace) {
		boolean isValid = false;
		count = 0;

		try {
			if (wallSpace.trim().length() > 0 && wallSpace.matches("[0-9]+"))
				count++;

			if (count == 1)
				return isValid = true;
		} catch (InputMismatchException e) {
			e.printStackTrace();
		}

		return isValid;
	}

	public boolean nameCheck(String name) {
		boolean isValid = false;
		count = 0;

		try {
			if (name.trim().length() > 0 && name.matches("[a-zA-Z]+"))
				count++;

			if (count == 1)
				return isValid = true;
		} catch (InputMismatchException e) {
			e.printStackTrace();
		}

		return isValid;
	}

	public boolean validatePhone(String phone) {
		boolean cleanPhone = false;
		count = 0;
		try {
			if (phone.replaceAll("\\D", "").length() == 11 && phone.replaceAll("\\D", "").matches("[0-9]+"))
				count++;

			if (count == 1)
				return cleanPhone = true;
		} catch (InputMismatchException e) {
			e.printStackTrace();
		}

		return cleanPhone;
	}
}
