package effective.study.chapter06.item34.enum_type.operation.switch_enum;

public enum Operation {
    PLUS, MINUS, TIMES, DIVIDE;

    public double applu(double x, double y) {
        return switch (this) {
            case PLUS -> x + y;
            case MINUS -> x - y;
            case TIMES -> x * y;
            case DIVIDE -> x / y;
        };
    }
}
