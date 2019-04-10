package Education1;

import controller.ControllerInterface;
import controller.StudentController;
import model.ListStudent;
import model.ModelInterface;

public class Test {
	public static void main(String[] args) {
		ModelInterface model = new ListStudent();
		ControllerInterface controller = new StudentController(model);
	}
}
