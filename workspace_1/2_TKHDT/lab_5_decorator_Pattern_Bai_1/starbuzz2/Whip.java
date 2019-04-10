package starbuzz2;

public class Whip extends CondimentDecorator {
	public Beverage be;

	public Whip(Beverage bes) {
		// TODO Auto-generated constructor stub
		this.be = bes;
	}

	@Override
	public String getDes() {
		return be.getDes() + ", whip";
	}

	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return 6 + be.cost();
	}
}
