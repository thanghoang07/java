package starbuzz;

public class DarkRoast extends Bevarage {

	public DarkRoast(String description, boolean milk, boolean soy, boolean mocha, boolean whip) {
		this.description = description;
		this.milk = milk;
		this.soy = soy;
		this.mocha = mocha;
		this.whip = whip;
	}

	public int cost() {
		return 12 + super.cost();
	}

}
