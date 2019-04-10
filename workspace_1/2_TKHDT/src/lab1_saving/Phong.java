package lab1_saving;

import java.util.ArrayList;
import java.util.List;

public class Phong {
	protected String maPB;
	protected String tenPB;
	protected List<NhanVien> listNV;

	public Phong(String maPB, String tenPB, List<NhanVien> listNV) {
		super();
		this.maPB = maPB;
		this.tenPB = tenPB;
		this.listNV = listNV;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Phong [listNV=" + listNV + ", maPB=" + maPB + ", tenPB=" + tenPB + "]";
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
	 * @return the listNV
	 */
	public List<NhanVien> getListNV() {
		return listNV;
	}

	/**
	 * @param listNV
	 *            the listNV to set
	 */
	public void setListNV(List<NhanVien> listNV) {
		this.listNV = listNV;
	}

	public float tinhTongLuong() {
		float tongLuong = 0;
		for (int i = 0; i < listNV.size(); i++) {
			tongLuong += listNV.get(i).tinhLuong() + listNV.get(i).tinhThuong();
		}
		return tongLuong;

	}
	public float tinhTongThuong() {
		float tongThuong = 0;
		for (int i = 0; i < listNV.size(); i++) {
			tongThuong += listNV.get(i).tinhThuong();
		}
		return tongThuong;
	}

	public void printBangLuong(List<NhanVien> listNV) {
		System.out.println("=================================");
		System.out.println("Ten phong: " + getTenPB());
		System.out.println("Ma phong: " + getMaPB());
		for (NhanVien nhanVien : listNV) {
			System.out.println("---------------------------");
			System.out.println("Ten: " + nhanVien.getTenNV());
			System.out.println("Luong: " + Math.round(nhanVien.tinhTongLuongTra()));
			System.out.println("---------------------------");
		}
		double tempTongLuongPhong = 0;
		for (int i = 0; i < listNV.size(); i++) {
			tempTongLuongPhong += Math.round(listNV.get(i).tinhTongLuongTra());
		}
		System.out.println("***********************");
		System.out.println("Tong Tien: " + Math.round(tempTongLuongPhong));
	}

	public void printNV(List<NhanVien> listNV) {
		for (NhanVien nhanVien : listNV) {
			System.out.println(nhanVien.getTenNV());
		}
	}
}
