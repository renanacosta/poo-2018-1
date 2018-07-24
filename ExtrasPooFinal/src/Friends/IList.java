package Friends;

public interface IList {

	public void append(Object o);

	public void prepend(Object o);

	public boolean insert(Object o, int index);

	public Object get(int index);

	public Object getFirst();

	public Object getLast();

	public Object getSample();

	public Object drop(int index);

	public boolean delete(int index);

	public boolean remove(Object o);

	public void reset();

	public int count();

	public boolean has(Object o);

	public boolean isEmpty();

	public int indexOf(Object o);

}
