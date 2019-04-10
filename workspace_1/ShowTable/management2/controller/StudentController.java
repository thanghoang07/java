package controller;

import model.ModelInterface;
import Education1.ViewStudent;

public class StudentController implements ControllerInterface {
	private ModelInterface model;
	private ViewStudent view;

	public StudentController(ModelInterface model) {
		this.model = model;
		view = new ViewStudent(this, model);
		view.createView();
	}

	@Override
	public void addAction(int stCode, String stName, String stDob, String stPob) {
		model.add(stCode, stName, stDob, stPob);

	}
}
