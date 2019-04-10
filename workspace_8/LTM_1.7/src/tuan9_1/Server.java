package tuan9_1;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
public static void main(String[] args) throws IOException{
	ServerSocket server = new ServerSocket(12345);
	Socket socket = server.accept();
	DataInputStream in = new DataInputStream(socket.getInputStream());
	if(in.readUTF().equals("send")) {
		File file = new File("D://server//Template_testDesign_v0.1.xls");
		if(file.exists()) {
			Socket socketSend =new Socket("localhost", 54321);
			OutputStream out = socketSend.getOutputStream();
			FileInputStream inSend = new FileInputStream(file);
			byte[] buffer = new byte[1024];
			int count;
			while((count = inSend.read(buffer))>=0) {
				out.write(buffer, 0, count);
			}
			out.close();
			inSend.close();
			socketSend.close();
		}
	}
	in.close();
	socket.close();
	server.close();
}
}
