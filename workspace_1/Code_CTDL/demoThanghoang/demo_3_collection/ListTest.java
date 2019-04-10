package demo_3_collection;

import java.util.*;

public class ListTest
{
	public static void main(String[] args) 
	{
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.addFirst(5);
		list.add( 2 );
		list.add( 3 );
		list.add( 4 );
		list.add( 1 );
		list.addLast( 6 );
		list.add( 7 );
		list.add( 8 );
		list.add( 9 );
		list.add( 10 );
		
		
		System.out.println(list);		
		//System.out.println(list.removeFirst());
		System.out.println(list.size());
	}
}
