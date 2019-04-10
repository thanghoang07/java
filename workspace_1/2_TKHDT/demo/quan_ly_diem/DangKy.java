package quan_ly_diem;

public class DangKy {
	private MonHoc course;
	private float grade;

	public DangKy(MonHoc course) {
		this.course = course;
	}

	public MonHoc getCourse() {
		return course;
	}

	public void setGrade(float grade) {
		this.grade = grade;
	}

	public float getGrade() {
		return grade;
	}

}
