package Khac;
public class ShiftingElements {
	public static void main(String[] args) {
		double[] myList = new double[10];
		double temp = myList[0]; // Retain the first element
		// Shift elements left
		for (int i = 1; i < myList.length; i++) {
			myList[i - 1] = myList[i];
		}
		// Move the first element to fill in the last position
		myList[myList.length - 1] = temp;

	}
}
