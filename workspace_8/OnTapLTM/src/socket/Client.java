package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	Socket socket;
	String ip = "localhost";
	static int port = 12345;
	PrintWriter out;
	BufferedReader in;
	BufferedReader s = new BufferedReader(new InputStreamReader(System.in));

	public Client() throws UnknownHostException, IOException {
		socket = new Socket(ip, port);
		in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		out = new PrintWriter(socket.getOutputStream(), true);
		while (true) {
			String line = s.readLine();
			out.println(line);
			if (line.equalsIgnoreCase("exit")) {
				in.close();
				out.close();
				socket.close();
			}
			System.out.println(in.readLine());
		}
	}

	public static void main(String[] args) throws UnknownHostException, IOException {
		new Client();
	}
}