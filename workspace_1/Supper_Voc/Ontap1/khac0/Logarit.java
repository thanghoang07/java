package khac0;

import java.util.Scanner;

public class Logarit {
	public static final String err = "Errot";
	static double soN = 0, soA = 0, soM = 0;

	public static void main(String[] args) {
		Scanner nhapVao = new Scanner(System.in);
		System.out.println("nhap vao so duong A: ");
		double soA = nhapVao.nextDouble();
		// y1
		// System.out.println("nhap vao so M: ");
		// double soM = nhapVao.nextDouble();
		// System.out.println("so N can tim la: " + logarit1(soA, soM));
		// y2
		// System.out.println("nhap vao so N: ");
		// double soN = nhapVao.nextDouble();
		// System.out.println("so M can tim la: " + logarit2(soA, soN));
		// y3
		// System.out.println("nhap vao so A2\n(A2 co the am hoac duong nhung
		// gia tri cua A2 phai chinh bang A1): ");
		// double soA2 = nhapVao.nextDouble();
		// System.out.println("nhap vao so M: ");
		// double soM = nhapVao.nextDouble();
		// System.out.println("gia tri tra ve la: " + logarit3(soA, soA2, soM));

	}

	// tim n voi ct a-log-N = M
	public static double logarit1(double soA, double soM) {
		if (0 > soA) {
			System.out.println(err);
		} else {
			soN = Math.pow(soA, soM);
		}
		return soN;
	}

	// tim m voi ct a-log-N = M
	public static double logarit2(double soA, double soN) {
		if (soN < 0 && 0 < soA) {
			System.out.println(err);
		} else {
			soM = (Math.log(soN)) / (Math.log(soA));
		}
		return soM;
	}

	// tim m voi ct a-log-a^M = M (a thuoc a^M co the am hoac duong tuy)
	public static double logarit3(double soA1, double soA2, double soM) {
		// kiem tra code co dung hay ko??
		if (0 > soA1) {
			System.out.println(err);
		} else if (soA2 < 0) {
			Logarit.soM = -soM;
		} else {
			Logarit.soM = soM;
		}
		return Logarit.soM;
	}

	// tim n voi ct a^(a-log-n) = n
	public static double logarit4(double soA, double soN) {
		if (soA < 0) {
			System.out.println(err);
		}
		return soN;
	}
}
