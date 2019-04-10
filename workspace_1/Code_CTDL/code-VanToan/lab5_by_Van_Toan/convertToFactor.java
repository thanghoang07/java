package lab5_by_Van_Toan;

public class convertToFactor {
	public static void convertTo(int n, int m) {
		ArrayStack<Integer> s = new ArrayStack<>(10);
		int r;
		while (n != 0) {
			r = n % m;
			s.push(r);
			n = n / m;
		}

		while (!s.isEmpty())
			System.out.print(s.pop());
	}
}
