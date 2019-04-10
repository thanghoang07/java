package VongLap;

public class KiloToPound {
	public static void main(String[] args) {
		System.out.print("Kilograms\t");
		System.out.print("Pounds\t\t");
		System.out.print("Pounds\n");
		// System.out.print("Kilograms\n");
		for (int i = 0; i < 10; i++) {

			if (i % 2 != 0) {
				System.out.print(i + "\t\t");
				System.out.print(String.format("%.1f", tinhPound(i)) + "\t\t");
				int j = 20;
				do {
					if (j % 5 == 0)
						System.out.print(j + "\n");
					j++;
					
				} while (j < 516);

			}
			// for (int j = 20; j < 516; j++) {
			// if (j % 5 == 0) {
			// System.out.print(j + "\t\t");
			// System.out.println(String.format("%.2f",
			// convertKilo(tinhPound(i), j, i)));
			// }
			// }
		}
	}

	public static double tinhPound(int i) {
		return i * 2.2;
	}

	public static double convertKilo(double poundX, int poundY, int kilo) {
		return poundY / poundX * kilo;
	}
}
