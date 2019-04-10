package BaiTapJavaFull;

public class Bai1Mang {
	public static void main(String[] args) {
		int[] a = { 3, 1, 7, 0, 10 };
		int n = 5;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] < a[j]) {
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + "  ");
		}
	}
}
