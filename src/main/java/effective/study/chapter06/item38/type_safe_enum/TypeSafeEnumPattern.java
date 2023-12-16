package effective.study.chapter06.item38.type_safe_enum;

public class TypeSafeEnumPattern {

    private final String type;
    private TypeSafeEnumPattern(String type) {
        this.type = type;
    }

    public String toString() {
        return type;
    }

    public static final TypeSafeEnumPattern PLUS = new TypeSafeEnumPattern("+");
    public static final TypeSafeEnumPattern MINUS = new TypeSafeEnumPattern("-");
    public static final TypeSafeEnumPattern TIMES = new TypeSafeEnumPattern("*");
    public static final TypeSafeEnumPattern DIVIDE = new TypeSafeEnumPattern("/");
}
