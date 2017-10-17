package privateClassData;

import java.awt.Point;

public class CircleSpecs {
	
	private double radius;
	private Point origin;

	public double getRadius() {
		return radius;
	}

	public Point getCenter() {
		return origin;
	}

	public CircleSpecs(double radius, Point center) {
		this.radius = radius;
		this.origin = center;
	}
	
	@Override
	public String toString() {
		return "Circle(radius: " + radius + ", center: " + origin + ");";
	}

}
