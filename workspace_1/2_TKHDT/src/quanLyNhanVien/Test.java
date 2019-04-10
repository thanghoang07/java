package quanLyNhanVien;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static List<NhanVien> nhanVien = new ArrayList<NhanVien>();
	public static List<NhanVien> dsNhanVienP1 = new ArrayList<NhanVien>();
	public static List<NhanVien> dsNhanVienP2 = new ArrayList<NhanVien>();
	public static List<NhanVien> dsNhanVienP3 = new ArrayList<NhanVien>();

	public static void main(String[] args) {
		CoHuu co = new CoHuu(12, 12000);
		NhanVien nv1 = new NhanVien("CHP01", "Hoang Duc Thang", "Nam", new Date(3, 10, 1996), 4000000,
				new Date(02, 01, 2013), co);
		NhanVien nv2 = new NhanVien("HDP01", "Trinh Van Toan", "Nam", new Date(19, 11, 1980), 4000000,
				new Date(02, 01, 2014), new HopDong());
		NhanVien nv3 = new NhanVien("CHK02", "Vo Quoc Huy", "Nam", new Date(29, 11, 1995), 4000000,
				new Date(01, 03, 2015), co);
		NhanVien nv4 = new NhanVien("HDK02", "Nguyen Thanh Trung", "Nam", new Date(23, 01, 1994), 3500000,
				new Date(02, 01, 2014), new HopDong(new Date(21, 02, 2015)));
		NhanVien nv5 = new NhanVien("CHP03", "Nguyen Thanh Hai", "Nam", new Date(02, 04, 1996), 5000000,
				new Date(05, 04, 2014), co);
		NhanVien nv6 = new NhanVien("HDP03", "Duong Gia Bao", "Nam", new Date(19, 01, 1997), 1500000,
				new Date(9, 03, 2014), new HopDong(new Date(21, 02, 2016)));
		NhanVien nv7 = new NhanVien("CHK04", "Nguyen Nhu Y", "Nu", new Date(15, 7, 1995), 4500000,
				new Date(03, 01, 2013), co);
		NhanVien nv8 = new NhanVien("HDK04", "Phan Thi Nhu Quuynh", "Nu", new Date(12, 05, 1995), 2500000,
				new Date(03, 01, 2013), new HopDong());

		dsNhanVienP1.add(nv1);
		dsNhanVienP1.add(nv2);
		dsNhanVienP1.add(nv3);

		dsNhanVienP2.add(nv4);
		dsNhanVienP2.add(nv5);
		dsNhanVienP2.add(nv6);

		dsNhanVienP3.add(nv7);
		dsNhanVienP3.add(nv8);

		Phong p1 = new Phong("P001", "Phong Hanh Chinh", dsNhanVienP1);
		Phong p2 = new Phong("K001", "Phong Nghiep Vu", dsNhanVienP2);
		Phong p3 = new Phong("S002", "Phong Nhan Su", dsNhanVienP3);

		MyCompany m1 = new MyCompany();

		m1.themPhong(p1);
		m1.themPhong(p2);
		m1.themPhong(p3);
		m1.inDSLuong();
		/*
		 * m1.themNhanVien("P001", nv1); m1.themNhanVien("P001", nv2);
		 * m1.themNhanVien("P001", nv3); m1.themNhanVien("K001", nv4);
		 * m1.themNhanVien("K001", nv5); m1.themNhanVien("K001", nv6);
		 * m1.themNhanVien("S002", nv7); m1.themNhanVien("S002", nv8);
		 * m1.timNV("CHP01");
		 */
		//
		nhanVien.add(nv1);
		nhanVien.add(nv2);
		nhanVien.add(nv3);
		nhanVien.add(nv4);
		nhanVien.add(nv5);
		nhanVien.add(nv6);
		nhanVien.add(nv7);
		nhanVien.add(nv8);

		m1.printNhanVien(nhanVien);
	}
}
