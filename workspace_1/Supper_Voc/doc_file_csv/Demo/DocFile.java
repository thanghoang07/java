package Demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DocFile {

	public static void main(String[] args) throws FileNotFoundException {
		try (Scanner scanner = new Scanner(new File("C:\\Users\\thang\\Desktop\\files\\sourcefile1.csv"))) {
			scanner.useDelimiter(",");
			while (scanner.hasNext()) {
				System.out.printf("%3s", scanner.next());
			}
		}
	}
}
