package Lab30_5;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import CuoiKy15.Painting;

public class Bai1 extends JFrame {
	JTextField jtfHoTen, jtfHoTenKQ, jtfGioiTinhKQ, jtfNgayKQ, jtfTien,
			jtfTienKQ;
	JRadioButton jrbNam, jrbNu;
	JComboBox jcbNgay, jcbThang, jcbNam;
	JCheckBox cbxNghe, cbxDoc, cbxBoi;
	JTextArea jtaKQ;

	// String[] array = new String[3];
	ArrayList<String> array = new ArrayList<String>();

	public Bai1() {
		super("Thông tin");
		BoxLayout b1 = new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS);
		setLayout(b1);

		Dimension dimLabel = new Dimension(80, 20);
		Dimension dimRB = new Dimension(98, 20);
		Dimension dimTF = new Dimension(200, 20);
		Dimension dimCB = new Dimension(64, 20);
		Dimension dimCX = new Dimension(190, 30);

		// row 1
		JPanel p1 = new JPanel();
		JLabel lblHoTen = new JLabel("Họ Tên");
		lblHoTen.setPreferredSize(dimLabel);
		jtfHoTen = new JTextField();
		jtfHoTen.setPreferredSize(dimTF);
		jtfHoTenKQ = new JTextField();
		jtfHoTenKQ.setPreferredSize(dimTF);
		p1.add(lblHoTen);
		p1.add(jtfHoTen);
		p1.add(jtfHoTenKQ);
		add(p1);

		jtfHoTen.addMouseListener(new MouseAdapter() {
			public void mouseExited(MouseEvent event) {
				jtfHoTenKQ.setText(jtfHoTen.getText());
			}
		});

		jtfHoTen.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				jtfHoTenKQ.setText(jtfHoTen.getText());
			}
		});

		JPanel p2 = new JPanel();
		JLabel lblGioiTinh = new JLabel("Giới Tính");
		lblGioiTinh.setPreferredSize(dimLabel);
		jrbNam = new JRadioButton("Nam");
		jrbNam.setPreferredSize(dimRB);
		jrbNu = new JRadioButton("Nữ");
		jrbNu.setPreferredSize(dimRB);
		jtfGioiTinhKQ = new JTextField();
		jtfGioiTinhKQ.setPreferredSize(dimTF);
		ButtonGroup btg = new ButtonGroup();
		btg.add(jrbNam);
		btg.add(jrbNu);
		p2.add(lblGioiTinh);
		p2.add(jrbNam);
		p2.add(jrbNu);
		p2.add(jtfGioiTinhKQ);
		add(p2);

		jrbNam.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				jtfGioiTinhKQ.setText("Nam");
			}
		});

		jrbNu.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				jtfGioiTinhKQ.setText("Nữ");
			}
		});

		JPanel p3 = new JPanel();
		JLabel lblNgay = new JLabel("Ngày Sinh");
		lblNgay.setPreferredSize(dimLabel);
		jcbNgay = new JComboBox(ngay());
		jcbThang = new JComboBox(thang());
		jcbNam = new JComboBox(nam());
		jcbNgay.setPreferredSize(dimCB);
		jcbNam.setPreferredSize(dimCB);
		jcbThang.setPreferredSize(dimCB);
		jtfNgayKQ = new JTextField();
		jtfNgayKQ.setPreferredSize(dimTF);
		p2.add(lblNgay);
		p2.add(jcbNgay);
		p2.add(jcbThang);
		p2.add(jcbNam);
		p2.add(jtfNgayKQ);
		add(p3);

		jcbNam.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED)
					jtfNgayKQ.setText(String.format("%s/%s/%s",
							jcbNgay.getSelectedItem(),
							jcbThang.getSelectedItem(),
							jcbNam.getSelectedItem()));

			}
		});

		JPanel p4 = new JPanel();
		JLabel lblSoThich = new JLabel("Sở thích");
		lblSoThich.setPreferredSize(dimLabel);
		p4.add(lblSoThich);
		add(p4);

		JPanel p5 = new JPanel();
		p5.setLayout(new GridLayout(3, 1));
		cbxNghe = new JCheckBox("Nghe nhạc");
		cbxDoc = new JCheckBox("Đọc sách");
		cbxBoi = new JCheckBox("Bơi");
		cbxNghe.setPreferredSize(dimCX);
		cbxDoc.setPreferredSize(dimCX);
		cbxBoi.setPreferredSize(dimCX);
		p5.add(cbxNghe);
		p5.add(cbxDoc);
		p5.add(cbxBoi);
		p4.add(p5);

		cbxNghe.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) 
					jtaKQ.setText("Nghe nhạc\n");
				else
					jtaKQ.setText(jtaKQ.getText());
			}
		});

		cbxDoc.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) 
					jtaKQ.setText(jtaKQ.getText() + "Đọc sách\n");
				else
					jtaKQ.setText(jtaKQ.getText());
			}
		});
		cbxBoi.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED)
					jtaKQ.setText(jtaKQ.getText() + "Bơi\n");
				else
					jtaKQ.setText(jtaKQ.getText());
			}
		});

		JPanel p6 = new JPanel();
		jtaKQ = new JTextArea(5, 18);
		// JScrollPane sp = new JScrollPane(jtaKQ);
		// p6.add(sp);
		p6.add(jtaKQ);
		p4.add(p6);

		JPanel p7 = new JPanel();
		JLabel lblTien = new JLabel("Số Tiền");
		lblTien.setPreferredSize(dimLabel);
		jtfTien = new JTextField();
		jtfTien.setPreferredSize(dimTF);
		jtfTienKQ = new JTextField();
		jtfTienKQ.setPreferredSize(dimTF);
		p7.add(lblTien);
		p7.add(jtfTien);
		p7.add(jtfTienKQ);
		add(p7);
		//
		// jtfTien.addMouseListener(new MouseAdapter() {
		// public void mouseExited(MouseEvent event) {
		// jtfTienKQ.setText(String.format("%,.2f", jtfTien.getText()));
		// }
		// });

		// jtfTien.addActionListener(new ActionListener() {
		//
		// @Override
		// public void actionPerformed(ActionEvent arg0) {
		// int n = Integer.parseInt(jtfTien.getText());
		// jtfTienKQ.setText(""+String.format("%,.2f", n ));
		// }
		// });

		setSize(520, 350);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

	}

	public static void main(String[] args) {
		new Bai1();

	}

	public static String[] ngay() {
		String[] intt = new String[31];
		int ngay = 1;
		for (int i = 0; i < intt.length; i++) {
			intt[i] = String.format("%s", ngay);
			ngay++;
		}
		return intt;
	}

	public static String[] thang() {
		String[] intt = new String[12];
		int thang = 1;
		for (int i = 0; i < intt.length; i++) {
			intt[i] = String.format("%s", thang);
			thang++;
		}
		return intt;
	}

	public static String[] nam() {
		String[] intt = new String[116];
		int nam = 1900;
		for (int i = 0; i < intt.length; i++) {
			intt[i] = String.format("%s", nam);
			nam++;
		}
		return intt;
	}

	private String inMang(ArrayList<String> array) {
		String in = "";
		for (int i = 0; i < array.size(); i++) {
			System.out.printf("%s\n", i);

		}
		return in;
	}
}
