package javaBasic_0;

import java.util.Scanner;
public class JavaBasic1_3 {
	public static void main(String[] args)
	{
		//nhap gia tri
		Scanner input = new Scanner(System.in);
		//ba so nhap vao
		System.out.print("nhap vao ba so: ");
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();
		//tinh gia tri trung binh
		double average = (number1 + number2 + number3) / 3;
		//in gia tri ra man hinh
		System.out.println(
				"cac so nhap vao va gia tri trung binh can tim la: "
		+ number1 + " " + number2 + " " + number3 + " va " + average);
	}

}
