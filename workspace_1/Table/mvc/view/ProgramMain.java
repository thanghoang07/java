package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import controller.Controller;
import model.ManageInfomation;
import javax.swing.BoxLayout;


public class ProgramMain {

	private JFrame frame;

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	ManageInfomation model;
	Controller controller;

	public Controller getController() {
		return controller;
	}

	public void setController(Controller controller) {
		this.controller = controller;
	}

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public ProgramMain(ManageInfomation model) {
		this.model = model;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.addWindowListener(new WindowListener() {

			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowClosing(WindowEvent e) {
				model.saveFile();

			}

			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub

			}
		});
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);

		JMenu mnQuanLy = new JMenu("Quản lý ");
		menuBar.add(mnQuanLy);

		JMenuItem mntmSinhVin = new JMenuItem("Sinh Viên ");
		mntmSinhVin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new StudentView(model, controller).setVisible(true);
			}
		});
		mnQuanLy.add(mntmSinhVin);

		JMenuItem mntmGioVin = new JMenuItem("Giáo viên");
		mntmGioVin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new TeacherView(model, controller).setVisible(true);
			}
		});
		mnQuanLy.add(mntmGioVin);

		JMenu mnThot = new JMenu("Thoát");
		menuBar.add(mnThot);

		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				model.saveFile();
				frame.dispose();
			}
		});
		mnThot.add(mntmExit);
		frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.X_AXIS));
	}

}
