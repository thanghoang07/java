package demo;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Bai2 extends JFrame {
	JRadioButton jrbLeft, jrbCenter, jrbRight;
	JTextField jtfSize, jtfText;

	public Bai2() {
		super("Excersise17_11");
		setLayout(new FlowLayout());

		JPanel p1 = new JPanel();
		p1.setLayout(new FlowLayout(FlowLayout.CENTER));
		JLabel lblText = new JLabel("TextField");
		jtfText = new JTextField(20);
		p1.add(lblText);
		p1.add(jtfText);
		add(p1);

		JPanel p2 = new JPanel(new GridLayout(1, 2));
		JPanel p3 = new JPanel();
		p3.setBorder(BorderFactory.createTitledBorder("Horizontal Aligment"));
		jrbLeft = new JRadioButton("Left");
		jrbCenter = new JRadioButton("Center");
		jrbRight = new JRadioButton("Right");
		ButtonGroup btg = new ButtonGroup();
		btg.add(jrbLeft);
		btg.add(jrbCenter);
		btg.add(jrbRight);
		p3.add(jrbLeft);
		p3.add(jrbCenter);
		p3.add(jrbRight);
		p2.add(p3);
		add(p2);
		

		JPanel p4 = new JPanel();
		p4.setBorder(BorderFactory.createTitledBorder(""));
		JLabel lblSize = new JLabel("Custom Size:");
		jtfSize = new JTextField(6);
		p4.add(lblSize);
		p4.add(jtfSize);
		add(p4);
		
		jtfSize.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				double size = Double.parseDouble(jtfSize.getText());
				
				
			}
		});

		setSize(400, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);

	}

	public static void main(String[] args) {
		new Bai2();
	}
}
