package demo_3_collection;

import java.util.ArrayList;
import java.util.Iterator;

public class TestCollection_Java_CTDL_1 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> num = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++)
		{
			num.add(i);
		}
		Iterator<Integer> itr = num.iterator();
		int sum = 0;
		while (itr.hasNext())
		{
			sum += itr.next();
			System.out.print(sum + "|");
		}
	}
}
