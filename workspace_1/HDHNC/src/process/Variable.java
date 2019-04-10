package process;

public class Variable implements Runnable {
	private int count;

	public Variable() {
		super();
		this.count = 0;
	}

	public int plus() {
		return count++;
	}

	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		plus();
		System.out.println(count);
	}

}
