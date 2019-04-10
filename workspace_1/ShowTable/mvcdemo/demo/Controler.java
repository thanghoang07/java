package demo;

import javax.swing.table.DefaultTableModel;

public class Controler {
	private StudentView view;
	private Data model;

	public void setStudentCode(String code) {
		model.setStdCode(code);
	}

	public String getStudentCode() {
		return model.getStdCode();
	}

	public void setStudentName(String name) {
		model.setStdName(name);
	}

	public String getStudentName() {
		return model.getStdName();
	}

	public void setStudentDob(String dob) {
		model.setStdDob(dob);
	}

	public String getStudentDob() {
		return model.getStdDob();
	}

	public void setStudentPob(String pob) {
		model.setStdPob(pob);
	}

	public String getStudentPob() {
		return model.getStdPob();
	}

	public DefaultTableModel getModel() {
		return view.getModel();
	}

	public void upData() {
		model.addStudent();
	}

	public void updateView() {
		view.addStudenTable(model.getStdCode(), model.getStdName(), model.getStdDob(), model.getStdPob());
	}

	public void setData(String code, String name, String dob, String pob) {
		setStudentCode(code);
		setStudentName(name);
		setStudentDob(dob);
		setStudentPob(pob);
		updateView();
	}
}
