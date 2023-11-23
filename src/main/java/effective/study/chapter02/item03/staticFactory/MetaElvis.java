package effective.study.chapter02.item03.staticFactory;

// 제네릭 싱글톤 팩토리
public class MetaElvis<T> {
    private static final MetaElvis<Object> INSTANCE = new MetaElvis<>();
    private MetaElvis() {}

    @SuppressWarnings("unchecked")
    public static <T> MetaElvis<T> getInstance() {
        return (MetaElvis<T>) INSTANCE;
    }

    public void say(T t) {
        System.out.println(t);
    }
    public void leaveTheBuilding() {
        System.out.println("leave the building");
    }

    public static void main(String[] args) {
        MetaElvis<String> elvis1 = MetaElvis.getInstance();
        MetaElvis<Integer> elvis2 = MetaElvis.getInstance();
        System.out.println(elvis2.equals(elvis1));
    }
}
