package lab1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

public class MenuDemo extends JFrame {
	JTextField jtf1, jtf2;

	public MenuDemo(String title) {
		super(title);
		setLayout(new BorderLayout(5, 10));

		ImageIcon icon1 = new ImageIcon("icon/Add-New.png");
		ImageIcon icon2 = new ImageIcon("icon/Text Edit.png");
		ImageIcon icon3 = new ImageIcon("icon/multi.png");
		ImageIcon icon4 = new ImageIcon("icon/Math_divide_Icon_16.png");

		// panel 1
		JPanel jplP1 = new JPanel();
		jplP1.setLayout(new FlowLayout(FlowLayout.CENTER));
		JLabel jlb1 = new JLabel("Number 1");
		jplP1.add(jlb1);
		jtf1 = new JTextField(4);
		jplP1.add(jtf1);
		JLabel jlb2 = new JLabel("Number 2");
		jplP1.add(jlb2);
		jtf2 = new JTextField(4);
		jplP1.add(jtf2);
		JLabel jlb3 = new JLabel("Result");
		jplP1.add(jlb3);
		JTextField jtf3 = new JTextField(4);
		jplP1.add(jtf3);
		add(jplP1, BorderLayout.EAST);

		// PANEL 2
		JPanel jplP2 = new JPanel();
		jplP2.setLayout(new FlowLayout(FlowLayout.CENTER));
		JButton btn1 = new JButton("Add", icon1);
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				double x = Double.parseDouble(jtf1.getText());
				double y = Double.parseDouble(jtf2.getText());
				jtf3.setText("" + (x + y));
			}
		});
		jplP2.add(btn1);
		JButton btn2 = new JButton("Subtract", icon2);
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				double x = Double.parseDouble(jtf1.getText());
				double y = Double.parseDouble(jtf2.getText());
				jtf3.setText("" + (x - y));
			}
		});
		jplP2.add(btn2);
		JButton btn3 = new JButton("Multiply", icon3);
		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				double x = Double.parseDouble(jtf1.getText());
				double y = Double.parseDouble(jtf2.getText());
				jtf3.setText("" + (x * y));
			}
		});
		jplP2.add(btn3);
		JButton btn4 = new JButton("Divide", icon4);
		btn4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				double x = Double.parseDouble(jtf1.getText());
				double y = Double.parseDouble(jtf2.getText());
				jtf3.setText("" + (x / y));
			}
		});
		jplP2.add(btn4);
		add(jplP2, BorderLayout.SOUTH);

		JMenuBar jmb = new JMenuBar();
		this.setJMenuBar(jmb);

		JMenu operation = new JMenu("Operation");
		JMenu exit = new JMenu("Exit");
		jmb.add(operation);
		jmb.add(exit);

		JMenuItem jmiExit;
		exit.add(jmiExit = new JMenuItem("Exit"));
		jmiExit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		JMenuItem jmiAdd, jmiSubtract, jmiMultiply, jmiDivide;
		operation.add(jmiAdd = new JMenuItem("Add"));
		operation.add(jmiSubtract = new JMenuItem("Subtract"));
		operation.add(jmiMultiply = new JMenuItem("Multiply"));
		operation.add(jmiDivide = new JMenuItem("Divide"));

		jmiAdd.setIcon(new ImageIcon("icon/Add-New.png"));
		jmiAdd.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				double x = Double.parseDouble(jtf1.getText());
				double y = Double.parseDouble(jtf2.getText());
				jtf3.setText("" + (x + y));
			}
		});
		jmiSubtract.setIcon(new ImageIcon("icon/Text Edit.png"));
		jmiSubtract.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				double x = Double.parseDouble(jtf1.getText());
				double y = Double.parseDouble(jtf2.getText());
				jtf3.setText("" + (x - y));
			}
		});
		jmiMultiply.setIcon(new ImageIcon("icon/multi.png"));
		jmiMultiply.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				double x = Double.parseDouble(jtf1.getText());
				double y = Double.parseDouble(jtf2.getText());
				jtf3.setText("" + (x * y));
			}
		});
		jmiDivide.setIcon(new ImageIcon("icon/Math_divide_Icon_16.png"));
		jmiDivide.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				double x = Double.parseDouble(jtf1.getText());
				double y = Double.parseDouble(jtf2.getText());
				jtf3.setText("" + (x / y));
			}
		});

		operation.setMnemonic('O');
		exit.setMnemonic('E');
		jmiAdd.setMnemonic('A');
		jmiSubtract.setMnemonic('S');
		jmiMultiply.setMnemonic('M');
		jmiDivide.setMnemonic('D');

		jmiAdd.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,
				ActionEvent.CTRL_MASK));
		jmiSubtract.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,
				ActionEvent.CTRL_MASK));
		jmiMultiply.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M,
				ActionEvent.CTRL_MASK));
		jmiDivide.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,
				ActionEvent.CTRL_MASK));

		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new MenuDemo("MenuDemo");
	}
}
