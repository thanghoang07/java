package lab5_by_Van_Toan;

import java.util.Scanner;

public class Bai5 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Nhap bieu thuc can chuyen sang postfix - Cac ky tu phai phan cach nhau boi dau cach: ");
		String input = in.nextLine();
//		String a = "2 * ( ( 3 + 4 ) - ( 5 - 6 ) )";
		System.out.println(InfixToPostfix.convertToPostfix(input));
	}
}
