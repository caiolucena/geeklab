package repository;

import java.util.ArrayList;

import database.InMemoryDatabase;
import model.User;
import port.IUserRepository;

public class UserRepository implements IUserRepository {
	
	private static UserRepository instance = null;
	private InMemoryDatabase database = null;
	
	private UserRepository () {
		this.database = InMemoryDatabase.getInstance();
	}
	
	public static UserRepository getInstance() {
		if (instance == null) {
			instance = new UserRepository();
		}
		return instance;
	}

	@Override
	public ArrayList<User> getAll() {
		return this.database.find();
	}

	@Override
	public User getById(String id) {
		return this.database.findById(id);
	}

	@Override
	public User create(User item) {
		return this.database.create(item);
	}

	@Override
	public User update(User item) {
		return this.database.update(item);
	}

	@Override
	public boolean delete(String id) {
		return this.database.deleteById(id);
	}

}
