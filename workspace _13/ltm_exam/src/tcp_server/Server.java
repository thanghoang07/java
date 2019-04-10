package tcp_server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	ServerSocket serverSocket;
	Socket socket;
	int port = 55555;

	private void start() throws IOException {
		serverSocket = new ServerSocket(port);
		while (true) {
			socket = serverSocket.accept();
			ServerProcess serverProcess = new ServerProcess(socket);
			serverProcess.start();
		}
	}

	public static void main(String[] args) throws IOException {
		Server server = new Server();
		server.start();
	}
}
