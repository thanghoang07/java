package lab3;

import java.util.Scanner;

public class Bai9 {
	public static void main(String[] args) {
		// tao Scanner
		Scanner input = new Scanner(System.in);
		// yeu cau nguoi dung nhap tien gui ngan hang P
		System.out.print("Số tiền gửi ngân hàng (P) là : ");
		int p = input.nextInt();
		System.out.print("Lãi suất tiên gửi từng tháng (r) là : ");
		int r = input.nextInt();
		System.out.print("Số tháng gửi (n) là : ");
		int n = input.nextInt();
		double f = p * Math.pow((1 + r), n);
		System.out.println("Số tiền được rút ra F sau n tháng là F = " + f);
	}
}
