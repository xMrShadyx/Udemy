package a1_Challenges;

public class a10_minuteToYearDayCalculator {
    public static void main(String[] args) {
        printYearsAndDays(1440);

    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        long minsToEdit = minutes;
        long years = 0;
        long days = 0;

        while (minsToEdit >= 1440) {
            days++;
            if (days == 365) {
                years++;
                days -= 365;
            }

            minsToEdit -= 1440;
        }

        System.out.println(minutes + " min = " + years + " y and " + days + " d");

    }
}
