package Swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Bai1 extends JFrame implements ActionListener {
	JTextField jtfNumber1, jtfNumber2;
	JLabel jlbHienThi1, jlbHienThi2;

	public Bai1() {
		setTitle("Bai 1 - Nhan 2 so");
		setLayout(new FlowLayout());

		// panel 1
		JPanel p1 = new JPanel();
		JLabel lblNumber1 = new JLabel("Nhap so nguyen x:");
		p1.add(lblNumber1);
		jtfNumber1 = new JTextField(10);
		p1.add(jtfNumber1);

		JLabel lblNumber2 = new JLabel("Nhap so thuc y:");
		p1.add(lblNumber2);
		jtfNumber2 = new JTextField(10);
		p1.add(jtfNumber2);
		JButton jbtTinh = new JButton("Tinh");
		p1.add(jbtTinh);
		add(p1);
		// panel 2
		JPanel p2 = new JPanel();
		jlbHienThi1 = new JLabel("Gia tri nhap vao la: ... va ... ");
		jlbHienThi2 = new JLabel(" Ket qua x*y la:");
		p2.add(jlbHienThi1);
		p2.add(jlbHienThi2);
		add(p2);

		// frame
		setSize(520, 120);
		setLocation(200, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		// them su kien cho nut tinh
		jbtTinh.addActionListener(this);
	}

	public static void main(String[] args) {
		new Bai1();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int x = Integer.parseInt(jtfNumber1.getText());
		double y = Double.parseDouble(jtfNumber2.getText());
		jlbHienThi1.setText("Gia tri nhap vao la: " + x + " va " + y);
		jlbHienThi2.setText(" Ket qua x*y la: " + tinh(x, y));
	}

	public static double tinh(int x, double y) {
		return x * y;
	}

}
