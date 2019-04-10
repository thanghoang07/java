package starbuzz;

public class Expresso extends Bevarage {
	
	public Expresso(String description, boolean milk, boolean soy, boolean mocha, boolean whip) {
		this.description = description;
		this.milk = milk;
		this.soy = soy;
		this.mocha = mocha;
		this.whip = whip;}

	public int cost() {
		return 8 + super.cost();
	}
}
