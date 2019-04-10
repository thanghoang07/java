package dog;

public class SiberianHusky extends Dog {

	public SiberianHusky() {
		super(DogType.SIBERIANHUSKY);
		speak();
	}

	@Override
	public void speak() {
		System.out.println("The husky says \"Dude, what's up?\"");
	}

}
