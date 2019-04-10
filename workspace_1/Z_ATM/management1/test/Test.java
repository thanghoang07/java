package test;

import javax.swing.UIManager;

import controler.Controller;
import model.Students;
import view.StudentView;

public class Test {
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			Controller contro1 = new Controller(new Students(), new StudentView());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
