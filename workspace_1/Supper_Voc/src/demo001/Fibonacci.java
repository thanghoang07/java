package demo001;

import java.awt.FlowLayout;
import java.awt.event.*;
import java.io.*;
import java.util.*;

import javax.swing.*;

public class Fibonacci extends JFrame implements ActionListener {
	JTextField tfd1;
	JLabel lblKQ;

	public Fibonacci(String title) {
		super(title);
		setLayout(new FlowLayout());
		// panel 1
		JPanel p1 = new JPanel();
		JLabel lblx = new JLabel("Nhap vao so phan tu day Fibonacci: ");
		tfd1 = new JTextField(10);
		p1.add(lblx);
		p1.add(tfd1);
		add(p1);

		JButton btn = new JButton("Tính");
		add(btn);
		lblKQ = new JLabel("Tong day Fibonacci la: ");
		add(lblKQ);

		btn.addActionListener(this);

		setSize(500, 120);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static int dayFibonacci(int Fibonacci) {
		int a = 1, b = 1, c = 0, s = 2;
		while (c <= Fibonacci) {
			c = a + b;
			s = s + c;
			a = b;
			b = c;
		}
		return s - c;
	}

	public static void main(String[] args) {
		new Fibonacci("Tong day Fibonacci");
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		int so = Integer.parseInt(tfd1.getText());
		lblKQ.setText("Tong day Fibonacci la: " + dayFibonacci(so));

	}
}
