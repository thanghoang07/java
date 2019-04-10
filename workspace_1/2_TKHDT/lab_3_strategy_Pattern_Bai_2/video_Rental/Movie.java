package video_Rental;

public class Movie {
	// trangj thái có sẳn của phim
	private boolean trangThai;
	private String tenPhim, hangSanXuat, ma;
	private LoaiPhimThue loaiPhim;

	public Movie(String ma, String tenPhim, String hangSanXuat, LoaiPhimThue loaiPhim) {
		super();
		this.ma = ma;
		this.tenPhim = tenPhim;
		this.hangSanXuat = hangSanXuat;
		this.loaiPhim = loaiPhim;
		trangThai = true;
	}

	public String getMa() {
		return ma;
	}

	public void setMa(String ma) {
		this.ma = ma;
	}

	public String getHangSanXuat() {
		return hangSanXuat;
	}

	public void setHangSanXuat(String hangSanXuat) {
		this.hangSanXuat = hangSanXuat;
	}

	public boolean isTrangThai() {
		return trangThai;
	}

	public void setTrangThai(boolean trangThai) {
		this.trangThai = trangThai;
	}

	public String getTenPhim() {
		return tenPhim;
	}

	public void setTenPhim(String tenPhim) {
		this.tenPhim = tenPhim;
	}

	public LoaiPhimThue getLoaiPhim() {
		return loaiPhim;
	}

	public void setLoaiPhim(LoaiPhimThue loaiPhim) {
		this.loaiPhim = loaiPhim;
	}

	@Override
	public String toString() {
		return "Ten: " + getTenPhim() + "\nHang: " + getHangSanXuat() + "\nTrang thai: "
				+ (trangThai ? "Co san" : "Khong co san") + "\n.................................";
	}

	public double tinhTien(int ngayThue) {
		return loaiPhim.tinhTien(ngayThue);
	}

	public double tinhThuong(int ngayThue) {
		return loaiPhim.tinhDiemThuong(ngayThue);
	}

	public boolean timPhim(String maSo) {
		if (this.ma.equals(maSo)) {
			return true;
		} else {
			return false;
		}
	}
}
