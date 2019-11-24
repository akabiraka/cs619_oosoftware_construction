import java.util.Collection;
import java.util.List;

public class InstrumentedList<E> extends ForwardingList<E>{
	private int addCount = 0;
	
	public InstrumentedList(List<E> list) {
		super(list);
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