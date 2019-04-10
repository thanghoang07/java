package run;

import java.util.Date;

import model.Student;
import model.StudentTableModel;
import view.MainFrame;

public class Run {

	public static void main(String[] args) {
		StudentTableModel model = new StudentTableModel();

		model.addStudent(
				new Student("001", "Nguyen Xuan", "Vinh", "DH05DT", new Date(), "nguyenxuanvinh@gmail.com", "Network"));

		MainFrame frame = new MainFrame(model);

		frame.setVisible(true);
	}

}
