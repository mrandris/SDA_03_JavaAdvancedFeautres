package collections;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class Set {
    public static void main(String[] args) {
        Point p1 = new Point(0,0);
        Point p2 = new Point(2,10);
        Point p3 = new Point(5,5);
        Point p4 = new Point(-3,5);

        /** tree set **/

        /*Comparator<Point> comp = new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                if(o1.getX() < o2.getX()) {
                    return -1;
                } else if(o1.getX() > o2.getX()) {
                    return 1;
                }
                return 0;
            }
        };

        java.util.Set<Point> pointTreeSet = new TreeSet<>(comp);

        pointTreeSet.add(p1);
        pointTreeSet.add(p2);
        pointTreeSet.add(p3);
        pointTreeSet.add(new Point(0, 1));
        pointTreeSet.add(p4);

        printCollection(pointTreeSet);

        pointTreeSet.remove(new Point(0,0));
        System.out.println();
        printCollection(pointTreeSet);*/

        /** hash set **/

        java.util.Set<Point> pointHashSet = new HashSet<>();

        pointHashSet.add(p1);
        pointHashSet.add(p1);
        pointHashSet.add(p2);
        pointHashSet.add(p3);
        pointHashSet.add(p4);
        pointHashSet.add(new Point(0,0)); // if equals() & hashCode() is not overridden in Point class
                                                // this is treated as a different object

        printCollection(pointHashSet);

    }

    static void printCollection (Collection<Point> col) {
        System.out.println("Collection:");
        for (Point point : col) {
            System.out.println(point);
        }
    }
}
