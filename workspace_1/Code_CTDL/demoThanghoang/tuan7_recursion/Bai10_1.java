package tuan7_recursion;

import java.util.Scanner;

public class Bai10_1 
{
	private static int soN;
	private static Scanner nhapVao;

	public static String printStar1(int count)
	{
		if (count <= 0)
			return "";
		else 
		{
			String pS1_1 = printStar1(count - 1);
			pS1_1 = "*" + pS1_1;
			System.out.print(pS1_1 + "\n");			
			return pS1_1;
		}
	}
	public static String printStar2(int count)
	{
		if(count == 0)
		{
			return "";
		}
		else
		{
			String pS2_1 = printStar2(count - 1);
			pS2_1 = "*" + pS2_1;
			System.out.print(pS2_1 + "\n");			
			return pS2_1;
		}
	}
	public static void printStar1_0 (int line, int size, int count) {
	    if (count == 0)
	        return;
	    if (line == 0){ 
	        System.out.println();
	        printStar1_0(size + 1, size + 1, count - 1);
	    }
	    else
	    {
	        System.out.print("*");
	        printStar1_0(line - 1, size, count);
	    }
	}
	public static void printStar1_1 (int line, int size, int count) {
	    if (count == 0)
	        return;
	    else if (line != 0){ 
	    	printStar1_0(line - 1, size, count);
	        System.out.print("*");      
	    }
	    else
	    {	    	
	        printStar1_0(size + 1, size + 1, count - 1);
	        System.out.println();	
	    }
	}

	public static void main(String[] args)
	{
		nhapVao = new Scanner(System.in);
		System.out.println("nhap vao: ");
		soN = nhapVao.nextInt();
		
		System.out.println("in ra hinh1: " );
		printStar1(soN);
		
		System.out.println("in ra hinh2: " );
		printStar2(soN);
		
		System.out.println("in ra hinh3: " );
		printStar1_0(1, 1, soN);

		System.out.println("in ra hinh4: " );
		printStar1_1(1, 1, soN);
	}
}
