package copyFileClientServer;

import java.io.IOException;
import java.net.Socket;

public class ClientCopyFile {
	private Socket socket;
	private int port = 12345;
	private String ip = "127.0.0.1";

	public ClientCopyFile() throws IOException {
		Connects();
	}

	private void Connects() throws IOException {
		socket = new Socket(ip, port);
		System.out.println("Connected....." + ip + port);
	}

	public static void main(String[] args) throws IOException {
		ClientCopyFile c = new ClientCopyFile();
	}
}
