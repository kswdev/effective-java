package effective.study.chapter02.item10;

import java.util.Objects;

//단순한 불변 2차원 정수 점(point) 클래스
public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Point)) {
            return false;
        }
        Point p = (Point) o;
        return (p.x == this.x && p.y == this.y);
    }

/*    // 잘못된 코드 - 리스코프 치환 원칙 위배! (59쪽)
    @Override public boolean equals(Object o) {
        if (o == null || o.getClass() != getClass())
            return false;
        Point p = (Point) o;
        return p.x == x && p.y == y;
    }*/
}
