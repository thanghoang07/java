package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class AccClass {
	Scanner sc = new Scanner(System.in);

	public void inputHashMap() {
		HashMap<String, String> map = new HashMap<>();
		for (int i = 0; i < 10; i++) {
			System.out.print("\nACCOUNT " + (i + 1));
			System.out.print("\nAcc: ");
			String acc = sc.nextLine();
			System.out.print("Pass :");
			String pass = sc.nextLine();
			map.put(acc, pass);
		}
		System.out.println();
		for (String j : map.keySet()) {
			int i =0;
			System.out.println("Acc: " + j + " - Pass: " + map.get(j));
		}
	}

	public static void main(String[] args) {
		AccClass wen = new AccClass();
		wen.inputHashMap();
	}

}