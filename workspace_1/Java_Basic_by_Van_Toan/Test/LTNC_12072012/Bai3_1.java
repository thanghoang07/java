package LTNC_12072012;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Bai3_1 extends JFrame {
	public Bai3_1() {
		super("About");
		setLayout(new BorderLayout());

		JPanel p0 = new JPanel();
		JLabel lblHinh = new JLabel(new ImageIcon("hinh/zalo.png"));
		p0.add(lblHinh);
		add(lblHinh, BorderLayout.WEST);

		JPanel p1 = new JPanel();
		p1.setLayout(new BoxLayout(p1, BoxLayout.Y_AXIS));
		JLabel lbl1 = new JLabel("Advanced Programming");
		JLabel lbl2 = new JLabel("Version 1.0");
		JLabel lbl3 = new JLabel("Copyright Your Name");
		JLabel lbl4 = new JLabel("FIT HCMUAF");
		p1.add(lbl1);
		p1.add(lbl2);
		p1.add(lbl3);
		p1.add(lbl4);
		add(p1, BorderLayout.CENTER);

		JPanel p2 = new JPanel();
		p2.setLayout(new FlowLayout(FlowLayout.RIGHT));
		JButton btnOK = new JButton("OK");
		p2.add(btnOK);
		add(p2, BorderLayout.SOUTH);
		
		btnOK.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});

		setSize(350, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);

	}

	public static void main(String[] args) {
		new Bai3_1();
	}
}
