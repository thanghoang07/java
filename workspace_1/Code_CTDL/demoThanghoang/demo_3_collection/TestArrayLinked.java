package demo_3_collection;

import java.util.*;

public class TestArrayLinked
{
	public static void main(String args[])
	{
		// creating arraylist
		List<String> aL = new ArrayList<String>();
		// adding object in arraylist
		aL.add("Ravi");
		aL.add("Vijay");
		aL.add("Ravi");
		aL.add("Ajay");
		// creating linkedlist
		List<String> aL2 = new LinkedList<String>();
		// adding object in linkedlist
		aL2.add("James");
		aL2.add("Serena");
		aL2.add("Swati");
		aL2.add("Junaid");

		System.out.println("arraylist: \t" + aL);
		System.out.println("linkedlist: \t" + aL2);
	}
}
