package adapter;

public class Client {

	public static void main(String[] args) {

		LegacyEllipse circle = new LegacyEllipse();
		LegacyRectangle rectangle = new LegacyRectangle();
		circle.display(10, 10, 100, 100);
		rectangle.display(10, 10, 100, 100);
	}

}
