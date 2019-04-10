package lab4_by_thanh_hai;

import java.util.Scanner;

public class Bai7 {
	private static Scanner nhapVao;
	public static void soDao(int n){
		if(n<10){
			System.out.print(n);
		}else{
			System.out.print(n%10);
			soDao(n/10);
		}
	}
	public static void main(String[] args) {
		nhapVao = new Scanner(System.in);
		System.out.print("Nhap vao so nguyen (n): ");
		int n = nhapVao.nextInt();
		System.out.print("So nguyen " + n + " sau khi dao: ");
		soDao(n);
	}
}
