package pizzaFM;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
	public String name;
	public String dough;
	public String sauce;
	public List<String> toppings = new ArrayList<String>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void prepare() {
		System.out.printf("prepare: %s\n", name);
	}

	public void bake() {
		System.out.printf("bake: %s\n", name);
	}

	public void cut() {
		System.out.printf("cut: %s\n", name);
	}

	public void box() {
		System.out.printf("box: %s\n", name);
	}

	public void inRa() {
		System.out.println("\n= = = = = = = = = = = = = = = = =");
		System.out.println("---- " + name + " ----\n");
		System.out.println("dough: " + dough);
		System.out.println("sauce: " + sauce);
		for (int i = 0; i < toppings.size(); i++) {
			System.out.println("topping: " + toppings.get(i));
		}
	}
}
