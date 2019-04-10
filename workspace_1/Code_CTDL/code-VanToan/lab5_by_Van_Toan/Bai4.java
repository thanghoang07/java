package lab5_by_Van_Toan;

import java.util.Scanner;
import java.util.Stack;

public class Bai4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Nhap bieu thuc postfix can tinh: ");
		String input = in.nextLine();
//		String test = "2 3 4 + 15 6 - - *";
		System.out.println(CalPostFix.calculate(input));
	}
}
