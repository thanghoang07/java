package Demo;

import java.util.ArrayList;
import java.util.List;

public class FindSubsets {

	/**
	 * Find all the subsets of in, recursively.
	 * 
	 * @param <T>
	 *            the type of item items in the set.
	 * @param in
	 *            the set to get subsets off.
	 * @return the list of subsets of in. The order is the same as doing binary
	 *         counting with the least significant digit on the right.
	 */
	public static <T> List<List<T>> findAll(List<T> in) {
		/*
		 * we can do this recursively, we either exclude or include the first
		 * item, and join all the deeper subsets to it.
		 */

		if (in.size() == 0) {
			/*
			 * the base case is just the empty set.
			 */
			List<List<T>> out = new ArrayList<List<T>>();
			out.add(new ArrayList<T>());
			return out;
		}

		List<List<T>> out = new ArrayList<List<T>>();

		T first = in.get(0);
		List<List<T>> rest = findAll(in.subList(1, in.size()));

		/*
		 * first all the sets excluding the first item
		 */
		for (List<T> r : rest) {
			out.add(r);
		}

		/*
		 * next all the sets including the first item
		 */
		for (List<T> r : rest) {
			List<T> s = new ArrayList<T>();
			s.add(first);
			s.addAll(r);
			out.add(s);
		}

		return out;
	}

	/**
	 * Find all the subsets of in, non-recursively.
	 * 
	 * @param <T>
	 *            the type of item items in the set.
	 * @param in
	 *            the set to get subsets off.
	 * @return the list of subsets of in.
	 */
	public static <T> List<List<T>> findAllFlat(List<T> in) {
		List<List<T>> out = new ArrayList<List<T>>();
		out.add(new ArrayList<T>());

		for (T i : in) {
			List<List<T>> next = new ArrayList<List<T>>();
			for (List<T> j : out) {
				next.add(j);

				List<T> k = new ArrayList<T>(j);
				k.add(i);
				next.add(k);
			}
			out = next;
		}

		return out;
	}

}