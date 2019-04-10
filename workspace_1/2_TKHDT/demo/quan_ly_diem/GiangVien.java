package quan_ly_diem;

import java.util.Date;

public class GiangVien {
	private String name;
	private Date dateOfBirth;
	private String degree;

	public GiangVien(String name, Date dateOfBirth, String degree) {
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.degree = degree;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String toString() {
		return getDegree() + " " + getName();
	}

}
