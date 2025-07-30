public class App {
    public static void main(String[] args) throws Exception {
        // Demonstrating polymorphism: the same 'shape' reference is used for different shape types.
        // Each shape (Circle, Rectangle and Triangle) have their own parameters, and the correct area
        // and perimeter methods are called based on the actual object type.
        AbstractShape abstractShape = new Circle(5);
        abstractShape.display();

        // Instantiates our new shape as a Rectangle.
        abstractShape = new Rectangle(4, 6);
        abstractShape.display();

        // Instantiates our new shape as a Triangle.
        abstractShape = new Triangle(10, 5, 3, 5, 6);
        abstractShape.display();

    }
}
