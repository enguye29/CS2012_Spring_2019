package lecture02_oop_ii.book_examples;

public class CircleWithStaticMembers {
  /** The radius of the circle */
  double radius;

  /** The number of the objects created */
  static int numberOfObjects = 0;

  /** Construct a circle with radius 1 */
  public CircleWithStaticMembers() {
    this.radius = 1.0;
    CircleWithStaticMembers.numberOfObjects++;
  }

  /** Construct a circle with a specified radius */
  public CircleWithStaticMembers(double newRadius) {
    this.radius = newRadius;
    CircleWithStaticMembers.numberOfObjects++;
  }

  /** Return numberOfObjects */
  public static int getNumberOfObjects() {
    return CircleWithStaticMembers.numberOfObjects;
  }

  /** Return the area of this circle */
  public double getArea() {
    return this.radius * this.radius * Math.PI;
  }
}

