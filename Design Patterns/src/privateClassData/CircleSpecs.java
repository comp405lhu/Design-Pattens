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
		return radius+":"+"("+center.x+","+center.y+")";
	}

}
