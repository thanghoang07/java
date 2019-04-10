package DonHang;

import Controls.DateTime;
import KhachHang.KhachHang;
import NhanSu.NhanSu;
import NhanSu.NhanVien;

public class DonHang implements IDonHang {
	private String maDH;
	private NhanSu nhanVien;
	private DateTime ngayNhan;
	private DateTime ngayGiao;
	private float tongTien;
	private ChiTietDonHang chiTietDonHang;
	private KhachHang khachHang;
	private TrangThaiDonHang trangThai;

	public DonHang(String maDH, NhanSu nhanVien, DateTime ngayNhan, DateTime ngayGiao, float tongTien,
			ChiTietDonHang chiTietDonHang, KhachHang khachHang, TrangThaiDonHang trangThai) {
		super();
		this.maDH = maDH;
		this.nhanVien = nhanVien;
		this.ngayNhan = ngayNhan;
		this.ngayGiao = ngayGiao;
		this.tongTien = tongTien;
		this.chiTietDonHang = chiTietDonHang;
		this.khachHang = khachHang;
		this.trangThai = trangThai;
	}

	@Override
	public String toString() {
		return "DonHang [maDH=" + maDH + ", nhanVien=" + nhanVien + ", ngayNhan=" + ngayNhan + ", ngayGiao=" + ngayGiao
				+ ", tongTien=" + tongTien + ", chiTietDonHang=" + chiTietDonHang + ", khachHang=" + khachHang
				+ ", trangThai=" + trangThai + "]";
	}

	public String getMaDH() {
		return maDH;
	}

	public void setMaDH(String maDH) {
		this.maDH = maDH;
	}

	public NhanSu getNhanVien() {
		return nhanVien;
	}

	public void setNhanVien(NhanSu nhanVien) {
		this.nhanVien = nhanVien;
	}

	public DateTime getNgayNhan() {
		return ngayNhan;
	}

	public void setNgayNhan(DateTime ngayNhan) {
		this.ngayNhan = ngayNhan;
	}

	public DateTime getNgayGiao() {
		return ngayGiao;
	}

	public void setNgayGiao(DateTime ngayGiao) {
		this.ngayGiao = ngayGiao;
	}

	public float getTongTien() {
		return tongTien;
	}

	public void setTongTien(float tongTien) {
		this.tongTien = tongTien;
	}

	public ChiTietDonHang getChiTietDonHang() {
		return chiTietDonHang;
	}

	public void setChiTietDonHang(ChiTietDonHang chiTietDonHang) {
		this.chiTietDonHang = chiTietDonHang;
	}

	public KhachHang getKhachHang() {
		return khachHang;
	}

	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}

	public TrangThaiDonHang getTrangThai() {
		return trangThai;
	}

	public void setTrangThai(TrangThaiDonHang trangThai) {
		this.trangThai = trangThai;
	}

	@Override
	public void kiemTraDH(String maDonHang) {
		// TODO Auto-generated method stub

	}

	@Override
	public float tongTienDonHang(DonHang donHang) {
		// TODO Auto-generated method stub
		return 0;
	}

}
