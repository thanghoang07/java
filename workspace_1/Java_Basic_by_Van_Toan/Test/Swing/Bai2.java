package Swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Bai2 extends JFrame implements ActionListener {
	JTextField jtfA, jtfB;
	JLabel jlbHienThi;

	public Bai2() {
		setTitle("Bai 2 - Giai phuong trinh bac 1");
		setLayout(new FlowLayout());

		// panel 1
		JPanel p1 = new JPanel();
		JLabel lblA = new JLabel("Nhap a:");
		p1.add(lblA);
		jtfA = new JTextField(10);
		p1.add(jtfA);
		JLabel lblB = new JLabel("Nhap b:");
		p1.add(lblB);
		jtfB = new JTextField(10);
		p1.add(jtfB);
		JButton jbtGiai = new JButton("Giai phuong trinh");
		p1.add(jbtGiai);
		add(p1);

		// panel 2
		JPanel p2 = new JPanel();
		jlbHienThi = new JLabel("Nghiem cua phuong trinh la  x =");
		p2.add(jlbHienThi);
		add(p2);

		// them su kien button giai phuong tring
		jbtGiai.addActionListener(this);

		setSize(520, 120);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocation(100, 200);

	}

	public static void main(String[] args) {
		new Bai2();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		double a = Double.parseDouble(jtfA.getText());
		double b = Double.parseDouble(jtfB.getText());
		jlbHienThi.setText("Nghiem cua phuong trinh la  x = " + giaiBac1(a, b));

	}

	public static double giaiBac1(double a, double b) {
		return -b / a;
	}
}
