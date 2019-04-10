package demo003;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class StudenManagement_1 extends JFrame implements ActionListener, KeyListener  {
	public JPanel pnl1, pnl2, pnl3, pnl4, pnl5, pnl6, pnl7;
	public JComboBox<Integer> cboxNgay, cboxThang, cboxNam;
	public JLabel lblDanhSach;
	public JTextField jtfMSV, jtfHoTen, jtfGiangVien, jtfHienNgayDayDu;
	public DefaultComboBoxModel<Integer> model1, model2, model3;
	public JButton btnThemMoi, btnSapXep;
	public int ngayChon, thangChon, namChon;
	
	public StudenManagement_1(String title) {
		super(title);
		setLayout(new GridLayout(5, 2, 5, 5));
		int size = 15;
		// panel 1
		pnl1 = new JPanel();
		pnl1.setLayout(new GridLayout(2, 1, 5, 5));
		pnl1.add(new JLabel("Quan ly sinh vien"));
		add(pnl1);
		// panel 2
		pnl2 = new JPanel();
		pnl2.setLayout(new GridLayout(2, 1, 5, 5));
		jtfMSV = new JTextField(size);
		jtfMSV.setHorizontalAlignment(JTextField.RIGHT);
		jtfMSV.addKeyListener(this);
		pnl2.add(new JLabel("Ma sinh vien: "));
		pnl2.add(jtfMSV);
		add(pnl2);
		// panel 3
		pnl3 = new JPanel();
		pnl3.setLayout(new GridLayout(2, 1, 5, 5));
		jtfHoTen = new JTextField(size);
		jtfHoTen.setHorizontalAlignment(JTextField.RIGHT);
		jtfHoTen.addKeyListener(this);
		pnl3.add(new JLabel("Ho ten: "));
		pnl3.add(jtfHoTen);
		add(pnl3);
		// panel 4
		pnl4 = new JPanel();
		pnl4.setLayout(new GridLayout(2, 1, 5, 5));
		jtfGiangVien = new JTextField(size);
		jtfGiangVien.setHorizontalAlignment(JTextField.RIGHT);
		jtfGiangVien.addKeyListener(this);
		pnl4.add(new JLabel("Giang Vien: "));
		pnl4.add(jtfGiangVien);
		add(pnl4);
		// panel 5
		pnl5 = new JPanel();
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
		pnl5.add(new JLabel("Ngay Sinh: "));
		pnl5.add(cboxNgay);
		pnl5.add(cboxThang);
		pnl5.add(cboxNam);
		add(pnl5);
		// panel6
		pnl6 = new JPanel();
		pnl6.setLayout(new GridLayout(2, 1, 5, 5));
		btnThemMoi = new JButton("Them Moi");
		btnSapXep = new JButton("Sap xep");
		pnl6.add(btnThemMoi);
		pnl6.add(btnSapXep);
		add(pnl6);
		btnThemMoi.addActionListener(this);
		// panel 7
		pnl7 = new JPanel();
		pnl7.setLayout(new GridLayout(2, 1, 5, 5));
		jtfHienNgayDayDu = new JTextField(size);
		jtfHienNgayDayDu.setEditable(false);// khong cho phep nhap vao
		pnl7.add(new JLabel("Danh Sach"));
		pnl7.add(jtfHienNgayDayDu);
		add(pnl7);
		//
		setSize(500, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}	

	public static void main(String[] args) {
		new StudenManagement("Studen Management");
	}

	public void upDataTen(){
		// ho ten
		lblDanhSach.setText(jtfHoTen.getText());
	}
	public void upDataMSV(){
		// msv
		lblDanhSach.setText(jtfMSV.getText());
	}
	public void upDaTaGiangVien(){
		// giang vien
		lblDanhSach.setText(jtfGiangVien.getText());
	}

	@Override
	public void keyPressed(KeyEvent e) { // nhan vao phim3
		if (e.getKeyCode() == KeyEvent.VK_END) {
			upDataTen();
		}
		if(e.getKeyCode() == KeyEvent.VK_END){
			upDataMSV();
		}
		if(e.getKeyCode() == KeyEvent.VK_END){
			upDaTaGiangVien();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// ngay
		ngayChon = Integer.hashCode(cboxNgay.getSelectedIndex() + 1);
		thangChon = Integer.hashCode(cboxThang.getSelectedIndex() + 1);
		namChon = Integer.hashCode(cboxNam.getSelectedIndex() + 1975);
		jtfHienNgayDayDu.setText("Ho Ten: " + jtfHoTen.getText() + "\n Ngay Sinh: " + 
				String.valueOf(ngayChon) + " - " + String.valueOf(thangChon) + " - " + String.valueOf(namChon)
				+ "\n MSV: " + jtfMSV.getText() + "\n Giang Vien: " + jtfGiangVien.getText());
	}
}
