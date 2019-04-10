package gui2;

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
	private JPanel tempate;
	private JLabel temp1, temp2;	
	private JPasswordField pin;
	private boolean kiemTraBo = true, adminBo = false;
	private String temp = "";
	private KeyboardPlus keyPlus = new KeyboardPlus();
	private HangCuoiPlus tail = new HangCuoiPlus();
	private ButtonPlus ltbut = new ButtonPlus();
	private CardPlus cPlus = new CardPlus();
	private ScreenPlus scree = new ScreenPlus();
	
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
		// them su kien
		tail.getOnOff().addActionListener(this);
		cPlus.getNapThe().addActionListener(this);
		cPlus.getLayThe().addActionListener(this);
		for (int i = 1; i < 10; i++)
			keyPlus.getNumber()[i].addActionListener(this);
		keyPlus.getNumber()[0].addActionListener(this);
		keyPlus.getEnter().addActionListener(this);
		keyPlus.getClear().addActionListener(this);
		keyPlus.getCancel().addActionListener(this);
		keyPlus.getAdmin().addActionListener(this);
		//
		add(ltbut.getPanlTrai());// hai dãy button hai bên màn hình chính
		add(ltbut.getPanlPhai());// hai dãy button hai bên màn hình chính
		add(scree.getPanlManHinh());
		add(keyPlus);// thêm vào bàn phím và dãy chức năng
		add(tail.getPanlHangCuoi1());// thêm váo dòng cuối
		add(tail.getPanlHangCuoi2());// thêm váo dòng cuối
		add(cPlus.getPanlThe());
		add(cPlus.getPanlNhanThe());
		add(cPlus.getLoaiThe());
		// thử
		temp1 = new JLabel("");
		temp1.setForeground(Color.yellow);
		temp1.setFont(scree.getFont1());
		temp2 = new JLabel("");
		temp2.setForeground(Color.yellow);
		temp2.setFont(scree.getFont1());
		//
		tempate = new JPanel();
	}

	public String time() {
		Date today = new Date();
		DateFormat time = new SimpleDateFormat("hh:mm:ss");
		String stringDate = time.format(today);
		return stringDate;
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
		if (e.getSource().equals(cPlus.getNapThe())) {
			if (cPlus.getLoaiThe().getText().toString().compareTo("") == 0
					|| cPlus.getLoaiThe().getText().toString().compareTo("Nhập mã thẻ") == 0) {
				cPlus.getLoaiThe().setText("");
				cPlus.getLoaiThe().requestFocus();
				JOptionPane.showMessageDialog(null, "Xin hãy cho thẻ vào", "Chưa có thẻ", JOptionPane.WARNING_MESSAGE);
			} else {
				if (cPlus.getLoaiThe().getText().toString().compareTo("AAAAAA") == 0) {
					adminBo = true;
					kiemTraBo = false;
					JOptionPane.showMessageDialog(null, "Admin đăng nhập", "Xin chào quản trị viên",
							JOptionPane.WARNING_MESSAGE);
					// gán lại
					cPlus.getJlbKhuVucHienThiThe().setText(">>>Thẻ Admin<<<");
					keyPlus.getAdmin().setEnabled(true);
					keyPlus.getEnter().setEnabled(true);
					keyPlus.getCancel().setEnabled(true);
					ltbut.getBut3Trai().setEnabled(true);
					ltbut.getBut4Trai().setEnabled(true);
					scree.getPanlManHinh().setVisible(false); // loại bỏ màn hình chính để
													// thêm vô đó là màn hình
													// khi admin đăng nhập
					remove(scree.getPanlManHinh());
					adminLogin("<html><center><p>Xin chào quản trị viên ATM</p></center><html>");
					tail.getShowLog().setVisible(true);
					cPlus.getNapThe().setVisible(false);
					cPlus.getLayThe().setVisible(true);
					ltbut.getBut3Trai().setText("Nhập Tiền");
					ltbut.getBut4Trai().setText("Hủy bỏ");
				}
			}
		} else if (e.getSource().equals(cPlus.getLayThe())) {
			if (adminBo) {
				// trường hợp admin đăng nhập
				kiemTraBo = false;
				tempate.setVisible(false);
				remove(tempate);
				// gán lại màn hình ban đầu chính
				scree.manHinhBanDau();
				add(scree.getPanlManHinh());
				cPlus.getLoaiThe().setText("Nhập mã thẻ");
				cPlus.getLoaiThe().setEditable(true);
				scree.getJlbHienThiBenTrong().setText("");
				keyPlus.getEnter().setEnabled(false);
				keyPlus.getCancel().setEnabled(false);
				keyPlus.getClear().setEnabled(false);
				keyPlus.getAdmin().setEnabled(false);
				cPlus.getNapThe().setVisible(true);
				cPlus.getLayThe().setVisible(false);
				scree.getJlbManHinhChinh().setText("<html><center><p>Cám ơn quý khách đã sử dụng</p>"
						+ "<p>dịch vụ của chúng tôi</p>Xin vui lòng để thẻ vào....</center></html>");
				pin.setVisible(false);
				temp = "";
				scree.getPanlManHinh().remove(pin);
				ltbut.getBut3Trai().setText("");
				ltbut.getBut4Trai().setText("");
				ltbut.getBut3Trai().setEnabled(false);
				ltbut.getBut4Trai().setEnabled(false);
				tail.getShowLog().setVisible(false);
			}
			// trường hợp khách đăng nhập
		}
		for (int i = 0; i < keyPlus.getNumber().length; i++) {
			if (e.getSource().equals(keyPlus.getNumber()[i])) {
				// bắt sự kiện cho phím số
				temp += i;
			}
		}
		if (e.getSource().equals(keyPlus.getNumber()[0])) {
			// bắt sự kiện cho phím số
			temp += 0;
		}
		System.out.printf("%s\n%s\n", time(), temp);
	}
}
