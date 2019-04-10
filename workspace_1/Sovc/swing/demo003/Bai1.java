package demo003;

import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Bai1 extends JFrame implements ActionListener{
	JTextField txtNumber1;
	JTextField txtNumber2;
	JLabel lblNoti1, lblNoti2;
	
	public Bai1() {
		setTitle("Bài 1 - Nhân 2 số");
		setLayout(new FlowLayout());
		
		// panel 1
		JPanel p1 = new JPanel();
		JLabel lblNumber1 = new JLabel("Nhập số nguyên x:");
		p1.add(lblNumber1);
		txtNumber1 = new JTextField(10);
		p1.add(txtNumber1);
		
		JLabel lblNumber2 = new JLabel("Nhập số thực y:");
		p1.add(lblNumber2);
		txtNumber2 = new JTextField(10);
		p1.add(txtNumber2);
		JButton btnResult = new JButton("Tính");
		p1.add(btnResult);
		add(p1);
		
		// panel 2
		JPanel p2 = new JPanel();
		lblNoti1 = new JLabel("Giá trị nhập vào là: ... và ...");
		lblNoti2 = new JLabel(" Kết quả x*y là:");
		p2.add(lblNoti1);
		p2.add(lblNoti2);
		add(p2);
		
		//panel 3
		JPanel p3 = new JPanel();
		//Label lal = new Label("Ket Qua");
		TextArea ta1 = new TextArea(20, 10);
		//p3.add(lal);
		p3.add(ta1);
		pack();
		add(p3);
		
		// for frame
		setSize(520, 520);
		setLocation(200, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		btnResult.addActionListener(this);

	}
	public void actionPerformed(ActionEvent e) {
		int x = Integer.parseInt(txtNumber1.getText());
		double y = Double.parseDouble(txtNumber2.getText());
		lblNoti1.setText("Giá trị nhập vào là:" + x + "và" + y);
		lblNoti2.setText("Kết quả x*y là:" + multi(x,y));
	}
	public static double multi(int x, double y) {
		return x*y;
	}
	
	public static void main(String[] args) {
		new Bai1();
	}
}
