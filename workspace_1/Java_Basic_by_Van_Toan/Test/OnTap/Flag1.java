package OnTap;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Flag1 extends JFrame {
	private JLabel lblHinh;

	public Flag1() {
		super("Flag");
		setLayout(new BorderLayout());

//		Dimension dimBTN = new Dimension(100, 100);

		JPanel p1 = new JPanel();
		p1.setLayout(new FlowLayout(FlowLayout.LEFT));
		p1.setBorder(BorderFactory.createLineBorder(Color.RED));
		JButton btnPrint = new JButton(new ImageIcon("hinh/print.png"));
		JButton btnSave = new JButton(new ImageIcon("hinh/save.png"));
		p1.add(btnPrint);
		p1.add(btnSave);
		add(p1, BorderLayout.NORTH);

		JPanel p2 = new JPanel();
		p2.setLayout(new BoxLayout(p2, BoxLayout.Y_AXIS));
		p2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		JButton btnUS = new JButton("US");
		JButton btnCanada = new JButton("Canada");
		JButton btnAu = new JButton("Australia");
		JButton btnNor = new JButton("Norway");
		JButton btnGer = new JButton("Germany");
//		btnUS.setPreferredSize(dimBTN);
//		btnCanada.setPreferredSize(dimBTN);
//		btnAu.setPreferredSize(dimBTN);
//		btnNor.setPreferredSize(dimBTN);
//		btnGer.setPreferredSize(dimBTN);
		p2.add(btnUS);
		p2.add(btnCanada);
		p2.add(btnAu);
		p2.add(btnNor);
		p2.add(btnGer);
		add(p2, BorderLayout.EAST);

		btnUS.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				lblHinh.setIcon(new ImageIcon("hinh/America.png"));
			}
		});

		btnCanada.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				lblHinh.setIcon(new ImageIcon("hinh/Canada.gif"));
			}
		});

		btnAu.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				lblHinh.setIcon(new ImageIcon("hinh/australia.gif"));
			}
		});
		btnNor.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				lblHinh.setIcon(new ImageIcon("hinh/norway.png"));
			}
		});
		btnGer.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				lblHinh.setIcon(new ImageIcon("hinh/germany.jpg"));
			}
		});

		JPanel p3 = new JPanel();
		lblHinh = new JLabel();
		p3.add(lblHinh);
		add(p3, BorderLayout.CENTER);

		setSize(450, 350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		new Flag1();
	}
}
