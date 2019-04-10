package KiemTraGiuaKy;

import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Bai4 extends JFrame implements ActionListener {

	JTextField jtfLaiSuat, jtfTienGui, jtfSoThang, jtfTienNhan;
	JButton jbtTinh;

	public Bai4() {
		setTitle("14130349_Trình Văn Toàn_Ca1_102");
		setLayout(new FlowLayout());

		JPanel tieuDe = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JLabel jlbTieuDe = new JLabel("Chương trình tính lãi suất ngân hàng");
		tieuDe.add(jlbTieuDe);
		add(tieuDe);

		JPanel tong = new JPanel();
		tong.setLayout(new GridLayout(1, 2, 10, 0));
		add(tong);

		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(5, 1, 4, 10));
		JLabel jlbTienGui = new JLabel("Số tiền gửi: ");
		JLabel jlbLaiSuat = new JLabel("Lãi Suất: ");
		JLabel jlbSoThang = new JLabel("Số tháng: ");
		JLabel jlbNull = new JLabel("");
		JLabel jlbTienNhan = new JLabel("Số tiền nhận được: ");
		p1.add(jlbTienGui);
		p1.add(jlbLaiSuat);
		p1.add(jlbSoThang);
		p1.add(jlbNull);
		p1.add(jlbTienNhan);
		tong.add(p1);

		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout(5, 1, 4, 10));
		jtfTienGui = new JTextField(14);
		jtfLaiSuat = new JTextField(14);
		jtfSoThang = new JTextField(14);
		jbtTinh = new JButton("Tính");
		jtfTienNhan = new JTextField(14);
		p2.add(jtfTienGui);
		p2.add(jtfLaiSuat);
		p2.add(jtfSoThang);
		p2.add(jbtTinh);
		p2.add(jtfTienNhan);
		tong.add(p2);

		jbtTinh.addActionListener(this);

		setSize(350, 250);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Bai4();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		try {
			if (Integer.parseInt(jtfSoThang.getText()) < 3) {
				JOptionPane.showMessageDialog(this, "Sai");
			}
			double p = Integer.parseInt(jtfTienGui.getText());
			double r = Double.parseDouble(jtfLaiSuat.getText());
			int n = Integer.parseInt(jtfSoThang.getText());
			if (n > 3) {
				jtfTienNhan.setText("" + Math.round(tien(p, r, n)));
				DecimalFormat tron = new DecimalFormat("0.00");
				jtfTienNhan.setText("" + tron.format(tien(p, r, n)));
			}

		} catch (NumberFormatException e1) {
			JOptionPane.showMessageDialog(this, "Sai dinh dang");
		}

	}

	public static double mu(double d, int n) {
		double s = 1;
		for (int i = 0; i < n; i++) {
			s = s * d;
		}
		return s;

	}

	public static double tien(double p, double r, int n) {
		return (p) * (mu(r + 1, n));

	}
}
