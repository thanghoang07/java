package OnTap;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class ThongTinCaNhan extends JFrame {
	String[] hocSinh = { "Phân Ban", "Không phân ban" };
	String[] sinhVien = { "Kỹ Thuật", "Xã Hội" };
	String[] kySu = { "Cơ khí", "Công nghệ Thông tin" };
	JComboBox jcbLoai;
	JTextArea jta;

	public ThongTinCaNhan() {
		super("THONG TIN CA NHAN");
		setLayout(new BorderLayout());

		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(4, 1));
		JLabel lblNghe = new JLabel("Nghề nghiệp");
		JRadioButton jrbHocSinh = new JRadioButton("Học Sinh");
		JRadioButton jrbSV = new JRadioButton("Sinh viên");
		JRadioButton jrbKySu = new JRadioButton("Kỹ sư");
		ButtonGroup btg = new ButtonGroup();
		btg.add(jrbHocSinh);
		btg.add(jrbSV);
		btg.add(jrbKySu);
		p1.add(lblNghe);
		p1.add(jrbHocSinh);
		p1.add(jrbSV);
		p1.add(jrbKySu);
		add(p1, BorderLayout.WEST);

		jrbHocSinh.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jcbLoai.setModel(new DefaultComboBoxModel(hocSinh));
				jta.setText("Học Sinh ");
			}
		});

		jrbSV.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jcbLoai.setModel(new DefaultComboBoxModel(sinhVien));
				jta.setText("Sinh viên ");
			}
		});

		jrbKySu.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jcbLoai.setModel(new DefaultComboBoxModel(kySu));
				jta.setText("Kỹ sư ");
			}
		});
		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout(4, 1));
		jcbLoai = new JComboBox();
		jcbLoai.setPreferredSize(new Dimension(200, 20));
		JCheckBox cbxHocSinh = new JCheckBox("Đọc báo");
		JCheckBox cbxSV = new JCheckBox("Đọc sách");
		JCheckBox cbxKySu = new JCheckBox("Nghe nhạc");
		p2.add(jcbLoai);
		p2.add(cbxHocSinh);
		p2.add(cbxSV);
		p2.add(cbxKySu);
		add(p2, BorderLayout.EAST);

		jta = new JTextArea();
		jta.setPreferredSize(new Dimension(0, 25));
		add(jta, BorderLayout.SOUTH);
		
//		jta.setText(jta.getText() + "thích: ");

		jcbLoai.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED)
					jta.setText(jta.getText() + jcbLoai.getSelectedItem() + " ");

			}
		});

		cbxHocSinh.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jta.setText(jta.getText() + "Đọc báo");

			}
		});
		cbxSV.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jta.setText(jta.getText() + "Đọc sách");

			}
		});
		cbxKySu.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jta.setText(jta.getText() + "Nghe nhạc");

			}
		});

		setSize(400, 180);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		new ThongTinCaNhan();
	}
}
