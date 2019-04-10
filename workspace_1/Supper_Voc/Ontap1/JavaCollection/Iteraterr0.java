package JavaCollection;

import java.util.*;

public class Iteraterr0 {
	public static void main(String[] args) {
		Collection<String> myColl = new ArrayList<String>();
		myColl.add("New York");
		myColl.add("Atlanta");
		myColl.add("Dallas");
		myColl.add("Madison");
		Iterator<String> iterator = myColl.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next().toUpperCase() + " ");
		}
		System.out.println();
	}
}
