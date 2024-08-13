package code.JavaUdemyCourse.CollectionFramework;

import java.util.TreeSet;

class Point implements Comparable {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "X = " + x + " Y = " + y;
        // X = 1,Y = 2
    }

    @Override
    public int compareTo(Object o) {
        Point p = (Point) o;
        if (this.x < p.x) {
            return -1;

        } else if (this.x > p.x) {
            return 1;

        } else {
            if (this.y < p.y) {
                return -1;
            } else if (this.y > p.y) {
                return 1;
            }
            return 0;
        }
    }
}

public class TreeSetComparableInterface {
    public static void main(String[] args) {
        TreeSet<Point> ts = new TreeSet<Point>();
        ts.add(new Point(5, 4));
        ts.add(new Point(2, 2));
        ts.add(new Point(1, 2));
        ts.add(new Point(3, 1));
        ts.add(new Point(2, 1));

        System.out.println(ts);
        // (1,2),(2,1),(2,2),(3,1),(5,4)

    }
}
