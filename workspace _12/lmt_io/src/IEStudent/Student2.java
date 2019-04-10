package IEStudent;

public class Student2 {
	private String id, name;
	private int gpa;

	public Student2() {
	}

	public Student2(String idStudent, String nameStudent, int gpaStudent) {
		this.id = idStudent;
		this.name = nameStudent;
		this.setGpa(gpaStudent);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getGpa() {
		return gpa;
	}

	public void setGpa(int gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id + " | " + name + " | " + gpa;
	}
}
