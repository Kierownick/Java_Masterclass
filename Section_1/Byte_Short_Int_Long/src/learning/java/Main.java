package learning.java;

public class Main {

    public static void main(String[] args) {

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value:" + myMinIntValue);
        System.out.println("Integer Maximum Value:" + myMaxIntValue);

        //Overflow
        System.out.println("Overflow int:" + (myMaxIntValue + 1));

        //Underflow
        System.out.println("Underflow int:" + (myMinIntValue - 1));

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Min byte number:" + myMinByteValue);
        System.out.println("Max byte number:" + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Min short number:" + myMinShortValue);
        System.out.println("Max short number:" + myMaxShortValue);

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Min long number:" + myMinLongValue);
        System.out.println("Max long number:" + myMaxLongValue);

        long myLongValue = 2_147_483_647_222L;
        System.out.println(myLongValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Min double number:" + myMinDoubleValue);
        System.out.println("Max double number:" + myMaxDoubleValue);

        //Casting - To convert a number from one type to another
        int myTotal = (myMinIntValue / 2);
        byte myNewByteValue = (byte) (myMinByteValue / 2);
        short myNewShortValue = (short) (myMinShortValue /2);
    }
}
