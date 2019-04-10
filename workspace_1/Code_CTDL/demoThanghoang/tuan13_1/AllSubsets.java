package tuan13_1;

import java.util.*;

public class AllSubsets {
	public static void main(String[] args) {
		Set<Integer> original = new HashSet<Integer>(); 
		for (int i = Integer.parseInt(args[0]); i > 0; i--) {
			original.add(i);
		}
		System.out.println(generateAllSubsets(original));
	}

	public static HashSet<HashSet<Integer>> generateAllSubsets(Set<Integer> original) {

		HashSet<HashSet<Integer>> allSubsets = new HashSet<HashSet<Integer>>();

		allSubsets.add(new HashSet<Integer>()); // Add empty set.

		Iterator it = original.iterator();
		while (it.hasNext()) {
			Integer element = (Integer) it.next();

			// Deep copy all subsets to temporary power set.
			HashSet<HashSet<Integer>> tempClone = new HashSet<HashSet<Integer>>();
			for (HashSet<Integer> subset : allSubsets) {
				tempClone.add((HashSet<Integer>) subset.clone());
			}

			// All element to all subsets of the temporary power set.
			Iterator it2 = tempClone.iterator();
			while (it2.hasNext()) {
				Set<Integer> s = (HashSet<Integer>) it2.next();
				s.add(element);
			}

			// Merge both power sets.
			allSubsets.addAll(tempClone);
		}
		return allSubsets;
	}
}
