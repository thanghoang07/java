package pizzaFM;

public class Test {
	public static void main(String[] args) {
		PizzaStore Ny = new NYSPizzaStore();

		Pizza pi = Ny.orderPizza("cheese");
		System.out.printf("Orderd: %s", pi.getName());
		pi.inRa();
		
		
	}
}
