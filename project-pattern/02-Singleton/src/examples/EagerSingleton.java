package examples;

public class EagerSingleton {
	
	private static EagerSingleton instance = new EagerSingleton();
	
	private EagerSingleton() {
	}
	
	public static EagerSingleton getInstance() {
		return instance;
	}
	
	public void showYourself() {
		System.out.println(">> Hello, my name is EagerSingleton and i'am the fastest Singleton implementation.\n");
	}
}

