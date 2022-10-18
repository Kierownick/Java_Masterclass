package learning.java;

public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float min value:" + myMinFloatValue);
        System.out.println("Float max value:" + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double min value:" + myMinDoubleValue);
        System.out.println("Double max value:" + myMaxDoubleValue);

        int myIntValue = 5;
        float myFloatValue = 5.25f;
        double myDoubleValue = 5.25d;

        float floatCasting = (float) (myFloatValue + myDoubleValue);
        System.out.println(floatCasting);

        int myInt1Value = 5 /3;
        float myFloat1Value = 5f / 3f;
        double myDouble1Value = 3.00 / 3.00;

        System.out.println("My int1 value:" + myInt1Value);
        System.out.println("My float1 value:" + myFloat1Value);
        System.out.println("My double1 value:" + myDouble1Value);

        //Challenge
        double poundToKg = 0.45359237d;
        double kgToPound = 2.20462262185d;

        double numberOfPounds = 200d;
        double numberOfKg = 200d;

        double convertedPounds = numberOfKg * kgToPound;
        double convertedKilograms = numberOfPounds * poundToKg;
        System.out.println("Converted kilograms: " + convertedKilograms);
        System.out.println("Converted pounds: " + convertedPounds);
    }
}
