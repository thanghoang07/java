package lab7;

// mÃ£ sinh viÃªn, há»�, tÃªn, Ä‘iá»ƒm lÃ½ thuyáº¿t, Ä‘iá»ƒm thá»±c hÃ nh, Ä‘iá»ƒm trung bÃ¬nh. 
public class SinhVien implements Comparable<SinhVien> {
	public int mSV;
	public double diemLyThuyet, diemThucHanh, diemTrungBinh;
	public String ho, ten;
	private String tenLot;

	public SinhVien(int mSV, String ho, String tenLot, String ten, double diemLyThuyet, double diemThucHanh, double diemTrungBinh) {
		this.mSV = mSV;
		this.ho = ho;
		this.tenLot = tenLot;
		this.ten = ten;
		this.diemLyThuyet = diemLyThuyet;
		this.diemThucHanh = diemThucHanh;
		this.diemTrungBinh = diemTrungBinh;
	}

	public int getmSV() {
		return mSV;
	}

	public void setmSV(int mSV) {
		this.mSV = mSV;
	}

	public double getDiemLyThuyet() {
		return diemLyThuyet;
	}

	public void setDiemLyThuyet(int diemLyThuyet) {
		this.diemLyThuyet = diemLyThuyet;
	}

	public double getDiemThucHanh() {
		return diemThucHanh;
	}

	public void setDiemThucHanh(int diemThucHanh) {
		this.diemThucHanh = diemThucHanh;
	}

	public double getDiemTrungBinh() {
		return diemTrungBinh;
	}

	public void setDiemTrungBinh(int diemTrungBinh) {
		this.diemTrungBinh = diemTrungBinh;
	}

	public String getHo() {
		return ho;
	}

	public void setHo(String ho) {
		this.ho = ho;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String toString() {
		
		return "Ma so sinh vien: " + mSV +
				"\tHo va Ten: " + ho + " " + tenLot + " " + ten + "  " +
				"\tDiem ly thuyet: " + diemLyThuyet + 
				"\tDiem thuc hanh: " + diemThucHanh +
				"\tDiem trung binh: " + diemTrungBinh + "\n";
	}

	public String getTenLot() {
		return tenLot;
	}

	public void setTenLot(String tenLot) {
		this.tenLot = tenLot;
	}

	@Override
	public int compareTo(SinhVien o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
