package gui2;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HangCuoiPlus extends JPanel {
	private JPanel panlHangCuoi1, panlHangCuoi2;
	private JButton showLog, onOff;
	private JLabel jlbOperatorPanle1, jlbOperatorPanle2;

	public JPanel getPanlHangCuoi1() {
		return panlHangCuoi1;
	}

	public void setPanlHangCuoi1(JPanel panlHangCuoi1) {
		this.panlHangCuoi1 = panlHangCuoi1;
	}

	public JPanel getPanlHangCuoi2() {
		return panlHangCuoi2;
	}

	public void setPanlHangCuoi2(JPanel panlHangCuoi2) {
		this.panlHangCuoi2 = panlHangCuoi2;
	}

	public JButton getShowLog() {
		return showLog;
	}

	public void setShowLog(JButton showLog) {
		this.showLog = showLog;
	}

	public JButton getOnOff() {
		return onOff;
	}

	public void setOnOff(JButton onOff) {
		this.onOff = onOff;
	}

	public JLabel getJlbOperatorPanle1() {
		return jlbOperatorPanle1;
	}

	public void setJlbOperatorPanle1(JLabel jlbOperatorPanle1) {
		this.jlbOperatorPanle1 = jlbOperatorPanle1;
	}

	public JLabel getJlbOperatorPanle2() {
		return jlbOperatorPanle2;
	}

	public void setJlbOperatorPanle2(JLabel jlbOperatorPanle2) {
		this.jlbOperatorPanle2 = jlbOperatorPanle2;
	}

	public HangCuoiPlus() {
		// TODO Auto-generated constructor stub
		//
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.NONE;
		GridBagLayout layout1 = new GridBagLayout();
		panlHangCuoi1 = new JPanel(layout1);
		showLog = new JButton("ShowLog");
		showLog.setVisible(false); // ẩn chỉ Adim mới coi được
		panlHangCuoi1.add(showLog, gbc);
		panlHangCuoi1.setSize(200, 50);
		panlHangCuoi1.setLocation(0, 625);
		//
		GridBagLayout layout2 = new GridBagLayout();
		panlHangCuoi2 = new JPanel(layout2);
		onOff = new JButton("On");
		jlbOperatorPanle2 = new JLabel("Click button to turn ATM on");
		jlbOperatorPanle1 = new JLabel("Operator Panle");
		panlHangCuoi2.add(jlbOperatorPanle1, gbc);
		panlHangCuoi2.add(jlbOperatorPanle2, gbc);
		panlHangCuoi2.add(onOff, gbc);
		panlHangCuoi2.setSize(445, 40);
		panlHangCuoi2.setLocation(210, 625);
	}
}
