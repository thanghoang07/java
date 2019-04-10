package quanLyNhanVien;

import java.util.List;

public class Phong {
	private String maPB;
	private String tenPB;
	private List<NhanVien> dsNhanVien;

	public Phong(String maPB, String tenPB, List<NhanVien> dsNhanVien) {
		this.setMaPB(maPB);
		this.tenPB = tenPB;
		this.dsNhanVien = dsNhanVien;
	}

	/**
	 * @return the maPB
	 */
	public String getMaPB() {
		return maPB;
	}

	/**
	 * @param maPB
	 *            the maPB to set
	 */
	public void setMaPB(String maPB) {
		this.maPB = maPB;
	}

	/**
	 * @return the tenPB
	 */
	public String getTenPB() {
		return tenPB;
	}

	/**
	 * @param tenPB
	 *            the tenPB to set
	 */
	public void setTenPB(String tenPB) {
		this.tenPB = tenPB;
	}

	/**
	 * @return the dsNhanVien
	 */
	public List<NhanVien> getDsNhanVien() {
		return dsNhanVien;
	}

	/**
	 * @param dsNhanVien
	 *            the dsNhanVien to set
	 */
	public void setDsNhanVien(List<NhanVien> dsNhanVien) {
		this.dsNhanVien = dsNhanVien;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Phong [listNV=" + dsNhanVien + ", maPB=" + maPB + ", tenPB=" + tenPB + "]";
	}

	public float tinhTongLuong() {
		float tongLuong = 0;
		for (int i = 0; i < dsNhanVien.size(); i++) {
			tongLuong += dsNhanVien.get(i).tinhLuong() + dsNhanVien.get(i).tinhThuong();
		}
		return tongLuong;
	}

	public float tinhTongThuong() {
		float tongThuong = 0;
		for (int i = 0; i < dsNhanVien.size(); i++) {
			tongThuong += dsNhanVien.get(i).tinhThuong();
		}
		return tongThuong;
	}

	public void print() {
		System.out.println("\nDanh sach nhan vien trong phong");
		for (int i = 0; i < dsNhanVien.size(); i++) {
			System.out.println("-------------------------------------------");
			System.out.println((i + 1) + "\nTen nhan vien: \t" + dsNhanVien.get(i).getTenNV());
			System.out.println("Ma nhan vien: \t" + dsNhanVien.get(i).getMaNV());
			System.out.println("Ngay sinh: \t" + dsNhanVien.get(i).getNgaySinh());
			System.out.println("Ngay vao lam: \t" + dsNhanVien.get(i).getNgayVaoLam());
			System.out.println("Luong co ban: \t" + Math.round(dsNhanVien.get(i).getLuongCoBan()));
			System.out.println("Luong: \t\t" + Math.round(dsNhanVien.get(i).tinhLuong()));
			System.out.println("-------------------------------------------");
		}
		System.out.println("- - - - - - - - - - - - - - - - - - - - - -");
		System.out.println("Tong tien luong cua ca phong: \t" + Math.round(tinhTongLuong()));
		System.out.println("- - - - - - - - - - - - - - - - - - - - - -");
		System.out.println("Tong tien thuong cua phong: \t" + Math.round(tinhTongThuong()));
		System.out.println("===========================================\n");
	}
}
