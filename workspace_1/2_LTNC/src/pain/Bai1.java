package pain;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Bai1 extends JFrame {
	private JPanel panl2;

	public Bai1() {
		super("Graphics");

		createGUI();

		setSize(450, 450);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);
	}

	public void createGUI() {
		JPanel panl1 = new JPanel();

		JButton btm1 = new PainButton(PainButton.REC);
		btm1.setPreferredSize(new Dimension(30, 30));
		btm1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				panl2 = new PainPanel(PainPanel.REC);
				panl2.setBackground(Color.ORANGE);
				add(panl2, BorderLayout.CENTER);
				revalidate();
			}
		});

		JButton btm2 = new PainButton(PainButton.OVA);
		btm2.setPreferredSize(new Dimension(30, 30));
		btm2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				panl2 = new PainPanel(PainPanel.OVA);
				panl2.setBackground(Color.GREEN);
				add(panl2, BorderLayout.CENTER);
				revalidate();
			}
		});

		JButton btm3 = new PainButton(PainButton.LIN);
		btm3.setPreferredSize(new Dimension(30, 30));
		btm3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				panl2 = new PainPanel(PainPanel.LIN);
				panl2.setBackground(Color.RED);
				add(panl2, BorderLayout.CENTER);
				revalidate();
			}
		});

		panl1.add(btm1);
		panl1.add(btm2);
		panl1.add(btm3);
		panl2 = new JPanel();
		this.add(panl1, BorderLayout.NORTH);
		this.add(panl2, BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		new Bai1();
	}
}

class PainPanel extends JPanel {
	public static final int REC = 1;
	public static final int OVA = 2;
	public static final int LIN = 3;
	private int type = 0;

	public PainPanel(int type) {
		super();
		this.type = type;
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.BLACK);
		switch (type) {
		case 1:
			g.drawRect(10, 10, 150, 250);
			break;
		case 2:
			g.drawOval(10, 10, 150, 250);
			break;
		case 3:
			g.drawLine(10, 10, 150, 250);
			break;
		default:
			break;
		}
	}
}

class PainButton extends JButton {
	public static final int REC = 1;
	public static final int OVA = 2;
	public static final int LIN = 3;
	int type = 0;

	public PainButton(int type) {
		super();
		this.type = type;
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.GRAY);
		switch (type) {
		case 1:
			g.drawRect(5, 5, getPreferredSize().width - 10, getPreferredSize().height - 10);
			break;
		case 2:
			g.drawOval(5, 5, getPreferredSize().width - 10, getPreferredSize().height - 10);
			break;
		case 3:
			g.drawLine(5, 5, 10, 10);
			break;
		default:
			break;
		}
	}
}
