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
		String str ="";
		for (int i = 0; i < 2; i++) {
			str += i;
		}
		return radius+":"+"("+center.x+","+center.y+")" + "-"+ str;
	}

}
