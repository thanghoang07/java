package tuan2;

import java.io.IOException;

// them cac item vao Channel
public class Producer extends Channel implements Runnable {
	int so;

	public void add(int a) {
		queue.add(a);
	}

	public Producer(int so) {
		super();
		this.so = so;
	}

	@Override
	public void run() {
		try {
			while (so < 10) {
				queue.add(++so);
				System.out.println("Product: " + queue.size());
				Thread.sleep(400);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
