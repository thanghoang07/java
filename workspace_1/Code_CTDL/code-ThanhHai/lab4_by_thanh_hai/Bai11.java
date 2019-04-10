package lab4_by_thanh_hai;

import java.util.Scanner;

public class Bai11 {
	private static Scanner nhapVao;
	public static void chuyenDia(int n, int i, int j){
	int k; //k la cot trung gian
	 
    if(n==1)
        System.out.printf("Di chuyen mot dia tu coc %d de sang coc %d\n",i,j);
    else
    {
        k = 6-i-j;
        chuyenDia(n-1,i,k);
        chuyenDia(1,i,j);
        chuyenDia(n-1,k,j);
    }
	}
	public static void main(String[] args) {
		nhapVao = new Scanner(System.in);
		System.out.print("-Nhap vao so dia: ");
		int n = nhapVao.nextInt();
		System.out.print("-Nhap vao thu tu cot chua dia: ");
		int i = nhapVao.nextInt();
		System.out.print("-Nhap vao thu tu cot can chuyen het dia qua: ");
		int j = nhapVao.nextInt();
		System.out.println("    ----Qua trinh chuyen dia----   ");
		chuyenDia(n, i, j);
	}
}
