package effective.study.chapter06.item38.interface_enum;

import java.util.Arrays;
import java.util.Collection;

public class OperationExample {

    public static void main(String[] args) {
        double x = 1.2;
        double y = 5.5;
        test(ExtendedOperation.class, x, y);
        test(Arrays.asList(ExtendedOperation.values()), x, y);
    }

    private static <T extends Enum<T> & Operation> void test(
            Class<T> opEnumType, double x, double y
    ) {
        for (Operation op : opEnumType.getEnumConstants()) {
            System.out.printf("%f %s %f = %f\n",
                    x, op, y, op.apply(x, y));
        }
    }
    private static void test(
            Collection<? extends Operation> opSet, double x, double y
    ) {
        for (Operation op : opSet) {
            System.out.printf("%f %s %f = %f\n",
                    x, op, y, op.apply(x, y));
        }
    }

}

