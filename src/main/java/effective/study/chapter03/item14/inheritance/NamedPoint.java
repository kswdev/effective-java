package effective.study.chapter03.item14.inheritance;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class NamedPoint extends Point{
    private final String name;
    public NamedPoint(int x, int y, String name) {
        super(x, y);
        this.name = name;
    }

    @Override
    public String toString() {
        return "NamedPoint{" +
                "name='" + name + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    public static void main(String[] args) {
        NamedPoint p1 = new NamedPoint(1, 0, "son");
        NamedPoint p2 = new NamedPoint(1, 0, "lee");

        Set<NamedPoint> points = new TreeSet<>(Comparator
                        .comparingInt((NamedPoint p12) -> p12.getX())
                        .thenComparingInt(Point::getY)
                        .thenComparing(p12 -> p12.name)
        );

        points.add(p1);
        points.add(p2);

        System.out.println(points);
    }
}
