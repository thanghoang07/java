package lab9;

import java.util.*;

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
	public boolean contains(T target) {
		int search = NOT_FOUND;
		for (int index = 0; index < count && search == NOT_FOUND; index++)
			if (contents[index].equals(target))
				search = index;
		return (search != NOT_FOUND);
	}

	@Override
	public boolean isSubSet(SetADT<T> set) {
		ArraySet<T> tem = new ArraySet<>();
		return set.containsAll(tem);
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

	@Override
	public SetADT<T> intersect(SetADT<T> set) {
		ArraySet<T> d = new ArraySet<T>();
		for (int i = 0; i < count; i++) {
			if (set.contains(contents[i])) {
				d.add(contents[i]);
			}
		}
		return d;
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

	private void expandCapacity() {
		T[] larger = (T[]) (new Object[contents.length * 2]);
		for (int index = 0; index < contents.length; index++)
			larger[index] = contents[index];
		contents = larger;
	}

	public String toString() {
		StringBuilder inRa = new StringBuilder();
		if (contents.length == 0)
			inRa.append(" ");
		for (int i = 0; i < contents.length; i++) {
			if (contents[i] != null)
				inRa.append(contents[i] + " ");
		}
		return inRa.toString();
	}

	@Override
	public SetADT<T> difference(SetADT<T> set) {
		/*ArraySet<T> agr = (ArraySet<T>) set;
		ArraySet<T> result = new ArraySet<T>();
		for (int i = 0; i <= count; i++)
			if (agr.contents[i] <= set.contents[i])
				result.contents[i] = contents[i] && !agr.contents[i];
*/
		return null;
	}
}
