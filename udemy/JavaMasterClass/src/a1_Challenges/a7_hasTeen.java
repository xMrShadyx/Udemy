package a1_Challenges;

public class a7_hasTeen {

    public static void main(String[] args) {
        System.out.println(hasTeen(22,23,34));
        System.out.println(isTeen(13));
    }

    public static boolean hasTeen(int num1, int num2, int num3) {
        return (num1 >= 13 && num1 <= 19) || (num2 >= 13 && num2 <= 19) || (num3 >= 13 && num3 <= 19);
    }

    public static boolean isTeen(int var) {
        return (var >= 13 && var <= 19);
    }
}
