package Generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Bounded queue representation of type E of given size. If two items a and b is
 * inserted into this such that a comes before b, while serving a must be served
 * before b.
 * 
 * AF(c) = c[1], ... ... c[k] where k<=size. 
 * rep-inv: 
 * 1. c!=null 
 * 2. c[i]!=null for 0 <= i < size-1 
 * 3. size >= 0 
 * 4. c.size <= size
 *
 * @param <E> The Type of the elements in this.
 */
public class BoundedQueue<E> {
	private List<E> rep;
	private int size = 0;

	/**
	 * Create an empty bounded queue of given size.
	 * 
	 * @param size The given size of this.
	 * @throws IllegalArgumentException if size is negative.
	 */
	public BoundedQueue(int size) {
		if (size < 0)
			throw new IllegalArgumentException("BoundedQueue: queue size can not be negative");
		this.size = size;
		this.rep = new ArrayList<E>();
	}

	/**
	 * Checks whether this is empty or not.
	 * 
	 * @return true if this is empty, else false.
	 */
	public boolean isEmpty() {
		return this.rep.isEmpty();
	}

	/**
	 * Checks whether this is full or not.
	 * 
	 * @return true if this is full, else false.
	 */
	public boolean isFull() {
		return this.rep.size() == this.size;
	}

	/**
	 * Calculate the number of items in this.
	 * 
	 * @return the number of items in this.
	 */
	public int getCount() {
		return this.rep.size();
	}

	/**
	 * Calculate the size of this.
	 * 
	 * @return the size of this.
	 */
	public int getSize() {
		return this.size;
	}

	/**
	 * Put item e into this.
	 * 
	 * @param e the item to put into this.
	 * @throws NullPointerException  if e is null.
	 * @throws IllegalStateException if this is full while putting e into this.
	 */
	public void put(E e) {
		if (e == null)
			throw new NullPointerException("BoundedQueue.put: Can not put null into queue.");
		if (isFull())
			throw new IllegalStateException("BoundedQueue.put: The queue is full.");

		this.rep.add(e);
	}

	/**
	 * Return the first item of this.
	 * 
	 * @return the first item of this.
	 * @throws IllegalStateException if this is empty while getting the first item
	 *                               of this.
	 */
	public E get() {
		if (isEmpty())
			throw new IllegalStateException("BoundedQueue.get: The queue is empty.");
		E e = this.rep.get(0);
		this.rep.remove(0);
		return e;
	}

	/**
	 * @param elements a collection of items to put into this.
	 * @throws NullPointerException     if null elements is passed to put into this.
	 * @throws NullPointerException     if any item of elements is null.
	 * @throws IllegalArgumentException if the collection size of items exceeds this
	 *                                  size.
	 */
	public void putAll(Iterable<? extends E> elements) {
		if (elements == null)
			throw new NullPointerException("BoundedQueue.putAll: Can not put null into queue.");
		List<E> list = new ArrayList<E>();
		for (E e : elements) {
			if (e == null)
				throw new NullPointerException("BoundedQueue.putAll: Can not put null into queue.");
			list.add(e);
		}

		if (list.size() + this.rep.size() > this.size) {
			throw new IllegalArgumentException("BoundedQueue.putAll: Not have enough space in this.");
		}
		this.rep.addAll(list);
	}

	/**
	 * Put all items into destination collection from this.
	 * 
	 * @param collection The output collection where all elements of this will be
	 *                   put.
	 * @throws NullPointerException if the destination collection is null.
	 */
	public void getAll(Collection<? super E> collection) {
		if (collection == null)
			throw new NullPointerException("BoundedQueue:getAll: destination collection can not be null");
		if (isEmpty())
			throw new IllegalStateException("BoundedQueue.getAll: The queue is empty.");

		collection.addAll(this.rep);
		this.rep.clear();
	}

	/**
	 * Checks whether this is ok or not.
	 * 
	 * @return true if this is ok, else false.
	 */
	public boolean repOk() {
		return this.rep != null && !this.rep.contains(null) && this.size >= 0 && this.rep.size() <= this.size;
	}

	/**
	 * Produce the string representation of this.
	 * 
	 * @return the string representation of this.
	 */
	@Override
	public String toString() {
		return this.rep.toString();
	}

	public static void main(String args[]) {
		BoundedQueue<Number> queue = new BoundedQueue<Number>(10);
		for (int i = 0; !queue.isFull(); i++) {
			queue.put(Integer.valueOf(i));
			System.out.println("put: " + i);
		}
		while (!queue.isEmpty()) {
			System.out.println("get: " + queue.get());
		}
	}
}
