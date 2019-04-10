package starbuzz2;

public class Soy extends CondimentDecorator {
	public Beverage be;

	public Soy(Beverage be) {
		super();
		this.be = be;
	}

	@Override
	public String getDes() {
		return be.getDes() + ", soy";
	}

	@Override
	public int cost() {
		return 3 + be.cost();
	}

}
