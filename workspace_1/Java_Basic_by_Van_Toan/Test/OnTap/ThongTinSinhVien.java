package OnTap;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ThongTinSinhVien extends JFrame {
	JButton btnTB;

	public ThongTinSinhVien() {
		super("Thong Tin Sinh Vien");

		BoxLayout b1 = new BoxLayout(getContentPane(), BoxLayout.Y_AXIS);
		setLayout(b1);

		Dimension dimLBL = new Dimension(80, 25);
		Dimension dimTF = new Dimension(150, 25);

		JPanel p1 = new JPanel();
		p1.setLayout(new FlowLayout(FlowLayout.CENTER));
		JLabel lblTieuDe = new JLabel("THONG TIN SINH VIEN");
		p1.add(lblTieuDe);

		JPanel p2 = new JPanel();
		JLabel lblHo = new JLabel("Ho:");
		lblHo.setPreferredSize(dimLBL);
		JTextField jtfHo = new JTextField();
		jtfHo.setPreferredSize(dimTF);
		p2.add(lblHo);
		p2.add(jtfHo);
		add(p2);

		JPanel p3 = new JPanel();
		JLabel lblTen = new JLabel("Ten:");
		lblTen.setPreferredSize(dimLBL);
		JTextField jtfTen = new JTextField();
		jtfTen.setPreferredSize(dimTF);
		p3.add(lblTen);
		p3.add(jtfTen);
		add(p3);

		JPanel p5 = new JPanel();
		JLabel lblGioiTinh = new JLabel("Gioi Tinh:");
		lblGioiTinh.setPreferredSize(new Dimension(135, 25));
		JRadioButton jrbNam = new JRadioButton("Nam");
		JRadioButton jrbNu = new JRadioButton("Nu");
		ButtonGroup btg = new ButtonGroup();
		btg.add(jrbNam);
		btg.add(jrbNu);
		p5.add(lblGioiTinh);
		p5.add(jrbNam);
		p5.add(jrbNu);
		add(p5);

		JPanel p4 = new JPanel();
		JLabel lblNgaySinh = new JLabel("Ngay Sinh:");
		lblNgaySinh.setPreferredSize(dimLBL);
		JComboBox jcbNgay = new JComboBox(ngay());
		JComboBox jcbThang = new JComboBox(thang());
		JComboBox jcbNam = new JComboBox(nam());
		p4.add(lblNgaySinh);
		p4.add(jcbNgay);
		p4.add(jcbThang);
		p4.add(jcbNam);
		add(p4);

		JPanel pTong = new JPanel();
		JPanel p6 = new JPanel();
		p6.setLayout(new GridLayout(2, 4));
		JLabel lblToan = new JLabel("Toan");
		JLabel lblLy = new JLabel("Ly");
		JLabel lblHoa = new JLabel("Hoa");
		JLabel lblTB = new JLabel("Diem TB");
		JTextField jtfToan = new JTextField(4);
		JTextField jtfLy = new JTextField(4);
		JTextField jtfHoa = new JTextField(4);
		JTextField jtfTB = new JTextField(4);
		p6.add(lblToan);
		p6.add(lblLy);
		p6.add(lblHoa);
		p6.add(lblTB);
		p6.add(jtfToan);
		p6.add(jtfLy);
		p6.add(jtfHoa);
		p6.add(jtfTB);
		pTong.add(p6);

		btnTB = new JButton("Tinh");
		pTong.add(btnTB);
		add(pTong);

//		JPanel p7 = new JPa
		JTextArea jtaThongTin = new JTextArea(3, 10);
		add(jtaThongTin);
		
		setSize(500, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		new ThongTinSinhVien();
	}

	public static String[] ngay() {
		String[] arr = new String[31];
		int ngay = 1;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = "" + ngay;
			ngay++;
		}
		return arr;
	}

	public static String[] thang() {
		String[] arr = new String[12];
		int thang = 1;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = "" + thang;
			thang++;
		}
		return arr;
	}

	public static String[] nam() {
		String[] arr = new String[116];
		int nam = 1900;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = "" + nam;
			nam++;
		}
		return arr;
	}
}
