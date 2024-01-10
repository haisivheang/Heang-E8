package demo;

public class Main {
    public static void main(String[] args) {
        // Example usage
        Rectangle rectangle = new Rectangle(3, 5);
        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());

        Square square = new Square(4);
        System.out.println("Square Area: " + square.getArea()); // Inherits getArea() from Rectangle
        System.out.println("Square Perimeter: " + square.getPerimeter()); // Inherits getPerimeter() from Rectangle
    }
}
package demo;

public class Rectangle {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }
}
package demo;

public class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }
}