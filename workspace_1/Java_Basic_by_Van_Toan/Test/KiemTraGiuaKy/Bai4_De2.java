package KiemTraGiuaKy;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Bai4_De2 extends JFrame implements ActionListener {
	JTextField jtfA, jtfB, jtfC, jtfKetQua;
	JButton jbtGiai;

	public Bai4_De2() {
		setTitle("MSSV_");
		setLayout(new FlowLayout());

		JPanel p0 = new JPanel();
		p0.setLayout(new FlowLayout(FlowLayout.CENTER));
		JLabel lblTieuDe = new JLabel("GIAI PHUONG TRINH BAC 2");
		p0.add(lblTieuDe);
		add(p0);

		JPanel tong = new JPanel(new GridLayout(1, 2));
		add(tong);
		// panel 1
		JPanel p1 = new JPanel(new GridLayout(5, 1));
		JLabel lblA = new JLabel("Nhap a:");
		JLabel lblB = new JLabel("Nhap b:");
		JLabel lblC = new JLabel("Nhap c:");
		JLabel lblNull = new JLabel("");
		JLabel lblKetQua = new JLabel("Ket qua: ");
		p1.add(lblA);
		p1.add(lblB);
		p1.add(lblC);
		p1.add(lblNull);
		p1.add(lblKetQua);
		tong.add(p1);

		// panel 2
		JPanel p2 = new JPanel(new GridLayout(5, 1));
		jtfA = new JTextField(15);
		jtfB = new JTextField(15);
		jtfC = new JTextField(15);
		jbtGiai = new JButton("Giai phuong trinh");
		jtfKetQua = new JTextField(15);
		p2.add(jtfA);
		p2.add(jtfB);
		p2.add(jtfC);
		p2.add(jbtGiai);
		p2.add(jtfKetQua);
		tong.add(p2);

		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		jbtGiai.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		double a = Double.parseDouble(jtfA.getText());
		double b = Double.parseDouble(jtfB.getText());
		double c = Double.parseDouble(jtfC.getText());
		try {
			if (a != 0) {
				if (delta(a, b, c) > 0)
					jtfKetQua.setText("x1 = "
							+ (-b + Math.sqrt(delta(a, b, c)) / (2 * a))
							+ "\nx2 = "
							+ (-b - Math.sqrt(delta(a, b, c)) / (2 * a)));
				else if (delta(a, b, c) < 0)
					jtfKetQua.setText("Phuong trinh vo nghiem");
				else if (delta(a, b, c) == 0)
					jtfKetQua.setText(" x1 = x2 = " + ((-b) / (2 * a)));
				else if (b != 0)
					jtfKetQua.setText("x = " + (-c / b));
				else
					jtfKetQua.setText("Phuong trinh co vo so nghiem");
			}
		} catch (NumberFormatException e1) {
			JOptionPane.showMessageDialog(this, "Sai dinh dang");
		}
	}

	public static double delta(double a, double b, double c) {
		return (b * b) - (4 * a * c);
	}

	public static void main(String[] args) {
		new Bai4_De2();
	}

}
