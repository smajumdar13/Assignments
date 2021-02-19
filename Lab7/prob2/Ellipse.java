package lesson7.labs.prob2;

public class Ellipse implements ClosedCurve{
	final private double semiMajorAxis;
	final private double ellipticalIntegral;
	
	@Override
	public double computePerimeter() {
		double perimeter = 4 * semiMajorAxis * ellipticalIntegral;
		return perimeter;
	}
	public Ellipse(double axis, double integral) {	
		this.semiMajorAxis = axis;
		this.ellipticalIntegral = integral;
	}
	
	public double getAxis() {
		return semiMajorAxis;
	}
	public double getEllipticalIntegral() {
		return ellipticalIntegral;
	}
}
