package vacworld;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This is a utility class used to preview randomly generated Vacuum World
 * states.
 */
public class StateSelector {

    /**
     * This is a utility class used to preview randomly generated Vacuum World
     * states. The program runs an infinite loop asking for a seed and
     * displaying the state. You will need to use an operating system command to
     * terminate the program. Once you find a seed you like, you can provide it
     * to VacuumWorld using the -rand argument.
     */
    public static void main(String[] args) {

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
}
