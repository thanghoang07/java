package thucHanhJavaBasic4;

import java.util.Scanner;

public class JavaBasic4_2 {
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

		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			System.out.print("Nhập vào n : ");
			int n = in.nextInt();
			int[] myList = new int[n];

			// gán gía trị cho mang
			myList = createArray(n);
			// in mang
			printArray(myList);

			// câu a: Đếm số phần âm, dương, bằng 0 của dãy
			demSo(myList);
			// cau b : Xác định số âm lớn nhất và số dương nhỏ nhất
			System.out.printf(
					"\nCâu b : \n+ Số âm lớn nhất : %d\n+ Số dương nhỏ nhất : %d",
					soAmLonNhat(myList), soDuongNhoNhat(myList));
			// cau c: kiểm tra |tổng âm| có bằng tổng dương không
			if (kiemTraTong(myList) == true)
				System.out.println("\nCâu c : \n|tổng âm| = tổng dương.");
			else
				System.out.println("\nCâu c : \n|tổng âm| != bằng tổng dương.");
		}

		public static void demSo(int[] myList) {
			int demAm = 0, demDuong = 0, dem0 = 0;
			for (int i = 0; i < myList.length; i++) {
				if (myList[i] < 0)
					demAm++;
				if (myList[i] >= 0)
					demDuong++;
				if (myList[i] == 0)
					dem0++;
			}
			System.out
					.printf("\nCâu a :\n+ Số phần tử âm : %d\n+ Số phần tử dương : %d\n+ Số phần tử bằng 0 : %d",
							demAm, demDuong, dem0);

		}

		public static int soAmLonNhat(int[] myList) {
			int phanTuAmDauTin = 0;
			int i = 0;
			// do {
			// i++;
			// } while (myList[i] >= 0 && i <= myList.length);
			// if (myList[i] < 0)
			// phanTuAmDauTin = myList[i];
			// for (i = 0; i < myList.length; i++) {
			// if (myList[i] < phanTuAmDauTin && myList[i] < 0)
			// phanTuAmDauTin = myList[i];
			// }
			for (i = 0; i < myList.length; i++) {
				if (myList[i] < 0) {
					phanTuAmDauTin = myList[i];
					break;
				}
			}
			for (i = 0; i < myList.length; i++) {
				if (myList[i] > phanTuAmDauTin && myList[i] < 0)
					phanTuAmDauTin = myList[i];
			}
			return phanTuAmDauTin;
		}

		public static int soDuongNhoNhat(int[] myList) {
			int phanTuDuongDauTien = 0;
			// tim ra phan tu dau tien duong
			for (int i = 0; i < myList.length; i++) {
				if (myList[i] >= 0) {
					phanTuDuongDauTien = myList[i];
					break;
				}
			}
			// so sanh phan tu dau tien o tren vs cac phan tu duong khac
			for (int i = 0; i < myList.length; i++) {
				if (myList[i] < phanTuDuongDauTien && myList[i] >= 0)
					phanTuDuongDauTien = myList[i];
			}
			return phanTuDuongDauTien;
		}

		public static boolean kiemTraTong(int[] myList) {
			int tongDuong = 0, tongAm = 0;
			for (int i = 0; i < myList.length; i++) {
				if (myList[i] >= 0)
					tongDuong += myList[i];
				if (myList[i] < 0)
					tongAm += myList[i];
			}
			if (Math.abs(tongAm) == tongDuong)
				return true;
			else
				return false;
		}
}