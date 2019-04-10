package Swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Bai3 extends JFrame implements ActionListener{ 
	JTextField jtfM, jtfKm;
	public Bai3(){
		setTitle("Bai 3 - Chuyen doi mile sang km");
		setLayout(new FlowLayout());
		
		//panel 1
		JPanel p1 = new JPanel();
		JLabel jblMile = new JLabel("Nhap mile");
		p1.add(jblMile);
		jtfM = new JTextField(10);
		p1.add(jtfM);
		JLabel jlbKm = new JLabel("So km tuong ung la:");
		p1.add(jlbKm);
		jtfKm = new JTextField(10);
		p1.add(jtfKm);
		JButton jbtChuyenDoi = new JButton("Chuyen doi");
		p1.add(jbtChuyenDoi);
		add(p1);
		
		// panel 2
		JPanel p2 = new JPanel();
		JLabel lblChuY = new JLabel("Chuyen: 1 mile = 1.609 km");
		p2.add(lblChuY);
		add(p2);
		
		setSize(600, 150);
		setLocation(100, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		jbtChuyenDoi.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		double mile = Double.parseDouble(jtfM.getText());
		jtfKm.setText(1.609 * mile + "");
	}
	public static void main(String[] args) {
		new Bai3();
	}
}
