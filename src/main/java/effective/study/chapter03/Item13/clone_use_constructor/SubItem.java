package effective.study.chapter03.Item13.clone_use_constructor;

public class SubItem extends Item implements Cloneable{
    private String name;

    @Override
    public SubItem clone() {
        //상위 타입을 구체 타입으로 캐스팅 못 함
        return (SubItem) super.clone();
    }

    public static void main(String[] args) {

        SubItem item = new SubItem();
        SubItem clone = item.clone();
        System.out.println(clone != null);
        System.out.println(clone.getClass() == item.getClass());
        System.out.println(clone.equals(item));
    }
}
