package ReNhanh;

import java.util.Scanner;

public class Bai10 {
	public static boolean xetNamNhuan(int y) {
		if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0)
			return true;
		else
			return false;
	}

	public static boolean kiemTraDuLieu(int d, int m, int y) {
		int ngay = d;
		switch (m) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			d = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			d = 30;
			break;
		case 2:
			if (xetNamNhuan(y) == true)
				d = 29;
			else
				d = 28;
		}
		if (ngay <= d && d > 0 && m > 0 && m <= 12 && y > 0)
			return true;
		else
			return false;
	}

	public static void inNgayTiepTheo(int d, int m, int y) {
		if (d == 29 && m == 2 && xetNamNhuan(y) == true)
			System.out.printf("Ngày kế tiếp là: 1/%d/%d", (m + 1), y);
		else if (d == 28 && m == 2&& xetNamNhuan(y) == false)
			System.out.printf("Ngày kế tiếp là: 1/%d/%d", (m + 1), y);
		else if (d == 31 && m == 1 || m == 3 || m == 5 || m == 7 || m == 8
				|| m == 10)
			System.out.printf("Ngày kế tiếp là: 1/%d/%d", (m + 1), y);
		else if (d == 30 && m == 4 || m == 6 | m == 9 || m == 11)
			System.out.printf("Ngày kế tiếp là: 1/%d/%d", (m + 1), y);
		else if (d == 31 && m == 12)
			System.out.printf("Ngày kế tiếp là: 1/1/%d", (y + 1));
		else
			System.out.printf("Ngày kế tiếp là: %d/%d/%d", (d + 1), m, y);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Nhập d: ");
		int d = in.nextInt();
		System.out.print("Nhập m: ");
		int m = in.nextInt();
		System.out.print("Nhập y: ");
		int y = in.nextInt();

		if (kiemTraDuLieu(d, m, y) == true) {
			System.out
					.println("Ngày được tạo bởi 3 số đó theo dạng d/m/y hợp lệ.");
			inNgayTiepTheo(d, m, y);
		} else
			System.out
					.println("Ngày được tạo bởi 3 số đó theo dạng d/m/y không hợp lệ");
	}
}
