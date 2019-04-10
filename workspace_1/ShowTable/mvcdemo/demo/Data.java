package demo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Data {
	private String stdCode, stdName, stdDob, stdPob;
	private List<String> dsStudent;
	private String body;
	private Controler contro;

	public Data() {
		super();
		dsStudent = new LinkedList<String>();
	}

	public String getStdCode() {
		return stdCode;
	}

	public void setStdCode(String stdCode) {
		this.stdCode = stdCode;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public String getStdDob() {
		return stdDob;
	}

	public void setStdDob(String stdDob) {
		this.stdDob = stdDob;
	}

	public String getStdPob() {
		return stdPob;
	}

	public void setStdPob(String stdPob) {
		this.stdPob = stdPob;
	}

	public void addStudent() {
		dsStudent.add(data());
		toString(dsStudent);
	}

	private String data() {
		for (int i = 0; i < contro.getModel().getRowCount(); i++) {
			String stdCode = getStdCode(), stdName = getStdName(), stdDob = getStdDob(), stdPob = getStdPob();
			body += String.format("STT: %d \nStdCode: %s \nStdTen: %s \nStdDob: %s \nStdPod: %s\n", i, stdCode, stdName,
					stdDob, stdPob);
		}
		return body;
	}

	private void toString(List<String> ds) {
		Iterator<String> itr = ds.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
