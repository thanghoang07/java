package dog;

public class Test {
	public static void main(String[] args) {
		DogFactory dgf = new DogFactory();
		System.out.println(dgf.getDog(DogType.POODLE));
		System.out.println(dgf.getDog(DogType.ROTTWEILER));
		System.out.println(dgf.getDog(DogType.SIBERIANHUSKY));
	}
}
