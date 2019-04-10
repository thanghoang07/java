package quanLyDiem;

//mon hoc
public class Course {
	// khoi tao ten
	public String ten;
	// khoi tao giang vien
	public Lecturer giangVien;
	// khoi tao so tin chi
	public int soTinChi;

	public Course(String tenMonHoc, Lecturer giangVien, int soTinChi) {
		this.ten = tenMonHoc;
		this.giangVien = giangVien;
		this.soTinChi = soTinChi;
	}

	public int getSoTinChi() {
		return soTinChi;
	}

	public void setSoTinChi(int soTinChi) {
		this.soTinChi = soTinChi;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public Lecturer getGiangVien() {
		return giangVien;
	}

	public void setGiangVien(Lecturer giangVien) {
		this.giangVien = giangVien;
	}

	@Override
	public String toString() {
		return "Course [ten=" + getTen() + ", giangVien=" + giangVien + ", soTinChi=" + getSoTinChi() + "]";
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		if (giangVien == null) {
			if (other.giangVien != null)
				return false;
		} else if (!giangVien.equals(other.giangVien))
			return false;
		return true;
	}
}
