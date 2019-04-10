package demo_3_collection;

import java.util.*;
//them phan tu tu mang hai vao mang thu nhat 
//va in ra mang thu nhat sau khi them vao
public class TestCollection3
{
	public static void main(String[] args)
	{
		ArrayList<String> aL = new ArrayList<String>();
		aL.add("Nguoi thu nhat mang 1");
		aL.add("Nguoi thu hai mang 1");
		aL.add("Nguoi thu ba mang 1");

		ArrayList<String> aL2 = new ArrayList<String>();
		aL2.add("Nguoi thu nhat mang 2");
		aL2.add("Nguoi thu hai mang 2");
		aL2.add("Nguoi thu ba mang 2");
		aL2.add("Nguoi thu tu mang 2");

		aL.addAll(aL2);
		
		Iterator<String> itr = aL.iterator();
		
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
