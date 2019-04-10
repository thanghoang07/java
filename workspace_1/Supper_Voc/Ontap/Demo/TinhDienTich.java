package Demo;

public class TinhDienTich {

	public static void HinhTron(double banKinh) {
		double dienTich = banKinh * banKinh * Math.PI;
		double chuVi = 2 * banKinh * Math.PI;
		double nuaChuVi = banKinh * Math.PI;
		if (banKinh <= 0) {
			System.out.print("day khong phai hinh tron :v ");
		} else {
			System.out.printf("dien tich: %.4f \nchu vi: %.4f \nnua chu vi: %.4f", dienTich, chuVi, nuaChuVi);
		}
	}

	public static void TuGiac(double chieuDai, double chieuRong) {
		double dienTich = chieuDai * chieuRong;
		double chuVi = (chieuDai + chieuRong) * 2;
		double nuaChuVi = (chieuDai + chieuRong);
		if (chieuDai == 0.0 && chieuRong != 0.0) {
			System.out.printf("day la duong thang co do dai la: %.4f", chieuRong);
		} else if (chieuDai != 0.0 && chieuRong == 0.0) {
			System.out.printf("day la duong thang co do dai la: %.4f", chieuDai);
		} else if (chieuDai <= 0.0 && chieuRong <= 0.0) {
			System.out.println("day khong phai la tu giac");
		} else if (chieuDai == chieuRong && chieuDai * chieuRong != 0.0) {
			System.out.printf("dien tich hinh vuong: %.4f \nchu vi hinh vuong: %.4f \nnua chu vi hinh vuong: %.4f",
					dienTich, chuVi, nuaChuVi);
		} else {
			System.out.printf(
					"dien tich hinh chu nhat: %.4f \nchu vi hinh chu nhat: %.4f \nnua chu vi hinh chu nhat: %.4f",
					dienTich, chuVi, nuaChuVi);
		}
	}

	public static void TamGiac(double canhA, double canhB, double canhC) {
		double canhA2 = canhA * canhA;
		double canhB2 = canhB * canhB;
		double canhC2 = canhC * canhC;
		double chuVi = canhA + canhB + canhC;
		double nuaChuVi = chuVi / 2;
		double dienTich = Math.sqrt((nuaChuVi) * (nuaChuVi - canhA) * (nuaChuVi - canhB) * (nuaChuVi - canhC));
		if (canhA + canhB > canhC && canhA + canhC > canhB && canhB + canhC > canhA) {
			System.out.println("day la hinh tam giac");
			if (canhA == canhB && canhA == canhC && canhB == canhC) {
				System.out.printf(
						"dien tich tam giac deu: S = %.4f \nchu vi tam giac deu: C = %.4f \nnua chu vi tam giac deu: C/2 = %.4f",
						dienTich, chuVi, nuaChuVi);
			} else if (canhA2 == canhB2 + canhC2) {
				System.out.printf(
						"day la tam giac vuong co canh huyen: %.4f\ncanh goc vuong: %.4f va %.4f\ndien tich tam giac vuong la: S = %.4f\nchu vi tam giac vuong la: C = %.4f\nnua chu vi tam giac vuong la: C/2 = %.4f",
						canhA, canhB, canhC, dienTich, chuVi, nuaChuVi);
			} else if (canhB2 == canhA2 + canhC2) {
				System.out.printf(
						"day la tam giac vuong co canh huyen: %.4f\ncanh goc vuong: %.4f va %.4f\ndien tich tam giac vuong la: S = %.4f\nchu vi tam giac vuong la: C = %.4f\nnua chu vi tam giac vuong la: C/2 = %.4f",
						canhB, canhA, canhC, dienTich, chuVi, nuaChuVi);
			} else if (canhC2 == canhA2 + canhB2) {
				System.out.printf(
						"day la tam giac vuong co canh huyen: %.4f\ncanh goc vuong: %.4f va %.4f\ndien tich tam giac vuong la: S = %.4f\nchu vi tam giac vuong la: C = %.4f\nnua chu vi tam giac vuong la: C/2 = %.4f",
						canhC, canhA, canhB, dienTich, chuVi, nuaChuVi);
			} else if (canhA2 == canhB2 && canhC2 == canhA2 + canhB2) {
				System.out.printf(
						"day la tam giac vuong can co canh huyen: %.4f\ncanh goc vuong: %.4f va %.4f\ndien tich tam giac vuong la: S = %.4f\nchu vi tam giac vuong la: C = %.4f\nnua chu vi tam giac vuong la: C/2 = %.4f",
						canhC, canhA, canhB, dienTich, chuVi, nuaChuVi);
			} else if (canhB2 == canhC2 && canhA2 == canhC2 + canhB2) {
				System.out.printf(
						"day la tam giac vuong can co canh huyen: %.4f\ncanh goc vuong: %.4f va %.4f\ndien tich tam giac vuong la: S = %.4f\nchu vi tam giac vuong la: C = %.4f\nnua chu vi tam giac vuong la: C/2 = %.4f",
						canhA, canhB, canhC, dienTich, chuVi, nuaChuVi);
			} else if (canhA2 == canhC2 && canhB2 == canhA2 + canhC2) {
				System.out.printf(
						"day la tam giac vuong can co canh huyen: %.4f\ncanh goc vuong: %.4f va %.4f\ndien tich tam giac vuong la: S = %.4f\nchu vi tam giac vuong la: C = %.4f\nnua chu vi tam giac vuong la: C/2 = %.4f",
						canhB, canhA, canhC, dienTich, chuVi, nuaChuVi);
			} else if (canhA == canhB && canhB != canhC && canhA != canhC) {
				System.out.printf(
						"day la tam giac can co cac canh: %.4f va %.4f bang nhau va canh day %.4f\ndien tich tam giac la: S = %.4f\nchu vi tam giac  la: C = %.4f\nnua chu vi tam giac: C/2 = %.4f",
						canhA, canhB, canhC, dienTich, chuVi, nuaChuVi);
			} else if (canhA == canhC && canhC != canhB && canhA != canhB) {
				System.out.printf(
						"day la tam giac can co cac canh: %.4f va %.4f bang nhau va canh day %.4f\ndien tich tam giac la: S = %.4f\nchu vi tam giac  la: C = %.4f\nnua chu vi tam giac: C/2 = %.4f",
						canhA, canhC, canhB, dienTich, chuVi, nuaChuVi);
			} else if (canhB == canhC && canhB != canhA && canhC != canhA) {
				System.out.printf(
						"day la tam giac can co cac canh: %.4f va %.4f bang nhau va canh day %.4f\ndien tich tam giac la: S = %.4f\nchu vi tam giac  la: C = %.4f\nnua chu vi tam giac: C/2 = %.4f",
						canhB, canhC, canhA, dienTich, chuVi, nuaChuVi);
			} else if (canhA != canhB && canhA != canhC && canhB != canhC) {
				System.out.printf(
						"day la tam giac thuong co cac canh: %.4f va %.4f va %.4f\ndien tich tam giac la: S = %.4f\nchu vi tam giac  la: C = %.4f\nnua chu vi tam giac: C/2 = %.4f",
						canhA, canhB, canhC, dienTich, chuVi, nuaChuVi);
			}
		} else {
			System.out.println("day khong phai hinh tam giac");
		}
	}
}
