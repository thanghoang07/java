package gui2;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonPlus extends JPanel {
	private static final int DISPLAY_Y = 10;
	private JPanel panlTrai, panlPhai;
	private JButton but1Trai, but2Trai, but3Trai, but4Trai, but1Phai, but2Phai, but3Phai, but4Phai;

	public ButtonPlus() {
		// TODO Auto-generated constructor stub
		// button bên trái
		but1Trai = new JButton("");
		but2Trai = new JButton("");
		but3Trai = new JButton("");
		but4Trai = new JButton("");
		// button bên phải
		but1Phai = new JButton("");
		but2Phai = new JButton("");
		but3Phai = new JButton("");
		but4Phai = new JButton("");
		// Ẩn hết chưa có thẻ thì ẩn hết
		but1Phai.setEnabled(false);
		but2Phai.setEnabled(false);
		but3Phai.setEnabled(false);
		but4Phai.setEnabled(false);
		but1Trai.setEnabled(false);
		but2Trai.setEnabled(false);
		but3Trai.setEnabled(false);
		but4Trai.setEnabled(false);
		//
		panlTrai = new JPanel(new GridLayout(4, 1));
		panlTrai.add(but1Trai);
		panlTrai.add(but2Trai);
		panlTrai.add(but3Trai);
		panlTrai.add(but4Trai);
		panlTrai.setSize(100, 250);
		// panlTrai.setLocation(0, 135);
		// DISPLAY_Y = 10
		panlTrai.setLocation(0, DISPLAY_Y);
		//
		panlPhai = new JPanel(new GridLayout(4, 1));
		panlPhai.add(but1Phai);
		panlPhai.add(but2Phai);
		panlPhai.add(but3Phai);
		panlPhai.add(but4Phai);
		panlPhai.setSize(100, 250);
		// panlPhai.setLocation(600, 135);
		panlPhai.setLocation(600, DISPLAY_Y);
	}

	public JPanel getPanlTrai() {
		return panlTrai;
	}

	public void setPanlTrai(JPanel panlTrai) {
		this.panlTrai = panlTrai;
	}

	public JPanel getPanlPhai() {
		return panlPhai;
	}

	public void setPanlPhai(JPanel panlPhai) {
		this.panlPhai = panlPhai;
	}

	public JButton getBut1Trai() {
		return but1Trai;
	}

	public void setBut1Trai(JButton but1Trai) {
		this.but1Trai = but1Trai;
	}

	public JButton getBut2Trai() {
		return but2Trai;
	}

	public void setBut2Trai(JButton but2Trai) {
		this.but2Trai = but2Trai;
	}

	public JButton getBut3Trai() {
		return but3Trai;
	}

	public void setBut3Trai(JButton but3Trai) {
		this.but3Trai = but3Trai;
	}

	public JButton getBut4Trai() {
		return but4Trai;
	}

	public void setBut4Trai(JButton but4Trai) {
		this.but4Trai = but4Trai;
	}

	public JButton getBut1Phai() {
		return but1Phai;
	}

	public void setBut1Phai(JButton but1Phai) {
		this.but1Phai = but1Phai;
	}

	public JButton getBut2Phai() {
		return but2Phai;
	}

	public void setBut2Phai(JButton but2Phai) {
		this.but2Phai = but2Phai;
	}

	public JButton getBut3Phai() {
		return but3Phai;
	}

	public void setBut3Phai(JButton but3Phai) {
		this.but3Phai = but3Phai;
	}

	public JButton getBut4Phai() {
		return but4Phai;
	}

	public void setBut4Phai(JButton but4Phai) {
		this.but4Phai = but4Phai;
	}

}
