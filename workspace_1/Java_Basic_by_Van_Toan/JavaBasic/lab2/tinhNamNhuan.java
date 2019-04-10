package lab2;

import java.util.Scanner;

public class tinhNamNhuan {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhập vào 1 năm : ");
		int nam = input.nextInt();
		System.out.print("Nhập vào 1 tháng : ");
		int thang = input.nextInt();
		boolean isLeapYear = (nam % 4 == 0 && nam % 100 != 0)
				|| (nam % 400 == 0);
		// System.out.println("" + namNhuan(nam));
		if (thang == 2) {
			if (isLeapYear == true)
				System.out.println("Năm " + nam + " là năm nhuận"
						+ " và tháng " + thang + " có 28 ngày");
			else
				System.out.println("Năm " + nam + " là năm không nhuận"
						+ " và tháng " + thang + " có 29 ngày");
		} else {
			switch (thang) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("Năm đó là " + isLeapYear + " Tháng "
						+ thang + " có 31 ngày");
				break;
			}
			switch (thang) {
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("Năm đó là " + isLeapYear + " Tháng "
						+ thang + " có 30 ngày");
				break;
			}
		}
		// if (thang == 1 || thang == 3 || thang == 5 || thang == 7 || thang ==
		// 8 || thang == 10 || thang == 12)
		// System.out.println("Năm " + nam + " là năm không nhuận" +
		// " và tháng "+ thang + " có 31 ngày");
		// else
		// System.out.println("Năm " + nam + " là năm không nhuận" +
		// " và tháng "+ thang + " có 30 ngày");
	}
}