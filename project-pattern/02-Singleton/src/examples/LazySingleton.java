package examples;

public class LazySingleton {
	
	private static LazySingleton instance;
	
	private LazySingleton() {
	}
	
	public static LazySingleton getInstance() {
		if (instance == null) {
			instance = new LazySingleton();
		}
		return instance;
	}
	
	public void showYourself() {
		System.out.println(">> Hello, my name is LazySingleton and i'am the default Singleton implementation.\n");
	}
}
