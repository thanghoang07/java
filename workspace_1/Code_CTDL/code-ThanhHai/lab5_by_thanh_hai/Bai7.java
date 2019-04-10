package lab5_by_thanh_hai;

import java.util.Scanner;

public class Bai7 {
	public static void main(String[] args) {
		System.out.println("Nhap so dia(n): ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        TowerOfHaNoi towerOfHaNoi = new TowerOfHaNoi();
        towerOfHaNoi.towersOfHanoi(n);
	}
}
