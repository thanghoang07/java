package LTNC_12072012;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Bai3 extends JFrame {
	public Bai3() {
		super("Solve Quadratioc Equation");
		BoxLayout b1 = new BoxLayout(getContentPane(), BoxLayout.Y_AXIS);
		setLayout(b1);

		Dimension dimLBL = new Dimension(170, 25);
		Dimension dimTF = new Dimension(180, 25);

		JPanel row1 = new JPanel();
		row1.setLayout(new FlowLayout(FlowLayout.CENTER));
		JLabel lblTieuDe = new JLabel("Enter factors of equation");
		row1.add(lblTieuDe);
		add(row1);

		JPanel row2 = new JPanel();
		JLabel lblA = new JLabel("Enter number a");
		lblA.setPreferredSize(dimLBL);
		JTextField jtfA = new JTextField();
		jtfA.setPreferredSize(dimTF);
		row2.add(lblA);
		row2.add(jtfA);
		add(row2);

		JPanel row3 = new JPanel();
		JLabel lblB = new JLabel("Enter number b");
		lblB.setPreferredSize(dimLBL);
		JTextField jtfB = new JTextField();
		jtfB.setPreferredSize(dimTF);
		row3.add(lblB);
		row3.add(jtfB);
		add(row3);

		JPanel row4 = new JPanel();
		JLabel lblC = new JLabel("Enter number c");
		lblC.setPreferredSize(dimLBL);
		JTextField jtfC = new JTextField();
		jtfC.setPreferredSize(dimTF);
		row4.add(lblC);
		row4.add(jtfC);
		add(row4);

		JPanel row5 = new JPanel();
		JButton btnSolve = new JButton("Enter number c");
		btnSolve.setPreferredSize(dimLBL);
		JTextField jtfSolve = new JTextField();
		jtfSolve.setPreferredSize(dimTF);
		row5.add(btnSolve);
		row5.add(jtfSolve);
		add(row5);

		btnSolve.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				double a = Double.parseDouble(jtfA.getText());
				double b = Double.parseDouble(jtfB.getText());
				double c = Double.parseDouble(jtfC.getText());

				if (a != 0) {
					if (delta(a, b, c) > 0)
						jtfSolve.setText("x1 = "
								+ ((-b + Math.sqrt(delta(a, b, c)) / (2 * a))
										+ "x2 = " + ((-b - Math.sqrt(delta(a,
										b, c)) / (2 * a)))));
					else if (delta(a, b, c) < 0)
						jtfSolve.setText("Phương trình vô nghiệm");
					else if (delta(a, b, c) == 0)
						jtfSolve.setText("x1 = x2 = " + (-b / (2 * a)));

				} else if (b != 0) {
					jtfSolve.setText("x1 = x2 = " + (-c / b));
				} else
					jtfSolve.setText("Phương trình có vô số nghiệm");

			}
		});

		JPanel row6 = new JPanel();
		JButton btnClose = new JButton("Close");
		btnClose.setPreferredSize(new Dimension(355, 25));
		row6.add(btnClose);
		add(row6);
		
		btnClose.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});

		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);

	}

	public static void main(String[] args) {
		new Bai3();
	}

	public static double delta(double a, double b, double c) {
		return (b * b) - (4 * a * c);

	}
}
