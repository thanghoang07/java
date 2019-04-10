package lab1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Bai2 extends JFrame implements ActionListener {
	JTextField txt1, txt2;
	JLabel lb3;
	JButton b1;

	public Bai2() {
		setTitle("Bài 2 - Giải phương trình bậc 1");
		setLayout(new FlowLayout());

		// panel 1
		JPanel p1 = new JPanel();
		JLabel lb1 = new JLabel("Nhập a:");
		p1.add(lb1);
		txt1 = new JTextField(10);
		p1.add(txt1);

		JLabel lb2 = new JLabel("Nhập b:");
		p1.add(lb2);
		txt2 = new JTextField(10);
		p1.add(txt2);
		b1 = new JButton("Giải phương trình");
		p1.add(b1);
		add(p1);

		// panel 2
		JPanel p2 = new JPanel();
		lb3 = new JLabel("Nghiệm của phương trình là x =");
		p2.add(lb3);
		add(p2);

		// for fame
		setSize(520, 120);
		setLocation(200, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		b1.addActionListener(this);
	}

	public static void main(String[] args) {
		new Bai2();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			double a = Double.parseDouble(txt1.getText());
			double b = Double.parseDouble(txt2.getText());
			if (a != 0) {
				lb3.setText("Nghiệm của phương trình là x =" + (-b / a));
			} else {
				if (b == 0)
					lb3.setText("pt vo dinh");
				else
					lb3.setText("ptvn");

			}
		}
	}

}
