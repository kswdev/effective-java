package effective.study.chapter06.item39;

import effective.study.chapter06.item39.annotation.ExceptionTest;
import effective.study.chapter06.item39.test.Sample2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RunTests2 {
    public static void main(String[] args) throws ClassNotFoundException {
        int tests = 0;
        int passed = 0;

        Class<?> testClass = Sample2.class;
        for (Method m : testClass.getDeclaredMethods()) {
            if (m.isAnnotationPresent(ExceptionTest.class)) {
                tests++;
                try {
                    m.invoke(null);
                    System.out.printf("테스트 %s 실패: 예외를 던지지 않음%n", m);
                } catch (InvocationTargetException wrappedExc) {
                    Throwable exc = wrappedExc.getCause();
                    Class<? extends  Throwable> excType =
                            m.getAnnotation(ExceptionTest.class).value();
                    if (excType.isInstance(exc)) {
                        passed ++;
                    } else {
                        System.out.printf("테스트 %s 실패 기대한 예외 %s 발생한 예외 %s%n", m, excType.getName(), exc);
                    }

                } catch (Exception e) {
                    System.out.println("잘못 사용한 @ExceptionTest: " + m);
                }
            }
        }
        System.out.printf("성공: %d, 실패: %d%n", passed, tests - passed);
    }
}
