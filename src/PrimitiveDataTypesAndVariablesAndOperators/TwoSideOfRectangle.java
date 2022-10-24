package PrimitiveDataTypesAndVariablesAndOperators;

import java.util.Scanner;

public class TwoSideOfRectangle {
    public static void main(String[] arg){
        Scanner scr = new Scanner(System.in);
        int firstSide = scr.nextInt();
        int secondSide = scr.nextInt();
        //S = a * b
        int faceOfRectangle = firstSide * secondSide;
        System.out.print(faceOfRectangle);
    }
}
