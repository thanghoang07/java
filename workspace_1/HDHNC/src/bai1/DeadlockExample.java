package bai1;

import java.util.concurrent.locks.*;

public class DeadlockExample {
	public static void main(String arg[]) {
		Lock lockX = new ReentrantLock();
		Lock lockY = new ReentrantLock();
		//
		Thread threadA = new Thread(new A(lockX, lockY));
		Thread threadB = new Thread(new B(lockX, lockY));
		//
		
		threadA.start();
//		threadA.stop();
		threadB.start();
	}
}
