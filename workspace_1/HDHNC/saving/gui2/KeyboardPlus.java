package gui2;

import java.awt.GridLayout;
import java.awt.Label;

import javax.swing.JButton;
import javax.swing.JPanel;

public class KeyboardPlus extends JPanel {
	private JButton[] number;
	private JButton enter, cancel, clear, admin;

	public KeyboardPlus() {
		// TODO Auto-generated constructor stub
		setLayout(new GridLayout(6, 3));
		// tạo dãy bàn phím
		number = new JButton[12];
		for (int i = 1; i < 10; i++) {
			number[i] = new JButton("" + i);
			add(number[i]);
		}
		// thêm nút 0
		add(new Label(""));
		number[0] = new JButton("0");
		add(number[0]);
		setSize(205, 150);
		setLocation(120, 460);
		add(new Label(""));
		enter = new JButton("ENTER");
		cancel = new JButton("CANCEL");
		clear = new JButton("CLEAR");
		enter.setEnabled(false); // chưa có thẻ thì ẩn hết
		cancel.setEnabled(false);// chưa có thẻ thì ẩn hết
		clear.setEnabled(false); // chưa có thẻ thì ẩn hết
		add(enter);
		add(cancel);
		add(clear);
		add(new Label(""));
		admin = new JButton("ADMIN");
		add(admin);
		admin.setEnabled(false); // chưa có thẻ thì ẩn hết
	}

	public JButton[] getNumber() {
		return number;
	}

	public void setNumber(JButton[] number) {
		this.number = number;
	}

	public JButton getEnter() {
		return enter;
	}

	public void setEnter(JButton enter) {
		this.enter = enter;
	}

	public JButton getCancel() {
		return cancel;
	}

	public void setCancel(JButton cancel) {
		this.cancel = cancel;
	}

	public JButton getClear() {
		return clear;
	}

	public void setClear(JButton clear) {
		this.clear = clear;
	}

	public JButton getAdmin() {
		return admin;
	}

	public void setAdmin(JButton admin) {
		this.admin = admin;
	}
}
