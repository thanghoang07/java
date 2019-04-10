package demo_3_collection;

import java.util.*;
//removeAll
public class TestCollection4 
{
	public static void main(String[] args) 
	{
		ArrayList<String> aL = new ArrayList<String>();
		aL.add("Ravi");
		aL.add("Vijay");
		aL.add("Ajay");
		
		ArrayList<String> aL2 = new ArrayList<String>();
		aL2.add("Ravi");
		aL2.add("Hanumat");
		
		aL.removeAll(aL2);
		
		System.out.println("........");
		Iterator<String> itr = aL.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
