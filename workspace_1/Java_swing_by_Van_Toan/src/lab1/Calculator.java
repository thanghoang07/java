package lab1;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame {
	private char operator;

	public Calculator(String title) {
		super(title);
		setLayout(new GridLayout(5, 1));

		// panel 1
		JPanel jplP1 = new JPanel();
		jplP1.setLayout(new FlowLayout());
		JLabel lbl1So1 = new JLabel("Số thứ 1:");
		jplP1.add(lbl1So1);
		JTextField jtfSo1 = new JTextField(14);
		jplP1.add(jtfSo1);
		add(jplP1);

		// panel 2
		JPanel jplP2 = new JPanel();

		jplP2.setLayout(new FlowLayout(FlowLayout.CENTER));
		JButton btn1 = new JButton("+");
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				operator = '+';
			}
		});

		jplP2.add(btn1);
		JButton btn2 = new JButton("-");
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				operator = '-';
			}
		});

		jplP2.add(btn2);
		JButton btn3 = new JButton("*");
		btn3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				operator = '*';
			}
		});

		jplP2.add(btn3);
		JButton btn4 = new JButton("/");
		btn4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				operator = '/';
			}
		});
		btn4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				operator = '*';
			}
		});

		jplP2.add(btn4);
		add(jplP2);

		// panel 3
		JPanel jplP3 = new JPanel();
		jplP3.setLayout(new FlowLayout());
		JLabel lbl1So2 = new JLabel("Số thứ 2:");
		jplP3.add(lbl1So2);
		JTextField jtfSo2 = new JTextField(14);
		jplP3.add(jtfSo2);
		add(jplP3);

		// panel 4
		JPanel jplP4 = new JPanel();
		jplP4.setLayout(new FlowLayout(FlowLayout.CENTER));
		JButton btn5 = new JButton("=");

		jplP4.add(btn5);
		add(jplP4);

		// panel 5
		JPanel jplP5 = new JPanel();
		jplP5.setLayout(new FlowLayout());
		JLabel lbl1So3 = new JLabel("Kết quả:");
		jplP5.add(lbl1So3);
		JTextField jtfSo3 = new JTextField(14);
		jplP5.add(jtfSo3);
		add(jplP5);

		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double x = Double.parseDouble(jtfSo1.getText());
				double y = Double.parseDouble(jtfSo2.getText());
				if (operator == '+') {
					jtfSo3.setText(x + y + "");
				} else if (operator == '-') {
					jtfSo3.setText(x - y + "");
				} else if (operator == '*') {
					jtfSo3.setText(x * y + "");
				} else {
					jtfSo3.setText(x / y + "");
				}
				// jtfSo3.setText(jtfSo1.getText() + operator + jtfSo2.getText()
				// + "=" + result(x, y));
			}
		});
	}

	double result(double x, double y) {
		if (operator == '+') {
			return x + y;
		} else if (operator == '-') {
			return x - y;
		} else if (operator == '*') {
			return x * y;
		} else {
			return x / y;
		}
	}

	public static void main(String[] args) {
		new Calculator("Calculator");
	}
}
