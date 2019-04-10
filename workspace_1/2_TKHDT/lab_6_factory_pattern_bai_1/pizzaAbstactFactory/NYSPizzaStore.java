package pizzaAbstactFactory;

public class NYSPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String str) {
		Pizza pi = null;
		PizzaIngerdientFactoory factory = new NYPizzaIngredientFactory();
		if (str.equals("cheese")) {
			pi = new CheesePizza(factory);
			pi.setName("NY cheese pizza");
		} else if (str.equals("pepperoni")) {
			pi = new PepperoniPizza(factory);
			pi.setName("NY pepperoni pizza");
		} else if (str.equals("clam")) {
			pi = new ClamPizza(factory);
			pi.setName("NY clam pizza");
		} else if (str.equals("veggie")) {
			pi = new VeggiePizza(factory);
			pi.setName("NY veggie pizza");
		}
		return pi;
	}

}
