package dan;

/**
 * @author DanTuo
 * @version 1.0
 * @date 2021/11/23 23:39
 * @description 自定义枚举类
 */
public class SeasonPOJO {
    //1.生命对象的属性：private final修饰
    private final String seasonName;
    private final String seasonDesc;

    //2.私有化构造器，给对象赋值
    private SeasonPOJO(String seasonName, String seasonDesc){
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    //3.提供当前枚举的多个对象
    public static final SeasonPOJO SPRING = new SeasonPOJO("春天","万物复苏");
    public static final SeasonPOJO SUMMER = new SeasonPOJO("夏天","烁玉流金");
    public static final SeasonPOJO AUTUMN = new SeasonPOJO("秋天","秋高气爽");
    public static final SeasonPOJO WINTER = new SeasonPOJO("冬天","千里冰封");

    //4.获取枚举对象属性
    public String getSeasonName(){
        return seasonName;
    }

    public String getSeasonDesc(){
        return seasonDesc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}
