package Graphics;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestPaintComponent extends JFrame {
	int x[] = { 40, 70, 60, 45, 20 };
	int y[] = { 20, 40, 80, 45, 60 };

	public TestPaintComponent() {
		super("TestPaintComponent");

		add(new paint());

		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		new TestPaintComponent();
	}

	public class paint extends JPanel {
		@Override
		protected void paintComponent(Graphics gra) {
			super.paintComponents(gra);
			gra.drawString("Banner", 50, 50);
			gra.drawLine(0, 0, 100, 100);
			gra.drawRect(70, 70, 20, 20);
			gra.fillRect(40, 40, 30, 30);
			gra.drawRoundRect(100, 100, 40, 40, 30, 30);
			gra.fillRoundRect(120, 120, 40, 40, 30, 30);
			gra.draw3DRect(100, 50, 40, 40, true);
			gra.drawOval(30, 140, 30, 30);
			gra.drawArc(50, 160, 40, 40, 20, 60);
			gra.fillArc(100, 80, 60, 60, 0, 50);
			gra.drawPolyline(x, y, x.length);
			
			gra.setFont(new Font("Serif", Font.ITALIC, 14));
			gra.drawString("Serif 14 point bold", 20, 200);
		}
	}
}
