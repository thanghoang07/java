package tuan8_3_stack;

import java.util.*;

public class DecimaltoBaseN 
{
	private static Scanner nhapVao;

	public static void doiHe(int nhapSo, int nhapHe)
	{
		ArrayStack<Integer> stack = new ArrayStack<Integer>(100);
		if (nhapHe != 16)
		{
			if (nhapSo < nhapHe)
				System.out.println(nhapSo);
			else 
			{
				while (nhapSo != 0) 
				{
					int q = nhapSo / nhapHe;
					int r = nhapSo % nhapHe;
					stack.push(r);
					nhapSo = q;
				}
			}
			while (!stack.isEmpty())
			{
				System.out.print(stack.pop());
			} // end while
			System.out.println(" ");
		} 
		else
			System.out.println("loi chua co code de chuyen sang he " + nhapHe);
	}

	public static void main(String args[]) 
	{
		nhapVao = new Scanner(System.in);
		System.out.println("nhap vao he can chuyen: ");
		int nhapHe = nhapVao.nextInt();
		System.out.println("nhap vao so can chuyen: "); // user input eciaml #
		int nhapSo = nhapVao.nextInt();

		System.out.println("chuyen qua he " + nhapHe + " la:");
		doiHe(nhapSo, nhapHe);
	}
}
