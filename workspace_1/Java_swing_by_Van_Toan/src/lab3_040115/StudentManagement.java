package lab3_040115;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class StudentManagement extends JFrame {
	String[] ngay = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11",
			"12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22",
			"23", "24", "25", "26", "27", "28", "29", "30", "31" };
	private JLabel lblNgaySinh;

	public StudentManagement(String title) {
		super(title);
		setLayout(new GridLayout(5, 4, 5, 5));

		// panel 1
		JPanel pnl1 = new JPanel();
		pnl1.setLayout(new FlowLayout(FlowLayout.CENTER));
		JLabel lblTieuDe = new JLabel("Quản lý sinh viên");
		pnl1.add(lblTieuDe);
		add(pnl1);

		// panel 2
		JPanel pnl2 = new JPanel();
		pnl2.setLayout(new FlowLayout(FlowLayout.CENTER));
		JLabel lblMSV = new JLabel("Mã sinh viên: ");
		JTextField jtfMSV = new JTextField(15);
		pnl2.add(lblMSV);
		pnl2.add(jtfMSV);
		add(pnl2);

		// panel 3
		JPanel pnl3 = new JPanel();
		pnl3.setLayout(new FlowLayout(FlowLayout.CENTER));
		JLabel lblHoTen = new JLabel("Họ tên: ");
		JTextField jtfHoTen = new JTextField(15);
		pnl3.add(lblHoTen);
		pnl3.add(jtfHoTen);
		add(pnl3);

		// panel 4
		JPanel pnl4 = new JPanel(new GridLayout(1, 4, 5, 5));
		lblNgaySinh = new JLabel("Ngày Sinh: ");
		JComboBox cbbNgay = new JComboBox(ngay);
		JComboBox cbbThang = new JComboBox(ngay);
		JComboBox cbbNam = new JComboBox(ngay);
		pnl4.add(cbbNgay);
		add(pnl4);

		// panel 5
		ImageIcon icon1 = new ImageIcon("icon/Search.png");
		ImageIcon icon2 = new ImageIcon("icon/Add-New.png");
		JPanel pnl5 = new JPanel();
		pnl5.setLayout(new GridLayout(1, 2, 5, 5));
		JButton btnTimKiem = new JButton("Tìm Kiếm", icon1);
		JButton btnSapXep = new JButton("Sắp xếp", icon2);
		pnl5.add(btnTimKiem);
		pnl5.add(btnSapXep);
		add(pnl5);

		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new StudentManagement("Student Management");
	}
}
