package khac;

import java.awt.AWTException;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.image.BufferedImage;
import java.util.Date;

public class Kukukube2 {
	GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
	GraphicsDevice gs = ge.getScreenDevices()[0];
	Robot robot = new Robot(gs);
	BufferedImage master = null;

	public static void main(String[] args) throws AWTException,
			InterruptedException {
		new Kukukube2();
	}

	private void logg(String text) {
		System.out.println(new Date().toString() + " - " + text);
	}

	public Kukukube2() throws AWTException, InterruptedException {
		logg("Script started v.2 - brainless");
		Thread.sleep(1000);
		robot.setAutoDelay(1);
		robot.setAutoWaitForIdle(true);

		long start = System.currentTimeMillis();
		long end = start + 58 * 1000; // 60 seconds * 1000 ms/sec
		while (System.currentTimeMillis() < end) {
			whereIsThatChange();
		}
	}

	private Point whereIsThatChange() {
		for (int x = 780; x < 1240; x = x + 56) {
			for (int y = 320; y < 780; y = y + 56) {
				robot.mouseMove(x, y);
				leftClick();
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

}