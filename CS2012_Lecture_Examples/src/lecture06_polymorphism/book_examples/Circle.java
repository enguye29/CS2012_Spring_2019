package lecture06_polymorphism.book_examples;

public class Circle extends GeometricObject {
	private double radius;

	public Circle() {
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(double radius, String color, boolean isFilled) {
		super(color, isFilled);
		this.radius = radius;
	}

	/** Return radius */
	public double getRadius() {
		return this.radius;
	}
	
	public void setColor(String color) {
		
	}

	/** Set a new radius */
	public void setRadius(double radius) {
		this.radius = radius;
	}

	/** Return area */
	public double getArea() {
		return radius * radius * Math.PI;
	}

	/** Return diameter */
	public double getDiameter() {
		return 2 * radius;
	}

	/** Return perimeter */
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}
	//radius, filled, color
	@Override
	public boolean equals(Object rhs) {
		if ( !(rhs instanceof Circle) ) {
			return false;
		}
		
		Circle temp = (Circle)rhs;
		
		boolean isRadiusSame = (this.radius == temp.radius);
		boolean isSameColor = (super.color.equals(temp.color));
		boolean isSameFilled = (super.filled == temp.filled);
	
		return isSameColor && isSameFilled && isRadiusSame;	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

	/* Print the circle info */
	@Override
	public String toString() {
		String s = "";

		s += super.toString() + "\n";
		s += "radius: " + this.radius;

		return s;
	}
}