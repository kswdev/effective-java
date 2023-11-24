package effective.study.chapter03.Item13.inheritance;

public abstract class Shape implements Cloneable{
    private int area;
    public abstract int getArea();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

/*    @Override
    protected final Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
    */
}
