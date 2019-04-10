package starbuzz2;

public class Mocha extends CondimentDecorator {
	public Beverage be;

	public Mocha(Beverage bes) {
		// TODO Auto-generated constructor stub
		this.be = bes;
	}

	@Override
	public String getDes() {
		return be.getDes() + ", mocha";
	}

	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return 5 + be.cost();
	}

}
