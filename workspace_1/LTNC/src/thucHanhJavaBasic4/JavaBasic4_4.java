package thucHanhJavaBasic4;
import java.util.Scanner;
public class JavaBasic4_4 {
		public static int[] createArray(int n) {
			int[] arrInts = new int[n];
			Scanner in = new Scanner(System.in);
			for (int i = 0; i < n; i++) {
				System.out.printf("myList[%d] = ", i);
				arrInts[i] = in.nextInt();
			}
			return arrInts;
		}

		public static void printArray(int[] myList) {
			System.out.print("Mảng đã nhập vào là : ");
			for (int i = 0; i < myList.length; i++) {
				System.out.print(myList[i] + "  ");
			}
		}

		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			System.out.print("Nhập vào n : ");
			int n = in.nextInt();
			int[] myList = new int[n];
			myList = createArray(n);
			printArray(myList);
			System.out.print("\nSố x : ");
			int x = in.nextInt();

			// cau a: Xác định xem số x có xuất hiện trong dãy không
			if (xetX(myList, n, x) == true)
				System.out.printf("a. Số %d có xuất hiện trong dãy", x);
			else
				System.out.printf(
						"a. Không có phấn tử nào trong mảng có giá trị %d", x);
			// câu b: Cho biết số x xuất hiện trong dãy bao nhiêu lần và tại các vị
			// trí nào?
			System.out.print("\nb. Số x xuất hiện trong dãy " + demX(myList, x)
					+ " và tại các vị trí : ");
			viTriX(myList, x);
			// cau c : Loại bỏ khỏi dãy tất cả các phần tử bằng x. In cả 2 dãy ra
			// màn hình.
			xoaX(myList, n, x);
}

		private static String demX(int[] myList, int x) {
			// TODO Auto-generated method stub
			return null;
		}

		private static void viTriX(int[] myList, int x) {
			// TODO Auto-generated method stub
			
		}

		private static void xoaX(int[] myList, int n, int x) {
			// TODO Auto-generated method stub
			
		}

		private static boolean xetX(int[] myList, int n, int x) {
			// TODO Auto-generated method stub
			return false;
		}
}
