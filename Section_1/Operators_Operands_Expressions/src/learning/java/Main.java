package learning.java;

public class Main {

    public static void main(String[] args) {

       int result = 1 + 2; // = 3
       result = 2 - 1; // = 1
       result = result * 10;
       result = result / 5;
       System.out.println(result);

       // the reminder of (4 % 3 = 1)
       result = 4 % 3; // result = 1
       System.out.println("1: " + result);

       result++; // result = 1 + 1
       System.out.println("++: " + result);

       result--; // result = 2 - 1
       System.out.println("--: " + result);

       result += 2; // result = 1 + 2
       System.out.println("+=: " + result);

       result *= 10; // result = 3 * 10
       System.out.println("*=: " + result);

       result /= 3; // result = 30 / 3
       System.out.println("/=: " + result);

        result -= 10; // result = 10 - 10
        System.out.println("-=: " + result);






    }
}
