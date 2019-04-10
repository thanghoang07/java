package process;

public class Test {
	public static void main(String[] args) {
		Variable ex = new Variable();
		Thread t1 = new Thread(ex);
		Thread t2 = new Thread(ex);

		t1.start();
		t2.start();
	}
}
