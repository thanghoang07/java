package model;

import java.util.Date;

public class Student {
	private String sid;
	private String firstName;
	private String lastName;
	private String className;
	private Date birthday;
	private String email;
	private String major;
	
	public Student() {}

	public Student(String sid, String firstName, String lastName,
			String className, Date birthday, String email, String major) {
		this.sid = sid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.className = className;
		this.birthday = birthday;
		this.email = email;
		this.major = major;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

}
