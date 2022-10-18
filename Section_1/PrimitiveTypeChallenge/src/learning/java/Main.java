package learning.java;

public class Main {

    public static void main(String[] args) {

        //Challenge
        byte byteOne = 10;
        short shortOne = 20;
        int intOne = 50;
        long longOne = 50000L + (10L * (byteOne + shortOne + intOne));
        System.out.println(longOne);

        short shortTotal = (short) (1000 + 10 * (byteOne + shortOne + intOne));
        System.out.println(shortTotal);
    }
}
