package ReNhanh;

import java.util.Scanner;

public class Bai9 {
	public static void main(String[] args) {
		// tao scanner
		Scanner in = new Scanner(System.in);
		// yeu cau nguoi dung nhap vao so tu nhien < 1000
		System.out.print("Nhap vao so tu nhien n < 1000: ");
		int n = in.nextInt();

		if (n < 1000)
			docSo(n);
		else
			System.out.println("n phai nho hon 1000.");
	}

	public static void docSo(int n) {
		int tram = n / 100;
		int chuc = (n % 100) / 10;
		// int donVi = ( 123 %100) %10;
		int donVi = n % 10;
		if (tram == 1 && chuc == 0 && donVi == 0)
			System.out.println("Mot tram");
		else if (tram == 2 && chuc == 0 && donVi == 0)
			System.out.println("Hai tram");
		else if (tram == 3 && chuc == 0 && donVi == 0)
			System.out.println("Ba tram");
		else if (tram == 4 && chuc == 0 && donVi == 0)
			System.out.println("Bon tram");
		else if (tram == 5 && chuc == 0 && donVi == 0)
			System.out.println("Nam tram");
		else if (tram == 6 && chuc == 0 && donVi == 0)
			System.out.println("Sau tram");
		else if (tram == 7 && chuc == 0 && donVi == 0)
			System.out.println("Bay tram");
		else if (tram == 8 && chuc == 0 && donVi == 0)
			System.out.println("Tam tram");
		else if (tram == 9 && chuc == 0 && donVi == 0)
			System.out.println("Chin tram");
		else if (tram == 0 && chuc == 1 && donVi == 0)
			System.out.println("Muoi");
		else if (tram == 0 && chuc == 2 && donVi == 0)
			System.out.println("Hai muoi");
		else if (tram == 0 && chuc == 3 && donVi == 0)
			System.out.println("Ba muoi");
		else if (tram == 0 && chuc == 4 && donVi == 0)
			System.out.println("Bon muoi");
		else if (tram == 0 && chuc == 5 && donVi == 0)
			System.out.println("Nam muoi");
		else if (tram == 0 && chuc == 6 && donVi == 0)
			System.out.println("Sau muoi");
		else if (tram == 0 && chuc == 7 && donVi == 0)
			System.out.println("Bay muoi");
		else if (tram == 0 && chuc == 8 && donVi == 0)
			System.out.println("Tam muoi");
		else if (tram == 0 && chuc == 9 && donVi == 0)
			System.out.println("Chin muoi");
		else if (tram == 0 && chuc == 0 && donVi == 1)
			System.out.println("Mot");
		else if (tram == 0 && chuc == 0 && donVi == 2)
			System.out.println("Hai");
		else if (tram == 0 && chuc == 0 && donVi == 3)
			System.out.println("Ba");
		else if (tram == 0 && chuc == 0 && donVi == 4)
			System.out.println("Bon");
		else if (tram == 0 && chuc == 0 && donVi == 5)
			System.out.println("Nam");
		else if (tram == 0 && chuc == 0 && donVi == 6)
			System.out.println("Sau");
		else if (tram == 0 && chuc == 0 && donVi == 7)
			System.out.println("Bay");
		else if (tram == 0 && chuc == 0 && donVi == 8)
			System.out.println("Tam");
		else if (tram == 0 && chuc == 0 && donVi == 9)
			System.out.println("Chin");
		else {
			String hangTram = "";
			switch (tram) {
			case 1:
				hangTram = "Mot tram";
				break;
			case 2:
				hangTram = "Hai tram";
				break;
			case 3:
				hangTram = "Ba tram";
				break;
			case 4:
				hangTram = "Bon tram";
				break;
			case 5:
				hangTram = "Nam tram";
				break;
			case 6:
				hangTram = "Sau tram";
				break;
			case 7:
				hangTram = "Bay tram";
				break;
			case 8:
				hangTram = "Tam tram";
				break;
			case 9:
				hangTram = "Chin tram";
				break;
			}
			String hangChuc = "";
			switch (chuc) {
			case 0:
				hangChuc = "la";
				break;
			case 1:
				hangChuc = "Muoi";
				break;
			case 2:
				hangChuc = "Hai muoi";
				break;
			case 3:
				hangChuc = "Ba muoi";
				break;
			case 4:
				hangChuc = "Bon muoi";
				break;
			case 5:
				hangChuc = "Nam muoi";
				break;
			case 6:
				hangChuc = "Sau muoi";
				break;
			case 7:
				hangChuc = "Bay muoi";
				break;
			case 8:
				hangChuc = "Tam muoi";
				break;
			case 9:
				hangChuc = "Chin muoi";
				break;
			}
			String hangDonVi = "";
			switch (donVi) {
			case 1:
				hangDonVi = "Mot";
				break;
			case 2:
				hangDonVi = "Hai";
				break;
			case 3:
				hangDonVi = "Ba";
				break;
			case 4:
				hangDonVi = "Bon";
				break;
			case 5:
				hangDonVi = "Nam";
				break;
			case 6:
				hangDonVi = "Sau";
				break;
			case 7:
				hangDonVi = "Bay";
				break;
			case 8:
				hangDonVi = "Tam";
				break;
			case 9:
				hangDonVi = "Chin";
				break;
			}
			//System.out.println(n + " doc la " + hangTram + " " + hangChuc + " " + hangDonVi);
			System.out.printf("%s doc la %s %s %s", n, hangTram, hangChuc, hangDonVi);
		}

	}
}
