package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Student {
	private int stCode;
	private String stName;
	private String stDob;
	private String stPob;

	public Student(int stCode, String stName, String stDob, String stPob) {
		this.stCode = stCode;
		this.stName = stName;
		this.stDob = stDob;
		this.stPob = stPob;
	}

	public int getStCode() {
		return stCode;
	}

	public String getStName() {
		return stName;
	}

	public String getStDob() {
		return stDob;
	}

	public String getStPob() {
		return stPob;
	}

}
