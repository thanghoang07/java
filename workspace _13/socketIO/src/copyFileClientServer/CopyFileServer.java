package copyFileClientServer;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class CopyFileServer {
	private int port = 4444;

	public void copy() throws IOException {
		ServerSocket server = new ServerSocket(port);
		System.out.println("waiting .... ");
		Socket sc = server.accept();
		System.out.println("Accept Connects ....");
		// response get information from client
		BufferedReader input = new BufferedReader(new InputStreamReader(sc.getInputStream()));
		//
		PrintWriter output = new PrintWriter(new File("D:\\OneDrive\\Documents\\workspace _12\\socketIO\\src\\copyFileClientServer\\stcopy.txt"));
		String line = "";
		while ((line = input.readLine()) != null) {
			output.write(line);
			output.write("\n");
		}
		input.close();
		output.close();
		sc.close();
		server.close();
		System.out.println("copy done!");
	}

	public static void main(String[] args) throws IOException {
		CopyFileServer s = new CopyFileServer();
		s.copy();
	}
}
