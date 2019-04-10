package pizzaAbstactFactory;

public abstract class Pizza {
	public String name;
	public Dough dough;
	public Sauce sauce;
	public Veggies[] veggies;
	public Cheese cheese;
	public Pepperoni pepperoni;
	public Clams clams;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void prepare();

	public void bake() {
		System.out.printf("bake: %s\n", name);
	}

	public void cut() {
		System.out.printf("cut: %s\n", name);
	}

	public void box() {
		System.out.printf("box: %s\n", name);
	}

	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("---- " + name + " ----\n");
		if (dough != null) {
			result.append(dough);
			result.append("\n");
		}
		if (sauce != null) {
			result.append(sauce);
			result.append("\n");
		}
		if (cheese != null) {
			result.append(cheese);
			result.append("\n");
		}
		if (veggies != null) {
			for (int i = 0; i < veggies.length; i++) {
				result.append(veggies[i]);
				if (i < veggies.length - 1) {
					result.append(", ");
				}
			}
			result.append("\n");
		}
		if (clams != null) {
			result.append(clams);
			result.append("\n");
		}
		if (pepperoni != null) {
			result.append(pepperoni);
			result.append("\n");
		}
		return result.toString();
	}
}
