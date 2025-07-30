// Interface for our shapes.
// Polymorphism allows different shape classes to be treated as shapes.
// This enables writing code that works with all shapes uniformly.
interface Shapes {
    public double area();
    public double perimeter();
}