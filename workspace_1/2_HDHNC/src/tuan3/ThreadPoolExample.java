package tuan3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Thread pool  
 */
public class ThreadPoolExample {
	public static void main(String[] args) {
		// Executors cung mot luc va chay cai thread nao truoc thi do CPU 
		
		ExecutorService pool = Executors.newCachedThreadPool();
		for (int i = 0; i < 10; i++) {
			pool.execute(new Task(i));
		}
		// sleep for 5 sec
		pool.shutdown();
	}
}

class Task implements Runnable {
	private int order;

	public Task(int order) {
		super();
		this.order = order;
	}

	public void run() {

		try {
			while (true) {
				System.out.printf("I am working on a task %d. \n", order);
				Thread.sleep(50);
			}
		} catch (InterruptedException e) {
			/*
			 * // TODO Auto-generated catch block e.printStackTrace();
			 */
			System.out.println(e.toString());
		}
	}
}