package lab4_by_thanh_hai;

import java.util.Scanner;

public class Bai2 {
	private static Scanner nhapVao;
	public static int tongSoLe(int n){
		if(n==0){
			return 1;
		}else{
			return(2*n+1) + tongSoLe(n-1);
		}
	}
	public static void main(String[] args) {
		nhapVao = new Scanner(System.in);
		System.out.print("-Nhap vao mot so (n): ");
		int n =nhapVao.nextInt();
		System.out.println(" Tong cua so le (trong khoang 1 den 2n+1) la: " + tongSoLe(n));
	}
}
