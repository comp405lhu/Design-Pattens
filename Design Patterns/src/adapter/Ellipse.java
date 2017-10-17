package adapter;

public class Ellipse implements Shape {

	private LegacyEllipse ellipse;
	
	public Ellipse() {
		ellipse = new LegacyEllipse();
	}
	@Override
	public void display(int x, int y, int w, int h) {
		// Do Something
		ellipse.display(x, y, w, h);

	}

}
