package lecture06_polymorphism.book_examples;

import java.util.ArrayList;

public class PolymorphismDemo {
	/** Main method */
	public static void main(String[] args) {
		// Display circle and rectangle properties
		Circle circle1 = new Circle(1, "red", false);
		Rectangle rectangle1 = new Rectangle(1, 1, "black", true);

		ArrayList<GeometricObject> myList = new ArrayList<>();
		myList.add(circle1);
		myList.add(rectangle1);

		displayObject(circle1);
		displayObject(rectangle1);
	}

	/** Display geometric object properties */
	public static void displayObject(GeometricObject object) {
		System.out.println("Created on " + object.getDateCreated() +
				". Color is " + object.getColor());
	}
}
