package tesst;

import javax.swing.UIManager;
import controller.Controller;
import model.ManageInfomation;
import view.ProgramMain;


public class Test {
	public static void main(String[] args) {		
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			ManageInfomation model = new ManageInfomation();
			ProgramMain view = new ProgramMain(model);
			Controller controller = new Controller(view, model);
			view.getFrame().setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
