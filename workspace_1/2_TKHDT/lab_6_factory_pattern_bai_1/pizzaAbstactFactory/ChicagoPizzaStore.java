package pizzaAbstactFactory;

public class ChicagoPizzaStore extends PizzaStore{

	@Override
	public Pizza createPizza(String str) {
		Pizza pi = null;
		PizzaIngerdientFactoory factory = new ChicagoPizzaIngredientFactory();
		if (str.equals("cheese")) {
			pi = new CheesePizza(factory);
			pi.setName("Chicago cheese pizza");
		} else if (str.equals("pepperoni")) {
			pi = new PepperoniPizza(factory);
			pi.setName("Chicago pepperoni pizza");
		} else if (str.equals("clam")) {
			pi = new ClamPizza(factory);
			pi.setName("Chicago clam pizza");
		} else if (str.equals("veggie")) {
			pi = new VeggiePizza(factory);
			pi.setName("Chicago veggie pizza");
		}
		return pi;
	}

}
