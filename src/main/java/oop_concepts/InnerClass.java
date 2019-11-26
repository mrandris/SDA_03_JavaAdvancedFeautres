package oop_concepts;

public class InnerClass {
    public static void main(String[] args) {
        Circle circle = new Circle(5, 0, 0);
        Circle.Point point = circle.new Point(5, 5);
    }
}

class Circle {
    private int radius;
    private Point center;

    public Circle(int radius, int x, int y) {
        this.radius = radius;
        this.center = this.new Point(x, y);
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    /** inner class **/
    class Point {
        private int xPos;
        private int yPos;

        public Point(int x, int y) {
            xPos = x;
            yPos = y;
        }
    }
}
