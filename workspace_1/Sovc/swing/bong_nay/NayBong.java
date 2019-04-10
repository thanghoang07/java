package bong_nay;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class NayBong extends JPanel {

	public NayBong() {
		add(new NayBongPanel());
	}

	public static void main(String[] args) {
		JFrame nayBong = new JFrame("Nay Bong Demo");
		nayBong.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		nayBong.setContentPane(new NayBongPanel());
		nayBong.getContentPane().setPreferredSize(new Dimension(400, 400));

		nayBong.pack();
		nayBong.setVisible(true);
	}
}
