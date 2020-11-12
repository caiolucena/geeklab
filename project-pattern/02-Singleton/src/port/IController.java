package port;

import java.util.ArrayList;

public interface IController<T> {
	public ArrayList<T> getAll();
	public T getById(String id);
	public T create(T item);
	public T update(T item);
	public boolean delete(String id);	
}
