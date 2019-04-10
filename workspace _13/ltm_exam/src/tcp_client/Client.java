package tcp_client;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.StringTokenizer;

public class Client {
	Socket socket;
	DataInputStream input;
	DataOutputStream output;
	BufferedReader userIn;
	String sf, df, command, folderView, host="127.0.0.1";
	int port = 55555;
	StringTokenizer st;
	
	private void start() throws IOException{
		socket = new Socket(host, port);
		input = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
		output = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
		userIn = new BufferedReader(new InputStreamReader(System.in));
		
		String getWellcom = input.readUTF();
		System.out.println(getWellcom);
		String line;
		while(true) {
			line = userIn.readLine();
			lineprocess(line);
			if("QUIT".equalsIgnoreCase(line))
				break;
		}
		userIn.close();
		input.close();
		output.close();
		socket.close();
	}
	
	private void lineprocess(String line) throws IOException{
		line = line.replace(" ", "");
		st = new StringTokenizer(line, "|");
		command = st.nextToken();
		String path, pathFileName, result =null;
		switch (command) {
		case "QUIT":
			output.writeUTF(line);
			result = "Quilt success";
			break;
		case "SET_FOLDER":
			folderView = st.nextToken();
			result = "SET_FOLDER SUCCESS";
			break;
		case "VIEW":
			path = st.nextToken();
			File file = new File(path);
			if (file.isDirectory()) {
				processPath(file);
				result = "VIEW SUCCESS";
			}else {
				pathFileName = folderView + File.separator + path;
				File filePath = new File(pathFileName);
				if (filePath.exists()) {
					result = filePath.getAbsolutePath();
				} else {
					result = "It not a folder or a name file in folder defaul";
				}
			}
			break;
		case "COPY":
			sf = st.nextToken();
			df = st.nextToken();
			output.writeUTF(command + " " + sf + " " + df);
			output.flush();
			result = input.readUTF();
			break;
		case "MOVE":
			sf = st.nextToken();
			df = st.nextToken();
			output.writeUTF(command + " " + sf + " " + df);
			output.flush();
			result = input.readUTF();
			break;
		case "RENAME":
			sf = st.nextToken();
			df = st.nextToken();
			output.writeUTF(command + " " + sf + " " + df);
			output.flush();
			result = input.readUTF();
			break;
		default:
			result = "command error";
			break;
		}
		output.flush();
		System.out.println(result);
	}
	
	private void processPath(File file) {
		File[] files = file.listFiles();
		for (File f : files) {
			System.out.println(f.getAbsolutePath());
		}
	}
}
