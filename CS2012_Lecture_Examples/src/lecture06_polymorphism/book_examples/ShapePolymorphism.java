package lecture06_polymorphism.book_examples;

import java.util.ArrayList;

public class ShapePolymorphism {
	public static void main(String[] args) {
		ArrayList<GeometricObject> list = new ArrayList<>();
		
		GeometricObject geo1 = new GeometricObject();
		GeometricObject geo2 = new GeometricObject();
		
		
		
		
		Circle c1 = new Circle(5, "red", true);
		Circle c2 = new Circle(5, "red", false);
		Circle c3 = new Circle(27.78, "green", true);
		
		System.out.println(geo1.equals(geo2));
	
	}
	
	public static void objectType(ArrayList<GeometricObject> list) {
		
		for (int i = 0 ; i < list.size() ; i++) {
			
			GeometricObject current = list.get(i);
			
			if (current instanceof Circle) {
				System.out.println("Circle");
			}
			else if (current instanceof Rectangle) {
				System.out.println("Rectangle");
			}
		}
	}
	
	
	public static void printColors(ArrayList<GeometricObject> list) {
		for (int i = 0; i < list.size() ; i++) {
			System.out.println(list.get(i).getColor());
		}
	}
	
	
//	public static void printObject(Circle c) {
//		System.out.println(c);
//	}
//	
//	public static void printObject(Rectangle r) {
//		System.out.println(r);
//	}
	
	
}
