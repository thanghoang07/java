package lab4_by_thanh_hai;

import java.util.Scanner;

public class Bai9 {
	private static Scanner nhapVao;
	public static int max(int[] a, int n){
		if(n==1)
			return a[0];
		else if(a[n-1] > max(a, n-1))
			return a[n-1];
		else
			return max(a, n-1);
	}
	public static void main(String[] args) {
		nhapVao = new Scanner(System.in);
		System.out.print("-Nhap so phan tu cua mang: ");
		int n = nhapVao.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++){
			System.out.printf("a[%d] =", i);
			a[i]=nhapVao.nextInt();
		}
		System.out.printf("\nMax =%2d", max(a, n));
	}
}
