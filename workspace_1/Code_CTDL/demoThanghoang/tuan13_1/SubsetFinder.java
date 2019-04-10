package tuan13_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Demo of a recursive method for finding all subsets of a specified size.
 */
public class SubsetFinder {
	public static void main(String[] args) {
		// Try finding the 4-element subsets of a 7-element set
		String test = "ABCDE";
		ArrayList<String> subsets = findSubsets(test, 2);

		// sort the results, individually and lexicographically, to
		// make it easier to read
		for (int i = 0; i < subsets.size(); ++i) {
			subsets.set(i, sortChars(subsets.get(i)));
		}
		Collections.sort(subsets);

		// print everything out
		for (String s : subsets) {
			System.out.println(s);
		}
		System.out.println("Found " + subsets.size() + " subsets");
	}

	/**
	 * Finds all subsets of the given set with 'size' elements. Each subset is
	 * represented as a string in which the elements in the set are distinct
	 * characters. Order of the characters does not matter.
	 * 
	 * @param givenSet
	 *            string consisting of distinct characters representing elements
	 *            of a set
	 * @param size
	 *            size of subsets to select
	 * @return list of all possible size-element subsets of the given set
	 */
	public static ArrayList<String> findSubsets(String givenSet, int size) {
		// Empty array list in which to put the results
		ArrayList<String> results = new ArrayList<String>();

		// Initially no values are chosen
		String chosen = "";

		// Start the recursive search using helper method
		findSubsets(chosen, givenSet, size, results);

		return results;
	}

	/**
	 * Recursive helper method finds all subsets that can be obtained by
	 * selecting 'howMany' elements from 'available' and adding them to
	 * 'chosen'. Results are added to the given array list 'results'.
	 * 
	 * @param chosen
	 *            string containing elements already selected
	 * @param available
	 *            string containing elements available to be selected
	 * @param howMany
	 *            number of additional elements to select
	 * @param results
	 *            all subsets found so far
	 */
	private static void findSubsets(String chosen, String available, int howMany, ArrayList<String> results) {
		if (howMany == 0) {
			// Base case (success): we've selected enough elements, add chosen
			// elements to list
			results.add(chosen);
		} else if (available.length() == 0) {
			// Base case (failure): there are no more elements available to
			// select, so
			// this is a dead end
			return;
		} else {
			// Recursive case: take the first available element. Possible
			// subsets either include it, or they don't.
			char ch = available.charAt(0);
			String remaining = available.substring(1);

			// First, find all subsets that DO include ch, by selecting
			// howMany - 1 more elements from remaining...
			findSubsets(chosen + ch, remaining, howMany - 1, results);

			// Then find subsets that DON'T include ch, by selecting howMany
			// more
			// elements from remaining
			findSubsets(chosen, remaining, howMany, results);
		}
	}

	/**
	 * Puts the characters in a string in ascending order.
	 * 
	 * @param s
	 * @return
	 */
	private static String sortChars(String s) {
		char[] arr = s.toCharArray();
		Arrays.sort(arr);
		return new String(arr);
	}
}
