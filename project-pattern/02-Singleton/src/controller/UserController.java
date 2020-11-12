package controller;

import java.util.ArrayList;

import model.User;
import port.IUserController;
import service.UserService;

public class UserController implements IUserController{
	
	private UserService service = null;
	
	public UserController() {
		this.service = UserService.getInstance();
	}

	@Override
	public ArrayList<User> getAll() {
		return this.service.getAll();
	}

	@Override
	public User getById(String id) {
		return this.service.getById(id);
	}

	@Override
	public User create(User item) {
		return this.service.create(item);
	}

	@Override
	public User update(User item) {
		return this.service.update(item);
	}

	@Override
	public boolean delete(String id) {
		return this.service.delete(id);
	}
}
