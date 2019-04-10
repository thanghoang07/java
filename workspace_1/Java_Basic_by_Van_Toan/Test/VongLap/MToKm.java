package VongLap;

public class MToKm {
	public static void main(String[] args) {
		System.out.print("Miles\t");
		System.out.println("Kilometers");
		int mile = 0;
		for (int i = 0; i < 100; i++) {
			System.out.print(mile + "\t");
			System.out.println(String.format("%.3f", tinh(mile)));
			mile++;
		}
	}
	public static double tinh(int mile) {
		return mile * 1.609;
	}
}
