package lab2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Bai1 extends JFrame implements ActionListener {
	public static JButton btnResult;
	public static JPanel panl1, panl2;
	public static JLabel lblNumber1, lblNumber2, lblNoti1, lblNoti2;
	public static JTextField txtNumber1, txtNumber2;

	public Bai1() {
		setTitle("Nhan hai so");
		creatGUI();
		setLayout(new FlowLayout());
		setSize(600, 120);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public void creatGUI() {
		// panel 1
		panl1 = new JPanel();
		lblNumber1 = new JLabel("Nhap vao mot so nguyen x: ");
		txtNumber1 = new JTextField(10);
		lblNumber2 = new JLabel("Nhap so thuc y: ");
		txtNumber2 = new JTextField(10);
		btnResult = new JButton("Tinh");
		btnResult.addActionListener(this);
		panl1.add(lblNumber1);
		panl1.add(txtNumber1);
		panl1.add(lblNumber2);
		panl1.add(txtNumber2);
		panl1.add(btnResult);
		this.add(panl1);
		// panel 2
		panl2 = new JPanel();
		lblNoti1 = new JLabel("Gia tri nhap vao la: ... va ...");
		lblNoti2 = new JLabel("Ket qua x * y la: ");
		panl2.add(lblNoti1);
		panl2.add(lblNoti2);
		add(panl2);
	}

	public static double tinh(double soX, double soY) {
		double temp = 0.0;
		temp = soX * soY;
		return temp;
	}

	public static void main(String[] args) {
		new Bai1();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if (obj.equals(btnResult)) {
			double soX = Double.parseDouble(txtNumber1.getText());
			double soY = Double.parseDouble(txtNumber2.getText());
			lblNoti1.setText("Gia tri nhap vao la: " + soX + " va " + soY);
			lblNoti2.setText("Ket qua x * y la: " + tinh(soX, soY));
		}
	}

	

}
