package lab2;

public class Bai2 {
	public static boolean isLeapYear(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {

	}
}
