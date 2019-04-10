package lab1;

import java.util.Scanner;

public class Bai2 {
	public static int phepTinh(int soA, int soB, int soC) {
		int out = 0;
		if (soA <= 100 && soB <= 100 && soC <= 100) {
			out = (soA - soB) * soC;
		} else {
			System.out.println("loi");
		}
		return out;
	}

	public static void main(String[] args) {
		Scanner nhapVao = new Scanner(System.in);
		System.out.println("nhap vao 3 so bat ky: ");
		int soA = nhapVao.nextInt();
		int soB = nhapVao.nextInt();
		int soC = nhapVao.nextInt();
		System.out.printf("So thu nhat %s, so thu hai %s, so thu ba %s, ta co %s la ket qua", soA, soB, soC,
				phepTinh(soA, soB, soC));
	}
}
