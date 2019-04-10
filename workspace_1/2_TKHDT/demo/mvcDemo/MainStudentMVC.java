package mvcDemo;

public class MainStudentMVC {
	public static void main(String[] args) {
		StudentModel model = new StudentModel();
		StudentView view = new StudentView();
		
		StudentController control = new StudentController(model, view);
		control.initActionController();
	}
	
}
