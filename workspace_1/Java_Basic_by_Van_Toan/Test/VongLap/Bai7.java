package VongLap;

public class Bai7 {
	public static void main(String[] args) {
		for (int i = 2; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.printf("%d x %d = %d\n", i, j, (i * j));
			}
			System.out.println();
		}
	}
}
