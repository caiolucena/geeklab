package service;

import java.util.ArrayList;

import model.User;
import port.IUserService;
import repository.UserRepository;

public class UserService implements IUserService{
	private static UserService instance = null;
	private UserRepository repository = null;
	
	private UserService() {
		this.repository = UserRepository.getInstance();
	}
	
	public static UserService getInstance() {
		if (instance == null) {
			instance = new UserService();
		}
		return instance;
	}

	@Override
	public ArrayList<User> getAll() {
		return this.repository.getAll();
	}

	@Override
	public User getById(String id) {
		return this.repository.getById(id);
	}

	@Override
	public User create(User item) {
		return this.repository.create(item);
	}

	@Override
	public User update(User item) {
		return this.repository.update(item);
	}

	@Override
	public boolean delete(String id) {
		return this.repository.delete(id);
	}

}
