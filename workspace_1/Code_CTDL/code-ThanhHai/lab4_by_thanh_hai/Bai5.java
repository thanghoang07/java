package lab4_by_thanh_hai;

import java.util.Scanner;

public class Bai5 {
	private static Scanner nhapVao;


	public static int ktNgTo(int n, int i) {
		if (i == 0)
			return 0;
		if (i == 1) 
			return 1;
		else if ((n % i == 0))
			return 0;
		else
			return ktNgTo(n, i - 1);
	}


	public static void main(String[] args) {
		int st;
		nhapVao = new Scanner(System.in);
		System.out.print("-Nhap so nguyen (n): ");
		int n = nhapVao.nextInt();
		st=ktNgTo(n, n/2);
		if(st==1){
			System.out.print("\n" + "=> " + n + " la mot so nguyen to");
		}else{
			System.out.print("\n" + "=> " + n + " khong phai la mot so nguyen to");
		}
		
	}
}