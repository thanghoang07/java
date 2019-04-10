package lab3;

import java.util.Scanner;

public class Bai4 {
	public static int uCLN(int soA, int soB) {
		while (soA != 0 && soB != 0) {
			if (soA > soB) {
				soA -= soB;
			} else {
				soB -= soA;
			}
		}
		if (soA == 0)
			return soB;
		return soA;
	}

	public static int bCNN(int soA, int soB) {
		return soA * soB / uCLN(soA, soB);
	}

	public static void main(String[] args) {
		Scanner nhapVao = new Scanner(System.in);
		System.out.print("Nhap vao so thu nhat: ");
		int soA = nhapVao.nextInt();
		System.out.print("Nhap vao so thu nhat: ");
		int soB = nhapVao.nextInt();

		Bai4 b4 = new Bai4();
		System.out.printf("Uoc so chung lon nhat cua %d va %d la: %d \nBoi so chung nho nhat cua %d va %d la: %d", soA,
				soB, b4.uCLN(soA, soB), soA, soB, b4.bCNN(soA, soB));
	}
}
