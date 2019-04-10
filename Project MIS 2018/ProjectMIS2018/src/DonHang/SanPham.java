package DonHang;

import java.util.List;

public class SanPham implements ISanPham {

	private String maSP, ten;
	private int soLuong;
	private float gia;
	private String kichThuoc;
	private List<NguyenLieu> danhSachNL;

	public SanPham(String maSP, String ten, int soLuong, float gia, String kichThuoc, List<NguyenLieu> danhSachNL) {
		super();
		this.maSP = maSP;
		this.ten = ten;
		this.soLuong = soLuong;
		this.gia = gia;
		this.kichThuoc = kichThuoc;
		this.danhSachNL = danhSachNL;
	}

	@Override
	public String toString() {
		return "SanPham [maSP=" + maSP + ", ten=" + ten + ", soLuong=" + soLuong + ", gia=" + gia + ", kichThuoc="
				+ kichThuoc + ", danhSachNL=" + danhSachNL + "]";
	}

	public String getMaSP() {
		return maSP;
	}

	public void setMaSP(String maSP) {
		this.maSP = maSP;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public float getGia() {
		return gia;
	}

	public void setGia(float gia) {
		this.gia = gia;
	}

	public String getKichThuoc() {
		return kichThuoc;
	}

	public void setKichThuoc(String kichThuoc) {
		this.kichThuoc = kichThuoc;
	}

	public List<NguyenLieu> getDanhSachNL() {
		return danhSachNL;
	}

	public void setDanhSachNL(List<NguyenLieu> danhSachNL) {
		this.danhSachNL = danhSachNL;
	}

	@Override
	public boolean kiemTraSamPham(String maSP) {
		// TODO Auto-generated method stub
		return false;
	}

}
