package demo2_1;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TienLai extends JFrame implements ActionListener {
	private JTextField tfTienGui, tfLaiXuat, tfThang, tfTienLai;

	public TienLai() {
		// ------------ create JFrame ------------ //
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(5, 2, 5, 5));

		// ------------ add content ------------ //

		int size = 15;
		add(new JLabel("Tiền gửi"));
		tfTienGui = new JTextField(size);
		add(tfTienGui);

		add(new JLabel("Lãi xuất / Tháng"));
		tfLaiXuat = new JTextField(size);
		add(tfLaiXuat);

		add(new JLabel("Tháng"));
		tfThang = new JTextField(size);
		add(tfThang);

		add(new JLabel("Tiền lãi"));
		tfTienLai = new JTextField(size);
		tfTienLai.setEditable(false);// khong cho phep nhap du lieu
		add(tfTienLai);

		add(createJButton("Tính"));
		add(createJButton("Nhập lại"));

		// ------------ display ------------
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}

	private JButton createJButton(String buttonName) {
		JButton btn = new JButton(buttonName);
		btn.addActionListener(this);
		return btn;
	}

	public static void main(String[] args) {
		new TienLai();
	}

	private void process() {
		// check data
		String text = tfTienGui.getText();
		double tienGui = 0, thang = 0, laiXuat = 0;

		// tien gui
		if (text.equals("")) {
			tfTienGui.requestFocus(); // nhay den de nhap tien gui
		} else {
			tienGui = Double.parseDouble(text);

			// lai xuat
			text = tfLaiXuat.getText();
			if (text.equals("")) {
				tfLaiXuat.requestFocus(); // nhay den de nhap lai xuat
			} else {
				laiXuat = Double.parseDouble(text);

				// thang
				text = tfThang.getText();
				if (text.equals("")) {
					tfThang.requestFocus(); // nhay den de nhap thang
				} else {
					thang = Integer.parseInt(tfThang.getText());
				}
			}
		}

		// process data
		double lai = tienGui * laiXuat * thang;
		tfTienLai.setText(String.valueOf(lai)); // hien thi ket qua
	}

	private void clear() {
		tfTienGui.setText("");
		tfTienGui.requestFocus(); // nhay ve de nha tien gui
		tfLaiXuat.setText("");
		tfThang.setText("");
		tfTienLai.setText("");
	}

	// methods of ActionListener
	@Override
	public void actionPerformed(ActionEvent evt) {
		String command = evt.getActionCommand();
		if (command == "Tính") {
			process();
		}
		if (command == "Nhập lại") {
			clear();
		}
	}
}
