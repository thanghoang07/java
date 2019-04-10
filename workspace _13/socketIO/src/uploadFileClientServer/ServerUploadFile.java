package uploadFileClientServer;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerUploadFile {
	private ServerSocket serverSocket;
	private Socket socket;
	private int port = 12345;

	public ServerUploadFile() throws IOException {
		CreateConnects();
	}

	private void CreateConnects() throws IOException {
		serverSocket = new ServerSocket(port);
		System.out.println("Walting....");
		socket = serverSocket.accept();
		System.out.println("Server Accept" + port);
	}
	
	public void copy() throws IOException {
		// response get information from client
		BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		//
		PrintWriter output = new PrintWriter(new File(""));
		String line = "";
		while ((line = input.readLine()) != null) {
			output.write(line);
			output.write("\n");
		}
		input.close();
		output.close();
		socket.close();
		serverSocket.close();
		System.out.println("copy done!");
	}


	public static void main(String[] args) throws IOException {
		ServerUploadFile s = new ServerUploadFile();
	}
}
