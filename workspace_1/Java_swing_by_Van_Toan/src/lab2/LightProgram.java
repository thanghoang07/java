package lab2;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class LightProgram extends JFrame implements ActionListener {
	private Drawing lblRedDraw, lblGreenDraw, lblYellowDraw;
	JLabel lblDo, lblXanh, lblVang;
	JRadioButton rbDo, rbXanh, rbVang;

	public LightProgram(String title) {
		super(title);
		setLayout(new GridLayout(3, 1));

		// panel 1
		JPanel pnl1 = new JPanel();
		pnl1.setBorder(BorderFactory
				.createTitledBorder("Thay đổi tín hiệu đèn giao thông"));
		pnl1.setLayout(new GridLayout(3, 1));
		lblDo = new JLabel("- Đỏ");
		lblXanh = new JLabel("- Xanh");
		lblVang = new JLabel("- Vàng");
		pnl1.add(lblDo);
		pnl1.add(lblXanh);
		pnl1.add(lblVang);
		add(pnl1);

		// panel 2
		JPanel pnl2 = new JPanel();
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
		JPanel pnlGraphics = new JPanel(new GridLayout(1, 3));
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
		private Color color = Color.gray;

		public void setColor(Color c) {
			color = c;
			repaint();
		}

		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(color);
			g.fillOval(10, 10, 50, 50);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (rbDo.isSelected()) {
			lblDo.setText("- Đỏ:Bạn chọn đèn màu đỏ");
			lblXanh.setText("- Xanh");
			lblVang.setText("- Vàng");
			lblRedDraw.setColor(Color.RED);
			lblGreenDraw.setColor(Color.GRAY);
			lblYellowDraw.setColor(Color.GRAY);
		} else {
			if (rbXanh.isSelected()) {
				lblXanh.setText("- Xanh:Bạn chọn đèn màu xanh");
				lblDo.setText("- Đỏ");
				lblVang.setText("- Vàng");
				lblGreenDraw.setColor(Color.GREEN);
				lblYellowDraw.setColor(Color.GRAY);
				lblRedDraw.setColor(Color.GRAY);
			} else {
				lblVang.setText("- Vàng:Bạn chọn đèn màu vàng");
				lblDo.setText("- Đỏ");
				lblXanh.setText("- Xanh");
				lblYellowDraw.setColor(Color.YELLOW);
				lblRedDraw.setColor(Color.GRAY);
				lblGreenDraw.setColor(Color.GRAY);
			}
		}
	}
}
