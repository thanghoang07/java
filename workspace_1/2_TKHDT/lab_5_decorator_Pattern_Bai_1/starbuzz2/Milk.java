package starbuzz2;

public class Milk extends CondimentDecorator {
	public Beverage be;

	public Milk(Beverage be) {
		super();
		this.be = be;
	}

	@Override
	public String getDes() {
		return be.getDes() + ", milk";
	}

	@Override
	public int cost() {
		return 4 + be.cost();
	}

}
