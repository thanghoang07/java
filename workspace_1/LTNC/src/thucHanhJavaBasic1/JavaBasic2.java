package thucHanhJavaBasic1;

import java.util.Scanner;

public class JavaBasic2 {
	public static void main(String[] args) {
//	Scanner Obj
		System.out.println("giai phuong trinh");
		Scanner input = new Scanner(System.in);
//	nhap vao so x
		System.out.print("nhap vao x: ");
		int soX = input.nextInt();
//	tinh phuong trinh
		int soY = 4*(soX-3)+20;
//	in ra man hinh
		System.out.println("so x nhap vao: " +soX+ " gia tri can tim: " +soY );
	}
}
