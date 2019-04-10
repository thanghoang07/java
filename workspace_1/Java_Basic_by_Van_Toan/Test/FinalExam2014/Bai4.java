package FinalExam2014;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Bai4 extends JFrame {
	JTextField jtfRate, jtfYear, jtfAmount, jtfMonthly, jtfTotal;
	
	public Bai4() {
		super("Loan calculator");
		setLayout(new BorderLayout());

		// Jpanel 1
		JPanel p1 = new JPanel();
		p1.setBorder(BorderFactory
				.createTitledBorder("Enter inferest rate, year and loand amount"));
		// BoxLayout b1 = new BoxLayout(getContentPane(), BoxLayout.Y_AXIS);
		p1.setLayout(new GridLayout(5, 2));
		JLabel lblRate = new JLabel("Interest Rate (e.g., 5.5 for 5.5%)");
		jtfRate = new JTextField(15);
		JLabel lblYear = new JLabel("Years");
		jtfYear = new JTextField(15);
		JLabel lblAmount = new JLabel("Loan Amount");
		jtfAmount = new JTextField(15);
		JLabel lblMonthly = new JLabel("Monthly Payment");
		jtfMonthly = new JTextField(15);
		jtfMonthly.setEditable(false);
		JLabel lblTotal = new JLabel("Total Payment");
		jtfTotal = new JTextField(15);
		jtfTotal.setEditable(false);
		p1.add(lblRate);
		p1.add(jtfRate);
		p1.add(lblYear);
		p1.add(jtfYear);
		p1.add(lblAmount);
		p1.add(jtfAmount);
		p1.add(lblMonthly);
		p1.add(jtfMonthly);
		p1.add(lblTotal);
		p1.add(jtfTotal);
		add(p1, BorderLayout.CENTER);

		// Jpanel 2
		JPanel p2 = new JPanel();
		p2.setLayout(new FlowLayout(FlowLayout.RIGHT));
		JButton jbtCompute = new JButton("Compute Payment");
		p2.add(jbtCompute);
		add(p2, BorderLayout.SOUTH);

		setSize(380, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		new Bai4();
	}
}
