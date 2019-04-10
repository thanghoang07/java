package quanLyNhanVien;

import java.util.Calendar;
import java.util.List;

public class NhanVien {
	protected String maNV;
	protected String tenNV;
	protected String gioiTinh;
	protected Date ngaySinh;
	protected float luongCoBan;
	protected Date ngayVaoLam;
	protected LoaiNV phanLoaiNV;
	protected Calendar cal;

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Ma NV: " + getMaNV() + "\nTen: " + getTenNV() + "\nGioi Tinh: " + getGioiTinh() + "\nNgay Sinh: "
				+ getNgaySinh() + "\nLuong Co Ban: " + getLuongCoBan() + "\nNgay Vao Lam: " + getNgayVaoLam()
				+ "\nPhan Loai NV: " + getPhanLoaiNV();
	}

	/**
	 * @return the luongCoBan
	 */
	public float getLuongCoBan() {
		return luongCoBan;
	}

	/**
	 * @param luongCoBan
	 *            the luongCoBan to set
	 */
	public void setLuongCoBan(float luongCoBan) {
		this.luongCoBan = luongCoBan;
	}

	/**
	 * @return the ngayVaoLam
	 */
	public Date getNgayVaoLam() {
		return ngayVaoLam;
	}

	/**
	 * @param ngayVaoLam
	 *            the ngayVaoLam to set
	 */
	public void setNgayVaoLam(Date ngayVaoLam) {
		this.ngayVaoLam = ngayVaoLam;
	}

	/**
	 * @return the phanLoaiNV
	 */
	public LoaiNV getPhanLoaiNV() {
		return phanLoaiNV;
	}

	/**
	 * @param phanLoaiNV
	 *            the phanLoaiNV to set
	 */
	public void setPhanLoaiNV(LoaiNV phanLoaiNV) {
		this.phanLoaiNV = phanLoaiNV;
	}

	/**
	 * @return the maNV
	 */
	public String getMaNV() {
		return maNV;
	}

	/**
	 * @param maNV
	 *            the maNV to set
	 */
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}

	/**
	 * @return the tenNV
	 */
	public String getTenNV() {
		return tenNV;
	}

	/**
	 * @param tenNV
	 *            the tenNV to set
	 */
	public void setTenNV(String tenNV) {
		this.tenNV = tenNV;
	}

	/**
	 * @return the gioiTinh
	 */
	public String getGioiTinh() {
		return gioiTinh;
	}

	/**
	 * @param gioiTinh
	 *            the gioiTinh to set
	 */
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	/**
	 * @return the ngaySinh
	 */
	public Date getNgaySinh() {
		return ngaySinh;
	}

	/**
	 * @param ngaySinh
	 *            the ngaySinh to set
	 */
	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public NhanVien(String maNV, String tenNV, String gioiTinh, Date ngaySinh, float luongCoBan, Date ngayVaoLam,
			LoaiNV phanLoaiNV) {
		this.maNV = maNV;
		this.tenNV = tenNV;
		this.gioiTinh = gioiTinh;
		this.ngaySinh = ngaySinh;
		this.luongCoBan = luongCoBan;
		this.ngayVaoLam = ngayVaoLam;
		this.phanLoaiNV = phanLoaiNV;
	}

	public void print() {
		System.out.println("===================================");
		System.out.println("Ma Nhan Vien: \t" + getMaNV());
		System.out.println("Ten Nhan Vien: \t" + getTenNV());
		System.out.println("Gioi Tinh: \t" + getGioiTinh());
		System.out.println("Ngay Sinh: \t" + getNgaySinh());
		System.out.println("- - - - - - - - - - - - - - - - - -");
		System.out.print("Phan loai: ");
		inChuDauMaNV(getMaNV());
		System.out.println("Ngay vao lam: \t" + getNgayVaoLam());
		System.out.println("Luong Co Ban: \t" + Math.round(getLuongCoBan()));
		System.out.println("Luong: \t\t" + Math.round(tinhLuong()));
		System.out.println("Thuong: \t" + Math.round(tinhThuong()));
		System.out.println("- - - - - - - - - - - - - - - - - -");
		System.out.println("Tong Tien: \t" + Math.round(tinhTongLuongTra()));
		System.out.println("===================================");

	}

	/**
	 * Quy uoc ma nhan vien: CH co huu HD hop dong
	 * 
	 */
	public void inChuDauMaNV(String str) {
		char temp = str.charAt(0);
		System.out.println((temp == 'C') ? ("\tNhan vien co huu") : ("\tNhan vien hop dong"));
	}

	public NhanVien() {
		super();
	}

	public float tinhLuong() {
		return phanLoaiNV.tinhluong(this);
	}

	public float tinhThuong() {
		return phanLoaiNV.tinhThuong(this);
	}

	public float tinhTongLuongTra() {
		return phanLoaiNV.tinhluong(this) + phanLoaiNV.tinhThuong(this);
	}
	
	
}