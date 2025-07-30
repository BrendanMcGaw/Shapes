// Abstract class AbstractShape to implement common behaviour for all shapes.
// It porovides a reusable 'display()' method that prints the area and perimeter.
// so each specific shape class, nor the main app have to do so.
// This reduces duplication and keeps shared logic in one place.
public abstract class AbstractShape implements Shapes {

    // Method that returns nothing that allows for reusability to display the name, area and perimeter of the shapes constructed.
    public void display() {
        System.out.println(getName());
        System.out.println(area());
        System.out.println(perimeter());
    }

    // Abstract method to get the name of the shape.
    public abstract String getName();
}
 