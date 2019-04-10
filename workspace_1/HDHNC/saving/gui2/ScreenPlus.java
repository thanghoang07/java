package gui2;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class ScreenPlus extends JPanel {
	private JPanel panlManHinh;
	private CardPlus cPlus = new CardPlus();
	private JLabel jlbManHinhChinh, jlbHienThiBenTrong;
	private Font font1;

	public ScreenPlus() {
		panlManHinh = new JPanel(new GridLayout(4, 1));
		// màn hình chính
		font1 = new Font("Segoe UI Light", Font.BOLD, 29);
		// TODO Auto-generated constructor stub
		jlbManHinhChinh = new JLabel(
				"<html><center><p>Ngân Hàng XYZ xin chào quý khách</p><p>Vui lòng để thẻ vào khe bên dưới</p></center></html>");
		jlbManHinhChinh.setFont(font1);
		// gán màu chữ cho màn hình chính
		jlbManHinhChinh.setForeground(Color.BLUE);
		cPlus.getJlbKhuVucHienThiThe().setText(">>>Chưa có thẻ<<<");
		jlbHienThiBenTrong = new JLabel();
		jlbHienThiBenTrong.setFont(font1);
		jlbHienThiBenTrong.setForeground(Color.RED);
		manHinhBanDau();
	}

	public JPanel getPanlManHinh() {
		return panlManHinh;
	}

	public void setPanlManHinh(JPanel panlManHinh) {
		this.panlManHinh = panlManHinh;
	}

	public void manHinhBanDau() {
		cPlus.getJlbKhuVucHienThiThe().setText(">>>Chưa có thẻ<<<");
		panlManHinh = new JPanel(new GridLayout(4, 1));
		panlManHinh.setSize(500, 440);
		panlManHinh.setLocation(100, 5);
		panlManHinh.add(cPlus.getJlbKhuVucHienThiThe());
		panlManHinh.add(jlbManHinhChinh);
		panlManHinh.add(jlbHienThiBenTrong);
		panlManHinh.setBackground(Color.BLACK);
	}

	public JLabel getJlbManHinhChinh() {
		return jlbManHinhChinh;
	}

	public void setJlbManHinhChinh(JLabel jlbManHinhChinh) {
		this.jlbManHinhChinh = jlbManHinhChinh;
	}

	public JLabel getJlbHienThiBenTrong() {
		return jlbHienThiBenTrong;
	}

	public void setJlbHienThiBenTrong(JLabel jlbHienThiBenTrong) {
		this.jlbHienThiBenTrong = jlbHienThiBenTrong;
	}

	public Font getFont1() {
		return font1;
	}

	public void setFont1(Font font1) {
		this.font1 = font1;
	}

}
