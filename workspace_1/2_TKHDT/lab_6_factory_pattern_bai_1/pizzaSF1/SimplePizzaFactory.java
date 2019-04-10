package pizzaSF1;

import pizzaFM.Pizza;

public class SimplePizzaFactory {
	public Pizza createPizza(String str) {
		Pizza pi = null;
		if (str.equals("cheese")) {
			pi = new CheesePizza();
		} else if (str.equals("pepperoni")) {
			pi = new PepperoniPizza();
		} else if (str.equals("clam")) {
			pi = new ClamPizza();
		} else if (str.equals("veggie")) {
			pi = new VeggiePizza();
		}
		return pi;
	}
}
