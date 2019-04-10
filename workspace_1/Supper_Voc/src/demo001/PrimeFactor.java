package demo001;

import java.awt.FlowLayout;
import java.awt.event.*;
import java.util.*;

import javax.swing.*;

public class PrimeFactor extends JFrame implements ActionListener {
	JTextField tfd1;
	JLabel lblKQ;

	public PrimeFactor(String title) {
		super(title);
		setLayout(new FlowLayout());
		// panel 1
		JPanel p1 = new JPanel();
		JLabel lblx = new JLabel("Nhap vao so nguyen to: ");
		tfd1 = new JTextField(10);
		p1.add(lblx);
		p1.add(tfd1);
		add(p1);

		JButton btn = new JButton("Tính");
		add(btn);
		lblKQ = new JLabel("Thua so nguyen to lon nhat cua so nguyen to la: ");
		add(lblKQ);

		btn.addActionListener(this);

		setSize(500, 120);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static long largestPrimeFactor(long so) {
		long temp = so;
		long ketQua = 0;
		while (temp % 2 == 0) {
			temp /= 2;
		}
		// System.out.println(temp);
		if (temp == 1) {
			ketQua = 2;
		} else {
			for (long i = 1; i <= (temp - 1) / 2; i++) {
				long j = 2 * i + 1;
				if (temp % j == 0) {
					temp /= j;
					i--;
				}
				if (temp == 1)
					ketQua = j;
			}
		}
		return ketQua;
	}

	public static void main(String[] args) {
		new PrimeFactor("Thua so nguyen to");
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		long so = Long.parseLong(tfd1.getText());
		lblKQ.setText("Thua so nguyen to lon nhat cua so nguyen to la: " + largestPrimeFactor(so));
	}
}
