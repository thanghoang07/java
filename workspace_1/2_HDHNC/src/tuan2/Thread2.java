package tuan2;

public class Thread2 extends Thread implements Runnable {

	int count1;
	int count2;

	public Thread2(int count1, int count2) {
		this.count1 = count1;
		this.count2 = count2;
	}

	// thoi gian su ly 1000
	@Override
	public void run() {
		try {
			while (true) {
				System.out.println("count 1 = " + plusC1());
				Thread.sleep(1000);
				System.out.println("count 2 = " + plusC2());
				Thread.sleep(1500);

			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private int plusC1() {

		return count1++;
	}

	private int plusC2() {

		return count1++;
	}
}
