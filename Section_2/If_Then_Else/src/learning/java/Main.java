package learning.java;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 5001;
        int levelCompleted = 5;
        int bonus = 100;

//        if (score == 5000)
//            System.out.println("Your score was 5000");
//        System.out.println("This will be executed without code block");
//
//
//        if (score == 5000) {
//            System.out.println("Your score was 5000");
//        } else {
//            System.out.println("Your score wasn't 5000");
//        }
//
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was: " + finalScore);
        }
        
        // Challenge
         score = 10000;
         levelCompleted = 8;
         bonus = 200;

        if (gameOver) {
             int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was: " + finalScore);
        }

        //private recap on operators
        score /= 2;
        System.out.println(score);
        score -=4900;
        System.out.println(score);
        score %=3;
        System.out.println(score);
    }
}
