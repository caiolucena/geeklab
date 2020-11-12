package database;

import java.util.ArrayList;

import model.User;
import port.IDatabase;

public class InMemoryDatabase implements IDatabase<User> {
	
	private ArrayList<User> data = new ArrayList<User>();
	private InMemoryConnection conn = null;
	private static InMemoryDatabase instance = null;
	
	private InMemoryDatabase() {
		this.conn = InMemoryConnection.getInstance();
	}
	
	public static InMemoryDatabase getInstance() {
		if (instance == null) {
			instance = new InMemoryDatabase();
		}
		return instance;
	}
	
	@Override
	public User create(User item) {
		try {
			if (!this.conn.isConnected()) {
				throw new Exception("No connection open");
			}
			this.data.add(item);		
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return item;
	}

	@Override
	public ArrayList<User> find() {	
		try {
			if (!this.conn.isConnected()) {
				throw new Exception("No connection open");
			}			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return data;
	}

	@Override
	public User findById(String id) {
		User result = null;
		try {
			if (!this.conn.isConnected()) {
				throw new Exception("No connection open");
			}	
			for(User user: data) {
				if (user.getId() == id) {
					result = user;
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}				
		return result;
	}

	@Override
	public User update(User item) {
		User result = null;
		try {
			if (!this.conn.isConnected()) {
				throw new Exception("No connection open");
			}			
			for(User user: data) {
				if (user.getId() == item.getId()) {
					user.setName(item.getName());
					user.setCurrentJob(item.getCurrentJob());
					user.setAge(item.getAge());
					result = user;
				}
			}	
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return result;
	}

	@Override
	public boolean deleteById(String id) {
		boolean result = false;
		try {
			if (!this.conn.isConnected()) {
				throw new Exception("No connection open");
			}		
			User userToRemove = null;
			for(User user: data) {
				if (user.getId() == id) {
					userToRemove = user;
				}
			}	
			if (userToRemove != null) {
				data.remove(userToRemove);
				result = true;
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}		
		return result;
	}

}
