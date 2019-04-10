package tuan7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Server {
	Socket socket;
	BufferedReader br;
	PrintWriter pw;

	public Server() throws IOException {
		ServerSocket ss = new ServerSocket(12345);
		System.out.println("Waiting......");
		socket = ss.accept();
		System.out.println("Connected");

		while (true) {
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw = new PrintWriter(socket.getOutputStream(), true);
			process(br, pw);
			br.close();
			pw.close();
			socket.close();

		}
	}

	private void process(BufferedReader br2, PrintWriter pw2) throws IOException {
		String command;
		ArrayList<SinhVien> list = null;
		while (true) {
			command = br.readLine();
			StringTokenizer token = new StringTokenizer(command, "\t");
			String acton = token.nextToken();
			if (acton.equalsIgnoreCase("findByName")) {
				list = SinhVienDao.findByName(token.nextToken());
			} else if (acton.equalsIgnoreCase("findByAge")) {
				list = SinhVienDao.findByAge(Integer.parseInt(token.nextToken()));
			} else if (acton.equalsIgnoreCase("findByDiem")) {
				list = SinhVienDao.findByDiem(Double.parseDouble(token.nextToken()));
			} else if (acton.equalsIgnoreCase("Exit"))
				break;
			pw.println(list.size());
			for (SinhVien sv : list) {
				pw.println(sv.toString());
			}
		}

	}

	public static void main(String[] args) throws IOException {
		new Server();
	}
}
