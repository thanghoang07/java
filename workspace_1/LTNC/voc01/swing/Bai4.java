package swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Bai4 extends JFrame implements ActionListener {
	JTextField tx2, tx1, tx3;
	JButton b1;

	public Bai4() {
		setTitle("Bài 4 - Chu vi và diện tích hình tròn");
		setLayout(new FlowLayout());

		JPanel p1 = new JPanel();
		JLabel lb1 = new JLabel("Nhập bán kính r:");
		p1.add(lb1);
		tx1 = new JTextField(10);
		p1.add(tx1);

		JLabel lb2 = new JLabel("Chu vi:");
		p1.add(lb2);
		tx2 = new JTextField(10);
		p1.add(tx2);

		JLabel lb3 = new JLabel("Diện tích:");
		p1.add(lb3);
		tx3 = new JTextField(10);
		p1.add(tx3);
		b1 = new JButton("Tính");
		p1.add(b1);
		add(p1);

		b1.addActionListener(this);

		setSize(700, 100);
		setLocation(200, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Bai4();
	}

	@Override
	public void actionPerformed(ActionEvent a) {
		float x = Float.parseFloat(tx1.getText());
		tx2.setText("" + ((x * 2) * Math.PI));
		tx3.setText("" + ((x * x) * Math.PI));
	}
}

