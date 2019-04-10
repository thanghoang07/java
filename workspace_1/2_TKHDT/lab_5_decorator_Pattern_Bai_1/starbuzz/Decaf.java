package starbuzz;

public class Decaf extends Bevarage {
	
	public Decaf(String description, boolean milk, boolean soy, boolean mocha, boolean whip) {
		this.description = description;
		this.milk = milk;
		this.soy = soy;
		this.mocha = mocha;
		this.whip = whip;
	}

	public int cost() {
		return 10 + super.cost();
	}
}
