package oop_concepts;

public class Abstract {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(4,3);
        System.out.println(rectangle.calculatePerimeter());
        System.out.println(rectangle.calculateArea()); // will return 0 because the parent class method was not overridden
    }
}

abstract class Shape {
    /** define method for calculating area **/
    public double calculateArea() {
        return 0;
    }

    /** no default implementation for method - call it abstract **/
    /** this way we make sure that all subclasses will have to provide an implementation for this method **/
    public abstract double calculatePerimeter();
}

class Rectangle extends Shape {
    double length;
    double height;

    Rectangle(double length, double height) {
        this.length = length;
        this.height = height;
    }

    /** mandatory implementation of abstract method from parent class **/
    public double calculatePerimeter() {
        return 2*(length + height);
    }
}


