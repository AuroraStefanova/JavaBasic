package NumerousSystemsBitOperators;

import java.util.Scanner;

public class Zad2 {
    public static void main(String[] arg){

        Scanner scr = new Scanner(System.in);
        int firstNumber = scr.nextInt();
        int secondNumber = scr.nextInt();
        double thirdNumber = scr.nextDouble();
        double forthNumber = scr.nextDouble();
        int firstIntSum ;
        int secondIntSum;
        double firstDoubleSum;
        double secondDoubleSum;

        int retainingNumberForFirstTwoNumbers = firstNumber;
        firstNumber = secondNumber;
        secondNumber = retainingNumberForFirstTwoNumbers;
        System.out.println("first: " + firstNumber + " and " + secondNumber);

        double thirdAndForthNumberRetainingNum = thirdNumber;
        thirdNumber = forthNumber;
        forthNumber = thirdAndForthNumberRetainingNum;
        System.out.println("third num: " + thirdNumber + " forth num "+ forthNumber);

        double castFirstNum = new Double(firstNumber);
        double castSecondNum = new Double(secondNumber);
        firstDoubleSum = (castFirstNum + castSecondNum);
        System.out.println("The sum from cast to double first and second number is: " + firstDoubleSum );

        int secondCastFirstNum = (int)castFirstNum;
        int secondCastSecondNum = (int)castSecondNum;
        firstIntSum = (secondCastFirstNum + secondCastSecondNum);
        System.out.println("The sum from cast to int first and second number is: " + firstIntSum);

        int castThirdNum = (int)thirdNumber;
        int castForthSum = (int)forthNumber;
        secondIntSum = (castThirdNum + castForthSum);
        System.out.println("The sum from  cast to int forth num and the third num is " + secondIntSum);

        Double secondCastThirdNum = (double)castThirdNum;
        Double secondCastForthNum = (double)castForthSum;
        secondDoubleSum = (secondCastThirdNum + secondCastForthNum);
        System.out.println("The sum from  cast to double forth num and the third num is " + secondDoubleSum);
    }
}
