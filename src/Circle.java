// Circle class that implements our Shapes interface.
// It models our circle based on its radius.
// Provides implementations for calculating area and perimeter.
public class Circle implements Shapes {

    // Instances variable to store Circle radius.
    private double radius;

    // Constructor to initialize Circle based on its radius.
    public Circle(double radius) {
        this.radius = radius;
    }

    // Calculates the area of the circle
    @Override
    public double area() {
        double totalArea = Math.PI*Math.pow(radius, 2);
        return totalArea;
    }

    // Calculates the perimeter of the circle.
    @Override
    public double perimeter() {
        double totalPerimeter = 2*Math.PI*radius;
        return totalPerimeter;
    }
}
