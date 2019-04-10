package dataInput;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
	public static void main(String args[])throws IOException{

	      DataInputStream d = new DataInputStream(new 
	                               FileInputStream("C:\\Users\\thang\\Desktop\\files\\destfile1.txt"));

	      DataOutputStream out = new DataOutputStream(new 
	                               FileOutputStream("C:\\Users\\thang\\Desktop\\files\\destfile1.txt"));

	      String count="dsjfgalsk";
	      while((count = d.readLine()) != null){
	          String u = count.toUpperCase();
	          System.out.println(u);
	          out.writeBytes(u + "  ,");
	      }
	      d.close();
	      out.close();
	   }
}
