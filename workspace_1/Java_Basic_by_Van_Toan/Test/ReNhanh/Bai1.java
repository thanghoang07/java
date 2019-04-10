package ReNhanh;

import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap vao 2 so a va b: ");
		int a = input.nextInt();
		int b = input.nextInt();

		System.out.printf("So lan nhat giua 2 so %d va %d la: %d", a, b, soLonNhat(a, b));
	}

	public static int soLonNhat(int a, int b) {
		if (a > b)
			return a;
		else
			return b;
	}
}
