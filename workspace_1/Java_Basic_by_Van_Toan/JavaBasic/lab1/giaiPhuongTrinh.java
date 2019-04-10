package lab1;

import java.util.Scanner;

public class giaiPhuongTrinh {
	public static void main(String[] args) {
		// nhap vao pban phim x, y so nguyen
		Scanner inputx = new Scanner(System.in);
		// yeu cau nhap x, y
		System.out.print("Nhap vao 1 so x : "); 
		int x = inputx.nextInt();
		int y = 4 * (x - 3) + 20;
		// hien thi ket qua ra man hinh
		System.out.println("y = " + y);
	}
}
