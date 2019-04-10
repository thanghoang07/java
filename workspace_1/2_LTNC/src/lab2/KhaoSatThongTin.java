package lab2;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class KhaoSatThongTin extends JFrame implements ActionListener, KeyListener {
	public JPanel panl1, panl2, panl3;
	public JLabel lblHoTen, lblGioiTinh, lblSoTien;
	public JTextField txtInTen, txtOutTen, txtOutSex, txtInTien, txtOutTien;
	public JRadioButton btNam, btNu;
	public Dimension sizeTxt;
	public int size = 18;

	public KhaoSatThongTin() {
		setTitle("Khao sat thong tin");
		creatGUI();
		setLayout(new FlowLayout());
		setSize(670, 135);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public void creatGUI() {
		// panel1
		GridLayout gl = new GridLayout(1, 3);
		BoxLayout bx = new BoxLayout(panl1, BoxLayout.X_AXIS);
		BoxLayout bx1 = new BoxLayout(panl2, BoxLayout.X_AXIS);
		BoxLayout bx2 = new BoxLayout(panl3, BoxLayout.X_AXIS);
		panl1 = new JPanel(gl);
		lblHoTen = new JLabel("Ho ten ");
		txtInTen = new JTextField(size);
		txtInTen.setPreferredSize(sizeTxt);
		txtInTen.addKeyListener(this);
		txtOutTen = new JTextField(size);
		txtOutTen.setPreferredSize(sizeTxt);
		txtOutTen.setEditable(false);
		panl1.add(lblHoTen);
		panl1.add(txtInTen);
		panl1.add(txtOutTen);
		add(panl1);
		// panel2
		panl2 = new JPanel(gl);
		// lblGioiTinh = new JLabel("Gioi tinh");
		txtOutSex = new JTextField(size);
		txtOutSex.setPreferredSize(sizeTxt);
		txtOutSex.setEditable(false);
		btNam = new JRadioButton("Nam");
		btNu = new JRadioButton("Nu");
		// panl2.add(lblGioiTinh);
		panl2.add(btNam);
		panl2.add(btNu);
		panl2.add(txtOutSex);
		add(panl2);
		// panel3
		panl3 = new JPanel(gl);
		lblSoTien = new JLabel("So tien");
		txtInTien = new JTextField(size);
		txtInTien.setPreferredSize(sizeTxt);
		txtInTien.addKeyListener(this);
		txtOutTien = new JTextField(size);
		txtOutTien.setPreferredSize(sizeTxt);
		txtOutTien.setEditable(false);
		panl3.add(lblSoTien);
		panl3.add(txtInTien);
		panl3.add(txtOutTien);
		add(panl3);
	}

	public static void main(String[] args) {
		new KhaoSatThongTin();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btNam) {
			txtOutSex.setText("Nam");
		} else if (e.getSource() == btNu) {
			txtOutSex.setText("Nu");
		}

	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		txtOutTen.setText(txtInTen.getText());
		if (arg0.getKeyCode() == KeyEvent.VK_ENTER) {
			String s1 = String.format("%,.2f", Double.parseDouble(txtInTien.getText()));
			txtOutTien.setText(s1);
		}

	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}
}
