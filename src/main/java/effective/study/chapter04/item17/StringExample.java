package effective.study.chapter04.item17;

public class StringExample {

    public static void main(String[] args) {
        String name = "son";
        StringBuilder nameBuilder = new StringBuilder(name);

        nameBuilder.append("heung");

        System.out.println(name);
    }
}
