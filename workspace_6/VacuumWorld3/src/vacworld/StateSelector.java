package vacworld;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Tao ngau nhien trang thai cua moi truong
public class StateSelector {

	public StateSelector() {
		String input = null;
		int seed = 0;

		do {
			System.out.println("Enter a seed:");
			BufferedReader console = new BufferedReader(new InputStreamReader(
					System.in));
			try {
				input = console.readLine();
				seed = Integer.parseInt(input);
			} catch (IOException ex) {
				System.out.println(ex.getMessage());
				System.exit(1);
			} catch (NumberFormatException ex) {
				System.out.println(input + "is not an integer!");
				continue;
			}
			VacuumState s = VacuumState.getRandomState(seed);
			s.display(System.out);
			System.out.println();
		} while (true);
	}

	public static void main(String[] args) {
		new StateSelector();
	}
}
