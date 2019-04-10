package tinhCuocSuDungDien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
	public static void inDanhSachChiNhanh(List<DienLuc> dienLuc) {
		System.out.println("Danh sach cac chi nhanh dien luc");
		for (int i = 0; i < dienLuc.size(); i++) {
			System.out.printf("* %s\n", dienLuc.get(i).getName());
		}
	}

	public static void main(String[] args) {
		//
		List<DienLuc> dienLuc = new ArrayList<DienLuc>();
		//
		CaNhan ca1 = new CaNhan("001", "Thang", "Q.ThuDuc");
		CaNhan ca2 = new CaNhan("002", "Toan", "Q.ThuDuc");
		CaNhan ca3 = new CaNhan("011", "Huy", "Q.2");
		CaNhan ca4 = new CaNhan("012", "Vo", "Q.BinhThanh");
		//
		DoanhNghiep da1 = new DoanhNghiep("100", "Doanh Nghiep CH", "Q.PhuNhuan", "DN1");
		DoanhNghiep da2 = new DoanhNghiep("101", "Doanh Nghiep GH", "Q.PhuNhuan", "DN2");
		DoanhNghiep da3 = new DoanhNghiep("102", "Doanh Nghiep TH", "Q.5", "DN3");
		DoanhNghiep da4 = new DoanhNghiep("103", "Doanh Nghiep DK", "Q.3", "DN4");
		//
		DienLuc dl1 = new DienLuc("DL01");
		DienLuc dl2 = new DienLuc("DL02");
		dienLuc.add(dl1);
		dienLuc.add(dl2);
		//
		ca1.themChiSo(new DienSinhHoat(new Date(12, 01, 2016), 01));
		ca1.themChiSo(new DienSinhHoat(new Date(12, 02, 2016), 123));
		//
		ca2.themChiSo(new DienSinhHoat(new Date(01, 07, 2015), 962));
		ca2.themChiSo(new DienSinhHoat(new Date(01, 10, 2015), 1232));
		//
		ca3.themChiSo(new DienSinhHoat(new Date(01, 03, 2016), 15673));
		ca3.themChiSo(new DienSinhHoat(new Date(01, 04, 2016), 16703));
		//
		ca4.themChiSo(new DienSinhHoat(new Date(01, 02, 2016), 1573));
		ca4.themChiSo(new DienSinhHoat(new Date(01, 03, 2016), 16703));
		//
		da1.themChiSo(new DienSanXuat(new Date(01, 05, 2014), 20560, 5000, 2000));
		da1.themChiSo(new DienSanXuat(new Date(01, 06, 2014), 21796, 5550, 2340));
		//
		da2.themChiSo(new DienSanXuat(new Date(01, 01, 2016), 32356, 4126, 2123));
		da2.themChiSo(new DienSanXuat(new Date(01, 02, 2016), 43267, 7446, 4320));
		//
		da3.themChiSo(new DienSanXuat(new Date(01, 01, 2016), 20560, 5000, 2000));
		da3.themChiSo(new DienSanXuat(new Date(01, 02, 2016), 43267, 7446, 4320));
		//
		da4.themChiSo(new DienSanXuat(new Date(01, 02, 2016), 0, 29823, 12424));
		da4.themChiSo(new DienSanXuat(new Date(01, 03, 2016), 1000000, 427600, 23200));
		//
		dl1.register(ca1);
		dl1.register(ca2);
		dl1.register(da1);
		dl1.register(da2);
		//
		dl2.register(ca3);
		dl2.register(ca4);
		dl2.register(da3);
		dl2.register(da4);
		//
		System.out.println();
		inDanhSachChiNhanh(dienLuc);
		System.out.println();
		dl1.inIDTen();
		System.out.print("Nhap vao ID can kiem tra: ");
		Scanner sc = new Scanner(System.in);
		String khachHang = sc.nextLine();
		System.out.println();
		dl1.inMotKH(khachHang);
		System.out.println();
		dl1.inTatCaKH();
		//
		System.out.println();
		dl2.inIDTen();
		System.out.print("Nhap vao ID can kiem tra: ");
		String khachHang2 = sc.nextLine();
		System.out.println();
		dl2.inMotKH(khachHang2);
		System.out.println();
		dl2.inTatCaKH();
}
}
