package OnTap;

public class Employee {
	private int id;
	private String name;
	private int year;
	private String sex;

	public Employee(int id, String name, int year, String sex) {
		this.id = id;
		this.name = name;
		this.year = year;
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", year=" + year
				+ ", sex=" + sex + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
}
