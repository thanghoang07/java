package demo_3_collection;
//retainAll
import java.util.*;

public class TestCollection5
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
		
		aL.retainAll(aL2);
		
		System.out.println("......");
		
		Iterator<String> itr = aL.iterator();
		
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
