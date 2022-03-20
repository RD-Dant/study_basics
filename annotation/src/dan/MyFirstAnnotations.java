package dan;

import java.lang.annotation.*;

/**
 * @author DanTuo
 * @version 1.0
 * @date 2021/12/6 21:47
 * @description 成员为关联注解的数组
 */
@Inherited
@Target({ElementType.FIELD,ElementType.METHOD,ElementType.TYPE,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyFirstAnnotations {
    MyFirstAnnotation[] value();
}
