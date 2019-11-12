

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class ForwardingSet<E> implements Set<E> {
	private final Set<E> s;

	public ForwardingSet(Set<E> s) {
		this.s = s;
	}

	@Override
	public boolean add(E e) {
		return this.s.add(e);
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		return this.s.addAll(c);
	}

	@Override
	public void clear() {
		this.s.clear();
	}

	@Override
	public boolean contains(Object arg0) {
		return this.s.contains(arg0);
	}

	@Override
	public boolean containsAll(Collection<?> arg0) {
		return this.s.containsAll(arg0);
	}

	@Override
	public boolean isEmpty() {
		return this.s.isEmpty();
	}

	@Override
	public Iterator<E> iterator() {
		return this.s.iterator();
	}

	@Override
	public boolean remove(Object arg0) {
		return this.s.remove(arg0);
	}

	@Override
	public boolean removeAll(Collection<?> arg0) {
		return this.s.removeAll(arg0);
	}

	@Override
	public boolean retainAll(Collection<?> arg0) {
		return this.s.retainAll(arg0);
	}

	@Override
	public int size() {
		return this.s.size();
	}

	@Override
	public Object[] toArray() {
		return this.s.toArray();
	}

	@Override
	public <T> T[] toArray(T[] arg0) {
		return this.s.toArray(arg0);
	}
	
	@Override
	public boolean equals(Object o) {
		return this.s.equals(o);
	}
	@Override
	public int hashCode() {
		return this.s.hashCode();
	}
	
	@Override
	public String toString() {
		return this.s.toString();
	}

}
