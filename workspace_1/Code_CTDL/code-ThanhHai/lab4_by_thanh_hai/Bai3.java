package lab4_by_thanh_hai;

import java.util.Scanner;

public class Bai3 {
	private static Scanner nhapVao;
	public static String soNhiPhan(int n){
		if(n < 2){
			return n + "";
		}else{
			return "" + soNhiPhan(n/2) + (n%2);
		}
	}
	public static void main(String[] args) {
		nhapVao = new Scanner(System.in);
		System.out.print("-Nhap vao so nguyen (N): ");
		int n = nhapVao.nextInt();
		System.out.print(" Bieu dien so nhi phan cua " + n + " la: " + soNhiPhan(n));
	}
}
