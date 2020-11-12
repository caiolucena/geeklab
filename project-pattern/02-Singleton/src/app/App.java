package app;

import controller.UserController;
import database.InMemoryConnection;

public class App {
	
	private  UserController userController;
	private InMemoryConnection conn;
	
	public App() {
		bootstrap();
		init();
	}
	
	private void bootstrap() {
		this.setUserController(new UserController());
		this.conn = InMemoryConnection.getInstance();		
	}
	
	private void init() {
		this.conn.connect();
	}

	public UserController getUserController() {
		return userController;
	}

	public void setUserController(UserController userController) {
		this.userController = userController;
	}
	
	
}
