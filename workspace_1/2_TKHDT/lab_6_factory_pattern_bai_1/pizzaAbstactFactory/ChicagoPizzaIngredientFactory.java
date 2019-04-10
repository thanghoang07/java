package pizzaAbstactFactory;

public class ChicagoPizzaIngredientFactory implements PizzaIngerdientFactoory {

	@Override
	public Dough createDough() {
		// TODO Auto-generated method stub
		return new ThickCrustDough();
	}

	@Override
	public Sauce createSauce() {
		// TODO Auto-generated method stub
		return new PlumTomatoSauce();
	}

	@Override
	public Cheese createCheesse() {
		// TODO Auto-generated method stub
		return new MozzarellaCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		// TODO Auto-generated method stub
		Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		// TODO Auto-generated method stub
		return new SlicedPepperoni();
	}

	@Override
	public Clams createClam() {
		// TODO Auto-generated method stub
		return new FreshClams();
	}

}
