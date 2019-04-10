package tuan8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.StringTokenizer;

public class Client {
	Socket socket;
	BufferedReader in;
	PrintWriter out;
	BufferedReader s;
	int port = 12345;
	String ip = "localhost";

	public Client() throws IOException {
		socket = new Socket(ip, port);
		in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		out = new PrintWriter(socket.getOutputStream(), true);
		s = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while (true) {
			RML();
			line = s.readLine();
			out.println(line);
			StringTokenizer tk = new StringTokenizer(line, "_");
			if (tk.countTokens() > 0) {
				String cm = tk.nextToken();
				switch (cm.toUpperCase()) {
				case "THEM":
					them();
					break;
				case "XOA":
					xoa();
					break;
				case "SUA":
					sua();
					break;
				case "XEM":
					xem();
					break;
				case "EXIT":
					in.close();
					out.close();
					socket.close();
					break;
				default:
					break;
				}

			}
		}
	}

	private void xem() throws IOException {
		RML();
	}

	private void sua() throws IOException {
		System.out.println(in.readLine());
	}

	private void xoa() throws IOException {
		System.out.println(in.readLine());
	}

	private void them() throws IOException {
		System.out.println(in.readLine());
	}

	public void RML() throws IOException {
		String line;
		while (true) {
			line = in.readLine();
			if (".".equalsIgnoreCase(line))
				break;
			System.out.println(line);
		}
	}

	public static void main(String[] args) throws IOException {
		new Client();
	}
}
