package using.iterableInterface;

import java.util.Iterator;

interface ImmutableIterator extends Iterator{
	public String getFront();
	public boolean hasPrevious();
	public ImmutableIterator previous();
	public String getTail();
}
