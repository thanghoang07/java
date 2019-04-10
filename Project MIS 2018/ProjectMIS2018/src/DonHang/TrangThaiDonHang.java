package DonHang;

public class TrangThaiDonHang {
	private String maTrangThai;
	private String ten;

	public TrangThaiDonHang(String maTrangThai, String ten) {
		super();
		this.maTrangThai = maTrangThai;
		this.ten = ten;
	}

	public String getMaTrangThai() {
		return maTrangThai;
	}

	public void setMaTrangThai(String maTrangThai) {
		this.maTrangThai = maTrangThai;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	@Override
	public String toString() {
		return "TrangThaiDonHang [maTrangThai=" + maTrangThai + ", ten=" + ten + "]";
	}

}
