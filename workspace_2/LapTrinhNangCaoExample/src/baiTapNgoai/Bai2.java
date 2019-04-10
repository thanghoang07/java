package baiTapNgoai;

public class Bai2 {
	private final static int G = 10;

	public static double tinhThoiGian(double doCao) {
		double tmp = Math.sqrt((2 * doCao) / (G));
		return tmp;
	}

	public static double tinhVanToc(double doCao) {
		double tmp = G * tinhThoiGian(doCao);
		return tmp;
	}

	public static void main(String[] args) {
		double doCao = 100;
		System.out.printf("Time: %3.3f \nVan toc: %3.3f", tinhThoiGian(doCao), tinhVanToc(doCao));

	}
}
