package lesson7.labs.prob2;

public final class EquilateralTriangle implements ClosedCurve {
	final private double side;
	
	@Override
	public double computePerimeter() {
		double perimeter =  3 * side;
		return perimeter;
	}
	public EquilateralTriangle(double side) {	
		this.side = side;
	}
	
	public double getSide() {
		return side;
	}
}
