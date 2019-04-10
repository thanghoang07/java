package lab3;

public class Bai6 {
	public static void main(String[] args) {
		int goc = 0;
		double sin, cos, tang, cotan = 0;
		for (int i = 0; i <= 90; i++) {
			if ( i % 5 == 0)
				goc += i;
//			sin = Math.sin(goc);
			System.out.println("" + goc);
		}
		// System.out.println("" + goc);
	}
}
