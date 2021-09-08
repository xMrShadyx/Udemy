package a1_Challenges;

public class a4_LeapYearCalculator {
    public static void main(String[] args) {
        System.out.println(isLeapYear(1924));
    }

    public static boolean isLeapYear(int year) {
        boolean leap = false;
        if (!(year >= 1 && year <= 9999)) {
            return false;
        }
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }

            else
                leap = true;
        }

        else
            leap = false;

        if (leap)
            return true;
        else
            return false;
    }
}

