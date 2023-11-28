package effective.study.chapter04.item16.method;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        //부가 작업 가능
        return x;
    }
    public double getY() {return y;}
    public void setX(double x) {this.x = x;}
    public void setY(double y) {this.y = y;}

    public static void main(String[] args) {

    }
}
