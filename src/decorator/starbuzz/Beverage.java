package decorator.starbuzz;

public abstract class Beverage {
	String description = "Unknown Beverage";

	public String getDescription() {
		return description;
	}
	// implemented by each of the concrete beverages
	public abstract double cost();
}
