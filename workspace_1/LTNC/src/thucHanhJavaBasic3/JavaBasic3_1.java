package thucHanhJavaBasic3;

import java.util.Scanner;

public class JavaBasic3_1 {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.print("Nhập vào số tự nhiên: ");
			int n = input.nextInt();
			System.out.println("Đếm số chữ số của số nguyên: " + n + " là "
					+ countOfNum(n));
			System.out.println("Đảo ngược của số " + n + " là " + reverseNumber(n));
		}

		public static int countOfNum(int n) {
			int count = 0;
			do {
				n = n / 10;
				count++;
			} while (n != 0);
			return count;
		}

		public static int reverseNumber(int n) {
			String temp = "";
			while (n != 0) {
				// soCuoi = n % 10;
				temp += n % 10;
				//giam gia tri n
				n = n / 10;

				// daoNguoc = soCuoi + daoNguoc * 10;
			}
			return Integer.parseInt(temp);
		}
	}


