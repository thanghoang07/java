package starbuzz;

public class HouseBlend extends Bevarage {

	public HouseBlend(String description, boolean milk, boolean soy, boolean mocha, boolean whip) {
		this.description = description;
		this.milk = milk;
		this.soy = soy;
		this.mocha = mocha;
		this.whip = whip;
	}

	public int cost() {
		return 6 + super.cost();
	}
}
