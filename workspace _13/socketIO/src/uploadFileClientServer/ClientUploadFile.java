package uploadFileClientServer;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.StringTokenizer;

public class ClientUploadFile {
	private Socket socket;
	private int port = 12345;
	private String ip = "127.0.0.1";

	public ClientUploadFile() throws IOException {
		Connects();
		upload();
	}

	private void Connects() throws IOException {
		socket = new Socket(ip, port);
		System.out.println("Connected....." + ip + port);
	}

	public void upload() throws IOException {
		String command, sourceFile, destFile;
		// file need copy
		BufferedReader fileSource = new BufferedReader(new InputStreamReader(System.in));

		// send request server
		PrintWriter ws = new PrintWriter(socket.getOutputStream());
		String line = "";
		line = fileSource.readLine();
		StringTokenizer st = new StringTokenizer(line, " ");
		command = st.nextToken();
		sourceFile = st.nextToken();
		destFile = st.nextToken();
		if (!command.equalsIgnoreCase("copy")) {
			System.out.println("");
			return;
		} else {
			System.out.println(command);
			ws.write(destFile);
			ws.flush();
			String line2 = "";
			BufferedReader is = new BufferedReader(new InputStreamReader(new FileInputStream(sourceFile)));
			while ((line2 = is.readLine()) != null) {
				ws.write(line2);
				ws.write("\n");
			}
			is.close();
			fileSource.close();
			ws.close();
			socket.close();
		}
	}

	public static void main(String[] args) throws IOException {
		ClientUploadFile c = new ClientUploadFile();
	}
}
