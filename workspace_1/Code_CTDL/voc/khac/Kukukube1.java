package khac;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.Date;

import javax.imageio.ImageIO;

public class Kukukube1 {
	GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
	GraphicsDevice gs = ge.getScreenDevices()[0];
	Robot robot = new Robot(gs);
	BufferedImage master = null;

	public static void main(String[] args) throws AWTException, InterruptedException {
		new Kukukube1();
	}

	private void logg(String text) {
		System.out.println(new Date().toString() + " - " + text);
	}

	public Kukukube1() throws AWTException, InterruptedException {
		logg("Script started v.1 - 9x9 solver");
		Thread.sleep(1000);
		robot.setAutoDelay(1);
		robot.setAutoWaitForIdle(true);

		createScreenshot("kukukube");
		try {
			master = javax.imageio.ImageIO.read(new File("c:\\tmp\\kukukube.bmp"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		long start = System.currentTimeMillis();
		long end = start + 58 * 1000; // 60 seconds * 1000 ms/sec
		while (System.currentTimeMillis() < end) {
			Point hit = whereIsThatChange();
			if (hit != null) {

				robot.delay(0);
				robot.mouseMove(hit.x, hit.y);
				robot.delay(100);
				leftClick();
				createScreenshot("kukukube");
				try {
					master = javax.imageio.ImageIO.read(new File("c:\\tmp\\kukukube.bmp"));
				} catch (IOException e) {
					e.printStackTrace();
				}
				hit = null;

			}
		}
	}

	private Point whereIsThatChange() {
		int count = 0;
		int col1 = 0;
		Point p1 = null;
		int col2 = 0;
		Point p2 = null;
		int col3 = 0;
		Point p3 = null;

		for (int x = 780; x < 1240; x = x + 56) {
			for (int y = 320; y < 780; y = y + 56) {
				robot.mouseMove(x, y);
				int masterColor = master.getRGB(x, y);
				if (count == 0) {
					col1 = masterColor;
					p1 = new Point(x, y);
				}
				if (count == 1) {
					col2 = masterColor;
					p2 = new Point(x, y);
				}
				if (count == 2) {
					col3 = masterColor;
					p3 = new Point(x, y);
					if (col1 == col2 && col2 == col3) {
						col1 = col2;
						p1 = p2;
						col2 = col3;
						p2 = p3;
						count = 2;
						continue;
					} else {
						if (col1 == col2) {
							logg("Alap: " + col1 + " Eltérő: " + col3);
							return p3;
						} else if (col1 == col3) {
							logg("Alap: " + col1 + " Eltérő: " + col2);
							return p2;
						} else {
							logg("Alap: " + col2 + " Eltérő: " + col1);
							return p1;
						}
					}
				}
				count++;
			}
		}
		return null;
	}

	private void leftClick() {
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.delay(0);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		robot.delay(0);
	}

	private void createScreenshot(String name) {
		try {
			BufferedImage image = new Robot()
					.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
			ImageIO.write(image, "bmp", new File("c:\\tmp\\" + name + ".bmp"));
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
