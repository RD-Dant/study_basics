package dan;

/**
 * @author DanTuo
 * @version 1.0
 * @date 2021/12/2 23:23
 * @description 配合注解测试
 */
@MyFirstAnnotation("hello")
@MyFirstAnnotation("world")
public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
