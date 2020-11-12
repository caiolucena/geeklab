package examples;

public class LazyAndSafeSingleton {
	
	private static LazyAndSafeSingleton instance;
	
	private LazyAndSafeSingleton() {
	}
	
	public static synchronized LazyAndSafeSingleton getInstance() {
		if (instance == null) {
			instance = new LazyAndSafeSingleton();
		}
		return instance;
	}
	
	public void showYourself() {
		System.out.println(">> Hello, my name is LazyAndSafeSingleton and i'am the safest Singleton implementation.\n");
	}
}
