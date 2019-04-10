package quanLyDiem;

public class Register {
	// khoi tao mon hoc
	public Course course;
	// khoi tao so diem
	public float diem;

	public Register(Course course) {
		this.course = course;
		this.diem = diem;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public float getDiem() {
		return diem;
	}

	public void setDiem(float diem) {
		this.diem = diem;
	}
}
