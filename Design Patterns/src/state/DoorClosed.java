package state;

public class DoorClosed extends State {

	@Override
	public void goNext(Context context) {
		context.setState(new DoorOpen());
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Door Closed!";
	}

}
