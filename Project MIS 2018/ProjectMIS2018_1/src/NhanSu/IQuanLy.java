package NhanSu;

import DonHang.SanPham;

public interface IQuanLy {
	public boolean tiepNhanDonDeNghiNhapHang();

	public int thongKeSanPhamTheoLoai(SanPham sanPham, String maLoaiSanPham);

	public int thongKeSanPhamTheoNhanVien(SanPham sanPham, String maNhanVien);
}
