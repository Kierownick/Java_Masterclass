package learning.java;

public class Main {

    public static void main(String[] args) {

        boolean isCar = false;
            if (isCar == true) {
                System.out.println("Car is false");
            }

	    boolean wasCar = isCar ? false : true; //testing operands basing whether isCar true or false
            if (wasCar) {
                System.out.println("wasCar is false"); //it checks if isCar is false then assigns this value to was car and checks first operand
             }


    }
}
