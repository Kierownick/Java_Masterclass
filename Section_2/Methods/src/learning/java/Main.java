package learning.java;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore =  calculateScore(gameOver, score, levelCompleted, bonus); //method assigned to a variable to received returned value
        System.out.println("Your final score was: " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore =  calculateScore(gameOver, score, levelCompleted, bonus); //method assigned to a variable to received returned value
        System.out.println("Your final score was: " + highScore);
    }

    //void returns nothing. Int is being used as in following method I intend to return int finalScore
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore; //first return in if statement
        } else {
            return -1; //it has to return two values when IF is being used. -1 means error in programing terminology
        }
    }
}