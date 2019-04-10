package Swing;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Bai5_lab3_Swing extends JFrame implements ActionListener {
	JTextField jtfSoTuNhien, jtfUocLeLonNhat, jtfKiemTra, jtfPhanTich,
			jtfInSoNguyenTo;
	JButton jbtTinh;

	public Bai5_lab3_Swing() {
		setTitle("Bai5_lab3_Swing");
		setLayout(new FlowLayout());

		// panel tong
		JPanel tong = new JPanel(new GridLayout(1, 2));

		// panel 1
		JPanel p1 = new JPanel(new GridLayout(5, 1));
		JLabel lblSoTuNhien = new JLabel("So tu nhien n: ");
		JLabel lblUocLeLonNhat = new JLabel("uoc le lon nhat : ");
		JLabel lblKiemTra = new JLabel("Kiem tra so nguyen to: ");
		JLabel lblPhanTich = new JLabel("Phan tich thua so nguyen to: ");
		JLabel lblInSoNguyenTo = new JLabel("So nguyen to nhá»� hÆ¡n n: ");
		p1.add(lblSoTuNhien);
		p1.add(lblUocLeLonNhat);
		p1.add(lblKiemTra);
		p1.add(lblPhanTich);
		p1.add(lblInSoNguyenTo);
		tong.add(p1);

		JPanel p2 = new JPanel(new GridLayout(5, 1));
		jtfSoTuNhien = new JTextField(14);
		jtfUocLeLonNhat = new JTextField(14);
		jtfKiemTra = new JTextField(14);
		jtfPhanTich = new JTextField(14);
		jtfInSoNguyenTo = new JTextField(14);
		p2.add(jtfSoTuNhien);
		p2.add(jtfUocLeLonNhat);
		p2.add(jtfKiemTra);
		p2.add(jtfPhanTich);
		p2.add(jtfInSoNguyenTo);
		tong.add(p2);
		add(tong);

		JPanel p3 = new JPanel();
		jbtTinh = new JButton("Tinh");
		p3.add(jbtTinh);
		add(p3);

		setSize(350, 150);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(100, 222);

		jbtTinh.addActionListener(this);
	}

	public static void main(String[] args) {
		new Bai5_lab3_Swing();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int n = Integer.parseInt(jtfSoTuNhien.getText());
		jtfUocLeLonNhat.setText("" + uocLe(n));
		if (kiemTraSoNguyenTo(n) == true)
			jtfKiemTra.setText("So tren la  so nguyen to");
		else
			jtfKiemTra.setText("So tren khong phai la  so nguyen to");
		// jtfPhanTich.setText((thuaSoNguyenTo(n));
	}

	public static int uocLe(int n) {
		int uocLe = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0 && i % 2 != 0)
				uocLe = i;
		}
		return uocLe;
	}

	public static boolean kiemTraSoNguyenTo(int n) {
		if (n < 2)
			return false;
		for (int i = 2; i < n - 1; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static void thuaSoNguyenTo(int n) {
		for (int i = 2; i <= n;) {
			if (n % i == 0) {
				System.out.print(i);
				n = n / i;
				if (n > 1)
					System.out.print(" x ");
			} else
				i++;
		}

	}

	public static void inSoNguyenTo(int n) {
		for (int i = 2; i <= n; i++) {
			if (kiemTraSoNguyenTo(i) == true)
				System.out.println(" " + i);
		}
	}
}
