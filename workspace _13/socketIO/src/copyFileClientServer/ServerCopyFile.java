package copyFileClientServer;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerCopyFile {
	private ServerSocket serverSocket;
	private Socket socket;
	private int port = 12345;

	public ServerCopyFile() throws IOException {
		CreateConnects();
	}

	private void CreateConnects() throws IOException {
		serverSocket = new ServerSocket(port);
		System.out.println("Walting....");
		socket = serverSocket.accept();
		System.out.println("Server Accept" + port);
	}

	public static void main(String[] args) throws IOException {
		ServerCopyFile s = new ServerCopyFile();
	}
}
