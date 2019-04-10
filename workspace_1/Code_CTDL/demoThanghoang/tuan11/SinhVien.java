package tuan11;

import lab3_by_thanh_hai.Node;

// mã sinh viên, họ, tên, điểm lý thuyết, điểm thực hành, điểm trung bình. 
public class SinhVien implements Comparable<SinhVien> {
	public int mSV;
	public double diemLyThuyet, diemThucHanh, diemTrungBinh;
	public String ho, ten;

	public SinhVien(int mSV, String ho, String ten, double diemLyThuyet, double diemThucHanh, double diemTrungBinh) {
		this.mSV = mSV;
		this.ho = ho;
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
		
		return ("Ma so sinh vien: " + mSV +
				"\nHo va Ten: " + ho + " " + ten +
				"\nDiem ly thuyet: " + diemLyThuyet + 
				"\tDiem thuc hanh: " + diemThucHanh +
				"\tDiem trung binh: " + diemTrungBinh + "\n");
	}

	@Override
	public int compareTo(SinhVien o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
