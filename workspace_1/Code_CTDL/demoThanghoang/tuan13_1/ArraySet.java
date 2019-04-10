// https://github.com/yuzhangcmu/LeetCode/blob/master/dfs/Subsets.java
	// http://www.stefan-pochmann.info/spots/tutorials/sets_subsets/
	// http://www.dreamincode.net/forums/topic/254302-generating-subsets/page__st__30
	// http://fivedots.coe.psu.ac.th/Software.coe/ADSA/Ford%20and%20Topp/Code/docs/ds/util/Sets.html
	// http://javamop.googlecode.com/svn/trunk/src/logicrepository/plugins/ltl/SetOperations.java
	// http://www.java2s.com/Code/Java/Collections-Data-Structure/Setoperationsunionintersectiondifferencesymmetricdifferenceissubsetissuperset.htm
package tuan13_1;

import java.io.Serializable;
import java.util.*;

public class ArraySet extends AbstractSet implements Cloneable, Serializable {

	private ArrayList<Object> list;

	public ArraySet() {
		list = new ArrayList<Object>();
	}

	public ArraySet(Collection<String> col) {
		list = new ArrayList<Object>();

		// No need to check for dups if col is a set
		Iterator<String> itor = col.iterator();
		if (col instanceof Set) {
			while (itor.hasNext()) {
				list.add(itor.next());
			}
		} else {
			while (itor.hasNext()) {
				add(itor.next());
			}
		}
	}

	public Iterator<Object> iterator() {
		return list.iterator();
	}

	public int size() {
		return list.size();
	}

	public boolean add(Object element) {
		boolean modified;
		if (modified = !list.contains(element)) {
			list.add(element);
		}
		return modified;
	}

	public boolean remove(Object element) {
		return list.remove(element);
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}

	public boolean contains(Object element) {
		return list.contains(element);
	}

	public void clear() {
		list.clear();
	}

	public Object clone() {
		try {
			ArraySet newSet = (ArraySet) super.clone();
			newSet.list = (ArrayList<Object>) list.clone();
			return newSet;
		} catch (CloneNotSupportedException e) {
			throw new InternalError();
		}
	}

	public static void main(String args[]) {
		String elements[] = { "Java", "Source", "and", "Support", "." };
		Set set = new ArraySet(Arrays.asList(elements));
		Iterator iter = set.iterator();
		while (iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
	}
}
