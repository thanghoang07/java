package lab4_by_Van_Toan;

public class Bai1 {

	public static String daoChuoi(String a, int n) {
		if (n == 1)
			return a.charAt(n - 1) + "";
		else
			return a.charAt(n - 1) + daoChuoi(a, n - 1) + "";

	}

	public static void main(String[] args) {
		String a = "123";
		System.out.println("Chuỗi ban đầu : ");
		System.out.println(a);
		System.out.println("Chuỗi đảo ngược : ");
		System.out.println(daoChuoi(a, a.length()));

	}
}
