package lab3_by_thanh_hai;

public class SinhVien {
	String ten;
	int mssv;
	public SinhVien(String ten, int mssv) {
		this.ten = ten;
		this.mssv = mssv;
	}
	public String toString() {
		return "Ten: " + ten + "\t MSSV: " + mssv ;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getMssv() {
		return mssv;
	}
	public void setMssv(int mssv) {
		this.mssv = mssv;
	}

}
