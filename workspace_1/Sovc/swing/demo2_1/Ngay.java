package demo2_1;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ngay extends JFrame implements ActionListener {
	public JPanel pnl5, pnl6;
	public JComboBox<Integer> cboxNgay, cboxThang, cboxNam;
	public JLabel lblNgaySinh, lblTest;
	public DefaultComboBoxModel<Integer> model1, model2, model3;
	public JButton btnThemMoi;
	public int ngayChon, thangChon, namChon;

	public Ngay(String title) {
		super(title);
		setLayout(new GridLayout(5, 2, 5, 5));
		// panel 5
		pnl5 = new JPanel();
		lblNgaySinh = new JLabel("Ngay Sinh");
		// ngay
		model1 = new DefaultComboBoxModel<Integer>();
		cboxNgay = new JComboBox<Integer>(model1);
		for (int i = 0; i < 31; i++) {
			model1.addElement(1 + i);
		}
		// thang
		model2 = new DefaultComboBoxModel<Integer>();
		cboxThang = new JComboBox<Integer>(model2);
		for (int i = 0; i < 12; i++) {
			model2.addElement(1 + i);
		}
		// nam
		model3 = new DefaultComboBoxModel<Integer>();
		cboxNam = new JComboBox<Integer>(model3);
		int i = 1975;
		do {
			model3.addElement(i);
			i++;
		} while (i <= 2016);
		// add
		pnl5.add(lblNgaySinh);
		pnl5.add(cboxNgay);
		pnl5.add(cboxThang);
		pnl5.add(cboxNam);
		add(pnl5);
		// panel6
		pnl6 = new JPanel();
		pnl6.setLayout(new GridLayout(2, 1, 5, 5));
		btnThemMoi = new JButton("Save");
		pnl6.add(btnThemMoi);
		add(pnl6);
		btnThemMoi.addActionListener(this);
		//
		lblTest = new JLabel("test");
		add(lblTest);
		//
		setSize(500, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// cboxNgay.setSelectedIndex(9);//chon tại vi tri
		ngayChon = Integer.hashCode(cboxNgay.getSelectedIndex() + 1);
		thangChon = Integer.hashCode(cboxThang.getSelectedIndex() + 1);
		namChon = Integer.hashCode(cboxNam.getSelectedIndex() + 1975);
		lblTest.setText("Ngay Sinh: " + String.valueOf(ngayChon) + " - " + String.valueOf(thangChon) + " - "
				+ String.valueOf(namChon));

	}

	public static void main(String[] args) {
		new Ngay("Ngay");
	}
}
