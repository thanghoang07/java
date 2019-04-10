package mvcDemo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentController {
	private StudentModel model;
	private StudentView view;

	public StudentController(StudentModel model, StudentView view) {
		this.model = model;
		this.view = view;
	}

	public void initActionController() {
		view.btnAdd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String id, name, dob, pob;
				id = view.txtStdCode.getText();
				dob = view.txtStdDob.getText();
				name = view.txtStdName.getText();
				pob = view.txtStdPob.getText();
				System.out.println(id + " name = " + name);

				// create new student model
				model = new StudentModel(id, name, dob, pob);

				view.updateDataView(model);
				view.clear();
			}
		});
	}
}
