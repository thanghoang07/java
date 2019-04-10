package tuan7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
	public static void main(String[] args) throws IOException {
		Socket socket = new Socket("localhost", 12345);
		System.out.println("Connected");
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(socket.getOutputStream());
		PrintWriter out = new PrintWriter(System.out, true);
		String command;
		while (true) {
			command = in.readLine();
			pw.println(command);
			if (command.equalsIgnoreCase("EXIT "))
				break;
			command = br.readLine();
			int count = Integer.parseInt(command);
			for (int i = 0; i < count; i++) {
				command = br.readLine();
				out.println(command);
			}
		}
		in.close();
		out.close();
		pw.close();
		br.close();
		socket.close();
	}
}
