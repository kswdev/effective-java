package effective.study.chapter02.item08.cleaner_as_a_safetynet;

public class Teenager {
    public static void main(String[] args) {
        new Room(99);
        System.out.println("Peace Out");

        //이런식으로 가비지 컬렉터를 강제로 호출하면 안된다
        //System.gc();
    }
}
