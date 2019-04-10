package lab2;

import java.util.Scanner;

public class SoThanhChu {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhập vào 1 số có 3 chữ số: ");
		int n = input.nextInt();
		int tram = n / 100;
		int chuc = (n % 100) / 10;
		int donVi = n % 10;
		String hangTram = "";
		String hangChuc = "";
		if ((tram == 1) && (chuc == 0) && (donVi == 0))
			System.out.print("Một trăm ");
		else if ((tram == 2) && (chuc == 0) && (donVi == 0))
			System.out.print("Hai trăm ");
		else if ((tram == 3) && (chuc == 0) && (donVi == 0))
			System.out.print("Ba trăm ");
		else if ((tram == 4) && (chuc == 0) && (donVi == 0))
			System.out.print("Bốn trăm ");
		else if ((tram == 5) && (chuc == 0) && (donVi == 0))
			System.out.print("Năm trăm ");
		else if ((tram == 6) && (chuc == 0) && (donVi == 0))
			System.out.print("Sáu trăm ");
		else if ((tram == 7) && (chuc == 0) && (donVi == 0))
			System.out.print("Bảy trăm ");
		else if ((tram == 8) && (chuc == 0) && (donVi == 0))
			System.out.print("Tám trăm ");
		else if ((tram == 9) && (chuc == 0) && (donVi == 0))
			System.out.print("Chín trăm ");
		else if ((tram == 0) && (chuc == 1) && (donVi == 0))
			System.out.print("Mười ");
		else if ((tram == 0) && (chuc == 2) && (donVi == 0))
			System.out.print("Hai mươi ");
		else if ((tram == 0) && (chuc == 3) && (donVi == 0))
			System.out.print("Ba mươi ");
		else if ((tram == 0) && (chuc == 4) && (donVi == 0))
			System.out.print("Bốn mươi ");
		else if ((tram == 0) && (chuc == 5) && (donVi == 0))
			System.out.print("Năm mươi ");
		else if ((tram == 0) && (chuc == 6) && (donVi == 0))
			System.out.print("Sáu mươi ");
		else if ((tram == 0) && (chuc == 7) && (donVi == 0))
			System.out.print("Bay mươi ");
		else if ((tram == 0) && (chuc == 8) && (donVi == 0))
			System.out.print("Tam mươi ");
		else if ((tram == 0) && (chuc == 9) && (donVi == 0))
			System.out.print("Chín mươi ");
		else if ((tram == 0) && (chuc == 0) && (donVi == 0))
			System.out.print("Không ");
		else if ((tram == 0) && (chuc == 0) && (donVi == 1))
			System.out.print("Một ");
		else if ((tram == 0) && (chuc == 0) && (donVi == 2))
			System.out.print("Hai ");
		else if ((tram == 0) && (chuc == 0) && (donVi == 3))
			System.out.print("Ba ");
		else if ((tram == 0) && (chuc == 0) && (donVi == 4))
			System.out.print("Bốn ");
		else if ((tram == 0) && (chuc == 0) && (donVi == 5))
			System.out.print("Năm ");
		else if ((tram == 0) && (chuc == 0) && (donVi == 6))
			System.out.print("Sáu ");
		else if ((tram == 0) && (chuc == 0) && (donVi == 7))
			System.out.print("Bảy ");
		else if ((tram == 0) && (chuc == 0) && (donVi == 8))
			System.out.print("Tám ");
		else if ((tram == 0) && (chuc == 0) && (donVi == 9))
			System.out.print("Chín ");
		else {
			switch (tram) {
			case 1:
				hangTram = "Một trăm";
				break;
			case 2:
				hangTram = "Hai trăm";
				break;
			case 3:
				hangTram = "Ba trăm";
				break;
			case 4:
				hangTram = "Bốn trăm";
				break;
			case 5:
				hangTram = "Năm trăm";
				break;
			case 6:
				hangTram = "Sáu trăm";
				break;
			case 7:
				hangTram = "Bảy trăm";
				break;
			case 8:
				hangTram = "Tám trăm";
				break;
			case 9:
				hangTram = "Chín trăm";
				break;
			}
			switch (chuc) {
			case 0:
				hangChuc = "lẻ";
				break;
			case 1:
				hangChuc = "Mười";
				break;
			case 2:
				hangChuc = "Hai mươi";
				break;
			case 3:
				hangChuc = "Ba mươi";
				break;
			case 4:
				hangChuc = "Bốn mươi";
				break;
			case 5:
				hangChuc = "Năm mươi";
				break;
			case 6:
				hangChuc = "Sáu mươi";
				break;
			case 7:
				hangChuc = "Bảy mươi";
				break;
			case 8:
				hangChuc = "Tám mươi";
				break;
			case 9:
				hangChuc = "Chín mươi";
				break;
			}
			String hangDonVi = "";
			switch (donVi) {
			case 1:
				hangDonVi = ("Một");
				break;
			case 2:
				hangDonVi = ("Hai");
				break;
			case 3:
				hangDonVi = ("Ba");
				break;
			case 4:
				hangDonVi = ("Bốn");
				break;
			case 5:
				hangDonVi = ("Năm ");
				break;
			case 6:
				hangDonVi = ("Sáu");
				break;
			case 7:
				hangDonVi = ("Bảy");
				break;
			case 8:
				hangDonVi = ("Tám");
				break;
			case 9:
				hangDonVi = ("Chín");
				break;
			}
			System.out.println(n + " đọc là " + hangTram + " " + hangChuc + " "
					+ hangDonVi);
		}
	}
}
