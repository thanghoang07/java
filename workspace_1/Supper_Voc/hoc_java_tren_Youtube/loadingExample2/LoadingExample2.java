package loadingExample2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author phamn
 */
public class LoadingExample2 extends JFrame {
	private LoadingScreen loadingScreen;
	private JButton start;

	public LoadingExample2() {
		setSize(500, 150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		loadingScreen = new LoadingScreen();
		add(loadingScreen, BorderLayout.CENTER);
		start = new JButton("Start Loading");
		start.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				loadingScreen.start();
			}
		});
		add(start, BorderLayout.SOUTH);

	}

	public static void main(String[] args) {
		LoadingExample2 f = new LoadingExample2();
		f.setVisible(true);
	}

	private class LoadingScreen extends JPanel {
		private LoadingThread loadingThread;
		private int steps = 0;
		private int sleepTime = 0;

		public LoadingScreen() {

		}

		public void start() {
			start.setEnabled(false);
			loadingThread = new LoadingThread(this);
			loadingThread.start();
		}

		public void stop() {
			start.setEnabled(true);
			steps = 0;
			loadingThread.stop();
			loadingThread = null;
		}

		public void update() {
			switch (steps) {
			case 0:
				sleepTime = 300;
				steps++;
				break;
			case 1:
				sleepTime = 300;
				steps++;
				break;
			case 2:
				sleepTime = 500;
				steps++;
				break;
			case 3:
				sleepTime = 320;
				steps++;
				break;
			case 4:
				sleepTime = 200;
				steps++;
				break;
			case 5:
				sleepTime = 300;
				steps++;
				break;
			case 6:
				sleepTime = 300;
				steps++;
				break;
			case 7:
				sleepTime = 300;
				steps++;
				break;
			case 8:
				sleepTime = 300;
				steps++;
				break;
			case 9:
				sleepTime = 300;
				steps++;
				break;
			case 10:
				sleepTime = 300;
				steps++;
				break;
			case 11:
				stop();
				steps++;
				break;
			}
			//System.out.println(String.valueOf(steps));
		}

		public void paint(Graphics g) {
			g.setColor(Color.WHITE);
			g.fillRect(0, 0, this.getWidth(), this.getHeight());
			g.setColor(Color.WHITE);
			g.fillRect(0, 20, this.getWidth(), 30);
			g.setColor(Color.GREEN);
			g.fillRect(0, 20, this.getWidth() / 11 * steps, 30);
		}
	}

	private class LoadingThread extends Thread {
		LoadingScreen lsc;

		public LoadingThread(LoadingScreen lsc) {
			this.lsc = lsc;
		}

		public void run() {
			while (true) {
				lsc.update();
				lsc.repaint();
				try {
					sleep(lsc.sleepTime);
				} catch (InterruptedException ex) {
					Logger.getLogger(LoadingExample2.class.getName()).log(Level.SEVERE, null, ex);
				}
			}
		}
	}
}
