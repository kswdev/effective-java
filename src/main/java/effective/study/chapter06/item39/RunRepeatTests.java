package effective.study.chapter06.item39;

import effective.study.chapter06.item39.annotation.ExceptionContainer;
import effective.study.chapter06.item39.annotation.ExceptionRepeatTest;
import effective.study.chapter06.item39.test.Sample4;

import java.lang.reflect.Method;

public class RunRepeatTests {
    public static void main(String[] args) throws ClassNotFoundException {
        int tests = 0;
        int passed = 0;

        Class<?> testClass = Sample4.class;
        for (Method m : testClass.getDeclaredMethods()) {
            if (/*m.isAnnotationPresent(ExceptionContainer.class) ||*/
                m.isAnnotationPresent(ExceptionRepeatTest.class)) {
                tests++;
                try {
                    m.invoke(null);
                    System.out.printf("테스트 %s 실패: 예외를 던지지 않음%n", m);
                } catch (Throwable wrappedExc) {
                    Throwable exc = wrappedExc.getCause();
                    int oldPassed = passed;
                    ExceptionRepeatTest[] excTests =
                            m.getAnnotationsByType(ExceptionRepeatTest.class);
                    for (ExceptionRepeatTest excType : excTests) {
                        if(excType.value().isInstance(exc)) {
                            passed++;
                            break;
                        }
                    }
                    if (passed == oldPassed)
                        System.out.printf("테스트 %s 실패: %s %n", m, exc);
                }
            }
        }
        System.out.printf("성공: %d, 실패: %d%n", passed, tests - passed);
    }
}
