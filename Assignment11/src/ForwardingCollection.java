import java.util.Collection;
import java.util.Iterator;

public class ForwardingCollection<E> implements Collection<E> {
	private Collection<E> collection;

	public ForwardingCollection(Collection<E> c) {
		this.collection = c;
	}

	@Override
	public boolean add(E e) {
		return collection.add(e);
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		return this.collection.addAll(c);
	}

	@Override
	public void clear() {
		this.collection.clear();
	}

	@Override
	public boolean contains(Object o) {
		return this.collection.contains(o);
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		return collection.containsAll(c);
	}

	@Override
	public boolean isEmpty() {
		return this.collection.isEmpty();
	}

	@Override
	public Iterator<E> iterator() {
		return this.collection.iterator();
	}

	@Override
	public boolean remove(Object o) {
		return this.collection.remove(o);
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		return this.collection.removeAll(c);
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		return this.collection.retainAll(c);
	}

	@Override
	public int size() {
		return this.collection.size();
	}

	@Override
	public Object[] toArray() {
		return this.collection.toArray();
	}

	@Override
	public <T> T[] toArray(T[] t) {
		return this.collection.toArray(t);
	}
	
	@Override
	public boolean equals(Object o) {
		return this.collection.equals(o);
	}
	
	@Override
	public int hashCode() {
		return this.collection.hashCode();
	}
	
	@Override
	public String toString() {
		return this.collection.toString();
	}

}
