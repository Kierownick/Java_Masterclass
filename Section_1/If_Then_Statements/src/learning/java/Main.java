package learning.java;

public class Main {

    public static void main(String[] args) {

        //Conditional logic
        boolean isAlien = false;
        if (isAlien) { //equal
            System.out.println("It is not an alien!");
            System.out.println("It isn't an alien 2!");
        }

        int topScore = 82;
        if (topScore != 100) { //not equal
            System.out.println("You got the high score 1");
        }

        if (topScore > 100) { //greater than
            System.out.println("You got the high score 2");

        }
        if (topScore >= 100) { //greater or equal
            System.out.println("You got the high score 3");
        }

        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100)) { //and
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (topScore <= 100)) { //or
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("Assignment versus comparing");
        }

        boolean isCar = false;
        if (!isCar) { //isCar != true
            System.out.println("Assigning different boolean in IF is possible");
        }
    }
}
