package studen;

public class Student {
	private String id, name, where;
	private double gpa;

	public Student() {
	}

	public Student(String idStudent, String nameStudent, String whereStudent, double gpaStudent) {
		this.id = idStudent;
		this.name = nameStudent;
		this.where = whereStudent;
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

	public String getWhere() {
		return where;
	}

	public void setWhere(String where) {
		this.where = where;
	}

	public double getGpa() {
		return gpa;	
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id + " | " + name + " | " + where + " | " + gpa;
	}
}
