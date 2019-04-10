package BaiTapJavaFull;

public class Bai12 {
	public static void main(String[] args) {
		int N = 100;
		int k;
		for (k = 2; k <= N; k++) {
			int dem = 0;
			for (int x = 2; x <= k; x++)
				if (k % x == 0)
					dem++;
			if ((N % k == 0) && (dem == 1)) {

				System.out.print("uoc so nguyen to nho nhat la:" + k);
				break;
			}
		}
	}
}
