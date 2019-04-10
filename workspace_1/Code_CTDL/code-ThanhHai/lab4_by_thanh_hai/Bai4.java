package lab4_by_thanh_hai;

import java.util.Scanner;

public class Bai4 {
	private static Scanner nhapVao;
	public static String chuyenDoiGio(int n){
		if(n<60){
			return n + " giay";
		}
		else if(n<3600){
			return 0 + " gio " + n/60 + " phut " + chuyenDoiGio(n%60);
		}else{
			return n/3600 + " gio " + ((n%3600/60) + " phut " + chuyenDoiGio((n%3600)%60));
		}
	}
	public static void main(String[] args) {
		nhapVao = new Scanner(System.in);
		System.out.print("-Nhap vao so giay (s): ");
		int s= nhapVao.nextInt();
		System.out.print(" " + chuyenDoiGio(s));
	}
}
