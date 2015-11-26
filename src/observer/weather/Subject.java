package observer.weather;
// collect observers who wants to know subject's status
public interface Subject {
	// Subject "has a" observers
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	// check change
	public void notifyObservers();
}
