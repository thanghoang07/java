package FinalExam2014;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Lab02_06.Graphics;

public class Bai4_2 extends JFrame {
	public Bai4_2() {
		super("Loan Calcultor About");
		BoxLayout b1 = new BoxLayout(getContentPane(), BoxLayout.Y_AXIS);
		setLayout(b1);
		
		
		
		Dimension dimlbl = new Dimension(100, 100);

		JPanel p1 = new JPanel();
		JLabel lblTieuDe = new JLabel("Loan Calculator Information");
		p1.add(lblTieuDe);
		add(p1);

		JPanel p2 = new JPanel();
		JLabel lblDeve = new JLabel("Developer:");
		lblDeve.setPreferredSize(dimlbl);
		JLabel lblName = new JLabel("Name");
		lblName.setSize(dimlbl);
		p2.add(lblDeve);
		p2.add(lblName);

		JPanel p3 = new JPanel();
		JLabel lblVer = new JLabel("Developer:");
		lblVer.setPreferredSize(dimlbl);
		JLabel lblVer1 = new JLabel("Name");
		lblVer1.setSize(dimlbl);
		p3.add(lblVer);
		p3.add(lblVer1);

		JPanel pChinh = new JPanel();
		pChinh.setLayout(new GridLayout(2, 1));
		pChinh.add(p2);
		pChinh.add(p3);
		add(pChinh);

		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		new Bai4_2();
	}
	
}
