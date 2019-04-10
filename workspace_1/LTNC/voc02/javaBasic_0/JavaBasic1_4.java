package javaBasic_0;
import java.util.Scanner;
public class JavaBasic1_4 {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("nhap gia tri do F: ");
		double Fahrenheit = input.nextDouble();
		//doi qua do C
		double Celsius = (5.0 / 9) * (Fahrenheit - 32);
		//in ra man hinh
		System.out.println(
				"do F: " + Fahrenheit + " va " + Celsius + " cho do C");
	}

}
