package effective.study.chapter04.item20.multipleinheritance;

public class MyCat extends AbsctractCat implements Flyable{

    private MyFlyable myFlyable = new MyFlyable();

    @Override
    protected String sound() {
        return "냥냥!";
    }

    @Override
    protected String name() {
        return "나비!";
    }

    public static void main(String[] args) {
        MyCat myCat = new MyCat();
        System.out.println(myCat.sound());
        System.out.println(myCat.name());
        myCat.myFlyable.fly();
    }

    @Override
    public void fly() {
        this.myFlyable.fly();
    }

    private class MyFlyable extends AbstractFlyable { }
}
