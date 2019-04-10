package tuan1;

public class ThreadExample extends Thread {
	private int count;

	public ThreadExample(int count) {
		this.count = count;
	}
	@Override
	public void run() {
		while (true) {
			count++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(count);
		}
	}

	/*public void run() {
		while (true) {
			count++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(count);
		}
	}*/
	public static void main(String[] args) throws Exception{
		ThreadExample t = new ThreadExample(0);
		System.out.println(t.isAlive());
		t.start();
		ThreadExample t2 = new ThreadExample(1023);
		System.out.println(t2.isAlive());
		t2.run();
		System.out.println(t.isAlive());
	}
}
