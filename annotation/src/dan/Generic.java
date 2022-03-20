package dan;

import java.util.ArrayList;
import java.util.List;

/**
 * @author DanTuo
 * @version 1.0
 * @date 2021/12/6 22:19
 * @description 修饰“类型参数”和“任何类型”的注解
 */
//此处泛型前使用的注解添加了：ElementType.TYPE_PARAMETER
public class Generic<@MyFirstAnnotation T> {

    //此方法中使用到的注解中添加了：ElementType.TYPE_USE
    public void show() throws @MyFirstAnnotation RuntimeException{
        List<@MyFirstAnnotation String> list = new ArrayList<>();
        int num = (@MyFirstAnnotation int)10L;
    }

}
