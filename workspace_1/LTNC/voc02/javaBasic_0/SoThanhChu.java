package javaBasic_0;

import java.util.Scanner;

public class SoThanhChu {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Nh?p v�o 1 s? c� 3 ch? s?: ");
		int n = input.nextInt();
		int tram = n / 100;
		int chuc = (n % 100) / 10;
		int donVi = n % 10;
		String hangTram = "";
		String hangChuc = "";
		if ((tram == 1) && (chuc == 0) && (donVi == 0))
			System.out.print("M?t tr?m ");
		else if ((tram == 2) && (chuc == 0) && (donVi == 0))
			System.out.print("Hai tr?m ");
		else if ((tram == 3) && (chuc == 0) && (donVi == 0))
			System.out.print("Ba tr?m ");
		else if ((tram == 4) && (chuc == 0) && (donVi == 0))
			System.out.print("B?n tr?m ");
		else if ((tram == 5) && (chuc == 0) && (donVi == 0))
			System.out.print("N?m tr?m ");
		else if ((tram == 6) && (chuc == 0) && (donVi == 0))
			System.out.print("S�u tr?m ");
		else if ((tram == 7) && (chuc == 0) && (donVi == 0))
			System.out.print("B?y tr?m ");
		else if ((tram == 8) && (chuc == 0) && (donVi == 0))
			System.out.print("T�m tr?m ");
		else if ((tram == 9) && (chuc == 0) && (donVi == 0))
			System.out.print("Ch�n tr?m ");
		else if ((tram == 0) && (chuc == 1) && (donVi == 0))
			System.out.print("M??i ");
		else if ((tram == 0) && (chuc == 2) && (donVi == 0))
			System.out.print("Hai m??i ");
		else if ((tram == 0) && (chuc == 3) && (donVi == 0))
			System.out.print("Ba m??i ");
		else if ((tram == 0) && (chuc == 4) && (donVi == 0))
			System.out.print("B?n m??i ");
		else if ((tram == 0) && (chuc == 5) && (donVi == 0))
			System.out.print("N?m m??i ");
		else if ((tram == 0) && (chuc == 6) && (donVi == 0))
			System.out.print("S�u m??i ");
		else if ((tram == 0) && (chuc == 7) && (donVi == 0))
			System.out.print("Bay m??i ");
		else if ((tram == 0) && (chuc == 8) && (donVi == 0))
			System.out.print("Tam m??i ");
		else if ((tram == 0) && (chuc == 9) && (donVi == 0))
			System.out.print("Ch�n m??i ");
		else if ((tram == 0) && (chuc == 0) && (donVi == 0))
			System.out.print("Kh�ng ");
		else if ((tram == 0) && (chuc == 0) && (donVi == 1))
			System.out.print("M?t ");
		else if ((tram == 0) && (chuc == 0) && (donVi == 2))
			System.out.print("Hai ");
		else if ((tram == 0) && (chuc == 0) && (donVi == 3))
			System.out.print("Ba ");
		else if ((tram == 0) && (chuc == 0) && (donVi == 4))
			System.out.print("B?n ");
		else if ((tram == 0) && (chuc == 0) && (donVi == 5))
			System.out.print("N?m ");
		else if ((tram == 0) && (chuc == 0) && (donVi == 6))
			System.out.print("S�u ");
		else if ((tram == 0) && (chuc == 0) && (donVi == 7))
			System.out.print("B?y ");
		else if ((tram == 0) && (chuc == 0) && (donVi == 8))
			System.out.print("T�m ");
		else if ((tram == 0) && (chuc == 0) && (donVi == 9))
			System.out.print("Ch�n ");
		else {
			switch (tram) {
			case 1:
				hangTram = "M?t tr?m";
				break;
			case 2:
				hangTram = "Hai tr?m";
				break;
			case 3:
				hangTram = "Ba tr?m";
				break;
			case 4:
				hangTram = "B?n tr?m";
				break;
			case 5:
				hangTram = "N?m tr?m";
				break;
			case 6:
				hangTram = "S�u tr?m";
				break;
			case 7:
				hangTram = "B?y tr?m";
				break;
			case 8:
				hangTram = "T�m tr?m";
				break;
			case 9:
				hangTram = "Ch�n tr?m";
				break;
			}
			switch (chuc) {
			case 0:
				hangChuc = "l?";
				break;
			case 1:
				hangChuc = "M??i";
				break;
			case 2:
				hangChuc = "Hai m??i";
				break;
			case 3:
				hangChuc = "Ba m??i";
				break;
			case 4:
				hangChuc = "B?n m??i";
				break;
			case 5:
				hangChuc = "N?m m??i";
				break;
			case 6:
				hangChuc = "S�u m??i";
				break;
			case 7:
				hangChuc = "B?y m??i";
				break;
			case 8:
				hangChuc = "T�m m??i";
				break;
			case 9:
				hangChuc = "Ch�n m??i";
				break;
			}
			String hangDonVi = "";
			switch (donVi) {
			case 1:
				hangDonVi = ("M?t");
				break;
			case 2:
				hangDonVi = ("Hai");
				break;
			case 3:
				hangDonVi = ("Ba");
				break;
			case 4:
				hangDonVi = ("B?n");
				break;
			case 5:
				hangDonVi = ("N?m ");
				break;
			case 6:
				hangDonVi = ("S�u");
				break;
			case 7:
				hangDonVi = ("B?y");
				break;
			case 8:
				hangDonVi = ("T�m");
				break;
			case 9:
				hangDonVi = ("Ch�n");
				break;
			}
			System.out.println(n + " ??c l� " + hangTram + " " + hangChuc + " "
					+ hangDonVi);
		}
	}
}