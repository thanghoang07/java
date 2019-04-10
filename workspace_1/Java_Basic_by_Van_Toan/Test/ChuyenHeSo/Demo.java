package ChuyenHeSo;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Nhập vào 1 số: ");
		int n = in.nextInt();

		System.out.println(he2(n));
		System.out.println(he16(n));
	}

	public static String he2(int n) {
		String nhiPhan = "";
		while (n != 0) {
			nhiPhan = (n % 2) + nhiPhan;
			n = n / 2;
		}
		return nhiPhan;
	}

	public static String he16(int n) {
		String thapLucPhan = "";
		while (n != 0) {
			int giaTri = n % 16;
			thapLucPhan = toHexChar(giaTri) + thapLucPhan;
			n = n / 16;
		}
		return thapLucPhan;
	}

	public static char toHexChar(int giaTri) {
		if (giaTri >= 0 && giaTri <= 9)
			return (char) (giaTri + '0');
		else
			return (char) (giaTri - 10 + 'A');
	}
}
