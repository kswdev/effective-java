package effective.study.chapter03.item10;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class CaseInsensitiveString {
    private final String s;

    public CaseInsensitiveString(String s) {
        this.s = Objects.requireNonNull(s);
    }

    //잘못된 equals
    @Override
    public boolean equals(Object o) {
        // 전달 받은 Object가 CaseInsensitiveString 타입일 때 필드 s 대소문자 구분 없이 비교
        if (o instanceof CaseInsensitiveString) {
            return s.equalsIgnoreCase(
                    ((CaseInsensitiveString) o).s
            );
        }
        // 전달 받은 Object가 String 데이터 타입일 때 대소문자 구분 없이 비교
        if (o instanceof String) {
            return s.equalsIgnoreCase((String) o);
        }
        return false;
    }

/*    @Override
    public boolean equals(Object o) {
        // 전달 받은 Object가 CaseInsensitiveString 타입일 때 필드 s 대소문자 구분 없이 비교
        if (o instanceof CaseInsensitiveString) {
            return s.equalsIgnoreCase(
                    ((CaseInsensitiveString) o).s
            );
        }
    }*/

    public static void main(String[] args) {
        CaseInsensitiveString cis = new CaseInsensitiveString("Polish");
        String polish = "polish";
        System.out.println(cis.equals(polish));
        System.out.println(polish.equals(cis));

        List<CaseInsensitiveString> list = new ArrayList<>();
        list.add(cis);

        System.out.println(list.contains(polish));
    }
}
