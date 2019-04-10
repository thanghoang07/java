package NhanSu;

import DonHang.SanPham;
import ThoiGian.DateTime;

public class QuanLy extends NhanSu implements IQuanLy {

	public QuanLy(String maNS, String tenNS, DateTime ngaySinh, String diaChi, Boolean gioiTinh, DateTime ngayVaoLam,
			LoaiNhanSu loai) {
		super(maNS, tenNS, ngaySinh, diaChi, gioiTinh, ngayVaoLam, loai);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void chamCong() {
		// TODO Auto-generated method stub

	}

	@Override
	public float tinhLuong() {
		// TODO Auto-generated method stub
		return 0;
	}

	

	@Override
	public boolean tiepNhanDonDeNghiNhapHang() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int thongKeSanPhamTheoLoai(SanPham sanPham, String maLoaiSanPham) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int thongKeSanPhamTheoNhanVien(SanPham sanPham, String maNhanVien) {
		// TODO Auto-generated method stub
		return 0;
	}

}
