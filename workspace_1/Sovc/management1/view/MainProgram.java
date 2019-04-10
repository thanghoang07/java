package view;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import controler.Controller;
import model.StudentsModel;
import model.TeachersModel;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class MainProgram extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public MainProgram() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		createGUI();

		setVisible(true);
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
				@SuppressWarnings("unused")
				Controller contro = new Controller(new StudentsModel(), new StudentView("Studens"));
			}
		});

		mnNew.add(meIStuden);

		JMenuItem meITeacher = new JMenuItem("Teacher");
		meITeacher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				@SuppressWarnings("unused")
				Controller contro = new Controller(new TeachersModel(), new TeacherView("Teacher"));
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
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));

		JLabel label = new JLabel("", SwingConstants.CENTER);
		label.setIcon(new ImageIcon(MainProgram.class.getResource("/image/img.jpg")));
		panel.add(label, BorderLayout.SOUTH);
	}
}
