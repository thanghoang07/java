package Khac;
import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		// tao Scanner
		Scanner input = new Scanner(System.in);
		// yeu cau nhap nam
		System.out.print("Enter a year: ");
		int year = input.nextInt();
		// kiem tra nam do co phai nam nhuan khong
		boolean isLeapYear = (year % 4 == 0 && year % 100 !=0) || (year % 400 == 0);
		// hien thi ket qua
		System.out.println(year + " is a leap year? " + isLeapYear);
	}
}
