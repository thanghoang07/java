package swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.UIManager;

public class Bai3 extends JFrame implements ActionListener {
	private JPanel panl1, panl2;
	private JLabel lbl1, lbl2, lbl3;
	private JTextField txt1, txt2, txt3;
	private JButton btn1, btn2, btn3, btn4;
	private JMenuBar menu;
	private JMenuItem addMe, subMe, mulMe, divMe, exitMe;
	private JMenu operation, exit;

	public Bai3(String title) {
		super(title);
		setSize(450, 150);
		createGUI();
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void createGUI() {
		setLayout(new BorderLayout(5, 10));
		//
		ImageIcon icon1 = new ImageIcon("icon/Add-New.png");
		ImageIcon icon2 = new ImageIcon("icon/Text Edit.png");
		ImageIcon icon3 = new ImageIcon("icon/multi.png");
		ImageIcon icon4 = new ImageIcon("icon/Math_divide_Icon_16.png");
		// panel 1
		panl1 = new JPanel();
		panl1.setLayout(new FlowLayout(FlowLayout.CENTER));
		lbl1 = new JLabel("Number 1");
		lbl2 = new JLabel("Number 2");
		lbl3 = new JLabel("Result");
		txt1 = new JTextField(5);
		txt2 = new JTextField(5);
		txt3 = new JTextField(5);
		txt3.setEnabled(false);
		panl1.add(lbl1);
		panl1.add(txt1);
		panl1.add(lbl2);
		panl1.add(txt2);
		panl1.add(lbl3);
		panl1.add(txt3);
		// PANEL 2
		panl2 = new JPanel();
		panl2.setLayout(new FlowLayout(FlowLayout.CENTER));
		btn1 = new JButton("Add", icon1);
		btn2 = new JButton("Subtract", icon2);
		btn3 = new JButton("Multiply", icon3);
		btn4 = new JButton("Divide", icon4);
		// them su kien
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		//
		panl2.add(btn1);
		panl2.add(btn2);
		panl2.add(btn3);
		panl2.add(btn4);
		//
		menu = new JMenuBar();
		setJMenuBar(menu);
		//
		operation = new JMenu("Operation");
		exit = new JMenu("Exit");

		exit.add(exitMe = new JMenuItem("Exit"));

		operation.add(addMe = new JMenuItem("Add"));
		operation.add(subMe = new JMenuItem("Subtract"));
		operation.add(mulMe = new JMenuItem("Multiply"));
		operation.add(divMe = new JMenuItem("Divide"));

		addMe.setIcon(new ImageIcon("icon/Add-New.png"));
		subMe.setIcon(new ImageIcon("icon/Text Edit.png"));
		mulMe.setIcon(new ImageIcon("icon/multi.png"));
		divMe.setIcon(new ImageIcon("icon/Math_divide_Icon_16.png"));

		operation.setMnemonic('O');
		exitMe.setMnemonic('E');
		addMe.setMnemonic('A');
		subMe.setMnemonic('S');
		mulMe.setMnemonic('M');
		divMe.setMnemonic('D');

		addMe.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.CTRL_MASK));
		subMe.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
		mulMe.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, ActionEvent.CTRL_MASK));
		divMe.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK));
		//
		menu.add(operation);
		menu.add(exit);
		// them su kien
		exitMe.addActionListener(this);
		addMe.addActionListener(this);
		subMe.addActionListener(this);
		mulMe.addActionListener(this);
		divMe.addActionListener(this);
		//
		add(panl1, BorderLayout.CENTER);
		add(panl2, BorderLayout.SOUTH);
	}

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}
		new Bai3("MenuDemo");
	}

	public static double sum(double so1, double so2) {
		return so1 + so2;
	}

	public static double sub(double so1, double so2) {
		return so1 - so2;
	}

	public static double divide(double so1, double so2) {
		return so1 / so2;
	}

	public static double multi(double so1, double so2) {
		return so1 * so2;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(exitMe)) {
			System.exit(0);
		} else if (e.getSource().equals(addMe)) {
			if (txt1.getText() == null && txt2.getText() == null) {
				JOptionPane.showMessageDialog(null, "Loi loi loi", "Chua co gi", JOptionPane.WARNING_MESSAGE);
				txt3.setText("");
			} else {
				double so1 = Double.parseDouble(txt1.getText());
				double so2 = Double.parseDouble(txt2.getText());
				txt3.setText("" + sum(so1, so2));
			}
		} else if (e.getSource().equals(subMe)) {
			double so1 = Double.parseDouble(txt1.getText());
			double so2 = Double.parseDouble(txt2.getText());
			txt3.setText("" + sub(so1, so2));
		} else if (e.getSource().equals(mulMe)) {
			double so1 = Double.parseDouble(txt1.getText());
			double so2 = Double.parseDouble(txt2.getText());
			txt3.setText("" + multi(so1, so2));
		} else if (e.getSource().equals(divMe)) {
			double so1 = Double.parseDouble(txt1.getText());
			double so2 = Double.parseDouble(txt2.getText());
			txt3.setText("" + divide(so1, so2));
		} else {
			double so1 = Double.parseDouble(txt1.getText());
			double so2 = Double.parseDouble(txt2.getText());
			if (e.getSource().equals(btn1)) {
				txt3.setText("" + sum(so1, so2));
			} else if (e.getSource().equals(btn2)) {
				txt3.setText("" + sub(so1, so2));
			} else if (e.getSource().equals(btn3)) {
				txt3.setText("" + multi(so1, so2));
			} else if (e.getSource().equals(btn4)) {
				txt3.setText("" + divide(so1, so2));
			}
		}
	}
}
