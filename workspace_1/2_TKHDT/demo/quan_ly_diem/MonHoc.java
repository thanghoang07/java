package quan_ly_diem;

public class MonHoc {
	private String tenGiangVien;
	private int credits;
	private GiangVien giangVien;

	public MonHoc(String name, int credits, GiangVien giangVien) {
		this.tenGiangVien = name;
		this.credits = credits;
		this.giangVien = giangVien;
	}

	public String getName() {
		return tenGiangVien;
	}

	public void setName(String name) {
		this.tenGiangVien = name;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public GiangVien getLecturer() {
		return giangVien;
	}

	public void setLecturer(GiangVien lecturer) {
		this.giangVien = lecturer;
	}

	public int hashCode() {
		return tenGiangVien.hashCode();
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MonHoc other = (MonHoc) obj;
		if (tenGiangVien == null) {
			if (other.tenGiangVien != null)
				return false;
		} else if (!tenGiangVien.equals(other.tenGiangVien))
			return false;
		return true;
	}

	public String toString() {
		return getName() + " " + getCredits() + " " + getLecturer();
	}

}
