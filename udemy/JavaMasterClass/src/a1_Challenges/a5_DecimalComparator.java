package a1_Challenges;

// import java.math.RoundingMode;
// import java.text.DecimalFormat;

public class a5_DecimalComparator {
    public static void main(String[] args) {
        // double num1 = 3.31232;
        // String firstNum = String.format("%.3f", num1);
        // double castedNum1 = Double.parseDouble(firstNum);

//        System.out.println(castedNum1);

        System.out.println(areEqualByThreeDecimalPlaces(-3.1756,-3.175));
    }


    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
//        DecimalFormat df = new DecimalFormat("#.###");
//        df.setRoundingMode(RoundingMode.CEILING);
//
//        String firstNum = df.format(num1);
//        String secondNum = df.format(num2);
//
//        return firstNum.equals(secondNum);
        num1 = (int) (num1 * 1000);
        num2 = (int) (num2 * 1000);

        return num1 == num2;


    }
}
