package examples;

public class StaticBlockSingleton {
	
	private static StaticBlockSingleton instance;
	
	private StaticBlockSingleton() {
	}
	
	static {
		try {
			instance = new StaticBlockSingleton();
		} catch (Exception ex) {
			String message = "An error occurred while trying' to instantiate the StaticBlockSingleton: ";
			throw new RuntimeException(message + ex.getMessage());
		}
	}
	public static StaticBlockSingleton getInstance() {
		return instance;
	}
	
	public void showYourself() {
		System.out.println(">> Hello, my name is StaticBlockSingleton and I'm as fast as EagleSingleton.");
		System.out.println("   Obs.: I still deal with possible instance exceptions. I'm the guy.\n");
	}
}

