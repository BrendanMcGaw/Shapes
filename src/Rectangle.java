// Rectangle class implements the Shapes interface.
// It models a rectangle using its width and length.
// Provides implementations for calculating area and perimeter.
public class Rectangle extends AbstractShape {

    // Instanced variables to store Rectangle dimensions.
    private double width;
    private double length;
    private String name;

    // Constructor to initialize a Rectangle with a width and length.
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public String getName() {
        this.name = "Rectangle";
        return name;
    }

    // Calculates and returns the area of the Rectangle.
    @Override
    public double area() {
        double totalArea = width*length;
        return totalArea;
    }

    // Calculates and returns the perimeter of the Rectangle.
    @Override
    public double perimeter() {
        double totalPerimeter = 2*(width + length);
        return totalPerimeter;
    }
}
