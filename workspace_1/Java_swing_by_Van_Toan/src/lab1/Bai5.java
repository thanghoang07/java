package lab1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Bai5 extends JFrame implements ActionListener {
	JTextField tx1, tx2;

	public Bai5() {
		setTitle("Bài 5 - Chuyển đổi thời gian");
		setLayout(new FlowLayout());

		JPanel p1 = new JPanel();
		JLabel lb1 = new JLabel("Nhập số giây:");
		p1.add(lb1);
		tx1 = new JTextField(10);
		p1.add(tx1);

		JButton b1 = new JButton("Chuyển đổi");
		p1.add(b1);
		JLabel lb2 = new JLabel("Kết quả (h:m:s)");
		p1.add(lb2);
		tx2 = new JTextField(10);
		p1.add(tx2);
		add(p1);

		b1.addActionListener(this);

		setSize(550, 90);
		setLocation(200, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Bai5();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int x = Integer.parseInt(tx1.getText());
		int gio = x / 3600;
		int phut = (x - gio * 3600) / 60;
		int giayx = x - gio * 3600 - phut * 60;
		tx2.setText(gio + ":" + phut + ":" + giayx);

		/*
		 * int giox = x / 3600; int phutx= (x % 3600 ) / 60; int giayxx = (x %
		 * 3600) % 60;
		 */
	}
}