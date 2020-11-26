package lesson2;

public class SwitchTest {


    public static void main(String[] args) {
        // System.out.println(convertSeason(3));
        // System.out.println(convertSeasonSwitch2(3));
        //System.out.println(convertSeasonSwitch3(3));
        System.out.println(convertSeasonSwitch21(3));
        //convertSeasonSwitch4(3);
        // System.out.println(convertSeasonSwitch3(3));
        convertSeasonSwitch4(3);
    }

    public static String convertSeason(int seasonNumber) {
        String season;

        if (seasonNumber == 1) {
            season = "Winter";
        } else if (seasonNumber == 2) {
            season = "Spring";
        } else if (seasonNumber == 3) {
            season = "Summer";
        } else if (seasonNumber == 4) {
            season = "Fall";
        } else {
            season = "Unknown season";
        }

        return season;
    }

    static String convertSeasonSwitch(int seasonNumber) {

        String season;

        switch (seasonNumber) {
            case 1:
                season = "Winter";
                break;
            case 2:
                season = "Spring";
                break;
            case 3:
                season = "Summer";
                break;
            case 4:
                season = "Fall";
                break;
            default:
                season = "Unknown season";
        }

        return season;
    }

    static String convertSeasonSwitch21(int seasonNumber) {

        return switch (seasonNumber) {
            case 1 -> "Winter";
            case 2 -> "Spring";
            case 3 -> "Summer";
            case 4 -> "Fall";
            default -> "Unknown season";
        };


    }

    static String convertSeasonSwitch2(int seasonNumber) {

        return switch (seasonNumber) {
            case 1 -> "Winter";
            case 2 -> "Spring";
            case 3 -> "Summer";
            case 4 -> "Fall";
            default -> "Unknown season";
        };

    }

    static String convertSeasonSwitch3(int seasonNumber) {

        String season;

        switch (seasonNumber) {
            case 1:
                return  "Winter";
            case 2:
                return  "Spring";
            case 3:
                return  "Summer";
            case 4:
                return  "Fall";
            default:
                return  "Unknown season";
        }

    }

    static void convertSeasonSwitch4 (int seasonNumber) {

        String season;


        switch (seasonNumber) {
            case 1 -> {
                System.out.println("Winter");
            }
            case 2 -> {
                System.out.println("Spring");
            }
            case 3 -> {
                System.out.println("Summer");
            }
            case 4 -> {
                System.out.println("Fall");
            }
            default -> System.out.println("Unknown season");
        }

    }
}
