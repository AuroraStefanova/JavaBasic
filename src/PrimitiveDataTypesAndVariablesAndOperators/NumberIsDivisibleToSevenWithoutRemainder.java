package PrimitiveDataTypesAndVariablesAndOperators;

import java.util.Scanner;

public class NumberIsDivisibleToSevenWithoutRemainder {
    public static void main(String[] arg){
        Scanner scr = new Scanner(System.in);
        int input = scr.nextInt();

        if(input % 7 == 0){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
