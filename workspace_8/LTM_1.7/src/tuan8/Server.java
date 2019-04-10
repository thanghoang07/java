package tuan8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Server extends Thread {
	Socket socket;
	BufferedReader in;
	PrintWriter out;
	int port = 12345;

	HashMap<String, Student> map = new HashMap<>();

	List<String> comment = new LinkedList<>();
	{
		comment.add("Su dung nhung lenh sau de thao tac voi sv");
		comment.add("THEM_msv_hoten_sdt_diem");
		comment.add("SUA_msv_hoten_sdt_diem");
		comment.add("XOA_msv");
		comment.add("XEM");
	}

	public Server(Socket s) throws IOException {
		socket = s;
	}

	@Override
	public void run() {
		super.run();
		try {
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream(), true);
			out.println("Welcome to Student manament Service");
			String line;
			while (true) {
				WML(comment);
				line = in.readLine();
				StringTokenizer token = new StringTokenizer(line, "_");
				if (token.countTokens() > 0) {
					String comment = token.nextToken();
					switch (comment.toUpperCase()) {
					case "THEM":
						them(line);
						break;
					case "XOA":
						xoaSV(line);
						break;
					case "SUA":
						suaSV(line);
						break;
					case "XEM":
						xem();
						break;
					case "EXIT":
						in.close();
						out.close();
						socket.close();
						break;
					default:
						break;
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void them(String line) {
		StringTokenizer token = new StringTokenizer(line, "_");
		if (token.countTokens() == 5) {
			try {
				token.nextToken();
				line = token.nextToken();
				map.put(line,
						new Student(line, token.nextToken(), token.nextToken(), Double.parseDouble(token.nextToken())));
				out.println("Them SV Thành công");
			} catch (NumberFormatException e) {

				out.println("Diem cua sinh vien bi sai ");

			}
		} else {
			out.println("Sai cu phap ");
		}
	}

	private void suaSV(String line) {
		StringTokenizer token = new StringTokenizer(line, "_");
		if (token.countTokens() == 5) {
			try {
				token.nextToken();
				line = token.nextToken();
				if (map.get(line) != null) {
					map.put(line, new Student(line, token.nextToken(), token.nextToken(),
							Double.parseDouble(token.nextToken())));
					out.println("Sua SV Thành công");
				} else {
					out.println("SV khong ton tai");
				}
			} catch (NumberFormatException e) {

				out.println("Diem cua sinh vien bi sai ");

			}
		} else {
			out.println("Sai cu phap ");
		}
	}

	private void xoaSV(String line) {
		StringTokenizer token = new StringTokenizer(line, "_");
		if (token.countTokens() == 2) {
			try {
				token.nextToken();
				line = token.nextToken();
				if (map.get(line) != null) {
					map.remove(line);
					out.println("Xoa SV Thành công");
				} else {
					out.println("SV khong ton tai");
				}
			} catch (NumberFormatException e) {

				out.println("Loi");

			}
		} else {
			out.println("Sai cu phap ");
		}
	}

	private void xem() {
		List<String> list = new LinkedList<>();
		for (Student s : map.values()) {
			list.add(s.toString());
		}
		WML(list);

	}

	public void WML(List<String> list) {
		for (String s : list) {
			out.println(s);
		}
		out.println(".");
	}

	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(12345);
		while (true) {
			new Server(ss.accept()).start();
		}
	}
}
