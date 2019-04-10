package calculatorClientServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class CalculatorClient {
	private int port = 12345;
	private String ip = "127.0.0.1";

	public void sendComputing() throws IOException, UnknownHostException {
		Socket sc = new Socket(ip, port);
		System.out.println("Accept Connects ....");
		// user input
		System.out.println("Nhap vao gia tri can tinh: a +(-*/) b");
		BufferedReader fs = new BufferedReader(new InputStreamReader(System.in));
		// send data
		String readUser = fs.readLine();
		//
		PrintWriter ws = new PrintWriter(sc.getOutputStream(), true);
		ws.println(readUser);
		//
		BufferedReader recrServer = new BufferedReader(new InputStreamReader(sc.getInputStream()));
		//
		String line = recrServer.readLine();
		//
		if(line.equalsIgnoreCase("null")) {
			System.out.println("No found command");
		}
		ws.println(line);
		sc.close();
		fs.close();
		ws.close();
		recrServer.close();
	}

	public static void main(String[] args) throws IOException, UnknownHostException {
		CalculatorClient c = new CalculatorClient();
		c.sendComputing();
	}
}
