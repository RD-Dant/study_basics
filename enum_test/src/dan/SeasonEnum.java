package dan;

/**
 * @author DanTuo
 * @version 1.0
 * @date 2021/11/25 23:28
 * @description 使用enum关键字定义枚举类
 * 定义的枚举类默认继承java.lang.Enum
 */
public enum SeasonEnum {
    //1.提供当前枚举的多个对象
    SPRING("春天","万物复苏"),
    SUMMER("夏天","烁玉流金"),
    AUTUMN("秋天","秋高气爽"),
    WINTER("冬天","千里冰封");

    //2.声明Season对象的属性：private final修饰
    private final String seasonName;
    private final String seasonDesc;

    //3.私有化类构造器，给对象属性赋值
    private SeasonEnum(String seasonName,String seasonDesc){
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    //4.其他诉求：获取枚举对象类的属性
    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }
}
