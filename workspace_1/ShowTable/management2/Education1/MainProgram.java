package Education1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

import controller.ControllerInterface;
import controller.StudentController;
import model.ListStudent;
import model.ModelInterface;

public class MainProgram {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainProgram window = new MainProgram();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainProgram() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 487, 340);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);

		JMenu mnNewMenu = new JMenu("Management");
		menuBar.add(mnNewMenu);

		JMenuItem mntmStudent = new JMenuItem("Student");
		mntmStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ModelInterface model = new ListStudent();
				ControllerInterface controller = new StudentController(model);
			}
		});
		mntmStudent.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, InputEvent.CTRL_MASK | InputEvent.ALT_MASK));
		mntmStudent.setIcon(new ImageIcon(
				"D:\\backup\\SyncBackup\\HocTap\\Icon\\Suu-tam\\Management\\Data_management_Icon_16.png"));
		mnNewMenu.add(mntmStudent);

		JMenu mnExit = new JMenu("Exit");
		mnExit.setMnemonic('E');
		menuBar.add(mnExit);

		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));

		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("D:\\backup\\SyncBackup\\HocTap\\Hinhnen\\graduate.jpg"));
		panel.add(label, BorderLayout.CENTER);
	}

}
