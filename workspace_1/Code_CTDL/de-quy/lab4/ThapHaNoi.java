package lab4;

import java.util.Scanner;

public class ThapHaNoi 
{
	private static Scanner nhapVao;
	
	public static void main(String[] args)
	{
		nhapVao = new Scanner(System.in);
		System.out.print("Nhap vao so dia: ");
		int n = nhapVao.nextInt();

		System.out.println("Cac buoc chuyen:");
		chuyenDia(n, 'A', 'B', 'C');
	}
	public static void chuyenDia
		(int n, char fromTower, char toTower, char auxTower)
	{
		if (n == 1)
			System.out.println("Chuyen dia " + n + " tu cot " + fromTower + " toi cot " + toTower);
		else
		{
			chuyenDia(n - 1, fromTower, auxTower, toTower);
			System.out.println("Chuyen dia " + n + " tu cot " + fromTower + " toi cot " + toTower);
			chuyenDia(n - 1, auxTower, toTower, fromTower);
		}
	}
}
