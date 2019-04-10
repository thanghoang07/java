package Theory;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class CloseFrameInnerClass extends JFrame {
	public CloseFrameInnerClass(String title) {
		super(title);
		this.addWindowListener(new CFListener());
		setSize(300, 300);
		setVisible(true);
	}

	class CFListener extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			System.out.println("Window closing");
			dispose();
			System.exit(1);
		}
	}

	public static void main(String[] args) {
		CloseFrameInnerClass cf = new CloseFrameInnerClass("Close Window");
	}

}
