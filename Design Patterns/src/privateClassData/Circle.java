package privateClassData;

import java.awt.Point;


public class Circle {

	private CircleSpecs circleSpecs;

	public Circle(double radius, Point center) {
		this.circleSpecs = new CircleSpecs(radius, center);
	}

	public double getCircumference() {
		return this.circleSpecs.getRadius() * Math.PI;
	}

	public double getDiameter() {
		return this.circleSpecs.getRadius() * 2;
	}

}
