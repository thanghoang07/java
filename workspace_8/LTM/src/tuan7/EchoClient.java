package tuan7;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class EchoClient {
 public static void main(String[] args) throws IOException {
	Socket  socket= new Socket("localhost", 12345);
	System.out.println("Connect");
	BufferedReader br= new BufferedReader(new InputStreamReader(socket.getInputStream()));
	BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
	PrintWriter pw=new PrintWriter(socket.getOutputStream(),true);
	PrintWriter out=new PrintWriter(System.out,true);
	String command;
	while(true){
		command=in.readLine();
		pw.println(command);
		if(command.equalsIgnoreCase("EXIT"))
			break;
		command=br.readLine();
		out.println(command);
	}
		in.close();
		out.close();
		pw.close();
		br.close();
		socket.close();
}
}
