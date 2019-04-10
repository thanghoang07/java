package thucHanhJavaBasic2;

import java.util.Scanner;

public class JavaBasic2_1 {
	static int soA;
	static int soB;
	public static void main(String[] args) {
//		scanner obj
		Scanner input = new Scanner(System.in);
		System.out.println("tim so lon nhat");
//		nhap vao so a
		System.out.print("nhap vao a: ");
		soA = input.nextInt();
//		nhap vao so b
		System.out.print("nhap vao b: ");
		soB = input.nextInt();
//		so sanh
		if(soA > soB)
			System.out.println(soA);
		else { 
			System.out.println(soB);
			}
		}
}
	
