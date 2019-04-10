package bai1;

import java.util.concurrent.locks.Lock;

public class A implements Runnable {
	private Lock first, second;

	public A(Lock first, Lock second) {
		this.first = first;
		this.second = second;
	}

	public void run() {
		try {
			// cho A chạy cả hai lọk trước - cách 2
			
			first.lock();
			System.out.println("Thread A got first lock.");
			// do something

			try {
				Thread.sleep(((int) (3 * Math.random())) * 1000);
			} catch (InterruptedException e) {
			}
			// lấy ra rồi thì unlock nó đi - cách 1
			first.unlock();
			//
			second.lock();
			System.out.println("Thread A got second lock.");
			// do something

		} finally {
			// first.unlock();
			second.unlock();
		}
	}
}
