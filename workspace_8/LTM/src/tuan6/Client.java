package tuan6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	Socket socket;
	int port = 7777;
	String host = "localhost";
	PrintWriter out;
	BufferedReader in;
	BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
	
	public Client() throws UnknownHostException, IOException {
		// TODO Auto-generated constructor stub
		socket = new Socket(host, port);
		in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		out = new PrintWriter(socket.getOutputStream(), true);
		while (true) {
			String line = s.readLine();
			out.println(line);
			if(line.equalsIgnoreCase("exit")) {
				in.close();
				out.println();
				socket.close();
			}
			System.out.println(in.readLine());
			out.flush();
		}
	}
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		new Client();
	}

}
