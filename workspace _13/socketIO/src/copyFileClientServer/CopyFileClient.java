package copyFileClientServer;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class CopyFileClient {
	private int port = 4444;
	private String ip = "127.0.0.1";
	Socket socket;

	public void copyFile() throws IOException, UnknownHostException {
		socket = new Socket(ip, port);
		System.out.println("Connect server ....");
		// file need copy
		BufferedReader fileSource = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\OneDrive\\Documents\\workspace _12\\socketIO\\src\\copyFileClientServer\\st.txt")));

		// send request server
		PrintWriter ws = new PrintWriter(socket.getOutputStream());
		String line = "";
		while ((line = fileSource.readLine()) != null) {
			ws.write(line);
			ws.write("\n");
		}
		fileSource.close();
		ws.close();
		socket.close();
	}
	public static void main(String[] args) throws IOException, UnknownHostException{
		CopyFileClient c = new CopyFileClient();
		c.copyFile();
	}
}
