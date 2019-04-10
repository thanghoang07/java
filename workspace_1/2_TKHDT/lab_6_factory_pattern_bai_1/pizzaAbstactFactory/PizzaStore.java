package pizzaAbstactFactory;

public abstract class PizzaStore {

	public abstract Pizza createPizza(String str);

	public Pizza orderPizza(String type) {
		Pizza pizza;
		pizza = createPizza(type);
		System.out.println("--- Making a " + pizza.getName() + " ---");
		//
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
