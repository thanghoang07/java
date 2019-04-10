package human;

import java.awt.Image;
import java.io.File;

import javax.swing.ImageIcon;

public class MyImage {
	private String urlImage = File.separator + "human"
			+ File.separator + "images" + File.separator;
	public Image imgCross;
	public Image imgNought;

	public MyImage() {
		int size = CaroGraphics.sizeCell - 2;
		imgCross = reSizeImage(getMyImageIcon("cross.png"), size, size);
		imgNought = reSizeImage(getMyImageIcon("nought.png"), size, size);
	}

	public Image reSizeImage(Image image, int width, int height) {
		image = new ImageIcon(image.getScaledInstance(width, height,
				imgCross.SCALE_SMOOTH)).getImage();
		return image;
	}

	public Image getMyImageIcon(String nameImageIcon) {
		Image ii = new ImageIcon(getClass().getClassLoader().getResource(
				urlImage + nameImageIcon)).getImage();
		return ii;
	}
}
