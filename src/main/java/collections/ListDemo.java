package collections;

import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
        /** ArrayList **/

        /*List<Point> pointArrayList = new ArrayList<>();

        pointArrayList.add(new Point(0,0));
        pointArrayList.add(new Point(1,10));
        pointArrayList.add(new Point(3,5));

        for(Point point : pointArrayList) {
            System.out.println(point + " index: " + pointArrayList.indexOf(point));
        }

        pointArrayList.remove(1);

        for(Point point : pointArrayList) {
            System.out.println(point + " ");
        }*/

        /** PriorityQueue **/

        Point p1 = new Point(0,0);
        Point p2 = new Point(1,10);
        Point p3 = new Point(3,5);
        Point p4 = new Point(-3,5);

        Comparator<Point> comp = new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                if(o1.getX()< o2.getX()) {
                    return -1;
                } else if(o1.getX()< o2.getX()) {
                    return 1;
                }
                return 0;
            }
        };

        PriorityQueue<Point> pointPriorityQueue = new PriorityQueue<Point>(comp);

        pointPriorityQueue.add(p1);
        pointPriorityQueue.add(p2);
        pointPriorityQueue.add(p3);

        Iterator i = pointPriorityQueue.iterator();
        while(i.hasNext()) {
            System.out.println(i.next());
        }

        pointPriorityQueue.add(p4);
        System.out.println("New print:");

        Iterator i2 = pointPriorityQueue.iterator();

        while(i2.hasNext()) {
            System.out.println(i2.next());
        }
    }
}

