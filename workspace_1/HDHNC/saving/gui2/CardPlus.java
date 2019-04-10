package gui2;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CardPlus extends JPanel {
	private JPanel panlThe, panlNhanThe, panlLoaiThe;
	private JButton layThe, napThe;
	private JTextField loaiThe;
	private JLabel jlbKhuVucHienThiThe;

	public CardPlus() {
		jlbKhuVucHienThiThe = new JLabel();
		// TODO Auto-generated constructor stub
		panlNhanThe = new JPanel(new GridLayout(1, 2));
		panlNhanThe.setSize(200, 30);
		panlNhanThe.setLocation(385, 490);
		layThe = new JButton("Lấy thẻ");
		// ghi chú: chưa có thẻ thì chỉ cho hiện nạp thẻ thôi
		layThe.setVisible(false);
		napThe = new JButton("Nạp thẻ");
		panlNhanThe.add(layThe);
		panlNhanThe.add(napThe);
		//
		loaiThe = new JTextField(20);
		loaiThe.setText("Nhập mã thẻ");
		loaiThe.setBackground(Color.gray);
		panlLoaiThe = new JPanel();
		panlLoaiThe.setSize(200, 30);
		panlLoaiThe.setLocation(380, 520);
		panlLoaiThe.add(loaiThe);
		//
		panlThe = new JPanel();
		panlThe.add(jlbKhuVucHienThiThe);
		panlThe.setSize(200, 20);
		panlThe.setLocation(385, 470);
		panlThe.setBackground(Color.cyan);
	}

	public JPanel getPanlThe() {
		return panlThe;
	}

	public void setPanlThe(JPanel panlThe) {
		this.panlThe = panlThe;
	}

	public JPanel getPanlNhanThe() {
		return panlNhanThe;
	}

	public void setPanlNhanThe(JPanel panlNhanThe) {
		this.panlNhanThe = panlNhanThe;
	}

	public JPanel getPanlLoaiThe() {
		return panlLoaiThe;
	}

	public void setPanlLoaiThe(JPanel panlLoaiThe) {
		this.panlLoaiThe = panlLoaiThe;
	}

	public JButton getLayThe() {
		return layThe;
	}

	public void setLayThe(JButton layThe) {
		this.layThe = layThe;
	}

	public JButton getNapThe() {
		return napThe;
	}

	public void setNapThe(JButton napThe) {
		this.napThe = napThe;
	}

	public JTextField getLoaiThe() {
		return loaiThe;
	}

	public void setLoaiThe(JTextField loaiThe) {
		this.loaiThe = loaiThe;
	}

	public JLabel getJlbKhuVucHienThiThe() {
		return jlbKhuVucHienThiThe;
	}

	public void setJlbKhuVucHienThiThe(JLabel jlbKhuVucHienThiThe) {
		this.jlbKhuVucHienThiThe = jlbKhuVucHienThiThe;
	}
}
