package bai1;

import java.util.concurrent.locks.Lock;

public class B implements Runnable {
	private Lock first, second;

	public B(Lock first, Lock second) {
		this.first = first;
		this.second = second;
	}

	public void run() {
		try {
			second.lock();
			System.out.println("Thread B got second lock.");
			// do something

			try {
				Thread.sleep(((int) (3 * Math.random())) * 1000);
			} catch (InterruptedException e) {
			}
			// lấy ra rồi thì unlock nó đi - cách 1
			second.unlock();
			//
			first.lock();
			System.out.println("Thread B got first lock.");
			// do something

		} finally {
			// second.unlock();
			first.unlock();
		}
	}
}