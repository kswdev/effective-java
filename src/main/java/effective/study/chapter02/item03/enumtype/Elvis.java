package effective.study.chapter02.item03.enumtype;

//열거 타입 싱글턴 - 추천 방법
public enum Elvis {
    INSTANCE;

    public void leaveTheBuilding() {
        System.out.println("빌딩 나가기");
    }

    public static void main(String[] args) {
        Elvis elvis = Elvis.INSTANCE;
        elvis.leaveTheBuilding();
    }
}
