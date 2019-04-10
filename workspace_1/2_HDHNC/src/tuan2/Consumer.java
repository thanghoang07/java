package tuan2;

import java.util.ArrayList;
import java.util.List;

// xuat ra( tieu thu) item
public class Consumer extends Channel implements Runnable {
	int item;
	public List<Integer> listItem;
	public Channel cha;

	public Consumer() {
		super();
	}

	public void all(int item) {
		queue.add(item);
	}

	@Override
	public void run() {
		try {
			while (!queue.isEmpty()) {
				queue.remove();
				System.out.println("Consumer: " + queue.size());
				Thread.sleep(800);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
