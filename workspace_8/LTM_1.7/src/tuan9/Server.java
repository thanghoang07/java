package tuan9;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	ServerSocket ss;
	Socket socket;
	int port = 12345;
	DataInputStream in;
	DataOutputStream out;

	public Server() throws IOException {
		createConnect();
		createStream();
		dowload();
		upload();
	}

	public void createConnect() throws IOException {
		ss = new ServerSocket(port);
		System.out.println("Đang chờ kết nối");
		socket = ss.accept();
		System.out.println("Kết nối hoàn tất");
	}

	public void createStream() throws IOException {
		in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
		out = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
		out.writeUTF("Chào mừng đến với hệ thống");
		out.flush();
	}

	// dowload
	public void dowload() throws IOException {
		String fname;
		fname = in.readUTF();
		BufferedInputStream is = new BufferedInputStream(new FileInputStream(fname));
		byte[] data = new byte[102400];
		int i;
		while ((i = is.read(data)) != -1) {
			out.write(data, 0, i);
			out.flush();
			socket.close();
		}
	}

	// upload
	public void upload() throws IOException {
		try {
			String fname = null;
			fname = in.readUTF();
			BufferedOutputStream os = new BufferedOutputStream(new FileOutputStream(fname));
			byte[] data = new byte[102400];
			int i;
			while ((i = in.read(data)) != -1)
				os.write(data, 0, i);
			os.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		socket.close();
	}

	public static void main(String[] args) throws IOException {
		Server s = new Server();
		//D:\\OneDrive - Học Viện Phần Cứng & Mạng Jetking Việt Nam(1)\\Học\\Năm 4 - 1\\LapTrinhMang\\LAPTRINHMANG\\LTMTHAYLONG\\src\\dowload_upload\\client.java
	}
}
