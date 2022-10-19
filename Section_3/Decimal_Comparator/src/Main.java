public class Main {

    public static void main(String[] args) {

        double num1 = 123.123;
        double num2 = 123.321;
        System.out.println((int) num1 * 1000 + " space " + (int) (num2 * 1000));
        // num1 is being firstly casted to int then multiplied, int 2 firstly ->
        // multiplied by 1000 as double, then casted to Integer
    }
}