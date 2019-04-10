package DonHang;

import java.util.List;

public class ChiTietDonHang {
	private String maDonHang;
	private List<SanPham> listSanPham;
	private int soLuong;

	public ChiTietDonHang(String maDonHang, List<SanPham> listSanPham, int soLuong) {
		super();
		this.maDonHang = maDonHang;
		this.listSanPham = listSanPham;
		this.soLuong = soLuong;
	}

	public String getMaDonHang() {
		return maDonHang;
	}

	public void setMaDonHang(String maDonHang) {
		this.maDonHang = maDonHang;
	}

	public List<SanPham> getListSanPham() {
		return listSanPham;
	}

	public void setListSanPham(List<SanPham> listSanPham) {
		this.listSanPham = listSanPham;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	@Override
	public String toString() {
		return "ChiTietDonHang [maDonHang=" + maDonHang + ", listSanPham=" + listSanPham + ", soLuong=" + soLuong + "]";
	}

}
