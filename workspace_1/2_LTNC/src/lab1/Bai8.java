package lab1;

import java.util.Scanner;

public class Bai8 {
	static int tempH;
	public static int giaiThua(int soH){
		tempH = 1;
		for (int i = 1; i <= soH; i++) {
			tempH *= i;
		}
		return tempH;
	}
	public static int toHop(int soA, int soB){
		int temp = 0;
		if(soA>= 0 && soB >= 0){
			temp = (giaiThua(soB))/(giaiThua(soA)*giaiThua(soB - soA));
		}else{
			System.out.println("loi");
		}
		return temp;
	}
	public static void main(String[] args) {
		Scanner nhapVao = new Scanner(System.in);
		System.out.print("Nhap vao so thu nhat: ");
		int soA = nhapVao.nextInt();
		System.out.print("Nhap vao so thu hai: ");
		int soB = nhapVao.nextInt();
		System.out.printf("To hop chap %s cua %s la: %s", soA, soB, toHop(soA, soB));
	}
}
