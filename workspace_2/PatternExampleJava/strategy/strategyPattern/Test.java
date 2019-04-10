package strategyPattern;

public class Test {
	public static void main(String[] args) {
		Context ct = new Context(new Add());
		// ban dau
		System.out.println("cong: " + ct.executeStrategy(10, 12));
		// set lai
		ct.setLaiStrategy(new Multiphy());
		System.out.println("nhan: " + ct.executeStrategy(10, 12));
	}
}
