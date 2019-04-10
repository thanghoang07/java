package util;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageCaro {
	private Image image = null;
	private File file = null;
	
	public Image getImage(String name) {
		String source = "img\\" + name + ".png";
		file = new File(source);
		try {
			image = ImageIO.read(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return image;
	}
}
