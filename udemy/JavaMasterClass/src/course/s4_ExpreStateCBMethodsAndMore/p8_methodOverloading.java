package course.s4_ExpreStateCBMethodsAndMore;

public class p8_methodOverloading {
    public static void main(String[] args) {

        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);

        double newScore1 = calculateScore("Tim", 50.25f);
        System.out.println("New score is " + newScore1);

    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static float calculateScore(String playerName, float score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }
}
