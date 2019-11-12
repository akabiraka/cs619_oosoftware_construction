import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ForwardingList<E> implements List<E> {
	private List<E> list;

	public ForwardingList(List<E> list) {
		this.list = list;
	}

	@Override
	public boolean add(E e) {
		return this.list.add(e);
	}

	@Override
	public void add(int i, E e) {
		this.list.add(i, e);
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		return this.list.addAll(c);
	}

	@Override
	public boolean addAll(int i, Collection<? extends E> c) {
		return this.list.addAll(i, c);
	}

	@Override
	public void clear() {
		this.list.clear();
	}

	@Override
	public boolean contains(Object o) {
		return this.list.contains(o);
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		return this.list.containsAll(c);
	}

	@Override
	public E get(int i) {
		return this.list.get(i);
	}

	@Override
	public int indexOf(Object o) {
		return this.list.indexOf(o);
	}

	@Override
	public boolean isEmpty() {
		return this.list.isEmpty();
	}

	@Override
	public Iterator<E> iterator() {
		return this.list.iterator();
	}

	@Override
	public int lastIndexOf(Object o) {
		return this.list.lastIndexOf(o);
	}

	@Override
	public ListIterator<E> listIterator() {
		return this.list.listIterator();
	}

	@Override
	public ListIterator<E> listIterator(int i) {
		return this.list.listIterator(i);
	}

	@Override
	public boolean remove(Object o) {
		return this.list.remove(o);
	}

	@Override
	public E remove(int i) {
		return this.list.remove(i);
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		return this.list.removeAll(c);
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		return this.list.retainAll(c);
	}

	@Override
	public E set(int i, E e) {
		return this.list.set(i, e);
	}

	@Override
	public int size() {
		return this.list.size();
	}

	@Override
	public List<E> subList(int i, int j) {
		return this.list.subList(i, j);
	}

	@Override
	public Object[] toArray() {
		return this.list.toArray();
	}

	@Override
	public <T> T[] toArray(T[] t) {
		return this.list.toArray(t);
	}
	
	@Override
	public boolean equals(Object o) {
		return this.list.equals(o);
	}
	
	@Override
	public int hashCode() {
		return this.list.hashCode();
	}
	
	@Override
	public String toString() {
		return this.list.toString();
	}

}
