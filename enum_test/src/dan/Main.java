package dan;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //testSeasonPOJO();
        //seasonEnum();
        SeasonEnumImpl.WINTER.showTime();
    }

    private static void seasonEnum() {
        System.out.println(SeasonEnum.WINTER);
        System.out.println(SeasonEnum.WINTER.getSeasonName());
        System.out.println(SeasonEnum.WINTER.getSeasonDesc());


        SeasonEnum season = SeasonEnum.WINTER;
        System.out.println(season.getClass().getSuperclass());
        System.out.println(SeasonEnum.WINTER.getDeclaringClass().getSuperclass());
    }

    private static void testSeasonPOJO() {
        SeasonPOJO season = SeasonPOJO.WINTER;
        System.out.println(season);
        System.out.println(season.getSeasonName());
        System.out.println(season.getSeasonDesc());

        System.out.println(SeasonPOJO.WINTER.getSeasonName());
        System.out.println(SeasonPOJO.WINTER.getSeasonDesc());
    }
}
