package lecture05_inheritance_arraylists.book_examples;

public class Circle extends GeometricObject {
  private double radius;

  public Circle() {
  }

  public Circle(double radius) {
    this.radius = radius;
  }

  public Circle(String color, boolean isFilled,
                double radius) {
    super(color, isFilled);
    this.radius = radius;

  }

  /** Return radius */
  public double getRadius() {
    return radius;
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

  /* Print the circle info */
  @Override
  public String toString() {
    String s = "";

    s += super.toString() + "\n";
    s += "radius: " + this.radius;

    return s;
  }
}