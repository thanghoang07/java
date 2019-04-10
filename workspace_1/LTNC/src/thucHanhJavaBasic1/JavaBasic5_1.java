package thucHanhJavaBasic1;


import java.util.Scanner;

public class JavaBasic5_1 {
	
	public static void main(String[] args) {
//		Scanner obj
		System.out.println("chuyen doi gio:");
		Scanner input = new Scanner(System.in);
//		nhap vao so giay
		System.out.print("nhap vao so giay: ");
		int soX = input.nextInt();
//		tinh gio
		int soY = soX/3600 ;
//		tinh phut
		int soZ = (soX%3600)/60;
//		tinh giay
		int soT = (soX%3600%60);
//		in ra man hinh
		System.out.println("tong so giay: " +soX);
		System.out.println("h:m:s " +soY+":"+soZ+":"+soT);
	}

}
