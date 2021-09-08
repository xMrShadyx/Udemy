package course.s4_ExpreStateCBMethodsAndMore;

public class p6_moreOnMethods extends p5_methodsInJava{
    public static void main(String[] args) {

//        String testResult = calculateScore(true, 2223, 12, 400);
//        System.out.println(testResult);


        int result = calculateHighScorePosition(1500);
        displayHighScorePosition("Shady", result);

        result = calculateHighScorePosition(900);
        displayHighScorePosition("xMr", result);

        result = calculateHighScorePosition(400);
        displayHighScorePosition("Dummy", result);

        result = calculateHighScorePosition(50);
        displayHighScorePosition("Yummy", result);


        // Create a method called displayHighScorePosition
        // it should a player name as a parameter, and a 2nd parameter as a position in the high score table
        // You should display the players name along with a message like " managed to get into position " and the
        // position they got and a further message " on the high score table "

        // Create a 2nd method called calculateScorePosition
        // it should be sent one argument only, the player score
        // it should return an int
        // the return data should be
        // 1 if the score is > 1000
        // 2 if the score is > 500 and < 1000
        // 3 if the score is > 100 and < 500
        // 4 in all other cases
        // cal both methods and display the result of fallowing
        // a score if 1500, 900, 400 and 50

    }

    public static void displayHighScorePosition(String playerName, int playerPosition) {
        String display = String.format("%s managed to get into position %d on the high score table", playerName, playerPosition);
        System.out.println(display);
    }

    public static int calculateHighScorePosition(int playerScore) {
        int position = 4;

        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }
        return  position;
    }

}
