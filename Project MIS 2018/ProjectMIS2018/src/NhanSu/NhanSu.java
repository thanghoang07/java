package NhanSu;

import Controls.DateTime;

public abstract class NhanSu implements INhanSu {
	private String maNS;
	private String tenNS;
	private DateTime ngaySinh;
	private String diaChi;
	private Boolean gioiTinh;
	private DateTime ngayVaoLam;
	private LoaiNhanSu loai;

	public NhanSu(String maNS, String tenNS, DateTime ngaySinh, String diaChi, Boolean gioiTinh, DateTime ngayVaoLam,
			LoaiNhanSu loai) {
		super();
		this.maNS = maNS;
		this.tenNS = tenNS;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
		this.gioiTinh = gioiTinh;
		this.ngayVaoLam = ngayVaoLam;
		this.loai = loai;
	}

	public abstract void chamCong();

	public abstract float tinhLuong();

	@Override
	public String toString() {
		return "NhanSu [maNS=" + maNS + ", tenNS=" + tenNS + ", ngaySinh=" + ngaySinh + ", diaChi=" + diaChi
				+ ", gioiTinh=" + gioiTinh + ", ngayVaoLam=" + ngayVaoLam + ", loai=" + loai + "]";
	}

	public String getMaNS() {
		return maNS;
	}

	public void setMaNS(String maNS) {
		this.maNS = maNS;
	}

	public String getTenNS() {
		return tenNS;
	}

	public void setTenNS(String tenNS) {
		this.tenNS = tenNS;
	}

	public DateTime getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(DateTime ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public Boolean getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(Boolean gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public DateTime getNgayVaoLam() {
		return ngayVaoLam;
	}

	public void setNgayVaoLam(DateTime ngayVaoLam) {
		this.ngayVaoLam = ngayVaoLam;
	}

	public LoaiNhanSu getLoai() {
		return loai;
	}

	public void setLoai(LoaiNhanSu loai) {
		this.loai = loai;
	}

}
