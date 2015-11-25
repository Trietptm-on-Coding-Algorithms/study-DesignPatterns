package observer.weather;
public interface Observer {
	// when needs to notify an Observer of a change
	public void update(float temp, float humidity, float pressure);
}
