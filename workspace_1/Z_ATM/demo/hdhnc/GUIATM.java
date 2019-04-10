package hdhnc;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GUIATM extends JFrame implements ActionListener {
	private JPanel panlPhim, panlTrai, panlPhai, panlManHinh, panlChucNang, panlThe, panlNhanThe, panlLoaiThe,
			panlHangCuoi1, panlHangCuoi2, tempate;
	private JButton[] number;
	private JLabel jlbManHinhChinh, jlbKhuVucHienThiThe, jlbHienThiBenTrong, jlbOperatorPanle1, jlbOperatorPanle2,
			temp1, temp2;
	private JButton enter, cancel, clear, admin, but1Trai, but2Trai, but3Trai, but4Trai, but1Phai, but2Phai, but3Phai,
			but4Phai, layThe, napThe, showLog, onOff;
	private Font font1, font2;
	private JPasswordField pin, pin1, pin2, pin3;
	private JTextField loaiThe, guiTien, taiKhoan, guiTien2;
	private static final int DISPLAY_Y = 10;
	private boolean kiemTraBo = true, adminBo = false;
	private String temp = "";

	public GUIATM() {
		setLayout(null);
		setSize(700, 700);
		setTitle("Chương trình mô phỏng máy ATM");
		createGUI();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
	}

	public void createGUI() {
		// màn hình chính
		font1 = new Font("Segoe UI Light", Font.BOLD, 29);
		font2 = new Font("Time New Romances", Font.BOLD, 40);
		jlbManHinhChinh = new JLabel(
				"<html><center><p>Ngân Hàng XYZ xin chào quý khách</p><p>Vui lòng để thẻ vào khe bên dưới</p></center></html>");
		jlbManHinhChinh.setFont(font1);
		// gán màu chữ cho màn hình chính
		jlbManHinhChinh.setForeground(Color.BLUE);
		jlbKhuVucHienThiThe = new JLabel(">>>Chưa có thẻ<<<");
		jlbHienThiBenTrong = new JLabel();
		jlbHienThiBenTrong.setFont(font1);
		jlbHienThiBenTrong.setForeground(Color.RED);
		// man hinh chinh
		manHinhBanDau();
		// bàn phím và dãy chức năng
		keyboardPlus();
		// hai dãy button hai bên màn hình chính
		twoButton();
		//
		panelThe();
		// hang cuoi
		panelHangCuoi();
		//
		pin = new JPasswordField(4);
		pin1 = new JPasswordField();
		pin1.setFont(font2);
		pin1.setEditable(false);
		pin2 = new JPasswordField();
		pin2.setFont(font2);
		pin2.setEditable(false);
		pin3 = new JPasswordField();
		pin3.setFont(font2);
		pin3.setEditable(false);
		guiTien = new JTextField();
		guiTien.setFont(font1);
		taiKhoan = new JTextField();
		taiKhoan.setFont(font1);
		guiTien2 = new JTextField();
		guiTien2.setFont(font1);
		guiTien2.setEditable(false);
		// them su kien
		onOff.addActionListener(this);
		napThe.addActionListener(this);
		layThe.addActionListener(this);
		for (int i = 0; i < 10; i++)
			number[i].addActionListener(this);
		enter.addActionListener(this);
		clear.addActionListener(this);
		cancel.addActionListener(this);
		admin.addActionListener(this);
		//
		add(panlHangCuoi1);
		add(panlHangCuoi2);
		//
		add(panlPhim);
		add(panlTrai);
		add(panlPhai);
		add(panlManHinh);
		add(panlChucNang);
		add(panlThe);
		add(panlNhanThe);
		add(panlLoaiThe);
		// thử
		temp1 = new JLabel("");
		temp1.setForeground(Color.yellow);
		temp1.setFont(font1);
		temp2 = new JLabel("");
		temp2.setForeground(Color.yellow);
		temp2.setFont(font1);
		//
		tempate = new JPanel();
	}

	public String time() {
		Date today = new Date();
		DateFormat time = new SimpleDateFormat("hh:mm:ss");
		String stringDate = time.format(today);
		return stringDate;
	}

	public void manHinhBanDau() {
		jlbKhuVucHienThiThe.setText(">>>Chưa có thẻ<<<");
		panlManHinh = new JPanel(new GridLayout(4, 1));
		panlManHinh.setSize(500, 440);
		panlManHinh.setLocation(100, 5);
		panlManHinh.add(jlbManHinhChinh);
		panlManHinh.add(jlbHienThiBenTrong);
		panlManHinh.setBackground(Color.BLACK);
	}

	public void twoButton() {
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

	public void panelThe() {
		panlNhanThe = new JPanel(new GridLayout(1, 2));
		panlNhanThe.setSize(200, 30);
		panlNhanThe.setLocation(385, 490);
		layThe = new JButton("Lấy thẻ");
		// ghi chú: chưa có thẻ thì chỉ cho hiện nạp thẻ thôi
		layThe.setVisible(false);
		napThe = new JButton("Nạp thẻ");
		panlNhanThe.add(layThe);
		panlNhanThe.add(napThe);
		//
		loaiThe = new JTextField(20);
		loaiThe.setText("Nhập mã thẻ");
		loaiThe.setBackground(Color.gray);
		panlLoaiThe = new JPanel();
		panlLoaiThe.setSize(200, 30);
		panlLoaiThe.setLocation(380, 520);
		panlLoaiThe.add(loaiThe);
		//
		panlThe = new JPanel();
		panlThe.add(jlbKhuVucHienThiThe);
		panlThe.setSize(200, 20);
		panlThe.setLocation(385, 470);
		panlThe.setBackground(Color.cyan);
	}

	public void keyboardPlus() {
		panlPhim = new JPanel();
		panlPhim.setLayout(new GridLayout(4, 3));
		// tạo dãy bàn phím
		number = new JButton[12];
		for (int i = 1; i < 10; i++) {
			number[i] = new JButton("" + i);
			panlPhim.add(number[i]);
		}		
		number[0] = new JButton("0");
		panlPhim.add(number[0]);
		panlPhim.add(new JLabel());
		panlPhim.setSize(150, 150);
		panlPhim.setLocation(120, 460);
		// thêm các nút chức năng
		panlChucNang = new JPanel(new GridLayout(4, 1));
		enter = new JButton("ENTER");
		cancel = new JButton("CANCEL");
		clear = new JButton("CLEAR");
		admin = new JButton("ADMIN");
		enter.setEnabled(false); // chưa có thẻ thì ẩn hết
		cancel.setEnabled(false);// chưa có thẻ thì ẩn hết
		clear.setEnabled(false); // chưa có thẻ thì ẩn hết
		admin.setEnabled(false); // chưa có thẻ thì ẩn hết
		panlChucNang.add(enter);
		panlChucNang.add(cancel);
		panlChucNang.add(admin);
		panlChucNang.add(clear);
		panlChucNang.setSize(80, 150);
		panlChucNang.setLocation(290, 460);
		// p5.setBackground(Color.red);
	}

	public void panelHangCuoi() {
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

	public void adminLogin(String tb) {
		temp = "";
		temp1.setText(tb);
		temp2.setText("");
		tempate.setVisible(true);
		remove(tempate);
		tempate.setSize(500, 440);
		tempate.setLocation(100, 5);
		tempate.setBackground(Color.blue);
		tempate.add(temp1);
		add(tempate);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// if (e.getSource().equals(onOff)) { // sự kiên cho nút bật tắt máy
		// if (!loaiThe.equals("")) {
		// // có thể bắt sự kiện khác như kiểm tra coi tiền trong máy có ko
		// JOptionPane.showMessageDialog(null, "Admin chưa đăng nhập", "Lỗi",
		// JOptionPane.WARNING_MESSAGE);
		// } else {
		// JFrame frame = new JFrame();
		// String str = JOptionPane.showInputDialog(frame, "Nhập vào số tiền
		// nhất định để máy có thể hoạt động");
		// onOff.setText("Off");
		// System.out.printf("so tien nhap vao: %3s\n", str);
		// if (e.getSource().equals(napThe)) {
		//
		// }
		// }
		// JFrame frame = new JFrame();
		// String str = JOptionPane.showInputDialog(frame, "Nhập vào số tiền
		// nhất định để máy có thể hoạt động");
		// onOff.setText("Off");
		// System.out.printf("so tien nhap vao: %3s\n", str);
		//
		// }
		// đầu tiên kiểm tra coi máy có còn tiền ko, ko có thì thông báo ra
		if (e.getSource().equals(napThe)) {
			if (loaiThe.getText().toString().compareTo("") == 0
					|| loaiThe.getText().toString().compareTo("Nhập mã thẻ") == 0) {
				loaiThe.setText("");
				loaiThe.requestFocus();
				JOptionPane.showMessageDialog(null, "Xin hãy cho thẻ vào", "Chưa có thẻ", JOptionPane.WARNING_MESSAGE);
			} else {
				if (loaiThe.getText().toString().compareTo("AAAAAA") == 0) {
					adminBo = true;
					kiemTraBo = false;
					JOptionPane.showMessageDialog(null, "Admin đăng nhập", "Xin chào quản trị viên",
							JOptionPane.WARNING_MESSAGE);
					// gán lại
					jlbKhuVucHienThiThe.setText(">>>Thẻ Admin<<<");
					admin.setEnabled(true);
					enter.setEnabled(true);
					cancel.setEnabled(true);
					but3Trai.setEnabled(true);
					but4Trai.setEnabled(true);
					panlManHinh.setVisible(false); // loại bỏ màn hình chính để
													// thêm vô đó là màn hình
													// khi admin đăng nhập
					remove(panlManHinh);
					adminLogin("<html><center><p>Xin chào quản trị viên ATM</p></center><html>");
					showLog.setVisible(true);
					napThe.setVisible(false);
					layThe.setVisible(true);
					but3Trai.setText("Nhập Tiền");
					but4Trai.setText("Hủy bỏ");
				}
			}
		} else if (e.getSource().equals(layThe)) {
			if (adminBo) {
				// trường hợp admin đăng nhập
				kiemTraBo = false;
				tempate.setVisible(false);
				remove(tempate);
				// gán lại màn hình ban đầu chính
				manHinhBanDau();
				add(panlManHinh);
				loaiThe.setText("Nhập mã thẻ");
				loaiThe.setEditable(true);
				jlbHienThiBenTrong.setText("");
				enter.setEnabled(false);
				cancel.setEnabled(false);
				clear.setEnabled(false);
				admin.setEnabled(false);
				napThe.setVisible(true);
				layThe.setVisible(false);
				jlbManHinhChinh.setText("<html><center><p>Cám ơn quý khách đã sử dụng</p>"
						+ "<p>dịch vụ của chúng tôi</p>Xin vui lòng để thẻ vào....</center></html>");
				pin.setVisible(false);
				temp = "";
				panlManHinh.remove(pin);
				but3Trai.setText("");
				but4Trai.setText("");
				but3Trai.setEnabled(false);
				but4Trai.setEnabled(false);
				showLog.setVisible(false);
			}
			// trường hợp khách đăng nhập
		}
		for (int i = 0; i < number.length; i++) {
			if (e.getSource().equals(number[i])) {
				// bắt sự kiện cho phím số
				temp += i;
			}
		}
		System.out.printf("%s\n%s\n", time(), temp);
	}
}
