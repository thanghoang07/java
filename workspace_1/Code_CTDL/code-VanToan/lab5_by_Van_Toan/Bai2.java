package lab5_by_Van_Toan;

import java.util.Random;
import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Nhập chuỗi : ");
		String input = in.nextLine();
		System.out.println("Chuỗi đảo ngược: " + DaoNguoc.daoNguocChuoi(input));
		
		
		Integer[] a = {2, 4, 5};
		System.out.println("Mang ban dau: ");
		DaoNguoc.printArray(a);
		DaoNguoc.daoNguocMang(a);
		System.out.println("\nMang sau khi dao nguoc");
		DaoNguoc.printArray(a);
		
	}
}
