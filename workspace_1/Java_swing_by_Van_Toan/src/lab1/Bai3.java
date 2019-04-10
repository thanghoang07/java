package lab1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Bai3 extends JFrame implements ActionListener {
	JTextField tx1, tx2;

	public Bai3() {
		setTitle("Bài 3- Chuyển đổi mile sang km");
		setLayout(new FlowLayout());

		JPanel p1 = new JPanel();
		JLabel lb1 = new JLabel("Nhập mile:");
		p1.add(lb1);
		tx1 = new JTextField(10);
		p1.add(tx1);

		JLabel lb2 = new JLabel("Số km tương ứng là :");
		p1.add(lb2);
		tx2 = new JTextField(10);
		p1.add(tx2);
		JButton b1 = new JButton("Chuyển đổi");
		p1.add(b1);
		add(p1);

		JPanel p2 = new JPanel();
		JLabel lbnoti = new JLabel("Chú ý: 1 mile = 1.609 km");
		p2.add(lbnoti);
		add(p2);

		setSize(550, 120);
		setLocation(200, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		b1.addActionListener(this);
	}

	public static double convert(double x) {
		return x * 1.609;
	}

	public static void main(String[] args) {
		new Bai3();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		double x = Double.parseDouble(tx1.getText());
		tx2.setText("" + convert(x));
	}

}
