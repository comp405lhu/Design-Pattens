package privateClassData;

import java.awt.Point;

public class CircleSpecs {
	
	private double r;
	private Point p;

	public double getRadius() {
		return r;
	}

	public Point getCenter() {
		return p;
	}

	public CircleSpecs(double radius, Point center) {
		this.r = radius;
		this.p = center;
	}
	
	@Override
	public String toString() {
		return "Circle(radius: " + r + ", center: " + p + ");";
	}

}
