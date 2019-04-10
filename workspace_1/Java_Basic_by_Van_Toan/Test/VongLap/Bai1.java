package VongLap;

import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number;
		int sum = 0;
		int count = 0;
		int max = Integer.MIN_VALUE;
		do {
			System.out.print("Nhap vao so nguyen : ");
			number = in.nextInt();
			sum += number;
			count++;
			if (max < number)
				max = number;
		} while (number != 0);
		System.out.println("Tong la : " + sum);
		System.out.println("trung binh cong la : " + (double) sum / --count);
		System.out.println("So lon nhat la : " + max);
	}
}
