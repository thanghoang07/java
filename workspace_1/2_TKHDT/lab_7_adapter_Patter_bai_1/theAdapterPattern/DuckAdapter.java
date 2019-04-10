package theAdapterPattern;

public class DuckAdapter implements Turkey {
	public Duck duck;

	public DuckAdapter(Duck duck) {
		this.duck = duck;
	}

	@Override
	public void gobble() {
		// TODO Auto-generated method stub
		duck.quack();
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		duck.fly();
	}
}
