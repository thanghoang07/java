package quanLyDiem;

public class Course {
	private String name;
	private int creadit;
	private Lecturer lecturer;

	public Course(String name, int creadit, Lecturer lecturer) {
		this.name = name;
		this.creadit = creadit;
		this.lecturer = lecturer;
	}

	public String getName() {
		return name;
	}

	public int getCreadit() {
		return creadit;
	}

	public Lecturer getLecturer() {
		return lecturer;
	}

	
}
