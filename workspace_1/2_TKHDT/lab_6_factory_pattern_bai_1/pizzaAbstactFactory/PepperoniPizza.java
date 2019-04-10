package pizzaAbstactFactory;

public class PepperoniPizza extends Pizza {
	public PizzaIngerdientFactoory factory;
	
	public PepperoniPizza(PizzaIngerdientFactoory factory) {
		super();
		this.factory = factory;
	}

	@Override
	public void prepare() {
		System.out.println("Preparing " + name);
		dough = factory.createDough();
		sauce = factory.createSauce();
		cheese = factory.createCheesse();
		veggies = factory.createVeggies();
		pepperoni = factory.createPepperoni();
	}

}
