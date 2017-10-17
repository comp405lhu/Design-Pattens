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
	
	@Override
	public String toString() {
		String str ="";
		for (int i = 0; i < 2; i++) {
			str += i;
		}
		return radius+":"+"("+center.x+","+center.y+")" + "-"+ str;
	}

}
