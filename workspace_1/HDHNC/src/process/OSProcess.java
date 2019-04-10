package process;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author IFORNO
 */
// gọi lệnh cmd trong windows
public class OSProcess {

	public static void main(String[] args) throws Exception {

		while (true) {
			Scanner scanner = new Scanner(System.in);
			String line = scanner.nextLine();
			ProcessBuilder pb = new ProcessBuilder(line);
			Process process = pb.start();
			BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()));
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			br.close();

		}
	}
}
