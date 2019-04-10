package thucHanhJavaBasic2;

import java.util.Scanner;

public class JavaBasic2_3 {

	public static void main(String[] args) {
//		scanner obj
		Scanner input = new Scanner(System.in);
		System.out.println("tinh nghiem phuong trinh");
//		nhap he so a
		System.out.print("nhap he so a: ");
		int soA = input.nextInt();
//		nhap he so b
		System.out.print("nhap he so b: ");
		int soB = input.nextInt();
//		tinh nghiem pt
		double soX = ((-soB)/soA);
//		in ra man hinh
		System.out.println("ta co phuong trinh: "+soA+"x + " +soB+" = 0"+ "va nghiem cua phuong trinh x: "+soX);
		System.out.println(soX);
	}
}
