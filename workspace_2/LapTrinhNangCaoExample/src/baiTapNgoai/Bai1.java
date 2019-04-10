package baiTapNgoai;

public class Bai1 {
	public static boolean kiemTraChanLe(int soX) {
		if ((soX % 2) == 0) {
			return true;
		}
		return false;
	}

	public static boolean kiemTraNuyenTo(int soX) {
		if(soX < 2)
			return false;
		else{
			for (int i = 2; i <= Math.sqrt((double)soX); i++) {
				if(soX % i == 0)
					return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int soX = 19;
		System.out.println(kiemTraNuyenTo(soX) ? "So NT" : "So ko NT");
	}
}
