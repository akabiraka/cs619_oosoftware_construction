import java.util.Collection;

public class InstrumentedCollection<E> extends ForwardingCollection<E> {
	private int addCount = 0;

	public InstrumentedCollection(Collection<E> c) {
		super(c);
	}

	@Override
	public boolean add(E e) {
		addCount++;
		return super.add(e);
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		addCount += c.size();
		return super.addAll(c);
	}

	public int getAddCount() {
		return this.addCount;
	}
}
