package effective.study.chapter07.item45.mersenne;

import java.math.BigInteger;
import java.util.stream.Stream;

public class MersenneExample {

    public static void main(String[] args) {
        primes().map(p -> BigInteger.TWO.pow(p.intValueExact()).subtract(BigInteger.ONE))
                .filter(mersenne -> mersenne.isProbablePrime(50))
                .limit(20)
                //.forEach(System.out::println)
                .forEach(mp -> System.out.println(mp.bitLength() + ": " + mp));
    }

    static Stream<BigInteger> primes() {
        return Stream.iterate(BigInteger.TWO, BigInteger::nextProbablePrime);
    }
}
