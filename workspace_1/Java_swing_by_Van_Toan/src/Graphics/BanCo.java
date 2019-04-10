package Graphics;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class BanCo extends JFrame {
	public BanCo() {
		super("Caro");

		add(new Paint());

		setSize(218,240);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		new BanCo();
	}

	class Paint extends JPanel {
		@Override
		protected void paintComponent(Graphics g) {

			super.paintComponent(g);

			g.fillRect(0, 0, 200, 200);
			for (int i = 0; i < 200; i += 100) {
				for (int j = 0; j < 200; j += 100) {
					g.clearRect(i, j, 50, 50);
				}
			}
			for (int i = 50; i < 200; i += 100) {
				for (int j = 50; j < 200; j += 100) {
					g.clearRect(i, j, 50, 50);
				}
			}
			
//			g.fillRect(0, 0, 200, 200);
//			for (int i = 50; i < 200; i += 100) {
//				for (int j = 0; j < 200; j += 100) {
//					g.clearRect(i, j, 50, 50);
//				}
//			}
//			for (int i = 0; i < 200; i += 100) {
//				for (int j = 50; j < 200; j += 100) {
//					g.clearRect(i, j, 50, 50);
//				}
//			}
		}
	}
}
