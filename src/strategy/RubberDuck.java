package strategy;

public class RubberDuck extends Duck {

	public RubberDuck() {
    // this is how to change concrete methods through inteface
		flyBehavior = new FlyNoWay();
		quackBehavior = new Squeak();
	}

	public void display() {
		System.out.println("I'm a rubber duckie");
	}
}
