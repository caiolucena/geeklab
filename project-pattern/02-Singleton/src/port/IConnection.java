package port;

public interface IConnection {	
	public void connect();
	
	public boolean isConnected();
	
	public void disconnect();
}
