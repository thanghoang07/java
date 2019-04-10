package starbuzz;

public class Test {
	public static void main(String[] args) {
		Bevarage b1 = new DarkRoast("Da",false, true, false, false);
		System.out.println(b1.getDescription());
		System.out.println(b1.cost());
	}
}
