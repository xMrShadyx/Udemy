package course.s4_ExpreStateCBMethodsAndMore;

public class p3_codeBlocksAndTheIfThenElseControl {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 555;
        int levelCompleted = 5;
        int bonus = 100;

//        if (score <= 5000 && score > 1000) {
//            System.out.println("Your score was less 5000");
//        } else if (score < 1000) {
//            System.out.println("less than 1000");
//        } else {
//            System.out.println("Got here");
//        }

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was: " + finalScore);

            score = 10000;
            levelCompleted = 8;
            bonus = 200;
            finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was: " + finalScore);
        }

        // Print out a second score on the screen with the following
        // score set to 10000
        // levelCompleted set to 8
        // bonus set to 200
        // but make sure the first printout above still display as well.





    }
}
