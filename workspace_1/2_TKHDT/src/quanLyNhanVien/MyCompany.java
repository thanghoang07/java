package quanLyNhanVien;

import java.util.ArrayList;
import java.util.List;

public class MyCompany {
	private List<Phong> dsPhong;
	private List<NhanVien> dsNhanVien;

	public MyCompany() {
		this.dsPhong = new ArrayList<Phong>();
		this.dsNhanVien = new ArrayList<NhanVien>();
	}

	public void themPhong(Phong phong) {
		dsPhong.add(phong);
	}

	public void themNhanVien(String maPB, NhanVien nv) {
		boolean check = false;
		System.out.println("- - - - - - - - - - - - - - - - - - - -");
		for (Phong phong : dsPhong) {
			System.out.print(!(phong.getMaPB().equals(maPB)) ? ("")
					: ("Phong " + phong.getMaPB() + " "
							+ ((phong.getDsNhanVien().add(nv)) ? ("da them nhan vien") : (" ")) + " \n"));
			check = true;
		}
		System.out.println("- - - - - - - - - - - - - - - - - - - -");
		System.out.println((check) ? ((dsNhanVien.add(nv)) ? ("Da them vao danh sach nhan vien cong ty") : (""))
				: ("Phong chua co trong du lieu"));
	}

	public void timNV(String maNV) {
		System.out.println(" ");
		for (int i = 0; i < dsNhanVien.size(); i++) {
			System.out.println((dsNhanVien.get(i).getMaNV().equals(maNV)) ? ("Ten: " + dsNhanVien.get(i).getTenNV()
					+ "\nTong Luong: " + Math.round(dsNhanVien.get(i).tinhTongLuongTra())) : (""));
		}
	}

	public void inDSLuong() {
		System.out.println("\n=========================================");
		for (int i = 0; i < dsPhong.size(); i++) {
			System.out.printf("%d. Ten PB: %s\n", (i + 1), dsPhong.get(i).getTenPB());
			dsPhong.get(i).print();
		}
	}

	public void printNhanVien(List<NhanVien> nhanViens) {
		for (NhanVien nhanVien : nhanViens) {
			nhanVien.print();
		}
	}
}
