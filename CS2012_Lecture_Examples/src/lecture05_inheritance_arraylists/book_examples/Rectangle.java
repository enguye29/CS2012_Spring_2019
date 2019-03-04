package lecture05_inheritance_arraylists.book_examples;

//super
//this
//method overriding
//method overloading
public class Rectangle extends GeometricObject {
  private double width;
  private double height;

  public Rectangle() {
    super();
  }

  public Rectangle(double width, double height) {

    this.width = width;
    this.height = height;
  }

  public Rectangle(String color, boolean filled,
                   double width, double height) {
    super(color, filled);

    this.width = width;
    this.height = height;
  }

  /** Return width */
  public double getWidth() {
    return width;
  }

  /** Set a new width */
  public void setWidth(double width) {
    this.width = width;
  }

  /** Return height */
  public double getHeight() {
    return height;
  }

  /** Set a new height */
  public void setHeight(double height) {
    this.height = height;
  }

  /** Return area */
  public double getArea() {
    return this.width * this.height;
  }

  /** Return perimeter */
  public double getPerimeter() {
    return 2 * (width + height);
  }

  @Override
  public String toString() {
    String s = "";

    s += super.toString() + "\n";
    s += "width: " + this.width + "\n";
    s += "height: " + this.height;

    return s;
  }

}
