package state.gumballstate;
// corepart!!
// every extended state class keep having same methods 
public interface State {

	public void insertQuarter();
	public void ejectQuarter();
	public void turnCrank();
	public void dispense();
}
