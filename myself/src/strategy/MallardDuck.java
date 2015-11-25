package strategy;

public class MallardDuck extends Duck {

	public MallardDuck() {
    // this is how to change concrete methods through inteface
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();

	}

	public void display() {
		System.out.println("I'm a real Mallard duck");
	}
}
