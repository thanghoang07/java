package pizzaAbstactFactory;

public class ClamPizza extends Pizza {
	public PizzaIngerdientFactoory factory;

	public ClamPizza(PizzaIngerdientFactoory factory) {
		super();
		this.factory = factory;
	}

	@Override
	public void prepare() {
		System.out.println("Preparing " + name);
		dough = factory.createDough();
		sauce = factory.createSauce();
		cheese = factory.createCheesse();
		clams = factory.createClam();
	}

}
