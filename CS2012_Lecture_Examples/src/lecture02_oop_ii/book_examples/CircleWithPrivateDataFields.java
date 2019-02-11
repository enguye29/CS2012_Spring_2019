package lecture02_oop_ii.book_examples;

public class CircleWithPrivateDataFields {
  /** The radius of the circle */
  private double radius = 1;

  /** The number of the objects created */
  private static int numberOfObjects = 0;

  /** Construct a circle with radius 1 */
  public CircleWithPrivateDataFields() {
    CircleWithPrivateDataFields.numberOfObjects++;
  }

  /** Construct a circle with a specified radius */
  public CircleWithPrivateDataFields(double newRadius) {
    this.radius = newRadius;
    CircleWithPrivateDataFields.numberOfObjects++;
  }

  /** Return radius */
  public double getRadius() {
    return this.radius;
  }

  /** Set a new radius */
  public void setRadius(double newRadius) {
    this.radius = (newRadius >= 0) ? newRadius : 0;
  }

  /** Return numberOfObjects */
  public static int getNumberOfObjects() {
    return CircleWithPrivateDataFields.numberOfObjects;
  }

  /** Return the area of this circle */
  public double getArea() {
    return this.radius * this.radius * Math.PI;
  }
}
