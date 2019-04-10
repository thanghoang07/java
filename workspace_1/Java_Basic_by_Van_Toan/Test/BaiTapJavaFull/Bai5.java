package BaiTapJavaFull;

public class Bai5 {
	public static void main(String[] args) {
		int n = 3;
		int s = 0;
		for (int i = 1; i <=  n; i++) {
			s += 1 / tongTich(i);
		}
		System.out.println(s);
	}

	public static float tongTich(int i) {
		int tong = 0;
		for (int x = 1; x <= i; x++) {
			tong += tich(x);
		}
		return tong;
	}

	public static float tich(int x) {
		int tich = 1;
		for (int j = 1; j <= x; j++) {
			tich =tich * j;
		}
		return tich;
	}
}
