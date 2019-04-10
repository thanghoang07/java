package pizzaAbstactFactory;

public class CheesePizza extends Pizza {
	public PizzaIngerdientFactoory factory;

	public CheesePizza(PizzaIngerdientFactoory factory) {
		super();
		this.factory = factory;
	}

	@Override
	public void prepare() {
		System.out.println("Preparing " + name);
		dough = factory.createDough();
		sauce = factory.createSauce();
		cheese = factory.createCheesse();
	}

}
