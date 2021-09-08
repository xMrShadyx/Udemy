package a1_Challenges;

public class a8_SecondsAndMinutes {
    // Constant Variable:
    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {


        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(-41));
        System.out.println(getDurationString(65, 9));

    }


    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || (seconds < 0 || seconds >= 60)) {
            return INVALID_VALUE_MESSAGE;
        }
        int hours = 0;
        while (minutes >= 60) {
            hours++;
            minutes -= 60;

        }

        return String.format("%02dh %02dm %02ds", hours, minutes, seconds);
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }
        int minutes = 0;
        while (seconds >= 60) {
            minutes++;
            seconds -= 60;
        }

      return getDurationString(minutes, seconds);
    }
}


