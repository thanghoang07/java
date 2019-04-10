package pizzaFM;

public class NYSPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String str) {
		Pizza pi = null;
		if (str.equals("cheese")) {
			pi = new NYSCheesePizza();
		} else if (str.equals("pepperoni")) {
			pi = new NYSpepperoniPizza();
		} else if (str.equals("clam")) {
			pi = new NYSClamPizza();
		} else if (str.equals("veggie")) {
			pi = new NYSveggiePizza();
		}
		return pi;
	}

}
