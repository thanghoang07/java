package DonHang;
import KhachHang.KhachHang;
import NhanSu.*;

import ThoiGian.DateTime;

public class DonHang implements IDonHang {
	private String maDH;
	private NhanSu NhanVienKD;
	private DateTime ngayNhan;
	private DateTime ngayGiao;
	private float tongTien;
	private ChiTietDonHang chiTietDonHang;
	private KhachHang khachHang;
	private TrangThaiDonHang trangThai;

	public DonHang(String maDH, NhanSu NhanVienKD, DateTime ngayNhan, DateTime ngayGiao, float tongTien,
			ChiTietDonHang chiTietDonHang, KhachHang khachHang, TrangThaiDonHang trangThai) {
		super();
		this.maDH = maDH;
		this.NhanVienKD = NhanVienKD;
		this.ngayNhan = ngayNhan;
		this.ngayGiao = ngayGiao;
		this.tongTien = tongTien;
		this.chiTietDonHang = chiTietDonHang;
		this.khachHang = khachHang;
		this.trangThai = trangThai;
	}

	@Override
	public String toString() {
		return "DonHang [maDH=" + maDH + ", NhanVienKD=" + NhanVienKD + ", ngayNhan=" + ngayNhan + ", ngayGiao=" + ngayGiao
				+ ", tongTien=" + tongTien + ", chiTietDonHang=" + chiTietDonHang + ", khachHang=" + khachHang
				+ ", trangThai=" + trangThai + "]";
	}

	public String getMaDH() {
		return maDH;
	}

	public void setMaDH(String maDH) {
		this.maDH = maDH;
	}

	public NhanSu getNhanVienKD() {
		return NhanVienKD;
	}

	public void setNhanVienKD(NhanSu NhanVienKD) {
		this.NhanVienKD = NhanVienKD;
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
