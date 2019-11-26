package oop_principles;

public class Polymorphism {
    public static void main(String[] args) {
        /*** static polymorphism ***/
        int[] numbers1 = {2, 4, 5, 6};
        System.out.println(StaticPolymorphism.sum(numbers1));
        System.out.println(StaticPolymorphism.sum("1,0,8,1"));

        /*** dynamic polymorphism***/
        Shape square = new Square(10);
        System.out.println("Square area: " + square.calculateArea());
        Shape circle = new Circle(10);
        System.out.println("Circle area: " + circle.calculateArea());
    }
}

/*** class has two sum() methods, taking different parameters: ***/
/*** the first takes an array of ints ***/
/*** the second takes a string of numbers separated with commas, splits it, then parse them to Integers ***/
class StaticPolymorphism {
    public static int sum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static int sum(String numbers) {
        int sum = 0;
        String[] arrayOfNumbers = numbers.split(",");
        for (String number : arrayOfNumbers) {
            sum += Integer.parseInt(number);
        }
        return sum;
    }
}

/*** dynamic polymorphism***/
/*** Shape class with generic calculateArea method***/
class Shape {
    public double calculateArea() {
        return 0;
    }
}
/*** Square class with overridden calculateArea method***/
class Square extends Shape {
    private int side;
    public Square(int side) {this.side = side;}
    @Override
    public double calculateArea() {return side*side;}
}
/*** Circle class with overridden calculateArea method***/
class Circle extends Shape {
    private int radius;
    public Circle(int radius) {this.radius = radius;}
    @Override
    public double calculateArea() {return Math.PI*radius*radius;}
}