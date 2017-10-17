package state;

public class DoorOpen extends State {

	@Override
	public void goNext(Context context) {
		context.setState(new DoorClosed());
		
	}
	 
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Door Open!";
	}
}
