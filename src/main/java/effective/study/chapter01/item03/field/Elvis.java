package effective.study.chapter01.item03.field;

import java.io.Serializable;

/**
 *  장점  : 간결하고 싱글턴임을 API 들어낼 수 있다.
 *  단점1 : 싱글톤을 사용하는 클라이언트를 테스트하기 어렵다.
 *  단점2 : 리플렉션으로 private 생성자를 호출할 수 있다.
 *  단점3 : 역질렬화 할 때 새로운 인스턴스가 생길 수 있다.
 */
public class Elvis implements IElvis, Serializable {

    /**
     * 싱글톤 오브젝트
     */
    public static final Elvis INSTANCE = new Elvis();
    private static boolean created;

    private Elvis() {
        if(created) {
            throw new UnsupportedOperationException("Can't be created by constructor.");
        }
        created = true;
    }

    public void leaveTheBuilding() {
        System.out.println("leave the building");
    }

    public void sing() {
        System.out.println("sing~ sing! sing~");
    }

    public static void main(String[] args) {
        Elvis elvis = Elvis.INSTANCE;
        elvis.leaveTheBuilding();
    }

    private Object readResolve() {
        return INSTANCE;
    }
}
