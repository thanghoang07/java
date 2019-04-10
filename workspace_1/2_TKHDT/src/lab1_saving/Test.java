package lab1_saving;

import java.util.ArrayList;
import java.util.List;

public class Test {
	/**
	 * Quy uoc ma nhan vien: CH co huu HD hop dong
	 * 
	 */
	public static List<NhanVien> nhanVien = new ArrayList<NhanVien>();
	public static List<NhanVien> nhanVienP1 = new ArrayList<NhanVien>();
	public static List<NhanVien> nhanVienP2 = new ArrayList<NhanVien>();
	public static List<Phong> phong1 = new ArrayList<Phong>();

	public void printNhanVien(List<NhanVien> nhanViens) {
		for (NhanVien nhanVien : nhanViens) {
			nhanVien.print();
		}
	}

	public static void main(String[] args) {
		CoHuu co = new CoHuu(12, 12000);
		NhanVien nv1 = new NhanVien("CHP01", "Hoang Duc Thang", "Nam", new Date(03, 01, 1995), 4000000,
				new Date(03, 01, 2014), co);
		NhanVien nv2 = new NhanVien("HDP01", "Trinh Van Toan", "Nam", new Date(03, 10, 1996), 4000000,
				new Date(03, 01, 2014), new HopDong(new Date(03, 01, 2015)));
		NhanVien nv3 = new NhanVien("CHK02", "Vo Quoc Huy", "Nam", new Date(29, 11, 1995), 4000000,
				new Date(03, 01, 2013), co);
		NhanVien nv4 = new NhanVien("HDK02", "Nguyen Thanh Trung", "Nam", new Date(29, 05, 1995), 3500000,
				new Date(03, 01, 2013), new HopDong(new Date(01, 11, 2013)));
		NhanVien nv5 = new NhanVien("CHP03", "Nguyen Thanh Hai", "Nam", new Date(03, 10, 1996), 5000000,
				new Date(03, 01, 2014), co);
		NhanVien nv6 = new NhanVien("HDP03", "Duong Gia Bao", "Nam", new Date(16, 9, 1996), 1500000,
				new Date(03, 01, 2014), new HopDong(new Date(03, 01, 2015)));
		NhanVien nv7 = new NhanVien("CHK04", "Nguyen Nhu Y", "Nu", new Date(15, 7, 1995), 4500000,
				new Date(03, 01, 2013), co);
		NhanVien nv8 = new NhanVien("HDK04", "Phan Thi Nhu Quuynh", "Nu", new Date(12, 05, 1995), 2500000,
				new Date(03, 01, 2013), new HopDong(new Date(01, 11, 2013)));
		nhanVien.add(nv1);
		nhanVien.add(nv2);
		nhanVien.add(nv3);
		nhanVien.add(nv4);
		nhanVien.add(nv5);
		nhanVien.add(nv6);
		nhanVien.add(nv7);
		nhanVien.add(nv8);
		Test te1 = new Test();
		// te1.printNhanVien(nhanVien);
		nhanVienP1.add(nv1);
		nhanVienP1.add(nv2);
		nhanVienP1.add(nv5);
		nhanVienP1.add(nv6);
		//
		nhanVienP2.add(nv3);
		nhanVienP2.add(nv4);
		nhanVienP2.add(nv7);
		nhanVienP2.add(nv8);
		//
		Phong p1 = new Phong("P001", "Phong Hanh Chinh", nhanVienP1);
		Phong p2 = new Phong("K001", "Phong Nghiep Vu", nhanVienP2);
		phong1.add(p1);
		 p1.printBangLuong(nhanVienP1);
		/*MyCompany m1 = new MyCompany();
		m1.themPhong(p1);
		m1.printBangLuong();*/
	}
}
