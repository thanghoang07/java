package DH13DT2;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Bai1 extends JFrame {
	String[] mauSac = { "Xanh", "Do", "Vang" };
	String[] loaiHinh = { "Tron", "Vuong" };
	String[] gioiTinh = { "Nam", "Nu" };
	String[] doTuoi = { "Thieu Nhi", "Thieu Nien", "Trung Nien" };
	JLabel lblNull1, lblNull2, lblNull3, lblNull4, lblNull5, lblNull6;
	JComboBox jcbMauSac, jcbLoaiHinh, jcbGioiTinh, jcbDoTuoi;
	JTextField jtfHoTen, jtfTruong;

	public Bai1() {
		super("KHAO SAT THONG TIN");
		setLayout(new GridLayout(4, 3));

		// JPanel 1
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(2, 1));
		p1.setBackground(Color.WHITE);
		JLabel lblLoaiHinh = new JLabel("Loai Hinh:");
		lblNull1 = new JLabel("");
		p1.add(lblLoaiHinh);
		p1.add(lblNull1);
		add(p1);

		// JPanel 1
		JPanel p5 = new JPanel();
		p5.setLayout(new GridLayout(2, 1));
		p5.setBackground(Color.WHITE);
		JLabel lblHoTen = new JLabel("Ho va ten:");
		lblNull3 = new JLabel("");
		p5.add(lblHoTen);
		p5.add(lblNull3);
		add(p5);

		// JPanel 1
		JPanel p9 = new JPanel();
		p9.setLayout(new GridLayout(2, 1));
		p9.setBackground(Color.WHITE);
		JLabel lblGioiTinh = new JLabel("Gioi Tinh;");
		lblNull5 = new JLabel("");
		p9.add(lblGioiTinh);
		p9.add(lblNull5);
		add(p9);

		// JPanel 2
		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout(2, 1));
		p2.setBackground(Color.WHITE);
		JLabel lblMauSac = new JLabel("Mau sac:");
		lblNull2 = new JLabel("");
		p2.add(lblMauSac);
		p2.add(lblNull2);
		add(p2);

		// JPanel 2
		JPanel p6 = new JPanel();
		p6.setLayout(new GridLayout(2, 1));
		p6.setBackground(Color.WHITE);
		JLabel lblTruong = new JLabel("Hoc Truong:");
		lblNull4 = new JLabel("");
		p6.add(lblTruong);
		p6.add(lblNull4);
		add(p6);

		// JPanel 2
		JPanel p10 = new JPanel();
		p10.setLayout(new GridLayout(2, 1));
		p10.setBackground(Color.WHITE);
		JLabel lblDoTuoi = new JLabel("Trong Do tuoi:");
		lblNull6 = new JLabel("");
		p10.add(lblDoTuoi);
		p10.add(lblNull6);
		add(p10);

		// JPanel 1
		JPanel p3 = new JPanel();
		p3.setLayout(new GridLayout(2, 1));
		JLabel lblMau = new JLabel("Mau sac:");
		jcbMauSac = new JComboBox(mauSac);
		p3.add(lblMau);
		p3.add(jcbMauSac);
		add(p3);

		jcbMauSac.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED)
					lblNull2.setText("Mau " + mauSac[jcbMauSac.getSelectedIndex()]);

			}
		});

		JPanel p7 = new JPanel();
		p7.setLayout(new GridLayout(2, 1));
		JLabel lblHoTen1 = new JLabel("Ho va Ten");
		jtfHoTen = new JTextField(15);
		p7.add(lblHoTen1);
		p7.add(jtfHoTen);
		add(p7);

		jtfHoTen.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER)
					lblNull3.setText(jtfHoTen.getText());
			}
		});

		// JPanel 1
		JPanel p11 = new JPanel();
		p11.setLayout(new GridLayout(2, 1));
		JLabel lblGioiTinh1 = new JLabel("Gioi Tinh:");
		jcbGioiTinh = new JComboBox(gioiTinh);
		p11.add(lblGioiTinh1);
		p11.add(jcbGioiTinh);
		add(p11);

		jcbGioiTinh.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED)
					lblNull5.setText(gioiTinh[jcbGioiTinh.getSelectedIndex()]);
			}
		});

		// JPanel 1
		JPanel p4 = new JPanel();
		p4.setLayout(new GridLayout(2, 1));
		JLabel lblLoai = new JLabel("Loai Hinh:");
		jcbLoaiHinh = new JComboBox(loaiHinh);
		p4.add(lblLoai);
		p4.add(jcbLoaiHinh);
		add(p4);

		jcbLoaiHinh.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED)
					lblNull1.setText("Hinh " + loaiHinh[jcbLoaiHinh.getSelectedIndex()]);
			}
		});

		JPanel p8 = new JPanel();
		p8.setLayout(new GridLayout(2, 1));
		JLabel lblTruong1 = new JLabel("Ten Truong");
		jtfTruong = new JTextField(15);
		p8.add(lblTruong1);
		p8.add(jtfTruong);
		add(p8);

		jtfTruong.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER)
					lblNull4.setText(jtfTruong.getText());
			}
		});

		// JPanel 1
		JPanel p12 = new JPanel();
		p12.setLayout(new GridLayout(2, 1));
		JLabel lblTuoi = new JLabel("Do tuoi:");
		jcbDoTuoi = new JComboBox(doTuoi);
		p12.add(lblTuoi);
		p12.add(jcbDoTuoi);
		add(p12);

		jcbDoTuoi.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED)
					lblNull6.setText(doTuoi[jcbDoTuoi.getSelectedIndex()]);
			}
		});

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(600, 250);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		new Bai1();
	}
}
