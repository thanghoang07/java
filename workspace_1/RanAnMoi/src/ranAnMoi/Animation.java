package ranAnMoi;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

public class Animation {
	// mang chua cac tam hinh
	public Image[] images;
	public int n, currentImage;

	public Animation() {
		n = 0;
		currentImage = 0;
	}

	public void addImage(Image image) {
		Image[] ar = images;
		images = new Image[n + 1];

		for (int i = 0; i < n; i++)
			images[i] = ar[i];
		images[n] = image;
		n++;
	}

	public void update() {
		currentImage++;
		if (currentImage >= n)
			currentImage = 0;
	}

	public Image getCurrentImage() {
		return images[currentImage];
	}
}
