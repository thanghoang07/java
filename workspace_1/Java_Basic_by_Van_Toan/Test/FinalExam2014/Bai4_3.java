package FinalExam2014;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

import Lab02_06.Graphics;

public class Bai4_3 extends JFrame {
	private Bai4 frame;
	private Bai4_2 frame1;
	private ImageIcon hinh = new ImageIcon("hinh/car-icon.png");
	private JMenuItem jmiCompute, jmiExit, jmiAbout;

	public Bai4_3() {
		super("Java Calculator");
		setLayout(new FlowLayout());

		JLabel lblHinh = new JLabel(hinh);
		add(lblHinh);

		JMenuBar jmb = new JMenuBar();
		this.setJMenuBar(jmb);

		JMenu operation = new JMenu("Operation");
		JMenu help = new JMenu("Help");
		operation.setMnemonic('O');
		help.setMnemonic('H');
		jmb.add(operation);
		jmb.add(help);

		operation.add(jmiCompute = new JMenuItem("Compute", new ImageIcon(
				"hinh/Add-New.png")));
		operation.add(jmiExit = new JMenuItem("Exit", new ImageIcon(
				"hinh/multi.png")));
		jmiCompute.setMnemonic('C');
		jmiExit.setMnemonic('E');

		jmiCompute.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,
				ActionEvent.CTRL_MASK));
		jmiExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E,
				ActionEvent.ALT_MASK));

		jmiCompute.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == jmiCompute) {
					frame = new Bai4();
					frame.setVisible(true);
					frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				}

			}
		});

		jmiExit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);

			}
		});

		help.add(jmiAbout = new JMenuItem("About"));
		jmiAbout.setMnemonic('A');
		jmiAbout.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,
				ActionEvent.CTRL_MASK));

		jmiAbout.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				frame1 = new Bai4_2();
				frame1.setVisible(true);
				frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});

		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		new Bai4_3();
	}

}
