import java.util.*;

// See Liskov exercise 7.11
// This version is generified
public class Bag<E> {

	// rep: map each object to the count of that object in this
	// rep-inv: range of map contains only positive integers
	// Example: A bag of 2 cats and a dog is map = { cat=2, dog=1 }

	private Map<E, Integer> map;

	/**
	 * Initializes an empty bag.
	 */
	public Bag() {
		map = new HashMap<E, Integer>();
	}

	// add 1 occurrence of e to this
	/**
	 * This will put e into this and adjust the occurrence of e in this. If e is
	 * already in this, increment number of occurrence of e by 1; else put e in this
	 * with number of occurrence of e 1
	 * 
	 * @param e The item to insert in this.
	 */
	public void insert(E e) {
		if (this.map.containsKey(e)) {
			this.map.put(e, this.map.get(e) + 1);
		} else {
			this.map.put(e, 1);
		}
	}

	// remove 1 occurrence of e from this
	/**
	 * Remove e from this.
	 * 
	 * @param e the item to removed from this.
	 */
	public void remove(E e) {
		if (this.map.containsKey(e)) {
			if (this.map.get(e) > 1) {
				this.map.put(e, this.map.get(e) - 1);
			} else {
				this.map.remove(e);
			}
		}
	}

	// return true iff e is in this
	/**
	 * Checks whether e is in this or not.
	 * 
	 * @param e the item to check whether that is in this or not
	 * @return true if e is in this, else false
	 */
	public boolean isIn(E e) {
		return this.map.containsKey(e);
	}

	// return cardinality of this
	/**
	 * Returns the cardinality (number of items) in this.
	 * 
	 * @return the cardinality (number of items) in this
	 */
	public int size() {
		Collection<Integer> allItemOccerrence = this.map.values();
		int sum = 0;
		for (Integer item : allItemOccerrence) {
			sum = sum + item;
		}
		return sum;
	}

	// if this is empty throw ISE
	// else return arbitrary element of this
	/**
	 * If this is empty throw IllegalStateException, else return arbitrary element
	 * of this
	 * 
	 * @return arbitrary element of this
	 * @throws IllegalStateException if this is empty.
	 */
	public E choose() {
		if (this.map.isEmpty()) {
			throw new IllegalStateException("Bag.choose: the bag is empty.");
		}
		return this.map.keySet().iterator().next();
	}

	// if rep-inv holds for this
	public boolean rekOk() {
		if (this.map.isEmpty()) 
			return true;
		Iterator<Integer> iterator = this.map.values().iterator();
		while (iterator.hasNext()) {
			if (iterator.next() <= 0) {
				return false;
			}
		}
		return true;
	}

	// conveniently, the <E,Integer> map is exactly the abstract state
	public String toString() {
		return map.toString();
	}

}