package a1_Challenges;

public class a3_BarkingDog {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true,-1));

    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        boolean result = (barking && (hourOfDay >= 0 && hourOfDay < 8) || (hourOfDay == 23));

        if (result) {
            return true;
        }
        return false;

    }
}
