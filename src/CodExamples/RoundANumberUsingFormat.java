package CodExamples;

import java.util.Scanner;

public class RoundANumberUsingFormat {
    public static void main(String[]arg){

        System.out.println("Please enter a double number ");

        Scanner scr = new Scanner(System.in);
        double number = scr.nextDouble();

        System.out.format("%.4f", number);
    }
}
