package mvcDemo;

public class StudentModel {
	private String id;
	private String name;
	private String dob;
	private String pob;
	
	public StudentModel() {
		super();
	}
	public StudentModel(String id, String name, String dob, String pob) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.pob = pob;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getPob() {
		return pob;
	}
	public void setPob(String pob) {
		this.pob = pob;
	}

	
}
