package javaBasic_0;

import java.util.Scanner;
public class JavaBasic1_2 {
	public static void main(String[] args)
	{
		//scanner
		Scanner input = new Scanner(System.in);
		//nhap gia tri
		System.out.print("nhap gia tri ban kinh: ");
		double radius = input.nextDouble();
		//tinh
		double area = radius * radius * 3.14159;
		//in ket qua
		System.out.println("gia tri ban kinh va dien tich can tim la: " 
		+ radius + " va " + area);
	}

}
