package tuan9_1;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("localhost", 12345);
		DataOutputStream out = new DataOutputStream(socket.getOutputStream());
		out.writeUTF("send");
		out.close();
		socket.close();

		ServerSocket serverReceive = new ServerSocket(54321);
		Socket socketReceive = serverReceive.accept();
		InputStream in = socketReceive.getInputStream();
		FileOutputStream outFile = new FileOutputStream("D://thanghoangLTM//Template_testDesign_v0.1.xls");
		byte[] buffer = new byte[1024];
		int count;
		while ((count = in.read(buffer)) >= 0) {
			outFile.write(buffer, 0, count);
		}
		outFile.close();
		in.close();
		socketReceive.close();
		serverReceive.close();
	}
}
