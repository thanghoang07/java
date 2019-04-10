package VongLap;

public class Bai6 {
	public static void main(String[] args) {
		double cos, tang, cotang;
		for (int i = 0; i <= 90; i++) {
			if (i % 5 == 0) {
				cos = Math.cos(i);
				tang = Math.tan(i);
				cotang = 1 / Math.tan(i);
				System.out.printf("\ncos%d = %.4f", i, Math.toRadians(cos));
				System.out.print("\ntan"+ i +" = "+Math.toRadians(tang));
				System.out.printf("\ncotg%d = %.4f", i, Math.toRadians(cotang));
			}
		}
		System.out.println();
	}
}
