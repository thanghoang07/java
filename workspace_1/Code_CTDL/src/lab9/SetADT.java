package lab9;

import java.util.Iterator;

public interface SetADT<T> {
	// Add one element to this set, ignoring duplicates
	public void add(T element);

	// Add all elments of set into this set, ignoring duplicates
	public void addAll(SetADT<T> set);

	// Removes and returns a random element from this set
	public T removeRandom();

	// Removes and returns the specified element from this set
	public T remove(T element);

	// Return the union of this set and the parameter
	public SetADT<T> union(SetADT<T> set);

	public SetADT<T> intersect(SetADT<T> set);

	// Return true if this set contains the parameter
	public boolean contains(T target);

	// Return true if this set and the parameter contain exactly the same
	// elements
	public boolean equals(SetADT<T> set);

	// Return true if this set is empty
	public boolean isEmpty();

	// Return the number of elements in the set
	public int size();

	// Return an iterator for the elements in the set
	public Iterator<T> iterator();

	// Return a string representation of the set
	public String toString();

	public boolean containsAll(SetADT<T> set1);

	public boolean isSubSet(SetADT<T> set);
	
	public SetADT<T> difference(SetADT<T> set);
}