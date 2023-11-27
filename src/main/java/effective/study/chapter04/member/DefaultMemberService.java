package effective.study.chapter04.member;

import java.util.Arrays;

//구현체는 내부 패키지내에서 있으면 충분하지 않을까?
class DefaultMemberService implements MemberService{

    private String name;

    //DefalutMemberService 안에서만 쓰이니까 private static으로 중첩시킨다.
    private static class PrivateStaticClass {
        public static void findById() {
        }

        //DefaultMemberService와 남남이다.
    }

    private class PrivateClass {
        //내부에 DefalutMemberService를 참조하는 필드가 자동으로 생긴다.

        void doPrint() {
            System.out.println(name);
        }
    }
    public Member getMember() {
        PrivateStaticClass.findById();
        return null;
    }

    public static void main(String[] args) {
        Arrays.stream(PrivateClass.class.getDeclaredFields()).forEach(System.out::println);
    }
}
