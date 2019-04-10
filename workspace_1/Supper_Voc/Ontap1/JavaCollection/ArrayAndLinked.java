package JavaCollection;

import java.util.*;

public class ArrayAndLinked {
	public static void main(String[] args) {
		List<Integer> arrLst = new ArrayList<Integer>();
		arrLst.add(1); // 1 is autoboxed to new Integer(1)
		arrLst.add(2);
		arrLst.add(3);
		arrLst.add(1);
		arrLst.add(4);
		arrLst.add(0, 10);
		arrLst.add(3, 30);
		System.out.println("A list of integers in the array list:");
		System.out.println(arrLst);
		LinkedList<Object> llst = new LinkedList<Object>(arrLst);
		llst.add(1, "Red");
		llst.removeLast();
		llst.addFirst("Green");
		System.out.println("Display the linked list forward:");
		ListIterator<Object> lstItr = llst.listIterator();
		while (lstItr.hasNext()) {
			System.out.print(lstItr.next() + " ");
		}
		System.out.println("\nDisplay the linked list backward:");
		for (int i = llst.size() - 1; i >= 0; i--) {
			System.out.print(llst.get(i) + " ");
		}
	}
}
