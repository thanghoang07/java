package lab1;

import java.util.Scanner;

public class Bai5 {
	public static void tamGiac(int canhA, int canhB, int canhC) {

		if (canhA + canhB > canhC || canhA + canhC > canhB || canhB + canhC > canhA) {
			System.out.println("Yes");
			int nuaChuVi = (canhA + canhB + canhC) / 2;

		} else {
			System.out.println("No");
		}

	}

	public static void main(String[] args) {
		Scanner nhapVao = new Scanner(System.in);
		System.out.println("nhap vao 3 so bat ky: ");
		int canhA = nhapVao.nextInt();
		int canhB = nhapVao.nextInt();
		int canhC = nhapVao.nextInt();
		System.out.printf("Canh thu nhat %s, Canh thu hai %s, Canh thu ba %s", canhA, canhB, canhC);
		System.out.println();
		Bai5 b5 = new Bai5();
		b5.tamGiac(canhA, canhB, canhC);
	}

}
