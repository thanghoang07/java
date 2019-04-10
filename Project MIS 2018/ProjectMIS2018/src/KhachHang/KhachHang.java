package KhachHang;

public class KhachHang implements IKhachHang {
	private String maKH, tenKH, email, diaChi, gioiTinh;
	private int phoneNumber;

	public KhachHang(String maKH, String tenKH, String email, String diaChi, String gioiTinh, int phoneNumber) {
		super();
		this.maKH = maKH;
		this.tenKH = tenKH;
		this.email = email;
		this.diaChi = diaChi;
		this.gioiTinh = gioiTinh;
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "KhachHang [maKH=" + maKH + ", tenKH=" + tenKH + ", email=" + email + ", diaChi=" + diaChi
				+ ", gioiTinh=" + gioiTinh + ", phoneNumber=" + phoneNumber + "]";
	}

	public String getMaKH() {
		return maKH;
	}

	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}

	public String getTenKH() {
		return tenKH;
	}

	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
