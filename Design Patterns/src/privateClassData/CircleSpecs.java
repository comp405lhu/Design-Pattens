package privateClassData;

import java.awt.Point;

public class CircleSpecs {

	private double radius;
	private Point center;

	public double getRadius() {
		return radius;
	}

	public Point getCenter() {
		return center;
	}

	public CircleSpecs(double radius, Point center) {
		this.radius = radius;
		this.center = center;
	}

	@Override
	public String toString() {
		String[] str = {"This", "is", "a", "circle"};
		String s1 = "";
		for (String s : str)
			s1 += s + " ";
		return radius + ":" + "(" + center.x + "," + center.y + ")" + "-" + s1;
	}

}
