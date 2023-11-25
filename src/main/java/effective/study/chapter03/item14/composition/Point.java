package effective.study.chapter03.item14.composition;

public class Point implements Comparable<Point>{

    final int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        int result = Integer.compare(this.x, o.x);
        if (result == 0) {
            result = Integer.compare(this.y, o.y);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(2147483645 + 10);
    }
}