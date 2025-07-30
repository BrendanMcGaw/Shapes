public class App {
    public static void main(String[] args) throws Exception {
        // Demonstrating polymorphism: the same 'shape' reference is used for different shape types.
        // Each shape (Circle, Rectangle and Triangle) have their own parameters, and the correct area
        // and perimeter methods are called based on the actual object type.
        Shapes shape = new Circle(5);
        System.out.println("Circle Area: " + shape.area());
        System.out.println("Circle Perimeter: " + shape.perimeter());

        // Instantiates our new shape as a Rectangle.
        shape = new Rectangle(4, 6);
        System.out.println("Rectangle Area: " + shape.area());
        System.out.println("Rectangle Perimeter: " + shape.perimeter()); 

        // Instantiates our new shape as a Triangle.
        shape = new Triangle(10, 5, 3, 5, 6);
        System.out.println("Triangle Area: " + shape.area());
        System.out.println("Triangle Perimeter: " + shape.perimeter());

    }
}
