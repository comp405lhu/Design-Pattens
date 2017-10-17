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
<<<<<<< HEAD

		String str = "";

		int i = 0;

		while (i < 20) {

			str += i;
			i++;
		}
		return radius + ":" + "(" + center.x + "," + center.y + ")" + "-" + str;
=======
		String[] str = {"This", "is", "a", "circle"};
		String s1 = "";
		for (String s : str)
			s1 += s + " ";
		return radius + ":" + "(" + center.x + "," + center.y + ")" + "-" + s1;
	}
>>>>>>> branch 'master' of https://github.com/comp405lhu/Design-Patterns.git

	}
}
