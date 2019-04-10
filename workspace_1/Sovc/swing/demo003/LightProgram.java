package demo003;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;

public class LightProgram extends JFrame implements ActionListener {
	private Drawing lblRedDraw, lblGreenDraw, lblYellowDraw;
	JLabel lblDo, lblXanh, lblVang;
	JRadioButton rbDo, rbXanh, rbVang;
	JPanel pnl1, pnl2, pnlGraphics;
	//Border titale = BorderFactory.createTitledBorder("Thay đổi tín hiệu đèn giao thông");

	public LightProgram(String title) {
		super(title);
		setLayout(new GridLayout(3, 1));

		// panel 1
		pnl1 = new JPanel();
		pnl1.setBorder(BorderFactory.createTitledBorder("Thay đổi tín hiệu đèn giao thông"));
		pnl1.setLayout(new GridLayout(3, 1));
		lblDo = new JLabel("- Đỏ");
		lblXanh = new JLabel("- Xanh");
		lblVang = new JLabel("- Vàng");
		pnl1.add(lblDo);
		pnl1.add(lblXanh);
		pnl1.add(lblVang);
		add(pnl1);

		// panel 2
		pnl2 = new JPanel();
		pnl2.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel lblChon = new JLabel("Chọn loại đèn:");
		rbDo = new JRadioButton("Đỏ");
		rbXanh = new JRadioButton("Xanh");
		rbVang = new JRadioButton("Vàng");
		ButtonGroup bg = new ButtonGroup();
		pnl2.add(lblChon);
		pnl2.add(rbDo);
		pnl2.add(rbXanh);
		pnl2.add(rbVang);
		bg.add(rbDo);
		bg.add(rbXanh);
		bg.add(rbVang);
		add(pnl2);

		// panel graphics
		pnlGraphics = new JPanel(new GridLayout(1, 3));
		lblRedDraw = new Drawing();
		lblGreenDraw = new Drawing();
		lblYellowDraw = new Drawing();
		pnlGraphics.add(lblRedDraw);
		pnlGraphics.add(lblGreenDraw);
		pnlGraphics.add(lblYellowDraw);
		add(pnlGraphics);

		rbDo.addActionListener(this);
		rbXanh.addActionListener(this);
		rbVang.addActionListener(this);

		setSize(500, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new LightProgram("Traffic Light Program");
	}

	public class Drawing extends JLabel {
		private Color color = Color.GRAY;

		public void setColor(Color c) {
			color = c;
			repaint();
		}

		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(color);
			g.fillOval(5, 5, 65, 65);
			
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (rbDo.isSelected()) {
			lblDo.setText("- Đỏ: Bạn chọn đèn màu đỏ");
			//
			lblDo.setForeground(Color.RED);
			lblXanh.setForeground(Color.BLACK);
			lblVang.setForeground(Color.BLACK);
			//
			lblXanh.setText("- Xanh");
			lblVang.setText("- Vàng");
			//
			lblRedDraw.setColor(Color.RED);
			lblGreenDraw.setColor(Color.GRAY);
			lblYellowDraw.setColor(Color.GRAY);
			//
			rbDo.setForeground(Color.RED);
			rbXanh.setForeground(Color.BLACK);
			rbVang.setForeground(Color.BLACK);
			//
			Border cop1 = BorderFactory.createLineBorder(Color.RED);
			pnl1.setBorder(BorderFactory.createTitledBorder(cop1, "Thay đổi tín hiệu đèn giao thông"));
		} else if (rbXanh.isSelected()) {
			lblXanh.setText("- Xanh: Bạn chọn đèn màu xanh");
			//
			lblDo.setForeground(Color.BLACK);
			lblXanh.setForeground(Color.GREEN);
			lblVang.setForeground(Color.BLACK);
			//
			lblDo.setText("- Đỏ");
			lblVang.setText("- Vàng");
			// 
			lblGreenDraw.setColor(Color.GREEN);
			lblYellowDraw.setColor(Color.GRAY);
			lblRedDraw.setColor(Color.GRAY);
			//
			rbDo.setForeground(Color.BLACK);
			rbXanh.setForeground(Color.GREEN);
			rbVang.setForeground(Color.BLACK);
			//
			Border cop2 = BorderFactory.createLineBorder(Color.GREEN);
			pnl1.setBorder(BorderFactory.createTitledBorder(cop2, "Thay đổi tín hiệu đèn giao thông"));
		} else {
			lblVang.setText("- Vàng: Bạn chọn đèn màu vàng");
			//
			lblDo.setForeground(Color.BLACK);
			lblXanh.setForeground(Color.BLACK);
			lblVang.setForeground(Color.YELLOW);
			//
			lblDo.setText("- Đỏ");
			lblXanh.setText("- Xanh");
			// 
			lblYellowDraw.setColor(Color.YELLOW);
			lblRedDraw.setColor(Color.GRAY);
			lblGreenDraw.setColor(Color.GRAY);
			//
			rbDo.setForeground(Color.BLACK);
			rbXanh.setForeground(Color.BLACK);
			rbVang.setForeground(Color.YELLOW);
			//
			Border cop3 = BorderFactory.createLineBorder(Color.YELLOW);
			pnl1.setBorder(BorderFactory.createTitledBorder(cop3, "Thay đổi tín hiệu đèn giao thông"));
		}

	}
}
