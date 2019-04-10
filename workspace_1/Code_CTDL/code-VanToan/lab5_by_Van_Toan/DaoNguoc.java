package lab5_by_Van_Toan;

import java.util.Random;

public class DaoNguoc {
	public static String daoNguocChuoi(String in) {
		ArrayStack<Character> theStack = new ArrayStack(in.length());
		for (int i = 0; i < in.length(); i++) {
			theStack.push(in.charAt(i));
		}
		StringBuilder output = new StringBuilder();
		while (!theStack.isEmpty()) {
			output.append(theStack.pop());
		}
		return output.toString();
	}

	public static <T> T[] daoNguocMang(T[] arr) {
		ArrayStack<T> theStack = new ArrayStack<>(arr.length);
		for (int i = 0; i < arr.length; i++) {
			theStack.push(arr[i]);

		}
		for (int i = 0; i < arr.length; i++) {
			arr[i] = theStack.top();
			theStack.pop();
		}
		return arr;
	}
	public static <T> void printArray(T[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print("[" +arr[i] + "]"+ " ");
		}
	}
	
}
