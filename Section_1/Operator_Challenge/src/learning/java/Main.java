package learning.java;

public class Main {

    public static void main(String[] args) {

        double firstValue = 20.00d;
        double secondValue = 80.00d;

        double value = (firstValue + secondValue) * 100.00d;
        System.out.println(value);

        double remainder = value % 40.00d;
        System.out.println(remainder);

        boolean isReminder = (remainder == 0) ? true : false;
        System.out.println(isReminder);

        if (!isReminder) {
            System.out.println("Got some remainders");
        }


    }
}
