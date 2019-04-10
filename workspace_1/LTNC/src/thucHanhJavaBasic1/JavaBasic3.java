package thucHanhJavaBasic1;

import java.util.Scanner;

public class JavaBasic3 {
	public static void main(String[] args) {
//		Scanner obj
		System.out.println("doi don vi tu mile sang km :");
		Scanner input = new Scanner(System.in);
		final int MILE = 1609;
//		nhap vao x
		System.out.print("nhap vao mile: ");
		int soX = input.nextInt();
//		doi
		int soY = soX*MILE;
//		in ra man hinh
		System.out.println("so mile: " +soX+ " so km: " +soY);
	}

}
