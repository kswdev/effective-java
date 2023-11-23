package effective.study.chapter03.Item13.clone_use_constructor;

public class Item implements Cloneable {

    private String name;

    /**
     * 이렇게 구현하면 하위 클래스의 clone()이 깨질 수 있다.
     */

    @Override
    public Item clone() {
        Item item = new Item();
        item.name = this.name;
        return item;
    }

/*    @Override
    public Item clone() throws CloneNotSupportedException {
        Item result = null;
        try {
            result = (Item) super.clone();
            return result;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }*/
}
