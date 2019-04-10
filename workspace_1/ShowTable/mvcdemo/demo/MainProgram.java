package demo;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLayeredPane;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.SwingConstants;

public class MainProgram extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
					MainProgram frame = new MainProgram();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainProgram() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		createGUI();
	}

	public void createGUI() {

		createMenu();

		createBrackgroud();
	}

	public void createMenu() {
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnNew = new JMenu("Management");
		menuBar.add(mnNew);

		JMenuItem meIStuden = new JMenuItem("Student");
		meIStuden.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFrame st = new StudentView();
				st.setVisible(true);
			}
		});

		mnNew.add(meIStuden);

		JMenuItem meITeacher = new JMenuItem("Teacher");
		meITeacher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Chuc nang chua co", "Error", JOptionPane.WARNING_MESSAGE);
			}
		});
		mnNew.add(meITeacher);

		JMenu mnExit = new JMenu("Exit");
		menuBar.add(mnExit);

		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		mnExit.add(mntmExit);
	}

	public void createBrackgroud() {
		JPanel panel = new JPanel(new BorderLayout());
		JLabel label = new JLabel("", new ImageIcon(MainProgram.class.getResource("/img/img1.jpg")),
				SwingConstants.CENTER);
		panel.add(label, BorderLayout.CENTER);
		contentPane.add(panel);
	}
}
