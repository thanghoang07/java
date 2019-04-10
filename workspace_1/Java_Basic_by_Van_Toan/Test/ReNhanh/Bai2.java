package ReNhanh;

import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Nhap vao 1 nam: ");
		int nam = in.nextInt();
		System.out.print("Nhap vao thang: ");
		int thang = in.nextInt();

		// câu a. xet nam nhuan
		if (namNhuan(nam) == true)
			System.out.printf("Nam %d la nam nhuan", nam);
		else
			System.out.printf("Nam %d khong phai la nam nhuan", nam);

		// cau b: so ngay
		soNgay(nam, thang);
	}

	public static boolean namNhuan(int nam) {
		if (nam % 4 == 0 && nam % 100 != 0 || nam % 400 == 0)
			return true;
		else
			return false;
	}

	public static void soNgay(int nam, int thang) {
		if (thang == 2) {
			if (namNhuan(nam) == true)
				System.out.printf("\nThang 2 co 29 ngay");
			else
				System.out.printf("\nThang 2 co 28 ngay");
		} else
			switch (thang) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 11:
				System.out.printf("\nThang %d co 31 ngay", thang);
				break;
			case 4:
			case 6:
			case 9:
			case 12:
				System.out.printf("\nThang %d co 30 ngay", thang);
				break;
			}
	}
}
