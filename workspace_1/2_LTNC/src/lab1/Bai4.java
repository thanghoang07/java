package lab1;

import java.util.Scanner;

public class Bai4 {
	public static int dienTichTamGiac(int canhA, int canhB, int canhC) {
		int dienTich = 0;
		if (canhA + canhB > canhC || canhA + canhC > canhB || canhB + canhC > canhA) {
			System.out.println("day la hinh tam giac");
			int nuaChuVi = (canhA + canhB + canhC) / 2;
			dienTich = (int) Math.sqrt(nuaChuVi * (nuaChuVi - canhA) * (nuaChuVi - canhB) * (nuaChuVi - canhC));
		} else {
			System.out.println("day khong phai la hinh tam giac");
		}
		return dienTich;
	}

	public static void main(String[] args) {
		Scanner nhapVao = new Scanner(System.in);
		System.out.println("nhap vao 3 so bat ky: ");
		int canhA = nhapVao.nextInt();
		int canhB = nhapVao.nextInt();
		int canhC = nhapVao.nextInt();
		System.out.printf("Canh thu nhat %s, Canh thu hai %s, Canh thu ba %s, ta co %s la ket qua", canhA, canhB, canhC,
				dienTichTamGiac(canhA, canhB, canhC));
	}
}
