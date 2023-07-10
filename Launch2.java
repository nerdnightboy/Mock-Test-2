/*
 * 2. Create a superclass called Shape with an abstract method calculateArea() that returns the area of the shape. Implement subclasses Rectangle, Circle, and Triangle that inherit from the Shape class. Implement the calculateArea() method in each subclass to calculate and return the area of a rectangle, circle, and triangle, respectively. Then, create a class called ShapeCalculator with a method printArea(Shape shape) that accepts an object of type Shape and prints its area. Demonstrate polymorphism by passing instances of different subclasses to the printArea() method.
 */

abstract class Shape{
    abstract double calculateArea();
}

class Rectangle extends Shape{
    double length;
    double width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double calculateArea(){
        return length * width;
    }
}
class Circle extends Shape{
    double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    public double calculateArea(){
        return Math.PI * radius * radius;
    }
}
class Triangle extends Shape{
    double base;
    double height;
    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }
    public double calculateArea(){
        return 0.5 * base * height;
    }
}

class ShapeCalculator {
    public void printArea(Shape shape) {
        double area = shape.calculateArea();
        System.out.println("The area of the shape is: " + area);
    }
}

public class Launch2 {
    public static void main(String[] args) {
        ShapeCalculator sc = new ShapeCalculator();

        Shape rectangle = new Rectangle(5.5, 3.5);
        System.out.print("Rectangle area, " );
        sc.printArea(rectangle);

        Shape circle = new Circle(5.5);
        System.out.print("Circle area, ");
        sc.printArea(circle);

        Shape triangle = new Triangle(5.5, 7.5);
        System.out.print("Triangle area, ");
        sc.printArea(triangle);
    }
}
