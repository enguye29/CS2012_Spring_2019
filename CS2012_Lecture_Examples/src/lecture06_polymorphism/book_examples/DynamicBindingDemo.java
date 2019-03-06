package lecture06_polymorphism.book_examples;

/**NOTE: This example shows that it is possible to define multiple classes within the same .java file.
 * DO NOT DO THIS.  This is a bad practice to get in the habit of doing, and it can lead to messy and poorly written
 * code.
 */

public class DynamicBindingDemo {
	public static void main(String[] args) {
		Object gs = new GraduateStudent();
		Student s = new Student();
		Person p = new Person();
		Object o = new Object();

		m(gs);
		m(s);
		m(p);
		m(o);
	}

	public static void m(Object x) {
		System.out.println(x);
	}
}

class GraduateStudent extends Student {
	  @Override
	  public String toString() {
	    return "Grad Student";
	  }
}

class Student extends Person {
	@Override 
	public String toString() {
		return "Student";
	}
}

class Person extends Object {
	@Override 
	public String toString() {
		return "Person";
	}
}
