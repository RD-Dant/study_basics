package dan;

/**
 * @author DanTuo
 * @version 1.0
 * @date 2021/11/26 0:24
 * @description enum类实现接口的两种情况
 */
public enum SeasonEnumImpl implements Show{
    SPRING("春天","万物复苏"){
        //情况二
        @Override
        public void showTime() {
            System.out.println("spring show!");
        }
    },
    SUMMER("夏天","烁玉流金"){
        @Override
        public void showTime() {
            System.out.println("summer show");
        }
    },
    AUTUMN("秋天","秋高气爽"){
        @Override
        public void showTime() {
            System.out.println("autumn show!");
        }
    },
    WINTER("冬天","千里冰封"){
        @Override
        public void showTime() {
            System.out.println("winter show");
        }
    };

    private final String seasonName;
    private final String seasonDesc;

    private SeasonEnumImpl(String seasonName,String seasonDesc){
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    //情况一
    /*@Override
    public void showTime() {
        System.out.println("Show time！");
    }*/
}
