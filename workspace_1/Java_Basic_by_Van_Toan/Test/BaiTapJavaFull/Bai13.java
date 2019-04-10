package BaiTapJavaFull;

public class Bai13 {
	public static void main(String[] args) {
		int n = 28;
		for (int i = 2; i <= n; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
				n = n / 2;
				if (n > i)
					System.out.print(" x ");
				i--;
			}
		}
	}
}
