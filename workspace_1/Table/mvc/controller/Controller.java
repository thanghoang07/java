package controller;

import model.ManageInfomation;
import model.Student;
import model.Teacher;
import view.ProgramMain;

public class Controller {
	private ProgramMain view;

	private ManageInfomation model;

	public Controller(ProgramMain view, ManageInfomation model) {
		this.view = view;
		view.setController(this);
		this.model = model;
	}

	public void addTeacher(Teacher obj) {
			model.addTeacher( obj);
	}

	public void addStudent(Student obj) {
			model.addStudent( obj);
	}

	public void deleteTeacher(Teacher obj) {
			model.deleteTeacher( obj);
	}

	public void deleteStudent(Student obj) {
			model.deleteStudent( obj);
	}

	public void editTeacher(Teacher objEdit, Teacher objAdd) {
			model.editTeacher( objEdit, objAdd);
	}

	public void editStudent(Student objEdit, Student objAdd) {
			model.editStudent( objEdit, objAdd);
	}

}
