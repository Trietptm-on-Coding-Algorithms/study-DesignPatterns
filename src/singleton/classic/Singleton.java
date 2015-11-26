package singleton.classic;

// NOTE: This is not thread safe!

public class Singleton {
	private static Singleton uniqueInstance;
  // the private constructor ensures that no other class can
	// instantiate a new singleton instance.
	private Singleton() {}

	public static Singleton getInstance() {
		// check 'Sigleton' object is existing or not
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}

	// other useful methods here
	public String getDescription() {
		return "I'm a classic Singleton!";
	}
}
