package controller;

public class ValidateCard {
	public static boolean luhnVerify(String str) {
		int sum = 0;
		int value;
		int idx = str.length(); // Start from the end of string
		boolean alt = false;

		while (idx-- > 0) {
			// Get value. Throws error if it isn't a digit
			value = Integer.parseInt(str.substring(idx, idx + 1));
			if (alt) {
				value *= 2;
				if (value > 9)
					value -= 9;
			}
			sum += value;
			alt = !alt; // Toggle alt-flag
		}
		return (sum % 10) == 0;
	}
}
