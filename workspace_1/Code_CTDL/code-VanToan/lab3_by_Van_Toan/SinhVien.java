package lab3_by_Van_Toan;

public class SinhVien {
	public int mssv;
	public String hoTen;

	public SinhVien(int mssv, String hoTen) {
		this.mssv = mssv;
		this.hoTen = hoTen;
	}

	public int getMssv() {
		return mssv;
	}

	public void setMssv(int mssv) {
		this.mssv = mssv;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	@Override
	public String toString() {
		return "MSSV : " + mssv + "\tHoTen: " + hoTen + "\n";
	}
}
