package sinhVienClientServer;

public class SinhVien {
	private String id;
	private String name;
	private int age;
	private double gpa;

	public SinhVien() {
		// TODO Auto-generated constructor stub
	}

	public SinhVien(String Id, String Name, int Age, double GPA) {
		this.setId(Id);
		this.name = Name;
		this.age = Age;
		this.gpa = GPA;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "SinhVien [id=" + id + ", name=" + name + ", age=" + age + ", gpa=" + gpa + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
