package PrimitiveDataTypesAndVariablesAndOperators;

import java.util.Scanner;

public class ThirdSideOfTriangle {
    public static void main(String[] arg){
        Scanner scr = new Scanner(System.in);
        int firstSide = scr.nextInt();
        int secondSide = scr.nextInt();
        int thirdSide = scr.nextInt();
        boolean notTriangle = false;
        boolean triangle = true;

        if (firstSide + secondSide > thirdSide && secondSide + thirdSide > firstSide && firstSide + thirdSide > secondSide){
            System.out.println(triangle);
        }
        else {
            System.out.println(notTriangle);
        }
    }
}
