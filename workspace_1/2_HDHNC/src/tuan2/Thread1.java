package tuan2;

public class Thread1 extends Thread {
	int count1;
	int count2;

	public Thread1(int count1, int count2) {
		this.count1 = count1;
		this.count2 = count2;
	}

	// thoi gian su ly 500
	@Override
	public void run() {
		try {
			while (true) {
				System.out.println("count 1 = " + plusC1());
				Thread.sleep(500);
				System.out.println("count 2 = " + plusC2());
				Thread.sleep(1000);

			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public int plusC1() {
		return count1++;
	}

	public int plusC2() {
		return count2++;
	}
}
