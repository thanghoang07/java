package pizzaAbstactFactory;

public class Test {
	public static void main(String[] args) {
		PizzaStore NY = new NYSPizzaStore();
		PizzaStore CH = new ChicagoPizzaStore();
		
		Pizza pi = NY.orderPizza("cheese");
		System.out.println(pi);
		//
		pi = CH.orderPizza("clam");
		System.out.println(pi);
	}
}
