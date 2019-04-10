package VongLap;

import java.util.Scanner;

public class BangCuuChuong1 {
	public static void main(String[] args) {
		int n;
		Scanner input = new Scanner(System.in);
		System.out.print("Ban muon in bang nhan thu may : ");
		n = input.nextInt();
		for (int i = 0; i < 50; i++) {
			System.out.println(+n + " x " + i + " = " + n * i);
		}
	}

}
