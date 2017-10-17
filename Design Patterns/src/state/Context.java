package state;

public class Context {
	
	private State current = new DoorOpen();
	
	public void goNext(){
		current.goNext(this);
	}
	
	public void setState(State state){
		current = state;
	}
	
	public State getState(){
		return current;
	}
	
}
