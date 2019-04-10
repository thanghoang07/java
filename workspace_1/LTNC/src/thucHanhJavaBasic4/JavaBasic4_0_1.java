package thucHanhJavaBasic4;

import java.util.Scanner;

public class JavaBasic4_0_1 {
		public static int[] createArray(int n) {
			int[] arrInts = new int[n];
			Scanner in = new Scanner(System.in);
			for (int i = 0; i < n; i++) {
				System.out.printf("a[%d] = ", i);
				arrInts[i] = in.nextInt();
			}
			return arrInts;
		}

		public static void printArray(int[] arrInts) {
			System.out.print("Mảng đã nhập vào là : ");
			for (int i = 0; i < arrInts.length; i++) {
				System.out.print(arrInts[i] + "  ");
			}
		}

		public static void maxAndPox(int[] arrInts, int n) {
			int max = arrInts[0], pos = 0;
			for (int i = 0; i < n; i++) {
				if (arrInts[i] > max) {
					max = arrInts[i];
					pos = i;
				}
			}
			System.out.printf("\na. Giá trị lớn nhất của dãy là: %d và ở vị trí %d",
					max, pos);
		}

		public static void minAndPos(int[] arrInts, int n) {
			int min = arrInts[0], pos = 0;
			for (int i = 0; i < n; i++) {
				if (arrInts[i] < min) {
					min = arrInts[i];
					pos = i;
				}
			}
			System.out.printf("\nb. Giá trị nhỏ nhất của dãy là: %d và ở vị trí %d",
					min, pos);
		}

		public static int total(int[] arrInts, int n) {
			int total = 0;
			for (int i = 0; i < n; i++) {
				total += arrInts[i];
			}
			return total;
		}

		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			System.out.print("Nhập vào n : ");
			int n = in.nextInt();
			int[] arrInts = new int[n];

			arrInts = createArray(n);
			printArray(arrInts);
			
			//cau a: vi tri va gia tri phan tu lon nhat cua day 
			maxAndPox(arrInts, n);
			
			//cau b: vi tri va gia tri phan tu nho nhat cua day
			minAndPos(arrInts, n);
			
			//tong cac phan tu trong day
			System.out.printf("\nc. Tổng các phần tử của dãy là  %d" ,total(arrInts, n));
		}
}
