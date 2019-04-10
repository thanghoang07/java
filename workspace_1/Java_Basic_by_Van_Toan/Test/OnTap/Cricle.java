package OnTap;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Cricle extends JFrame implements ActionListener {
	Drawing dongHo;
	JTextField jtfRadius;
	JButton jbtRadius;

	public Cricle() {
		setTitle("Cricle");
		setLayout(new BorderLayout());

		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(3, 1, 0, 10));
		JLabel lblRaidus = new JLabel("Radius:");
		jtfRadius = new JTextField(15);
		jbtRadius = new JButton("OK");
		p1.add(lblRaidus);
		p1.add(jtfRadius);
		p1.add(jbtRadius);
		add(p1, BorderLayout.NORTH);

		jbtRadius.addActionListener(this);

		JPanel p2 = new JPanel();
		Drawing dongHo = new Drawing();
		p2.add(dongHo);
		add(p2);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(400, 500);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		new Cricle();
	}

	public double chuVi(int r) {
		return r * 2 * Math.PI;
	}

	public double dienTich(int r) {
		return r * r * Math.PI;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int r = Integer.parseInt(jtfRadius.getText());

	}

	public class Drawing extends JPanel {
		int r = Integer.parseInt(jtfRadius.getText());

		public void paintComponent(Graphics g) {
			super.paintComponent(g);

			this.setBackground(Color.WHITE);

			g.drawString("R = " + r, r, r - 1);
			

			g.setFont(new Font("Serif", Font.BOLD, 20));
			g.drawString("S = " + dienTich(r), r * 2, (r * 2) - 1);
			g.drawString("P = " + chuVi(r), r * 2, (r * 2) + 2);
			// graphics 2d
			Graphics2D g2d = (Graphics2D) g;

			g2d.setPaint(new GradientPaint(5, 30, Color.GREEN, 35, 100,
					Color.RED, true));
			g2d.setStroke(new BasicStroke(3.0f));
			g.drawOval(0, 0, r * 2, r * 2);
			g.drawLine(r, r, r * 2, r);

		}
	}
}
