package swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Bai0 extends JFrame implements ActionListener {
	private JPanel panl1, panl2;
	private JTextField txt1;
	private JLabel lbl1, lbl2;
	private JButton btm1;
	private int size = 7;

	public static double convertCtoF(double cel) {
		double fah = 0;
		fah = (cel * 1.8) + 32;
		return fah;
	}

	public Bai0() {
		super("Convert C to F");
		createGUI();
		setLayout(new FlowLayout(FlowLayout.LEFT));
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(250, 120);
		setLocation(200, 100);
		setLocationRelativeTo(null);
		
	}

	public void createGUI() {
		panl1 = new JPanel();
		txt1 = new JTextField(size);
		lbl1 = new JLabel("Celsius");
		btm1 = new JButton("Convert");
		btm1.addActionListener(this);
		panl2 = new JPanel();
		lbl2 = new JLabel("Fahrenheit");
		panl1.add(txt1, BorderLayout.WEST);
		panl1.add(lbl1);
		panl2.add(btm1, BorderLayout.WEST);
		panl2.add(lbl2);
		this.add(panl1, BorderLayout.NORTH);
		this.add(panl2, BorderLayout.SOUTH);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btm1) {
			double cel = Double.parseDouble(txt1.getText());
			lbl2.setText(convertCtoF(cel) + "Fahrenheit");
		}

	}

	public static void main(String[] args) {
		new Bai0();
	}
}
