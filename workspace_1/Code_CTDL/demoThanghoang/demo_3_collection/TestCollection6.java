package demo_3_collection;

import java.util.Iterator;
import java.util.LinkedList;

public class TestCollection6
{
	public static void main(String[] args) 
	{
		LinkedList<String> aL = new LinkedList<String>();
		aL.add("Ravi");
		aL.add("Vijay");
		aL.add("Ravi");
		aL.add("Ajay");
		
		Iterator<String> itr = aL.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
