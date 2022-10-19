package learning.java;

public class Main {

    public static void main(String[] args) {

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Endrju", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("AJ", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("AK", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("JO", highScorePosition);

    }

    public static void displayHighScorePosition(String playerName, int positionHighScoreTable) {
        System.out.println(playerName + "'ve managed to get into position " + positionHighScoreTable
                + " on a high score table! ");
    }

    public static int calculateHighScorePosition(int playerScore) {

        if (playerScore > 1000) {
            return 1;
        } else if (playerScore > 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore > 100 && playerScore < 500) {
            return 3;
        } else return 4;
    }
}