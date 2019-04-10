package Demo;

import java.util.*;

public class Subsetn {
	/*
	 * public static ArrayList<String> getpowerset(int a[], int n,
	 * ArrayList<String> ps) { if (n < 0) { return null; } if (n == 0) { if (ps
	 * == null) ps = new ArrayList<String>(); ps.add(" "); return ps; } ps =
	 * getpowerset(a, n - 1, ps); ArrayList<String> tmp = new
	 * ArrayList<String>(); for (String s : ps) { if (s.equals(" ")) tmp.add(""
	 * + a[n - 1]); else tmp.add(s + a[n - 1]); } ps.addAll(tmp); return ps; }
	 */
	public static <T> List<List<T>> powerset(Collection<T> list) {
		List<List<T>> ps = new ArrayList<List<T>>();
		ps.add(new ArrayList<T>()); // add the empty set

		// for every item in the original list
		for (T item : list) {
			List<List<T>> newPs = new ArrayList<List<T>>();

			for (List<T> subset : ps) {
				// copy all of the current powerset's subsets
				newPs.add(subset);

				// plus the subsets appended with the current item
				List<T> newSubset = new ArrayList<T>(subset);
				newSubset.add(item);
				newPs.add(newSubset);
			}

			// powerset is now powerset of list.subList(0, list.indexOf(item)+1)
			ps = newPs;
		}
		return ps;
	}
	public static void main(String[] args) {
		/*
		 * int a[] = { 1, 2, 6, 4 }; int n = 4;
		 */
		/*ArrayList<String> list = new ArrayList<>();
		list.add("A");
		list.add("D");
		list.add("Y");
		list.add("U");
		System.out.println(powerset(list));*/
		ArrayList<Integer> test1 = new ArrayList<>();
		test1.add(10);
		test1.add(11);
		test1.add(12);
		test1.add(13);
		test1.add(14);
		test1.add(15);
		System.out.println(powerset(test1));
	}
}
