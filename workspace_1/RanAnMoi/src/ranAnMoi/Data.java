package ranAnMoi;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class Data {
	// cat hinh
	public static BufferedImage sprite;
	// hình đầu trái
	public static Image imgHead_GoLeft;
	// hình đầu phải
	public static Image imgHead_GoRight;
	// hình đầu hướng lên
	public static Image imgHead_GoUp;
	// hình đầu hướng xuống
	public static Image imgHead_GoDown;
	// hình đầu
	public static Image imgHead;
	// hình body
	public static Image imgBody;
	// hình con mồi
	public static Image imgWorm, imgWorm2, imgWorm3;
	// tạo animation đầu chuyển động lên trên
	public static Animation HeadGoUp;
	// tạo animation đầu chuyển động xuống dưới
	public static Animation HeadGoDown;
	// tạo animation đầu chuyển động qua phải
	public static Animation HeadGoRight;
	// tạo animation đầu chuyển động qua trái
	public static Animation HeadGoLeft;
	// tạo animation đầu chuyển động con mồi
	public static Animation Worm;

	public static void loadImage() {
		try {

			sprite = ImageIO.read(new File("SnakeProject1/sprite1.png"));

			imgHead = sprite.getSubimage(2, 3, 30, 30);
			imgBody = sprite.getSubimage(6, 79, 20, 20);

			imgHead_GoLeft = sprite.getSubimage(75, 3, 30, 30);
			imgHead_GoRight = sprite.getSubimage(110, 3, 30, 30);
			imgHead_GoUp = sprite.getSubimage(145, 3, 30, 30);
			imgHead_GoDown = sprite.getSubimage(39, 3, 30, 30);

			imgWorm = sprite.getSubimage(2, 40, 30, 30);
			imgWorm2 = sprite.getSubimage(32, 40, 30, 30);
			imgWorm3 = sprite.getSubimage(63, 40, 30, 30);
		} catch (Exception e) {
		}
	}

	public static void loadAllAnim() {
		HeadGoUp = new Animation();
		HeadGoUp.addImage(imgHead);
		HeadGoUp.addImage(imgHead_GoUp);

		HeadGoDown = new Animation();
		HeadGoDown.addImage(imgHead);
		HeadGoDown.addImage(imgHead_GoDown);

		HeadGoRight = new Animation();
		HeadGoRight.addImage(imgHead);
		HeadGoRight.addImage(imgHead_GoRight);

		HeadGoLeft = new Animation();
		HeadGoLeft.addImage(imgHead);
		HeadGoLeft.addImage(imgHead_GoLeft);

		Worm = new Animation();
		Worm.addImage(imgWorm);
		Worm.addImage(imgWorm2);
		Worm.addImage(imgWorm3);
		Worm.addImage(imgWorm2);
	}
}