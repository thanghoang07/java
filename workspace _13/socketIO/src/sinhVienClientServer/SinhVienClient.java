package sinhVienClientServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class SinhVienClient {
	final static int port = 444;
	final static String ip = "127.0.0.1";

	public static void sendComputing() throws UnknownHostException, IOException {
		while (true) {
			Socket sc = new Socket(ip, port);// socket co che truyen thong giua hai may tinh su dung tcp
			System.out.println("connect to server");
			// User input data
			BufferedReader fs = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter format : a +/* b");
			// read request client
			String readUser = fs.readLine();
			//// send request to server // gui yeu cau ket noi den sever
			PrintWriter ws = new PrintWriter(new OutputStreamWriter(sc.getOutputStream()), true);
			System.out.println("User : " + readUser);
			ws.println(readUser);
			// Receive data from server
			BufferedReader recrServer = new BufferedReader(new InputStreamReader(sc.getInputStream()));
			String line = recrServer.readLine();
			if (line.equalsIgnoreCase("Exit")) {
				System.out.println("Client  Goodbye!");
				sc.close();
				return;
			}
			if (line.equalsIgnoreCase("Again Input")) {
				System.out.println("No found Command");
			} else {
				System.out.println(line);
				ws.println(line);
			}

		}
	}
}
