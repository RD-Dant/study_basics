package dan;

import java.lang.annotation.*;

/**
 * @author DanTuo
 * @version 1.0
 * @date 2021/12/2 23:09
 * @description 自定义的第一个注解
 */
@Inherited
@Repeatable(MyFirstAnnotations.class)
@Target({ElementType.FIELD,ElementType.METHOD,ElementType.TYPE,ElementType.PARAMETER,ElementType.TYPE_PARAMETER,ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyFirstAnnotation {
    String value() default "hello";
}
