package pizzaSF1;

import pizzaFM.Pizza;

public class Test {
	public static void main(String[] args) {
		SimplePizzaFactory sim = new SimplePizzaFactory();
		PizzaStore ps = new PizzaStore(sim);
		//
		Pizza pi = ps.orderPizza("cheese");
		System.out.printf("Orderd: %s", pi.getName());
		pi.inRa();
	}
}
