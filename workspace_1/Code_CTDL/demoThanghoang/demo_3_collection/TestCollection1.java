package demo_3_collection;
//cach thong thuong
import java.util.*;

public class TestCollection1 {
	public static void main(String args[])
	{
		// creating arraylist
		ArrayList<String> aL = new ArrayList<String>();
		// adding object in arraylist
		aL.add("Nguoi thu nhat");
		aL.add("Nguoi thu hai");
		aL.add("Nguoi thu ba");
		aL.add("Nguoi thu tu");

		// getting Iterator from arraylist to
		Iterator<String> itr = aL.iterator();
		// traverse elements
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
