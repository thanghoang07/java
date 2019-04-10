package tuan6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server implements Runnable {
	Socket socket;
	static int port = 7777;
	PrintWriter out;
	BufferedReader in;
	int count = 0;

	public Server(Socket socket) {
		// TODO Auto-generated constructor stub
		this.socket = socket;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			System.out.println("Client connect ... ");
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream(), true);
			while (true) {
				String line = in.readLine();
				if (line.equalsIgnoreCase("exit"))
					break;
				line = "Echo: " + line + "||" + count;
				out.println(line);
				count++;
			}
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(port);
		while (true) {
			System.out.println("server wanning ... ");
			new Thread(new Server(ss.accept())).start();
			;
		}
	}
}
