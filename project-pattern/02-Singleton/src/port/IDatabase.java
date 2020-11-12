package port;

import java.util.ArrayList;

public interface IDatabase<T> {
	public T create(T item);
	public ArrayList<T> find();
	public T findById(String id);
	public T update(T item);
	public boolean deleteById(String id);
}
