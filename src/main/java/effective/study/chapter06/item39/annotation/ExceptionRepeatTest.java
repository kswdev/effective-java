package effective.study.chapter06.item39.annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(ExceptionContainer.class)
public @interface ExceptionRepeatTest {
    Class<? extends  Throwable> value();
}
