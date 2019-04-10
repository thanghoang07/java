package pizzaAbstactFactory;

public interface PizzaIngerdientFactoory {
	public Dough createDough();

	public Sauce createSauce();

	public Cheese createCheesse();

	public Veggies[] createVeggies();

	public Pepperoni createPepperoni();

	public Clams createClam();
}
