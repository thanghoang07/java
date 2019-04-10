package demo;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class DoiTien extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8459979286400010662L;
	
	JTextField txtMount, txtYear, txtFuruteRate, txtFuruteValue;
	JRadioButton jrbUSD, jrbVND;

	public DoiTien()
	{
		super("Bank Management");//
		BoxLayout b1 = new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS);
		this.setLayout(b1);

		Dimension dimLabel = new Dimension(120, 20);
		Dimension dimWith = new Dimension(150, 20);

		// radio butto
		JPanel row0 = new JPanel();
		jrbUSD = new JRadioButton("USD");
		jrbVND = new JRadioButton("VND");
		ButtonGroup btg = new ButtonGroup();
		btg.add(jrbUSD);
		btg.add(jrbVND);
		row0.add(jrbUSD);
		row0.add(jrbVND);
		add(row0);

		// row 2J
		JPanel row1 = new JPanel();
		JLabel lblRow1 = new JLabel("Invessent Amount");
		lblRow1.setPreferredSize(dimLabel);
		row1.add(lblRow1);

		txtMount = new JTextField();
		txtMount.setPreferredSize(dimWith);
		row1.add(txtMount);
		add(row1);

		// row 2J
		JPanel row2 = new JPanel();
		JLabel lblRow2 = new JLabel("Invessent Amount");
		lblRow2.setPreferredSize(dimLabel);
		row2.add(lblRow2);

		txtYear = new JTextField();
		txtYear.setPreferredSize(dimWith);
		row2.add(txtYear);
		add(row2);

		// row 2J
		JPanel row3 = new JPanel();
		JLabel lblRow3 = new JLabel("Invessent Amount");
		lblRow3.setPreferredSize(dimLabel);
		row3.add(lblRow3);

		txtFuruteRate = new JTextField();
		txtFuruteRate.setPreferredSize(dimWith);
		row3.add(txtFuruteRate);
		add(row3);

		// row 2J
		JPanel row4 = new JPanel();
		JLabel lblRow4 = new JLabel("Invessent Amount");
		lblRow4.setPreferredSize(dimLabel);
		row4.add(lblRow4);

		txtFuruteValue = new JTextField();
		txtFuruteValue.setPreferredSize(dimWith);
		txtFuruteValue.setEditable(false);
		row4.add(txtFuruteValue);
		add(row4);

		// row5
		JPanel row5 = new JPanel();
		JButton btnCal = new JButton("Calculate");
		btnCal.setIcon(new ImageIcon("hinh/Untitled.png"));
		row5.add(btnCal);
		add(row5);

		btnCal.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				try 
				{
					double amount = Double.parseDouble(txtMount.getText());
					double year = Double.parseDouble(txtYear.getText()) * 12;
					double rate = Double.parseDouble(txtFuruteRate.getText()) / 100;
					double result = Calcute(amount, rate, year);
					if (jrbUSD.isSelected())
						txtFuruteValue.setText("$ "
								+ String.format("%,.2f", result));
					else if (jrbVND.isSelected())
						txtFuruteValue.setText("VND "
								+ String.format("%,.2f", result));
				} 
				catch (Exception e)
				{
					JOptionPane
							.showMessageDialog(txtMount, "Chua nhap gia tri");					
				}

			}
		});

		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);
	}
	public static void main(String[] args)
	{
		new DoiTien();
	}
	public double Calcute(double amount, double rate, double year)
	{
		return amount * Math.pow((1 + rate), year);
	}
}
