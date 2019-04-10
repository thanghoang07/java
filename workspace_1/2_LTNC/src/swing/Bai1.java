package swing;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class Bai1 extends JFrame implements ActionListener {
	private JPanel panl1, panl2, panl3, panl4, panl5;
	private JLabel lab1, lab2, lab3;
	private JTextField txt1, txt2, txt3;
	private JButton btu1, btu2, btu3, btu4, btu5;
	private char op;
	private int size = 15;

	public Bai1(String title) {
		super(title);
		setSize(300, 300);
		setVisible(true);
		createGUI();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
	}

	public void createGUI() {
		setLayout(new GridLayout(5, 1));
		//
		panl1 = new JPanel();
		lab1 = new JLabel("So thu 1: ");
		txt1 = new JTextField(size);
		panl1.setLayout(new FlowLayout());
		panl1.add(lab1);
		panl1.add(txt1);
		//
		panl2 = new JPanel();
		btu1 = new JButton("+");
		btu2 = new JButton("-");
		btu3 = new JButton("*");
		btu4 = new JButton("/");
		panl2.setLayout(new FlowLayout());
		// them su kien
		btu1.addActionListener(this);
		btu2.addActionListener(this);
		btu3.addActionListener(this);
		btu4.addActionListener(this);
		//
		panl2.add(btu1);
		panl2.add(btu2);
		panl2.add(btu3);
		panl2.add(btu4);
		//
		panl3 = new JPanel();
		lab2 = new JLabel("So thu 2: ");
		txt2 = new JTextField(size);
		panl3.setLayout(new FlowLayout());
		panl3.add(lab2);
		panl3.add(txt2);
		//
		panl4 = new JPanel();
		btu5 = new JButton("=");
		// them su kien
		btu5.addActionListener(this);
		panl4.setLayout(new FlowLayout());
		panl4.add(btu5);
		//
		panl5 = new JPanel();
		lab3 = new JLabel("Ket qua: ");
		txt3 = new JTextField(size);
		panl5.setLayout(new FlowLayout());
		panl5.add(lab3);
		panl5.add(txt3);
		//
		add(panl1);
		add(panl2);
		add(panl3);
		add(panl4);
		add(panl5);
	}

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}
		new Bai1("Caculator");
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
		double so1 = Double.parseDouble(txt1.getText());
		// TODO Auto-generated method stub
		if (e.getSource().equals(btu1)) {
			double so2 = Double.parseDouble(txt2.getText());
			System.out.println(sum(so1, so2));
			op = '+';
		} else if (e.getSource().equals(btu2)) {
			double so2 = Double.parseDouble(txt2.getText());
			System.out.println(sub(so1, so2));
			op = '-';
		} else if (e.getSource().equals(btu3)) {
			double so2 = Double.parseDouble(txt2.getText());
			System.out.println(multi(so1, so2));
			op = '*';
		} else if (e.getSource().equals(btu4)) {
			double so2 = Double.parseDouble(txt2.getText());
			System.out.println(divide(so1, so2));
			op = '/';
		}
		if (e.getSource().equals(btu5)) {
			double so2 = Double.parseDouble(txt2.getText());
			if (op == '+') {
				txt3.setText("" + sum(so1, so2));
			} else if (op == '-') {
				txt3.setText("" + sub(so1, so2));
			} else if (op == '*') {
				txt3.setText("" + multi(so1, so2));
			} else if (op == '/') {
				txt3.setText("" + divide(so1, so2));
			}
		}
	}
}
