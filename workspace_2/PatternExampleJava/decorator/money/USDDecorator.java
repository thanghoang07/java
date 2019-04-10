package money;

public class USDDecorator extends Decorator {
	protected Currency cu;

	public USDDecorator(Currency currency) {
		this.cu = currency;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return cu.getDescription() + " ,its US Dollar";
	}

	@Override
	public double cost(double value) {
		// TODO Auto-generated method stub
		return 0.53;
	}

}
