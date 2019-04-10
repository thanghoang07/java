/*package tuan13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Random;

public class ArraySet<T> implements SetADT<T> {
	private final int DEFAULT_CAPACITY = 100;
	private final int NOT_FOUND = -1;
	private int count;
	private T[] contents; // contents

	// Creates an empty set using the default capacity.
	public ArraySet() {
		count = 0;
		T[] ts = (T[]) (new Object[DEFAULT_CAPACITY]);
		contents = ts;
	}

	// Creates an empty set using the default capacity.
	public ArraySet(int initialCapacity) {
		count = 0;
		contents = (T[]) (new Object[DEFAULT_CAPACITY]);
	}

	@Override
	public void add(T element) {
		if (!(contains(element))) {
			if (size() == contents.length)
				expandCapacity();
			contents[count] = element;
			count++;
		}
	}

	@Override
	public void addAll(SetADT<T> set) {
		Iterator<T> itr = set.iterator();
		while (itr.hasNext())
			add(itr.next());
	}

	@Override
	public T removeRandom() throws EmptySetException {
		if (isEmpty())
			throw new EmptySetException();
		// Create a random index
		Random rand = new Random();
		int rIndex = rand.nextInt(count);

		T result = contents[rIndex];
		contents[rIndex] = contents[count - 1];
		// fill the gap
		contents[count - 1] = null;
		count--;
		return result;
	}

	@Override
	public T remove(T target) throws EmptySetException, NoSuchElementException {
		int search = NOT_FOUND;
		if (isEmpty())
			throw new EmptySetException();
		for (int index = 0; index < count && search == NOT_FOUND; index++)
			if (contents[index].equals(target))
				search = index;
		if (search == NOT_FOUND)
			throw new NoSuchElementException();
		T result = contents[search];
		contents[search] = contents[count - 1];
		contents[count - 1] = null;
		count--;
		return result;
	}

	@Override
	public SetADT<T> union(SetADT<T> set) {
		ArraySet<T> both = new ArraySet<T>();
		for (int index = 0; index < count; index++)
			both.add(contents[index]);
		Iterator<T> itr = set.iterator();
		while (itr.hasNext())
			both.add(itr.next());
		return both;
	}

	@Override
	public SetADT<T> difference(SetADT<T> set) {
		return set;
		
		 * ArraySet<T> agr = (ArraySet<T>) set; ArraySet<T> result = new
		 * ArraySet<T>(); for (int i = 0; i <= count; i++) if (agr.contents[i]
		 * <= contents[i]) result.contents[i] = contents[i] && !agr.contents[i];
		 * return result;
		 
	}

	@Override
	public boolean contains(T target) {
		int search = NOT_FOUND;
		for (int index = 0; index < count && search == NOT_FOUND; index++)
			if (contents[index].equals(target))
				search = index;
		return (search != NOT_FOUND);
	}

	@Override
	public boolean equals(SetADT<T> set) {
		boolean result = false;
		T obj;
		ArraySet<T> temp1 = new ArraySet<T>();
		ArraySet<T> temp2 = new ArraySet<T>();
		if (size() == set.size()) {
			temp1.addAll(this);
			temp2.addAll(set);
			Iterator<T> itr = set.iterator();
			while (itr.hasNext()) {
				obj = itr.next();
				if (temp1.contains(obj)) {
					temp1.remove(obj);
					temp2.remove(obj);
				}
			} // end of while
			result = (temp1.isEmpty() && temp2.isEmpty());
		} // end of if
		return result;

	}

	@Override
	public boolean isEmpty() {
		return (count == 0);
	}

	@Override
	public int size() {
		return count;
	}

	@Override
	public Iterator<T> iterator() {
		return new ArrayIterator<T>(contents, count);
	}

	// -----------------------------------------------------
	private void expandCapacity() {
		T[] larger = (T[]) (new Object[contents.length * 2]);
		for (int index = 0; index < contents.length; index++)
			larger[index] = contents[index];
		contents = larger;
	}

	public String toString() {
		StringBuilder inRa = new StringBuilder();
		if (contents.length == 0)
			inRa.append("[]");
		for (int i = 0; i < contents.length; i++) {
			if (contents[i] != null)
				inRa.append("|" + contents[i] + "|");
		}
		return inRa.toString();
	}

	@Override
	public T removeAll(SetADT<T> set) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T retainAll(SetADT<T> set) {
		// TODO Auto-generated method stub
		return null;
	}

	
	 * public boolean subset(SetADT<T> set) { for (int i = 0; i < set.size();
	 * i++) { if (.contains(s.get(i))) { return true; } } return false; }
	 
	// https://github.com/yuzhangcmu/LeetCode/blob/master/dfs/Subsets.java
	// http://www.stefan-pochmann.info/spots/tutorials/sets_subsets/
	// http://www.dreamincode.net/forums/topic/254302-generating-subsets/page__st__30
	// http://fivedots.coe.psu.ac.th/Software.coe/ADSA/Ford%20and%20Topp/Code/docs/ds/util/Sets.html
	// http://javamop.googlecode.com/svn/trunk/src/logicrepository/plugins/ltl/SetOperations.java
	// http://www.java2s.com/Code/Java/Collections-Data-Structure/Setoperationsunionintersectiondifferencesymmetricdifferenceissubsetissuperset.htm
	public void isSubSet(SetADT<T> set, int key) {
		ArraySet<T> tem = new ArraySet<>();// allSubSet
		if (set.size() == key) {
			ArraySet<T> tem2 = new ArraySet<>();
			tem.addAll(tem2);
		} else {
			isSubSet(set, key + 1);
			ArraySet<T> tem3 = new ArraySet<>();
		}
	}

	public boolean containsAll(SetADT<T> set) {
		Iterator<T> it = set.iterator();
		while (it.hasNext()) {
			if (!contains(it.next())) {
				return false;
			}
		}
		return true;
	}

	public boolean subset(SetADT<T> set1, SetADT<T> set2) {
		return set2.containsAll(set1);
	}

	private ArrayList<T> list;

	public ArraySet<T> subSet(T fromE, T toE) {
		return subSet(fromE, true, toE, false);
	}

	public NavigableSet<E> subSet(E fromElement, boolean fromInclusive,

			E toElement, boolean toInclusive) {

		return new TreeSet<>(m.subMap(fromElement, fromInclusive,

				toElement, toInclusive));

	}

}
*/