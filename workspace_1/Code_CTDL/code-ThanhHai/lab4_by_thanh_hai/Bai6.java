package lab4_by_thanh_hai;

import java.util.Scanner;

public class Bai6 {
	private static Scanner nhapVao;
	public static int tong(int n){
		if(n < 10){
			return n;
		}else{
			return n%10 + tong(n/10);
		}
	}
	public static void main(String[] args) {
		nhapVao = new Scanner(System.in);
		System.out.print("Nhap vao day cac so nguyen (n): ");
		int n = nhapVao.nextInt();
		System.out.print("Tong (cac chu so cua so nguyen) = " + tong(n));
	}
}
