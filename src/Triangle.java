// Triangle class implements the Shapes interface
// It models a triangle using height, base, and the lengths of all three sides.
// Provides implementations for calculating area and perimeter
public class Triangle extends AbstractShape {

    // Instance variables to store triangle dimensions.
    private double height;
    private double base;
    private double sideA;
    private double sideB;
    private double sideC;
    private String name;
    
    // Constructor to initialize triangle with height, base and all three sides.
    public Triangle(double height, double base, double sideA, double sideB, double sideC) {
        this.height = height;
        this.base = base;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public String getName() {
        this.name = "Triangle";
        return name;
    }

    // Calculates and returns the area of the triangle using the standard formula: (1/2) x base x height.
    @Override
    public double area() {
        double totalArea = (0.5)*height*base;
        return totalArea;
    }

    // Calculates and return the perimeter of the triangle as the sum of its three sides.
    @Override
    public double perimeter() {
        double totalPerimeter = sideA + sideB + sideC;
        return totalPerimeter;
    }
}
