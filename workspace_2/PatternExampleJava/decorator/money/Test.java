package money;

public class Test {
	public static void main(String[] args) {

		Currency curr = new Dollar();
		System.out.println(curr.getDescription() + " dollar. " + curr.cost(2.0));

		Currency curr2 = new USDDecorator(new Dollar());
		System.out.println(curr2.getDescription() + " dollar. " + curr2.cost(4.0));

		Currency curr3 = new SGDDecorator(new Dollar());
		System.out.println(curr3.getDescription() + " dollar. " + curr3.cost(4.0));

	}
}
