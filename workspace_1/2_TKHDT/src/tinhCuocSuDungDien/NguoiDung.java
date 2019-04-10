package tinhCuocSuDungDien;

import java.util.List;

public abstract class NguoiDung {
	// tao bien thue gia tri gia tang
	protected static final double VAT = 0.1;
	private String ten, diaChi, ID;

	public NguoiDung(String ID, String ten, String diaChi) {
		super();
		this.ID = ID;
		this.ten = ten;
		this.diaChi = diaChi;

	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public abstract List<? extends NgayGhiSoDienDung> getNgayGhi();

	public NgayGhiSoDienDung getChiSoCu() {
		return getNgayGhi().get(getNgayGhi().size() - 2);
	}

	public NgayGhiSoDienDung getChiSoMoi() {
		return getNgayGhi().get(getNgayGhi().size() - 1);
	}

	public abstract void inHoaDon();
}
