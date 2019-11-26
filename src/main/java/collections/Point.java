package collections;

public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Coordinates: x = " + x + ", y = " + y;
    }

/*    @Override
    public boolean equals(Object o) {
        if(o instanceof Point) {
            if(this.x == ((Point) o).getX() && this.y == ((Point) o).getY()) {
                return true;
            }
        }
        return false;
    }*/

    @Override
    public int hashCode() {
        return 1;
    }
}
