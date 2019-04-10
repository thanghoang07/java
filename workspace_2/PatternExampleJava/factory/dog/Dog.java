package dog;

public abstract class Dog {
	private DogType model;

	public Dog(DogType model) {
		super();
		this.model = model;
	}

	public abstract void speak();

	public DogType getModel() {
		return model;
	}

	public void setModel(DogType model) {
		this.model = model;
	}

}
