package lecture06_polymorphism.book_examples;

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

    public Rectangle(double width, double height,
                     String color, boolean filled) {
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

    public boolean equals(Object rhs) {
        if (! (rhs instanceof Rectangle) ) {
            return false;
        }

        Rectangle temp = (Rectangle)rhs;

        boolean isWidthEqual = this.width == temp.width;
        boolean isHeightEqual = this.height == temp.height;

        return isWidthEqual && isHeightEqual && super.equals(rhs);
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
