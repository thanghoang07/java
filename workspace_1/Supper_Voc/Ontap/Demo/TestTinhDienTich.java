package Demo;

import java.util.*;

public class TestTinhDienTich {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("(Nhap 1)Hinh tron: \n(Nhap 2)Tu giac: \n(Nhap 3)Tam giac: \nNhap vao 1 so tuong ung: ");
		int so = sc.nextInt();
		switch (so) {
		case 1:
			System.out.print("Hinh tron: \nNhap vao do dai ban kinh: ");
			double banKinh = sc.nextDouble();
			TinhDienTich.HinhTron(banKinh);
			break;
		case 2:
			System.out.print("Hinh tu giac: \nNhap vao do dai chieu dai: ");
			double chieuDai = sc.nextDouble();
			System.out.print("Nhap vao do dai chieu rong: ");
			double chieuRong = sc.nextDouble();
			TinhDienTich.TuGiac(chieuDai, chieuRong);
			break;
		case 3:
			System.out.print("Hinh tam giac: \nNhap vai do dai canh thu nhat: ");
			double canhA = sc.nextDouble();
			System.out.print("Nhap vao do dai canh thu hai: ");
			double canhB = sc.nextDouble();
			System.out.print("Nhap vao do dai canh thu ba: ");
			double canhC = sc.nextDouble();
			TinhDienTich.TamGiac(canhA, canhB, canhC);
			break;
		default:
			System.out.println("loi.....");
			break;
		}
	}
}
