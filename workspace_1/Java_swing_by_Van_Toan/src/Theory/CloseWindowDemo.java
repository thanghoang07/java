package Theory;

import java.awt.Container;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class CloseWindowDemo extends JFrame implements WindowListener {
	JLabel lblCloseWindow;

	public CloseWindowDemo(String title) {
		super(title);
		lblCloseWindow = new JLabel("Close the Frame");
		this.addWindowListener(this);
	}

	void launchFrame(Container c) {
		c.add(lblCloseWindow);
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		CloseWindowDemo frm = new CloseWindowDemo("Close Window Demo");
		frm.launchFrame(frm.getContentPane());
	}

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		String msg = "Close Window";
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
