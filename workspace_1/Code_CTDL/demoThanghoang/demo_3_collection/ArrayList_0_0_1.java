package demo_3_collection;

import java.util.*;

public class ArrayList_0_0_1 
{
	private static Scanner nhapVao;

	public static void main(String[] args) 
	{
		ArrayList<String> list = new ArrayList<String>();
		
		System.out.println("Nhap vao: ");
		
		while(true)
		{
			nhapVao = new Scanner(System.in);
			String s = nhapVao.next();
			if(s.equalsIgnoreCase("end"))
			{
				break;
			}
			list.add(s);
		}
		
		System.out.println("Mang da tao: ");
		
		for (int i = 0; i < list.size(); i++)
		{
			System.out.print((String) list.get(i) + "\t");
		}
	}
}
