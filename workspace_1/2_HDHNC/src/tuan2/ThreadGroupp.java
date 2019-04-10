package tuan2;

public class ThreadGroupp {
	public static void main(String[] args) {
		ThreadGroup tg = new ThreadGroup("sub Group 1");
		Thread t1 = new Thread(tg, "thread 1");
		Thread t2 = new Thread(tg, "thread 2");
		Thread t3 = new Thread(tg, "thread 3");
		tg = new ThreadGroup("sub Group 2");
		Thread t4 = new Thread(tg, "thread 4");
		tg = Thread.currentThread().getThreadGroup();
		int agc = tg.activeCount();
		int agc2 = tg.activeGroupCount();
		tg.interrupt();
		System.out.println("|" + tg.getName() + " |" + agc + " |" + agc2 + " |");
		
		tg.list();
	}
}
