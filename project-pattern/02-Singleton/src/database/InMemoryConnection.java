package database;

import port.IConnection;

public class InMemoryConnection implements IConnection {
	private boolean connStatus;
	private static InMemoryConnection instance;
	
	private InMemoryConnection() {
		this.connStatus = false;
	}
	
	public static InMemoryConnection getInstance() {
		if (instance == null) {
			instance = new InMemoryConnection();
		}
		return instance;
	}
	
	@Override
	public void connect() {
		this.connStatus = true;
	}

	@Override
	public boolean isConnected() {
		return this.connStatus;
	}

	@Override
	public void disconnect() {
		this.connStatus = false;
	}

}
