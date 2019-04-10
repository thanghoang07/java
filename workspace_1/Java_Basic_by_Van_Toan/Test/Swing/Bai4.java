package Swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Bai4 extends JFrame implements ActionListener {
	JTextField jtfGiay, jtfKetQua;

	public Bai4() {
		setTitle("Bai 5 - Chuyen doi thoi gian");
		setLayout(new FlowLayout());

		JLabel lblGiay = new JLabel("Nhap so giay");
		add(lblGiay);
		jtfGiay = new JTextField(10);
		add(jtfGiay);
		JButton jbtChuyenDoi = new JButton("Chuyen doi");
		add(jbtChuyenDoi);
		JLabel lblKetQua = new JLabel("Ket qua (h:m:s)");
		add(lblKetQua);
		jtfKetQua = new JTextField(10);
		add(jtfKetQua);

		setSize(600, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocation(100, 200);

		jbtChuyenDoi.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int giay = Integer.parseInt(jtfGiay.getText());
		int gio = giay / 360;
		int phut = (giay % 360) / 60;
		int giayx = (giay % 360) % 60;
		jtfKetQua.setText("" + gio + ":" + phut + ":" + giayx);
	}

	public static void main(String[] args) {
		new Bai4();
	}
}
