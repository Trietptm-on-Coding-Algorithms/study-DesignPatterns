package CH05.designpatterns.singleton.threadsafe;

public class Singleton {
	private static Singleton uniqueInstance;


	private Singleton() {}
 // 'synchronized' keyword prevents other theard to enter while current theread finished
	public static synchronized Singleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}

	// other useful methods here
	public String getDescription() {
		return "I'm a thread safe Singleton!";
	}
}
