package effective.study.chapter06.item39.annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ExceptionListTest {
    Class<? extends  Throwable>[] value();
}
