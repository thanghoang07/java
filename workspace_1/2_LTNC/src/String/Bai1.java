package String;

public class Bai1 {
	public static int countWords(String s) {
		int count = 0;
		if (s.length() > 0 && s.charAt(0) != ' ') {
			count = 1;
		}
		for (int i = 0; i < s.length() - 1; i++) {
			if ((s.charAt(i) == ' ') && s.charAt(i + 1) != ' ') {
				count++;
			}
		}
		return count;
	}

	public static int countWords2(String s) {
		int count = 0;
		String[] arr = s.split(" ");
		for (int i = 0; i < arr.length; i++) {
			if (!arr[i].equals(" ")) {
				count++;
			}
		}
		return count;
	}

	public static int countWords3(String s) {
		int count = 0;
		String[] arr = s.split(" ");
		StringBuilder tmp = new StringBuilder(s);

		return count = tmp.toString().split(" ").length;
	}

	public static void countWords4(String s) {
		int count = 0;
		String[] arr = s.split(" ");
		for (int i = 0; i < arr.length; i++) {
			if (!arr[i].equals(" ")) {
				System.out.println(arr[i]);
			}
		}
	}

	public static String revWords(String s) {
		String tmp = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			tmp += s.charAt(i);
		}
		return tmp;
	}

	public static void main(String[] args) {
		String s = "Lap trinh nang cao";
		System.out.printf("1.so tu trong chuoi la: %3d\n", countWords(s));
		System.out.printf("1.so tu trong chuoi la: %3d\n", countWords2(s));
		countWords4(s);

		String[] arr = s.split(" ");
		for (int i = 0; i < arr.length; i++) {
			if (!arr[i].equals("")) {
				System.out.print(revWords(arr[i]));
			}
			System.out.print(" ");
		}
	}

}
