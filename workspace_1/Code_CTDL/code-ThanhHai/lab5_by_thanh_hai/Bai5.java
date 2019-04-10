package lab5_by_thanh_hai;

import java.io.IOException;
import java.util.Scanner;

public class Bai5 {
	public static void main(String[] args) throws IOException {
		System.out.println("Nhap bieu thuc dang infix:");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();//"1+2*4/5-7+3/6";
		String output;
		InToPost theTrans = new InToPost(input);
		output = theTrans.doTrans();
		System.out.println("=> Bieu thuc dang Postfix la: " + output + '\n');
	}
}
