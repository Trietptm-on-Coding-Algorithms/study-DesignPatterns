package decorator.starbuzz;
// This is the key to the decorator pattern
// 'CondimentDecorator' is the main mechanism to decorate beverage
public abstract class CondimentDecorator extends Beverage {
	public abstract String getDescription();
}
