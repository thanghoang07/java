package test;

import javax.swing.UIManager;
import view.MainProgram;

public class TestMVC {
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			new MainProgram();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
