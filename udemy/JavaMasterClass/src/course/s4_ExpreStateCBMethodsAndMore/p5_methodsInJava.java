package course.s4_ExpreStateCBMethodsAndMore;

public class p5_methodsInJava {

    public static void main(String[] args) {

            String result = calculateScore(true,10000,8,200);
            String result2 = calculateScore(false,800,5,100);

        System.out.println(result);
        System.out.println(result2);
    }

    public static String calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        String result = "";
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            result = "Your final score was: " + finalScore;
        } else {
            result = "There is no score to display.";
        }

        return result;
    }
}
