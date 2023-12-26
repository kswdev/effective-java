package effective.study.chapter08.item49;

import java.math.BigInteger;
import java.util.Objects;

public class NullExample {

        public static void main(String[] args) {
            requireNonNullMethod(null);
        }

        private static void requireNonNullMethod(String string) {
            Objects.requireNonNull(string);
            String s = string;
        }
}
