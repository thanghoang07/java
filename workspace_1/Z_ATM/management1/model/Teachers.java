package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Teachers {
	private String code, name, dob, pob;
	private List<String> listTeacher = new ArrayList<String>();

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
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

	public void setData(String code, String name, String dob, String pob) {
		this.code = code;
		this.name = name;
		this.dob = dob;
		this.pob = pob;
		listTeacher.add(String.format("StdCode: %s \nStdTen: %s \nStdDob: %s \nStdPod: %s\n", code, name, dob, pob));
		toString(listTeacher);
	}

	private void toString(List<String> ds) {
		Iterator<String> itr = ds.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
//	public void removeData(String code, String name, String dob, String pob){
//		this.code = code;
//		this.name = name;
//		this.dob = dob;
//		this.pob = pob;
//		for (int i = 0; i < listStudent.size(); i++) {
//			if()
//		}
//	}
}
