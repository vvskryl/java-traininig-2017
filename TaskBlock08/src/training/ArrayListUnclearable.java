package training;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

/**
 * ArrayListUnclearable is usual {@link java.util.ArrayList ArrayList} without support methods,
 * that remove elements and clear all array.
 * 
 * @author
 * Created by Viacheslav Skryl on 18.11.2017
 */

public class ArrayListUnclearable<E> extends ArrayList<E> {
	/**
	 * @serial Generated serial version ID
	 */
	private static final long serialVersionUID = -6748027849694558233L;
	
	//Constructors
	/**
	 * Empty constructor
	 */
	public ArrayListUnclearable() {
		super();
	}
	/**
	 * Constructor from Collection
	 * @param c is Collection that fills ArrayListUnclearable
	 */
	public ArrayListUnclearable(Collection<? extends E> c) {
		super(c);
	}
	/**
	 * Constructor with capacity
	 * @param initialCapacity define a capacity
	 */
	public ArrayListUnclearable(int initialCapacity) {
		super(initialCapacity);
	}
	/**
	 * Constructor from Array
	 * @param input is an array
	 */
	public ArrayListUnclearable(E[] input) {
		for (E element: input) {
			this.add(element);
		}
	}
	
	//Methods
	/**
	 * @deprecated Removing elements is unsupported
	 * @throws UnsupportedOperationException if the method is called
	 */
	public void clear() {
		throw new UnsupportedOperationException();
	}
	/**
	 * @deprecated Removing elements is unsupported
	 * @throws UnsupportedOperationException if the method is called
	 */
	public E remove(int index) {
		throw new UnsupportedOperationException();
	}
	/**
	 * @deprecated Removing elements is unsupported
	 * @throws UnsupportedOperationException if the method is called
	 */
	public boolean remove(Object o) {
		throw new UnsupportedOperationException();
	}
	/**
	 * @deprecated Removing elements is unsupported
	 * @throws UnsupportedOperationException if the method is called
	 */
	public boolean removeAll(Collection<?> c) {
		throw new UnsupportedOperationException();
	}
	/**
	 * @deprecated Removing elements is unsupported
	 * @throws UnsupportedOperationException if the method is called
	 */
	public boolean removeIf(Predicate<? super E> filter) {
		throw new UnsupportedOperationException();
	}
	/**
	 * @deprecated Removing elements is unsupported
	 * @throws UnsupportedOperationException if the method is called
	 */
	protected void removeRange(int fromIndex, int toIndex) {
		throw new UnsupportedOperationException();
	}
	/**
	 * @deprecated Removing elements is unsupported
	 * @throws UnsupportedOperationException if the method is called
	 */
	public boolean retainAll(Collection<?> c) {
		throw new UnsupportedOperationException();
	}
}
