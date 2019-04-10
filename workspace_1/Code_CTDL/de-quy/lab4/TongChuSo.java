package lab4;

import java.util.Scanner;

public class TongChuSo
{
	static Scanner nhapVao;
	public static int tongChuSo(int n)
	{
		if(n == 0)
			return 0;
		else
		{
			return n % 10 + tongChuSo(n / 10);
		}
	}
	public static void main(String[] args) 
	{
		nhapVao = new Scanner(System.in);
		System.out.println("Nhap vao mot chu so: ");
		int daySo = nhapVao.nextInt();
		
		System.out.println("tong cua "+ daySo + " la: " + tongChuSo(daySo));
	}
}
