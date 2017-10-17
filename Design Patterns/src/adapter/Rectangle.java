package adapter;

public class Rectangle implements Shape {

	// Has a relationship
	private LegacyRectangle rectangle;
	public Rectangle() {
		// TODO Auto-generated constructor stub
		rectangle = new LegacyRectangle();
	}
	@Override
	public void display(int x, int y, int w, int h) {
		// Do something else
		rectangle.display(x, y, w, h);
	}

}
