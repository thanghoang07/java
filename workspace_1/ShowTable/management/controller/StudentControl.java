package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.table.DefaultTableModel;

import models.Students;
import view.StudentView;

public class StudentControl implements Controller, ActionListener {
	private Students model;
	private StudentView view;

	public StudentControl() {
		super();
	}

	@Override
	public void updateData(String code, String name, String dob, String pob) {
		// TODO Auto-generated method stub
		setStudentCode(code);
		setStudentName(name);
		setStudentDob(dob);
		setStudentPob(pob);
	}

	@Override
	public void updateView() {
		// TODO Auto-generated method stub
		view.addStudenTable(model.getCode(), model.getName(), model.getDob(), model.getPob());
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub

	}

	public void addModel(Students model) {
		System.out.println("adding student model");
		this.model = (Students) model;
	}

	public void addView(StudentView view) {
		System.out.println("adding student model");
		this.view = view;
	}

	public void setStudentCode(String code) {
		model.setCode(code);
	}

	public String getStudentCode() {
		return model.getCode();
	}

	public void setStudentName(String name) {
		model.setName(name);
	}

	public String getStudentName() {
		return model.getName();
	}

	public void setStudentDob(String dob) {
		model.setDob(dob);
	}

	public String getStudentDob() {
		return model.getDob();
	}

	public void setStudentPob(String pob) {
		model.setPob(pob);
	}

	public String getStudentPob() {
		return model.getPob();
	}

	public DefaultTableModel getModel() {
		return view.getModel();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
