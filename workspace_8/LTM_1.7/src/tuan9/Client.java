package tuan9;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.StringTokenizer;

public class Client {
	Socket socket;;
	int port = 12345;
	String host = "127.0.0.1";
	DataInputStream in;
	DataOutputStream out;
	BufferedReader reader;
	String line;

	public Client() throws IOException {
		connect();
		createStream();
		dowload();
//		upload();
	}

	public void connect() throws IOException {
		socket = new Socket(host, port);
		System.out.println("Kết nối thành công");
	}

	public void createStream() throws IOException {
		in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
		out = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
		reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(in.readUTF());
	}

	// dowload
	public void dowload() throws IOException {
		String comand;
		String sfname = null, dfname = null;
		System.out.println("Get source_file_dest");
		line = reader.readLine();
		StringTokenizer st = new StringTokenizer(line, "\t");
		comand = st.nextToken();
		sfname = st.nextToken();
		dfname = st.nextToken();
		if (!comand.equalsIgnoreCase("get")) {
			System.out.println("Lỗi");
			return;
		}
		BufferedOutputStream os = new BufferedOutputStream(new FileOutputStream(dfname));
		out.writeUTF(sfname);
		out.flush();
		byte[] data = new byte[102400];
		int i;
		while ((i = in.read(data)) != -1)
			os.write(data, 0, i);
		os.close();
		socket.close();

	}

	// upload
	public void upload() throws IOException {
		String comand;
		String sfname = null, dfname = null;
		System.out.println("Copy source_file_dest");
		line = reader.readLine();
		StringTokenizer st = new StringTokenizer(line, "\t");
		comand = st.nextToken();
		sfname = st.nextToken();
		dfname = st.nextToken();
		if (!comand.equalsIgnoreCase("copy")) {
			System.out.println("Lỗi");
			return;
		}
		try {
			BufferedInputStream is = new BufferedInputStream(new FileInputStream(sfname));
			out.writeUTF(dfname);
			out.flush();
			byte[] data = new byte[102400];
			int i;
			while ((i = is.read(data)) != -1) {
				out.write(data, 0, i);
				out.flush();

			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		socket.close();
	}

	public static void main(String[] args) throws IOException {
		Client c = new Client();
	}
}