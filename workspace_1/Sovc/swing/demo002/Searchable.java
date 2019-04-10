package demo002;

import java.util.Collection;

public interface Searchable<E, V> {
	public Collection<E> search(V value);
}
