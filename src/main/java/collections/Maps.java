package collections;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {
    public static void main(String[] args) {
        Point p1 = new Point(0,0);
        Point p2 = new Point(2,10);
        Point p3 = new Point(5,5);
        Point p4 = new Point(-3,5);

        /** TreeMap **/

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

        Map<Point, String> pointTreeMap = new TreeMap(comp);

        pointTreeMap.put(p1, "P1");
        pointTreeMap.put(new Point(0,0), "P1");
        pointTreeMap.put(p2, "P2");
        pointTreeMap.put(p3, "P3");

        for(Map.Entry<Point, String> entry : pointTreeMap.entrySet()) {
            String value = entry.getValue();
            String key = entry.getKey().toString();
            System.out.printf("Coordinates: %s, Name: %s\n", key, value);
        }*/

        /** HashMap **/

        Map<Point, String> pointHashMap = new HashMap<>();
        pointHashMap.put(p1, "P1");
        pointHashMap.put(new Point(0,0), "P1");   // if equals() & hashCode() is not overridden in Point class
                                                        // this is treated as a different object
        pointHashMap.put(p2, "P2");
        pointHashMap.put(p3, "P3");

        for(Map.Entry<Point, String> entry : pointHashMap.entrySet()) {
            String value = entry.getValue();
            String key = entry.getKey().toString();
            System.out.printf("Coordinates: %s, Name: %s\n", key, value);
        }
    }
}
