/*package tuan8_stack;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class ReverseArrayUsingStack {
	private static String output;
	private static Scanner nhapVao;
	
	static int mang1[];
	static int n = 0;
	static int m = 0;
	static int i;
	static final int MAX = 10;
	public static int[] reverse(int[] data) {

		Stack<Integer> stack = new Stack<Integer>();

		for (int i = 0; i < data.length; i++)
			stack.push(data[i]);

		for (int i = 0; i < data.length; i++)
			data[i] = stack.pop();

		return data;
	}
	public static <T> T[] taoMang(int n)
	{
		T[] mang1 = (T[]) new [n];
		Random abc = new Random();  
	    for( i = 0; i < n; i++)  
	    	mang1[i] = abc.nextInt(MAX);
		return mang1;
	}
	public static <T> void  inMang(T[] mang1)
	{
		for (T x : mang1) 
			System.out.print("|" + x + "|");
	}
	
	public static <T> T[] daoMang(T[] mang){
		ArrayStack<T> wen = new ArrayStack<T>(mang.length);
		for (int i = 0; i < mang.length; i++) {
			wen.push(mang[i]);
		}
		output = "";
		while (!wen.isEmpty()) {
			for (int i = 0; i < mang.length; i++)
				mang[i] = wen.pop();
		}
		//return output.toString();
		return mang;
	}
	public static void main(String[] args) {
			
		nhapVao = new Scanner(System.in);
		System.out.println("nhap vao n: ");
		n = nhapVao.nextInt();
		int[] mang1 = new int[n];
		//mang1 = taoMang(n);
		System.out.println("in mang: ");
		//inMang(mang1);		
	
		System.out.println("\ndao: " + ReverseArrayUsingStack.daoMang(mang1));
		
		//System.out.println("dao: " + ReverseArrayUsingStack.daoMang(mang1));

		System.out.println(Arrays.toString(a));

		System.out.println(Arrays.toString(reverse(a)));

	}
	
	  public static String daoNguoc(String in) { ArrayStack<Character> theStack
	 * = new ArrayStack(in.length()); for (int i = 0; i < in.length(); i++) {
	 * theStack.push(in.charAt(i)); } StringBuilder output = new
	 * StringBuilder(); while (!theStack.isEmpty()) {
	 * output.append(theStack.pop()); } return output.toString(); }
	 * 
	 * public static void main(String[] args) { Scanner in = new
	 * Scanner(System.in); System.out.println("Nhập chuỗi: "); String input =
	 * in.nextLine(); String reversed = daoNguoc(input);
	 * System.out.println(reversed); }
	 
}
*/