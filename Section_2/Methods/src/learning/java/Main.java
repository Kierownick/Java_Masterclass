package learning.java;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        calculateScore(gameOver, score, levelCompleted, bonus);

        calculateScore(true, 10000, 8, 200);

    }

    //void returns nothing. Int is being used as in following method I intend to return int finalScore
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was: " + finalScore);
            return finalScore; //first return in if statement
        } else {
            return -1; //it has to return two values when IF is being used. -1 means error in programing terminology
        }
    }
}