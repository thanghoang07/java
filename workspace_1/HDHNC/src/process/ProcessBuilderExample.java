package process;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ProcessBuilderExample {
	public static void main(String[] args) throws InterruptedException, IOException {
		ProcessBuilder pb = new ProcessBuilder("echo", "This is ProcessBuilder Example from JCG");
		System.out.println("Run echo command");
		Process process = pb.start();
		int errCode = process.waitFor();
		System.out.println("Echo command executed, any errors? " + (errCode == 0 ? "No" : "Yes"));
		System.out.println("Echo Output:\n" + output(process.getInputStream()));
	}

	private static String output(InputStream inputStream) throws IOException {
		StringBuilder sb = new StringBuilder();
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(inputStream));
			String line = null;
			while ((line = br.readLine()) != null) {
				sb.append(line + System.getProperty("line.separator"));
			}
		} finally {
			br.close();
		}
		return sb.toString();
	}
}
