package khac;

import java.util.Scanner;

public class InNam 
{
	private static Scanner keyboard;
	public static void time(int a, int b)
	{
		int arr[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (a < 0 || b < 0)
			System.out.println("Nhap ko hop le");
		if (a != 2)
			System.out.println("Co Ngay " + arr[a - 1]);
		if (a == 2) {
			int day = 28 + ((b % 400 == 0 || (b % 4 == 0 && (b % 100 != 0)) ? 1 : 0));
			System.out.println("Co Ngay " + day);
		}
	}
	public static void main(String[] args) 
	{
		keyboard = new Scanner(System.in);
		System.out.println("Nhap thang: ");
		int thang = keyboard.nextInt();
		System.out.println("Nhap nam: ");
		int nam = keyboard.nextInt();		
		
		System.out.println("In ra " + "thang " + thang + " nam " + nam + " :");
		time(thang, nam);		
	}
}
