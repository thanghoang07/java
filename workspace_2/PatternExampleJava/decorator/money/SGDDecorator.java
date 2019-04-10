package money;

public class SGDDecorator extends Decorator {
	protected Currency cu;

	public SGDDecorator(Currency currency) {
		this.cu = currency;
	}

	@Override
	public String getDescription() {
		return cu.getDescription() + " ,its singapore Dollar";
	}

	@Override
	public double cost(double value) {
		// TODO Auto-generated method stub
		return 1.58;
	}

}
