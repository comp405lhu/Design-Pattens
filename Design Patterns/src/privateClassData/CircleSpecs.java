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
		String str = "";
		int i = 0;
		while (i < 20) {
			str += i;
			i++;
		}
		return radius + ":" + "(" + center.x + "," + center.y + ")" + "-" + str;

	}
}
