package dog;

public class DogFactory {
	public Dog getDog(DogType model) {
		Dog dg = null;
		switch (model) {
		case ROTTWEILER:
			dg = new Rottweiler();
			break;
		case POODLE:
			dg = new Poodle();
			break;
		case SIBERIANHUSKY:
			dg = new SiberianHusky();
			break;
		default:
			break;
		}
		return dg;
	}
}
